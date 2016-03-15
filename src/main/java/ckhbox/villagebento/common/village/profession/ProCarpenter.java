package ckhbox.villagebento.common.village.profession;

import ckhbox.villagebento.common.block.ModBlocks;
import ckhbox.villagebento.common.item.ModItems;
import ckhbox.villagebento.common.util.helper.PathHelper;
import ckhbox.villagebento.common.village.trading.TradingRecipe;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class ProCarpenter extends Profession{

	@Override
	protected void initTradingRecipeList() {
		this.tradingRecipeList.add(new TradingRecipe(
				new ItemStack[]{new ItemStack(ModItems.bronzeCoin,20)},
				new ItemStack(ModItems.woodenHelmet)));
		this.tradingRecipeList.add(new TradingRecipe(
				new ItemStack[]{new ItemStack(ModItems.bronzeCoin,30)},
				new ItemStack(ModItems.woodenChestplate)));
		this.tradingRecipeList.add(new TradingRecipe(
				new ItemStack[]{new ItemStack(ModItems.bronzeCoin,25)},
				new ItemStack(ModItems.woodenLeggings)));
		this.tradingRecipeList.add(new TradingRecipe(
				new ItemStack[]{new ItemStack(ModItems.bronzeCoin,20)},
				new ItemStack(ModItems.woodenBoots)));
	}

	@Override
	protected void initTexture() {
		this.createTextures("carpenter");
	}

	@Override
	protected String getUnlocalized() {
		return PathHelper.full("profession.carpenter");
	}

	@Override
	protected void initUpgradeOptions() {
		this.upgradeToCurentNeeds = new ItemStack[]{
				new ItemStack(ModItems.silverCoin,2)
		};
		
		this.upgradeToNextOptionClasses = new Class[]{
				ProBowmaker.class,
				ProFurnituremaker.class
				};
	}

}
