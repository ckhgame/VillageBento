package com.ckhgame.villagebento.entity.misc;

import com.ckhgame.villagebento.tileentity.TileEntityBlockCustom;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class EntityBlockMountable extends Entity {

	private TileEntityBlockCustom mountTileEntity;
	
	public EntityBlockMountable(World p_i1582_1_) {
		super(p_i1582_1_);
		this.setSize(0, 0);
		noClip = true;
        preventEntitySpawning = true;
	}

	@Override
	protected void entityInit() {
		// TODO Auto-generated method stub
		this.setSize(0, 0);
	}

	@Override
	public void onEntityUpdate() {
		
		super.onEntityUpdate();
		if (!this.worldObj.isRemote && (riddenByEntity == null || riddenByEntity.isDead)) {
            setDead();
        } 
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound p_70037_1_) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound p_70014_1_) {
		// TODO Auto-generated method stub
		
	}

}
