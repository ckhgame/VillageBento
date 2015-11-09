package com.ckhgame.villagebento.building;

import com.ckhgame.villagebento.building.builder.BuildingBuilder;
import com.ckhgame.villagebento.config.ConfigBuilding;
import com.ckhgame.villagebento.villager.VillagerProArchitect;

import net.minecraft.init.Blocks;

public class BuildingProArchitectsHouse extends Building {

	@Override
	public String getName() {
		return "Professional Architect's Home";
	}

	@Override
	public String getDescription() {
		return "Welcome to the Art of Architectural!";
	}

	@Override
	protected boolean canBuild() {
		return true;
	}
	
	@Override
	protected void generateVillagers(BuildingBuilder bb) {
		// TODO Auto-generated method stub
		//add villager
		bb.addBuildingVillager(VillagerProArchitect.class,"Alex",0,0);
	}

	@Override
	public int getSizeType() {
		return ConfigBuilding.SizeType_Small;
	}

	@Override
	protected void buildBlocks(BuildingBuilder bb) {
		bb.buildBlock(-3,0,-3,Blocks.stonebrick,0);bb.buildBlock(-3,0,-2,Blocks.stonebrick,0);bb.buildBlock(-3,0,-1,Blocks.stonebrick,0);
		bb.buildBlock(-3,0,0,Blocks.stonebrick,0);bb.buildBlock(-3,0,1,Blocks.stonebrick,0);bb.buildBlock(-3,0,2,Blocks.stonebrick,0);
		bb.buildBlock(-3,0,3,Blocks.stonebrick,0);bb.buildBlock(-2,0,-3,Blocks.stonebrick,0);bb.buildBlock(-2,0,1,Blocks.noteblock,0);
		bb.buildBlock(-2,0,2,Blocks.jukebox,0);bb.buildBlock(-2,0,3,Blocks.stonebrick,0);bb.buildBlock(-1,0,-3,Blocks.stonebrick,0);
		bb.buildBlock(-1,0,-2,Blocks.birch_stairs,0);bb.buildBlock(-1,0,3,Blocks.stonebrick,0);bb.buildBlock(0,0,-3,Blocks.stonebrick,0);
		bb.buildBlock(0,0,-2,Blocks.brick_block,0);bb.buildBlock(0,0,-1,Blocks.flower_pot,6);bb.buildBlock(0,0,3,Blocks.stonebrick,0);
		bb.buildBlock(1,0,-3,Blocks.stonebrick,0);bb.buildBlock(1,0,-2,Blocks.brick_block,0);bb.buildBlock(1,0,-1,Blocks.flower_pot,5);
		bb.buildBlock(1,0,2,Blocks.chest,2);bb.buildBlock(1,0,3,Blocks.stonebrick,0);bb.buildBlock(2,0,-3,Blocks.stonebrick,0);
		bb.buildBlock(2,0,-2,Blocks.brick_block,0);bb.buildBlock(2,0,-1,Blocks.flower_pot,7);bb.buildBlock(2,0,2,Blocks.chest,2);
		bb.buildBlock(2,0,3,Blocks.stonebrick,0);bb.buildBlock(3,0,-3,Blocks.stonebrick,0);bb.buildBlock(3,0,-2,Blocks.stonebrick,0);
		bb.buildBlock(3,0,-1,Blocks.stonebrick,0);bb.buildBlock(3,0,0,Blocks.iron_door,2);bb.buildBlock(3,0,1,Blocks.stonebrick,0);
		bb.buildBlock(3,0,2,Blocks.stonebrick,0);bb.buildBlock(3,0,3,Blocks.stonebrick,0);bb.buildBlock(-3,1,-3,Blocks.brick_block,0);
		bb.buildBlock(-3,1,-2,Blocks.brick_block,0);bb.buildBlock(-3,1,-1,Blocks.glass_pane,0);bb.buildBlock(-3,1,0,Blocks.glass_pane,0);
		bb.buildBlock(-3,1,1,Blocks.glass_pane,0);bb.buildBlock(-3,1,2,Blocks.brick_block,0);bb.buildBlock(-3,1,3,Blocks.brick_block,0);
		bb.buildBlock(-2,1,-3,Blocks.brick_block,0);bb.buildBlock(-2,1,3,Blocks.brick_block,0);bb.buildBlock(-1,1,-3,Blocks.brick_block,0);
		bb.buildBlock(-1,1,3,Blocks.glass_pane,0);bb.buildBlock(0,1,-3,Blocks.brick_block,0);bb.buildBlock(0,1,-2,Blocks.acacia_stairs,0);
		bb.buildBlock(0,1,3,Blocks.glass_pane,0);bb.buildBlock(1,1,-3,Blocks.brick_block,0);bb.buildBlock(1,1,-2,Blocks.brick_block,0);
		bb.buildBlock(1,1,3,Blocks.glass_pane,0);bb.buildBlock(2,1,-3,Blocks.brick_block,0);bb.buildBlock(2,1,-2,Blocks.brick_block,0);
		bb.buildBlock(2,1,1,Blocks.stone_button,2);bb.buildBlock(2,1,3,Blocks.brick_block,0);bb.buildBlock(3,1,-3,Blocks.brick_block,0);
		bb.buildBlock(3,1,-2,Blocks.brick_block,0);bb.buildBlock(3,1,-1,Blocks.brick_block,0);bb.buildBlock(3,1,0,Blocks.iron_door,8);
		bb.buildBlock(3,1,1,Blocks.brick_block,0);bb.buildBlock(3,1,2,Blocks.brick_block,0);bb.buildBlock(3,1,3,Blocks.brick_block,0);
		bb.buildBlock(-3,2,-3,Blocks.brick_block,0);bb.buildBlock(-3,2,-2,Blocks.brick_block,0);bb.buildBlock(-3,2,-1,Blocks.glass_pane,0);
		bb.buildBlock(-3,2,0,Blocks.glass_pane,0);bb.buildBlock(-3,2,1,Blocks.glass_pane,0);bb.buildBlock(-3,2,2,Blocks.brick_block,0);
		bb.buildBlock(-3,2,3,Blocks.brick_block,0);bb.buildBlock(-2,2,-3,Blocks.brick_block,0);bb.buildBlock(-2,2,3,Blocks.brick_block,0);
		bb.buildBlock(-1,2,-3,Blocks.brick_block,0);bb.buildBlock(-1,2,3,Blocks.glass_pane,0);bb.buildBlock(0,2,-3,Blocks.brick_block,0);
		bb.buildBlock(0,2,3,Blocks.glass_pane,0);bb.buildBlock(1,2,-3,Blocks.brick_block,0);bb.buildBlock(1,2,-2,Blocks.birch_stairs,0);
		bb.buildBlock(1,2,3,Blocks.glass_pane,0);bb.buildBlock(2,2,-3,Blocks.brick_block,0);bb.buildBlock(2,2,-2,Blocks.brick_block,0);
		bb.buildBlock(2,2,3,Blocks.brick_block,0);bb.buildBlock(3,2,-3,Blocks.brick_block,0);bb.buildBlock(3,2,-2,Blocks.brick_block,0);
		bb.buildBlock(3,2,-1,Blocks.brick_block,0);bb.buildBlock(3,2,0,Blocks.brick_block,0);bb.buildBlock(3,2,1,Blocks.brick_block,0);
		bb.buildBlock(3,2,2,Blocks.brick_block,0);bb.buildBlock(3,2,3,Blocks.brick_block,0);bb.buildBlock(-3,3,-3,Blocks.brick_block,0);
		bb.buildBlock(-3,3,-2,Blocks.brick_block,0);bb.buildBlock(-3,3,-1,Blocks.brick_block,0);bb.buildBlock(-3,3,0,Blocks.brick_block,0);
		bb.buildBlock(-3,3,1,Blocks.brick_block,0);bb.buildBlock(-3,3,2,Blocks.brick_block,0);bb.buildBlock(-3,3,3,Blocks.brick_block,0);
		bb.buildBlock(-2,3,-3,Blocks.brick_block,0);bb.buildBlock(-2,3,3,Blocks.brick_block,0);bb.buildBlock(-1,3,-3,Blocks.brick_block,0);
		bb.buildBlock(-1,3,3,Blocks.brick_block,0);bb.buildBlock(0,3,-3,Blocks.brick_block,0);bb.buildBlock(0,3,3,Blocks.brick_block,0);
		bb.buildBlock(1,3,-3,Blocks.brick_block,0);bb.buildBlock(1,3,3,Blocks.brick_block,0);bb.buildBlock(2,3,-3,Blocks.brick_block,0);
		bb.buildBlock(2,3,-2,Blocks.acacia_stairs,0);bb.buildBlock(2,3,3,Blocks.brick_block,0);bb.buildBlock(3,3,-3,Blocks.brick_block,0);
		bb.buildBlock(3,3,-2,Blocks.brick_block,0);bb.buildBlock(3,3,-1,Blocks.brick_block,0);bb.buildBlock(3,3,0,Blocks.glass_pane,0);
		bb.buildBlock(3,3,1,Blocks.brick_block,0);bb.buildBlock(3,3,2,Blocks.brick_block,0);bb.buildBlock(3,3,3,Blocks.brick_block,0);
		bb.buildBlock(-3,4,-3,Blocks.planks,4);bb.buildBlock(-3,4,-2,Blocks.planks,4);bb.buildBlock(-3,4,-1,Blocks.planks,4);
		bb.buildBlock(-3,4,0,Blocks.planks,4);bb.buildBlock(-3,4,1,Blocks.planks,4);bb.buildBlock(-3,4,2,Blocks.planks,4);
		bb.buildBlock(-3,4,3,Blocks.planks,4);bb.buildBlock(-2,4,-3,Blocks.planks,4);bb.buildBlock(-2,4,-2,Blocks.wooden_slab,4);
		bb.buildBlock(-2,4,-1,Blocks.wooden_slab,4);bb.buildBlock(-2,4,0,Blocks.wooden_slab,4);bb.buildBlock(-2,4,1,Blocks.planks,4);
		bb.buildBlock(-2,4,2,Blocks.planks,4);bb.buildBlock(-2,4,3,Blocks.planks,4);bb.buildBlock(-1,4,-3,Blocks.planks,4);
		bb.buildBlock(-1,4,-2,Blocks.wooden_slab,2);bb.buildBlock(-1,4,-1,Blocks.wooden_slab,2);bb.buildBlock(-1,4,0,Blocks.wooden_slab,4);
		bb.buildBlock(-1,4,1,Blocks.planks,4);bb.buildBlock(-1,4,2,Blocks.planks,4);bb.buildBlock(-1,4,3,Blocks.planks,4);
		bb.buildBlock(0,4,-3,Blocks.planks,4);bb.buildBlock(0,4,-1,Blocks.wooden_slab,2);bb.buildBlock(0,4,0,Blocks.wooden_slab,4);
		bb.buildBlock(0,4,1,Blocks.planks,4);bb.buildBlock(0,4,2,Blocks.planks,4);bb.buildBlock(0,4,3,Blocks.planks,4);
		bb.buildBlock(1,4,-3,Blocks.planks,4);bb.buildBlock(1,4,-1,Blocks.wooden_slab,2);bb.buildBlock(1,4,0,Blocks.wooden_slab,4);
		bb.buildBlock(1,4,1,Blocks.planks,4);bb.buildBlock(1,4,2,Blocks.planks,4);bb.buildBlock(1,4,3,Blocks.planks,4);
		bb.buildBlock(2,4,-3,Blocks.planks,4);bb.buildBlock(2,4,-1,Blocks.wooden_slab,2);bb.buildBlock(2,4,0,Blocks.wooden_slab,4);
		bb.buildBlock(2,4,1,Blocks.planks,4);bb.buildBlock(2,4,2,Blocks.planks,4);bb.buildBlock(2,4,3,Blocks.planks,4);
		bb.buildBlock(3,4,-3,Blocks.planks,4);bb.buildBlock(3,4,-2,Blocks.planks,4);bb.buildBlock(3,4,-1,Blocks.planks,4);
		bb.buildBlock(3,4,0,Blocks.planks,4);bb.buildBlock(3,4,1,Blocks.planks,4);bb.buildBlock(3,4,2,Blocks.planks,4);
		bb.buildBlock(3,4,3,Blocks.planks,4);bb.buildBlock(-3,5,-3,Blocks.brick_block,0);bb.buildBlock(-3,5,-2,Blocks.brick_block,0);
		bb.buildBlock(-3,5,-1,Blocks.glass_pane,0);bb.buildBlock(-3,5,0,Blocks.brick_block,0);bb.buildBlock(-3,5,1,Blocks.glass_pane,0);
		bb.buildBlock(-3,5,2,Blocks.brick_block,0);bb.buildBlock(-3,5,3,Blocks.brick_block,0);bb.buildBlock(-2,5,-3,Blocks.brick_block,0);
		bb.buildBlock(-2,5,2,Blocks.double_wooden_slab,2);bb.buildBlock(-2,5,3,Blocks.brick_block,0);bb.buildBlock(-1,5,-3,Blocks.brick_block,0);
		bb.buildBlock(-1,5,2,Blocks.bed,9);bb.buildBlock(-1,5,3,Blocks.brick_block,0);bb.buildBlock(0,5,-3,Blocks.brick_block,0);
		bb.buildBlock(0,5,2,Blocks.bed,1);bb.buildBlock(0,5,3,Blocks.brick_block,0);bb.buildBlock(1,5,-3,Blocks.brick_block,0);
		bb.buildBlock(1,5,3,Blocks.brick_block,0);bb.buildBlock(2,5,-3,Blocks.brick_block,0);bb.buildBlock(2,5,1,Blocks.bookshelf,0);
		bb.buildBlock(2,5,2,Blocks.bookshelf,0);bb.buildBlock(2,5,3,Blocks.brick_block,0);bb.buildBlock(3,5,-3,Blocks.brick_block,0);
		bb.buildBlock(3,5,-2,Blocks.brick_block,0);bb.buildBlock(3,5,-1,Blocks.glass_pane,0);bb.buildBlock(3,5,0,Blocks.brick_block,0);
		bb.buildBlock(3,5,1,Blocks.glass_pane,0);bb.buildBlock(3,5,2,Blocks.brick_block,0);bb.buildBlock(3,5,3,Blocks.brick_block,0);
		bb.buildBlock(-3,6,-3,Blocks.brick_block,0);bb.buildBlock(-3,6,-2,Blocks.brick_block,0);bb.buildBlock(-3,6,-1,Blocks.glass_pane,0);
		bb.buildBlock(-3,6,0,Blocks.brick_block,0);bb.buildBlock(-3,6,1,Blocks.glass_pane,0);bb.buildBlock(-3,6,2,Blocks.brick_block,0);
		bb.buildBlock(-3,6,3,Blocks.brick_block,0);bb.buildBlock(-2,6,-3,Blocks.brick_block,0);bb.buildBlock(-2,6,2,Blocks.flower_pot,2);
		bb.buildBlock(-2,6,3,Blocks.brick_block,0);bb.buildBlock(-1,6,-3,Blocks.planks,2);bb.buildBlock(-1,6,3,Blocks.glass_pane,0);
		bb.buildBlock(0,6,-3,Blocks.planks,2);bb.buildBlock(0,6,3,Blocks.glass_pane,0);bb.buildBlock(1,6,-3,Blocks.planks,2);
		bb.buildBlock(1,6,3,Blocks.glass_pane,0);bb.buildBlock(2,6,-3,Blocks.brick_block,0);bb.buildBlock(2,6,3,Blocks.brick_block,0);
		bb.buildBlock(3,6,-3,Blocks.brick_block,0);bb.buildBlock(3,6,-2,Blocks.brick_block,0);bb.buildBlock(3,6,-1,Blocks.glass_pane,0);
		bb.buildBlock(3,6,0,Blocks.brick_block,0);bb.buildBlock(3,6,1,Blocks.glass_pane,0);bb.buildBlock(3,6,2,Blocks.brick_block,0);
		bb.buildBlock(3,6,3,Blocks.brick_block,0);bb.buildBlock(-3,7,-3,Blocks.brick_block,0);bb.buildBlock(-3,7,-2,Blocks.brick_block,0);
		bb.buildBlock(-3,7,-1,Blocks.glass_pane,0);bb.buildBlock(-3,7,0,Blocks.brick_block,0);bb.buildBlock(-3,7,1,Blocks.glass_pane,0);
		bb.buildBlock(-3,7,2,Blocks.brick_block,0);bb.buildBlock(-3,7,3,Blocks.brick_block,0);bb.buildBlock(-2,7,-3,Blocks.brick_block,0);
		bb.buildBlock(-2,7,3,Blocks.brick_block,0);bb.buildBlock(-1,7,-3,Blocks.planks,2);bb.buildBlock(-1,7,3,Blocks.glass_pane,0);
		bb.buildBlock(0,7,-3,Blocks.planks,2);bb.buildBlock(0,7,3,Blocks.glass_pane,0);bb.buildBlock(1,7,-3,Blocks.planks,2);
		bb.buildBlock(1,7,3,Blocks.glass_pane,0);bb.buildBlock(2,7,-3,Blocks.brick_block,0);bb.buildBlock(2,7,3,Blocks.brick_block,0);
		bb.buildBlock(3,7,-3,Blocks.brick_block,0);bb.buildBlock(3,7,-2,Blocks.brick_block,0);bb.buildBlock(3,7,-1,Blocks.glass_pane,0);
		bb.buildBlock(3,7,0,Blocks.brick_block,0);bb.buildBlock(3,7,1,Blocks.glass_pane,0);bb.buildBlock(3,7,2,Blocks.brick_block,0);
		bb.buildBlock(3,7,3,Blocks.brick_block,0);bb.buildBlock(-3,8,-3,Blocks.brick_stairs,0);bb.buildBlock(-3,8,-2,Blocks.brick_stairs,0);
		bb.buildBlock(-3,8,-1,Blocks.brick_stairs,0);bb.buildBlock(-3,8,0,Blocks.brick_stairs,0);bb.buildBlock(-3,8,1,Blocks.brick_stairs,0);
		bb.buildBlock(-3,8,2,Blocks.brick_stairs,0);bb.buildBlock(-3,8,3,Blocks.brick_stairs,0);bb.buildBlock(-2,8,-3,Blocks.brick_stairs,2);
		bb.buildBlock(-2,8,-2,Blocks.stone_slab,12);bb.buildBlock(-2,8,-1,Blocks.stone_slab,12);bb.buildBlock(-2,8,0,Blocks.stone_slab,12);
		bb.buildBlock(-2,8,1,Blocks.stone_slab,12);bb.buildBlock(-2,8,2,Blocks.stone_slab,12);bb.buildBlock(-2,8,3,Blocks.brick_stairs,3);
		bb.buildBlock(-1,8,-3,Blocks.brick_stairs,2);bb.buildBlock(-1,8,-2,Blocks.stone_slab,12);bb.buildBlock(-1,8,2,Blocks.stone_slab,12);
		bb.buildBlock(-1,8,3,Blocks.brick_stairs,3);bb.buildBlock(0,8,-3,Blocks.brick_stairs,2);bb.buildBlock(0,8,-2,Blocks.stone_slab,12);
		bb.buildBlock(0,8,2,Blocks.stone_slab,12);bb.buildBlock(0,8,3,Blocks.brick_stairs,3);bb.buildBlock(1,8,-3,Blocks.brick_stairs,2);
		bb.buildBlock(1,8,-2,Blocks.stone_slab,12);bb.buildBlock(1,8,2,Blocks.stone_slab,12);bb.buildBlock(1,8,3,Blocks.brick_stairs,3);
		bb.buildBlock(2,8,-3,Blocks.brick_stairs,2);bb.buildBlock(2,8,-2,Blocks.stone_slab,12);bb.buildBlock(2,8,-1,Blocks.stone_slab,12);
		bb.buildBlock(2,8,0,Blocks.stone_slab,12);bb.buildBlock(2,8,1,Blocks.stone_slab,12);bb.buildBlock(2,8,2,Blocks.stone_slab,12);
		bb.buildBlock(2,8,3,Blocks.brick_stairs,3);bb.buildBlock(3,8,-3,Blocks.brick_stairs,2);bb.buildBlock(3,8,-2,Blocks.brick_stairs,1);
		bb.buildBlock(3,8,-1,Blocks.brick_stairs,1);bb.buildBlock(3,8,0,Blocks.brick_stairs,1);bb.buildBlock(3,8,1,Blocks.brick_stairs,1);
		bb.buildBlock(3,8,2,Blocks.brick_stairs,1);bb.buildBlock(3,8,3,Blocks.brick_stairs,1);bb.buildBlock(-2,9,-2,Blocks.fence,0);
		bb.buildBlock(-2,9,-1,Blocks.fence,0);bb.buildBlock(-2,9,0,Blocks.fence,0);bb.buildBlock(-2,9,1,Blocks.fence,0);
		bb.buildBlock(-2,9,2,Blocks.fence,0);bb.buildBlock(-1,9,-2,Blocks.fence,0);bb.buildBlock(-1,9,2,Blocks.fence,0);
		bb.buildBlock(0,9,-2,Blocks.fence,0);bb.buildBlock(0,9,2,Blocks.fence,0);bb.buildBlock(1,9,-2,Blocks.fence,0);
		bb.buildBlock(1,9,2,Blocks.fence,0);bb.buildBlock(2,9,-2,Blocks.fence,0);bb.buildBlock(2,9,-1,Blocks.fence,0);
		bb.buildBlock(2,9,0,Blocks.fence,0);bb.buildBlock(2,9,1,Blocks.fence,0);bb.buildBlock(2,9,2,Blocks.fence,0);
		bb.buildBlock(-2,10,-2,Blocks.acacia_stairs,0);bb.buildBlock(-2,10,-1,Blocks.acacia_stairs,0);bb.buildBlock(-2,10,0,Blocks.acacia_stairs,0);
		bb.buildBlock(-2,10,1,Blocks.acacia_stairs,0);bb.buildBlock(-2,10,2,Blocks.acacia_stairs,0);bb.buildBlock(-1,10,-2,Blocks.acacia_stairs,2);
		bb.buildBlock(-1,10,-1,Blocks.glass,0);bb.buildBlock(-1,10,0,Blocks.glass,0);bb.buildBlock(-1,10,1,Blocks.glass,0);
		bb.buildBlock(-1,10,2,Blocks.acacia_stairs,3);bb.buildBlock(0,10,-2,Blocks.acacia_stairs,2);bb.buildBlock(0,10,-1,Blocks.glass,0);
		bb.buildBlock(0,10,0,Blocks.glass,0);bb.buildBlock(0,10,1,Blocks.glass,0);bb.buildBlock(0,10,2,Blocks.acacia_stairs,3);
		bb.buildBlock(1,10,-2,Blocks.acacia_stairs,2);bb.buildBlock(1,10,-1,Blocks.glass,0);bb.buildBlock(1,10,0,Blocks.glass,0);
		bb.buildBlock(1,10,1,Blocks.glass,0);bb.buildBlock(1,10,2,Blocks.acacia_stairs,3);bb.buildBlock(2,10,-2,Blocks.acacia_stairs,2);
		bb.buildBlock(2,10,-1,Blocks.acacia_stairs,1);bb.buildBlock(2,10,0,Blocks.acacia_stairs,1);bb.buildBlock(2,10,1,Blocks.acacia_stairs,1);
		bb.buildBlock(2,10,2,Blocks.acacia_stairs,1);bb.buildBlock(-2,3,2,Blocks.torch,4);bb.buildBlock(2,3,2,Blocks.torch,4);

	}

}