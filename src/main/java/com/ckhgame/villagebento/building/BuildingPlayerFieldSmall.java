package com.ckhgame.villagebento.building;

import com.ckhgame.villagebento.building.builder.BuildingBuilder;
import com.ckhgame.villagebento.config.ConfigBuilding;

import net.minecraft.init.Blocks;

public class BuildingPlayerFieldSmall extends Building {

	@Override
	public String getName() {
		return "Player Field Small";
	}

	@Override
	public String getDescription() {
		return "The small size player field";
	}

	@Override
	protected boolean canBuild() {
		return true;
	}
	
	@Override
	protected void generateVillagers(BuildingBuilder bb) {
		// TODO Auto-generated method stub
	}

	@Override
	public int getSizeType() {
		return ConfigBuilding.SizeType_Small;
	}

	@Override
	protected void buildBlocks(BuildingBuilder bb) {
		bb.buildBlock(-1,-1,-2,Blocks.planks,0);bb.buildBlock(-1,-1,-1,Blocks.planks,0);bb.buildBlock(-1,-1,0,Blocks.planks,0);
		bb.buildBlock(-1,-1,1,Blocks.planks,0);bb.buildBlock(-1,-1,2,Blocks.planks,0);bb.buildBlock(0,-1,-2,Blocks.planks,0);
		bb.buildBlock(0,-1,-1,Blocks.planks,0);bb.buildBlock(0,-1,0,Blocks.planks,0);bb.buildBlock(0,-1,1,Blocks.planks,0);
		bb.buildBlock(0,-1,2,Blocks.planks,0);bb.buildBlock(1,-1,-2,Blocks.planks,0);bb.buildBlock(1,-1,-1,Blocks.planks,0);
		bb.buildBlock(1,-1,0,Blocks.planks,0);bb.buildBlock(1,-1,1,Blocks.planks,0);bb.buildBlock(1,-1,2,Blocks.planks,0);
		bb.buildBlock(2,-1,0,Blocks.planks,0);bb.buildBlock(-3,0,-3,Blocks.fence,0);bb.buildBlock(-3,0,3,Blocks.fence,0);
		bb.buildBlock(-2,0,-2,Blocks.planks,1);bb.buildBlock(-2,0,-1,Blocks.planks,1);bb.buildBlock(-2,0,0,Blocks.planks,1);
		bb.buildBlock(-2,0,1,Blocks.planks,1);bb.buildBlock(-2,0,2,Blocks.planks,1);bb.buildBlock(-1,0,-2,Blocks.planks,1);
		bb.buildBlock(-1,0,-1,Blocks.chest,5);bb.buildBlock(-1,0,0,Blocks.bed,0);bb.buildBlock(-1,0,1,Blocks.bed,8);bb.buildBlock(-1,0,2,Blocks.planks,1);
		bb.buildBlock(0,0,-2,Blocks.planks,1);bb.buildBlock(0,0,2,Blocks.planks,1);bb.buildBlock(1,0,-2,Blocks.planks,1);
		bb.buildBlock(1,0,-1,Blocks.flower_pot,3);bb.addTileEntityPot(1,0,-1,38,3);
		bb.buildBlock(1,0,2,Blocks.planks,1);bb.buildBlock(2,0,-2,Blocks.planks,1);bb.buildBlock(2,0,-1,Blocks.planks,1);
		bb.buildBlock(2,0,0,Blocks.wooden_door,2);bb.buildBlock(2,0,1,Blocks.planks,1);bb.buildBlock(2,0,2,Blocks.planks,1);
		bb.buildBlock(3,0,-3,Blocks.fence,0);
		bb.buildBlock(3,0,3,Blocks.fence,0);bb.buildBlock(-3,1,-3,Blocks.fence,0);bb.buildBlock(-3,1,3,Blocks.fence,0);
		bb.buildBlock(-2,1,-2,Blocks.planks,1);bb.buildBlock(-2,1,-1,Blocks.planks,1);bb.buildBlock(-2,1,0,Blocks.planks,1);
		bb.buildBlock(-2,1,1,Blocks.planks,1);bb.buildBlock(-2,1,2,Blocks.planks,1);bb.buildBlock(-1,1,-2,Blocks.planks,1);
		bb.buildBlock(-1,1,2,Blocks.planks,1);bb.buildBlock(0,1,-2,Blocks.glass_pane,0);bb.buildBlock(0,1,2,Blocks.glass_pane,0);
		bb.buildBlock(1,1,-2,Blocks.planks,1);bb.buildBlock(1,1,2,Blocks.planks,1);bb.buildBlock(2,1,-2,Blocks.planks,1);
		bb.buildBlock(2,1,-1,Blocks.planks,1);bb.buildBlock(2,1,0,Blocks.wooden_door,8);bb.buildBlock(2,1,1,Blocks.planks,1);
		bb.buildBlock(2,1,2,Blocks.planks,1);bb.buildBlock(3,1,-3,Blocks.fence,0);bb.buildBlock(3,1,3,Blocks.fence,0);
		bb.buildBlock(-3,2,-3,Blocks.acacia_stairs,2);bb.buildBlock(-3,2,-2,Blocks.acacia_stairs,7);bb.buildBlock(-3,2,2,Blocks.acacia_stairs,6);
		bb.buildBlock(-3,2,3,Blocks.acacia_stairs,3);bb.buildBlock(-2,2,-3,Blocks.acacia_stairs,2);bb.buildBlock(-2,2,-2,Blocks.planks,1);
		bb.buildBlock(-2,2,-1,Blocks.planks,1);bb.buildBlock(-2,2,0,Blocks.glass_pane,0);bb.buildBlock(-2,2,1,Blocks.planks,1);
		bb.buildBlock(-2,2,2,Blocks.planks,1);bb.buildBlock(-2,2,3,Blocks.acacia_stairs,3);bb.buildBlock(-1,2,-3,Blocks.acacia_stairs,2);
		bb.buildBlock(-1,2,-2,Blocks.planks,1);bb.buildBlock(-1,2,2,Blocks.planks,1);bb.buildBlock(-1,2,3,Blocks.acacia_stairs,3);
		bb.buildBlock(0,2,-3,Blocks.wooden_slab,12);bb.buildBlock(0,2,-2,Blocks.planks,1);bb.buildBlock(0,2,2,Blocks.planks,1);
		bb.buildBlock(0,2,3,Blocks.wooden_slab,12);bb.buildBlock(1,2,-3,Blocks.acacia_stairs,2);bb.buildBlock(1,2,-2,Blocks.planks,1);
		bb.buildBlock(1,2,2,Blocks.planks,1);bb.buildBlock(1,2,3,Blocks.acacia_stairs,3);bb.buildBlock(2,2,-3,Blocks.acacia_stairs,2);
		bb.buildBlock(2,2,-2,Blocks.planks,1);bb.buildBlock(2,2,-1,Blocks.planks,1);bb.buildBlock(2,2,0,Blocks.planks,1);
		bb.buildBlock(2,2,1,Blocks.planks,1);bb.buildBlock(2,2,2,Blocks.planks,1);bb.buildBlock(2,2,3,Blocks.acacia_stairs,3);
		bb.buildBlock(3,2,-3,Blocks.acacia_stairs,2);bb.buildBlock(3,2,-2,Blocks.acacia_stairs,7);bb.buildBlock(3,2,2,Blocks.acacia_stairs,6);
		bb.buildBlock(3,2,3,Blocks.acacia_stairs,3);bb.buildBlock(-3,3,-2,Blocks.acacia_stairs,2);bb.buildBlock(-3,3,-1,Blocks.acacia_stairs,7);
		bb.buildBlock(-3,3,1,Blocks.acacia_stairs,6);bb.buildBlock(-3,3,2,Blocks.acacia_stairs,3);bb.buildBlock(-2,3,-2,Blocks.acacia_stairs,2);
		bb.buildBlock(-2,3,-1,Blocks.planks,1);bb.buildBlock(-2,3,0,Blocks.planks,1);bb.buildBlock(-2,3,1,Blocks.planks,1);
		bb.buildBlock(-2,3,2,Blocks.acacia_stairs,3);bb.buildBlock(-1,3,-2,Blocks.acacia_stairs,2);bb.buildBlock(-1,3,2,Blocks.acacia_stairs,3);
		bb.buildBlock(0,3,-2,Blocks.acacia_stairs,2);bb.buildBlock(0,3,2,Blocks.acacia_stairs,3);bb.buildBlock(1,3,-2,Blocks.acacia_stairs,2);
		bb.buildBlock(1,3,2,Blocks.acacia_stairs,3);bb.buildBlock(2,3,-2,Blocks.acacia_stairs,2);bb.buildBlock(2,3,-1,Blocks.planks,1);
		bb.buildBlock(2,3,0,Blocks.glass_pane,0);bb.buildBlock(2,3,1,Blocks.planks,1);bb.buildBlock(2,3,2,Blocks.acacia_stairs,3);
		bb.buildBlock(3,3,-2,Blocks.acacia_stairs,2);bb.buildBlock(3,3,-1,Blocks.acacia_stairs,7);bb.buildBlock(3,3,1,Blocks.acacia_stairs,6);
		bb.buildBlock(3,3,2,Blocks.acacia_stairs,3);bb.buildBlock(-3,4,-1,Blocks.acacia_stairs,2);bb.buildBlock(-3,4,0,Blocks.planks,4);
		bb.buildBlock(-3,4,1,Blocks.acacia_stairs,3);bb.buildBlock(-2,4,-1,Blocks.acacia_stairs,2);bb.buildBlock(-2,4,0,Blocks.planks,4);
		bb.buildBlock(-2,4,1,Blocks.acacia_stairs,3);bb.buildBlock(-1,4,-1,Blocks.acacia_stairs,2);bb.buildBlock(-1,4,0,Blocks.planks,4);
		bb.buildBlock(-1,4,1,Blocks.acacia_stairs,3);bb.buildBlock(0,4,-1,Blocks.acacia_stairs,2);bb.buildBlock(0,4,0,Blocks.planks,4);
		bb.buildBlock(0,4,1,Blocks.acacia_stairs,3);bb.buildBlock(1,4,-1,Blocks.acacia_stairs,2);bb.buildBlock(1,4,0,Blocks.planks,4);
		bb.buildBlock(1,4,1,Blocks.acacia_stairs,3);bb.buildBlock(2,4,-1,Blocks.acacia_stairs,2);bb.buildBlock(2,4,0,Blocks.planks,4);
		bb.buildBlock(2,4,1,Blocks.acacia_stairs,3);bb.buildBlock(3,4,-1,Blocks.acacia_stairs,2);bb.buildBlock(3,4,0,Blocks.planks,4);
		bb.buildBlock(3,4,1,Blocks.acacia_stairs,3);bb.buildBlock(-1,3,0,Blocks.torch,1);bb.buildBlock(0,3,-1,Blocks.torch,3);
		bb.buildBlock(0,3,1,Blocks.torch,4);
		bb.addPlayerFieldSign(3,0,2);
	}

}
