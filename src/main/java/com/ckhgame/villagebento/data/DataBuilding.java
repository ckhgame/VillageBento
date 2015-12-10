package com.ckhgame.villagebento.data;

import java.util.ArrayList;

import com.ckhgame.villagebento.block.ModBlocks;
import com.ckhgame.villagebento.config.ConfigData;
import com.ckhgame.villagebento.util.IData;
import com.ckhgame.villagebento.util.data.Vec3Int;
import com.ckhgame.villagebento.util.tool.VBRandom;
import com.ckhgame.villagebento.util.village.BlockFinder;

import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class DataBuilding implements IData{
	
	public int id;
	public int x;
	public int z;
	public int sizeX; // if the total width is 7, sizeX would be 3 (3 + 1 + 3)
	public int sizeZ; // similar as sizeX
	public int y;
	public int type;
	public String owner; //the name of the owner player
	
	@Override
	public void writeToNBT(NBTTagCompound compound) {
		compound.setInteger(ConfigData.KeyDataBuildingID, this.id);
		compound.setInteger(ConfigData.KeyDataBuildingX, this.x);
		compound.setInteger(ConfigData.KeyDataBuildingY, this.y);
		compound.setInteger(ConfigData.KeyDataBuildingZ, this.z);
		compound.setInteger(ConfigData.KeyDataBuildingSizeX, this.sizeX);
		compound.setInteger(ConfigData.KeyDataBuildingSizeZ, this.sizeZ);
		compound.setInteger(ConfigData.KeyDataBuildingType, this.type);
		if(owner != null)
			compound.setString(ConfigData.KeyDataBuildingOwner, owner);
	}
	@Override
	public void readFromNBT(NBTTagCompound compound) {
		this.id = compound.getInteger(ConfigData.KeyDataBuildingID); 
		this.x = compound.getInteger(ConfigData.KeyDataBuildingX);
		this.y = compound.getInteger(ConfigData.KeyDataBuildingY);
		this.z = compound.getInteger(ConfigData.KeyDataBuildingZ);
		this.sizeX = compound.getInteger(ConfigData.KeyDataBuildingSizeX);
		this.sizeZ = compound.getInteger(ConfigData.KeyDataBuildingSizeZ);
		this.type = compound.getInteger(ConfigData.KeyDataBuildingType);
		if(compound.hasKey(ConfigData.KeyDataBuildingOwner))
			this.owner = compound.getString(ConfigData.KeyDataBuildingOwner);
	}
	
	
	
	
	//------ caches -------
	
	private class BedInfo{
		public String owner;
		public int x;
		public int y;
		public int z;
	}
	
	//bed cache
	private ArrayList<BedInfo> cacheBedsInfo = null;
	
	private void generatCacheBedsInfo(){
		this.cacheBedsInfo = new ArrayList<BedInfo>();
		World world = DataVillageBento.get().world;
		Vec3Int[] arr = BlockFinder.findBlock(world, this.x, this.y, this.z,this.sizeX,this.sizeZ, Blocks.bed, new int[] { 0, 1, 2, 3 }, false);
		BedInfo bedInfo;
		for(Vec3Int vec : arr){
			bedInfo = new BedInfo();
			bedInfo.owner = null;
			bedInfo.x = vec.x;
			bedInfo.y = vec.y;
			bedInfo.z = vec.z;
			this.cacheBedsInfo.add(bedInfo);
		}
	}
	
	/**
	 * 
	 * @param name: owner's name, could be any villager or player
	 * @return the bed position, null means no bed in the building or all beds are full
	 */
	public Vec3Int applyForBed(String name) {
		if(this.cacheBedsInfo == null){
			generatCacheBedsInfo();
		}
		for(BedInfo bedInfo : this.cacheBedsInfo){
			if(bedInfo.owner == null){
				bedInfo.owner = name;
				return Vec3Int.create(bedInfo.x,bedInfo.y,bedInfo.z);
			}
		}
		return null;
	}
	
	
	//mountable cache
	private ArrayList<Vec3Int> cacheMountables = null;
	
	private void generatCacheMountables(){
		cacheMountables = new  ArrayList<Vec3Int>();
		World world = DataVillageBento.get().world;
		Vec3Int[] arr = BlockFinder.findBlock(world, this.x, this.y, this.z,this.sizeX,this.sizeZ, ModBlocks.blockWoodenChair, new int[] {0}, false);
		for(Vec3Int v3 : arr){
			cacheMountables.add(v3);
		}
	}
	
	public Vec3Int getRandomAvailableMoutable(){
		if(this.cacheMountables == null)
			generatCacheMountables();
		
		if(cacheMountables.size() == 0)
			return null;
		
		return cacheMountables.get(VBRandom.getRand().nextInt(cacheMountables.size()));
		
	}
}