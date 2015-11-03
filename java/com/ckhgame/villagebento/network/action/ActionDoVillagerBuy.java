package com.ckhgame.villagebento.network.action;

import com.ckhgame.villagebento.data.DataVillageBento;
import com.ckhgame.villagebento.data.DataVillager;
import com.ckhgame.villagebento.data.helper.HelperDataVB;
import com.ckhgame.villagebento.data.helper.HelperDataVrComp;
import com.ckhgame.villagebento.gui.GuiVillagerBuy;
import com.ckhgame.villagebento.villager.Villager;
import com.ckhgame.villagebento.villager.component.VillagerCompBuy;

import cpw.mods.fml.common.network.ByteBufUtils;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;

/**
 * 
 * @author ckhgame
 * params:
 * 1.villagerID (int)
 * 2.EntiryPlayerID (int)
 * 3.itemBuy (ItemStack)
 * 
 *  result:
 * 1. ItemStack[]
 */
public class ActionDoVillagerBuy extends Action {
	
	@Override
	public void onClientSend(ByteBuf buf, Object[] info) {
		int villagerID = (int)info[0];
		int entityPlayerID = (int)info[1];
		ItemStack itemStack = (ItemStack)info[2];
		buf.writeInt(villagerID);
		buf.writeInt(entityPlayerID);
		ByteBufUtils.writeItemStack(buf, itemStack);
	}

	@Override
	public Object[] onServerReceived(ByteBuf buf) {
		int villagerID = buf.readInt();
		int entityPlayerID = buf.readInt();
		ItemStack itemStack = ByteBufUtils.readItemStack(buf);
		
		return new Object[]{villagerID,entityPlayerID,itemStack};
	}
	
	@Override
	public Object[] resolveRequest(Object[] info) {

		int villagerID = (int)info[0];
		int entityPlayerID = (int)info[1];
		ItemStack itemBuy = (ItemStack)info[2];
		
		EntityPlayer entityPlayer = (EntityPlayer)MinecraftServer.getServer().worldServerForDimension(0).getEntityByID(entityPlayerID);
		DataVillageBento dataVB = DataVillageBento.get();
		DataVillager dvr = HelperDataVB.findVillagerByID(dataVB, villagerID);

		if(HelperDataVrComp.buyItem(dvr, entityPlayer, itemBuy)){
			dataVB.markDirty();
		}
		ItemStack[] itemStacks = HelperDataVrComp.getBuyList(dvr);
		
		return new Object[]{villagerID,itemStacks};
	}
	
	@Override
	public void onServerSend(ByteBuf buf, Object[] info) {
		
		int villagerID = (int)info[0];
		ItemStack[] itemStacks = (ItemStack[])info[1];	
		
		buf.writeInt(villagerID);
		buf.writeInt(itemStacks.length);
		for(int i =0;i<itemStacks.length;i++){
			ByteBufUtils.writeItemStack(buf, itemStacks[i]);
		}
	}

	@Override
	public Object[] onClientReceived(ByteBuf buf) {

		int villagerID = buf.readInt();
		int l = buf.readInt();
		ItemStack[] itemStacks = new ItemStack[l];
		for(int i =0;i<l;i++){
			itemStacks[i] = ByteBufUtils.readItemStack(buf);
		}
		
		return new Object[]{villagerID,itemStacks};
	}



	@Override
	public void onActionCompleted(Object[] result) {

		int villagerID = (int)result[0];	
		ItemStack[] itemStacks = (ItemStack[])result[1];	
		
		DataVillager dvr = HelperDataVB.findVillagerByID(DataVillageBento.get(), villagerID); 
		Villager vr = Villager.registry.get(dvr.profession);
		VillagerCompBuy vcBuy = (VillagerCompBuy)vr.findVillagerComponentByClass(VillagerCompBuy.class);
		if(vcBuy != null){
			((GuiVillagerBuy)vcBuy.getGui()).setBuyList(itemStacks);
		}
	}

}