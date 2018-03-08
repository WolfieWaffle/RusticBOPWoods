package com.github.wolfiewaffle.rusticbopwoods.crafting;

import com.github.wolfiewaffle.rusticbopwoods.RusticBOPWoods;
import com.github.wolfiewaffle.rusticbopwoods.block.ModBlocks;

import biomesoplenty.api.block.BOPBlocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import rustic.common.Config;

public class Recipes {

	public static void init() {
		addCraftingRecipes();
	}

	private static void addCraftingRecipes() {
		if (Config.ENABLE_CHAIRS) {
			GameRegistry.addShapedRecipe(new ResourceLocation(RusticBOPWoods.MODID, "sacred_oak_chair"), new ResourceLocation(RusticBOPWoods.MODID, "chair"), new ItemStack(ModBlocks.CHAIR_SACRED_OAK, 4), "P  ", "PPP", "S S", 'P', new ItemStack(BOPBlocks.planks_0, 1, 0), 'S', new ItemStack(Items.STICK));
			GameRegistry.addShapedRecipe(new ResourceLocation(RusticBOPWoods.MODID, "cherry_chair"), new ResourceLocation(RusticBOPWoods.MODID, "chair"), new ItemStack(ModBlocks.CHAIR_CHERRY, 4), "P  ", "PPP", "S S", 'P', new ItemStack(BOPBlocks.planks_0, 1, 1), 'S', new ItemStack(Items.STICK));
			GameRegistry.addShapedRecipe(new ResourceLocation(RusticBOPWoods.MODID, "umbran_chair"), new ResourceLocation(RusticBOPWoods.MODID, "chair"), new ItemStack(ModBlocks.CHAIR_UMBRAN, 4), "P  ", "PPP", "S S", 'P', new ItemStack(BOPBlocks.planks_0, 1, 2), 'S', new ItemStack(Items.STICK));
			GameRegistry.addShapedRecipe(new ResourceLocation(RusticBOPWoods.MODID, "fir_chair"), new ResourceLocation(RusticBOPWoods.MODID, "chair"), new ItemStack(ModBlocks.CHAIR_FIR, 4), "P  ", "PPP", "S S", 'P', new ItemStack(BOPBlocks.planks_0, 1, 3), 'S', new ItemStack(Items.STICK));
			GameRegistry.addShapedRecipe(new ResourceLocation(RusticBOPWoods.MODID, "ethereal_chair"), new ResourceLocation(RusticBOPWoods.MODID, "chair"), new ItemStack(ModBlocks.CHAIR_ETHEREAL, 4), "P  ", "PPP", "S S", 'P', new ItemStack(BOPBlocks.planks_0, 1, 4), 'S', new ItemStack(Items.STICK));
			GameRegistry.addShapedRecipe(new ResourceLocation(RusticBOPWoods.MODID, "magic_chair"), new ResourceLocation(RusticBOPWoods.MODID, "chair"), new ItemStack(ModBlocks.CHAIR_MAGIC, 4), "P  ", "PPP", "S S", 'P', new ItemStack(BOPBlocks.planks_0, 1, 5), 'S', new ItemStack(Items.STICK));
			GameRegistry.addShapedRecipe(new ResourceLocation(RusticBOPWoods.MODID, "mangrove_chair"), new ResourceLocation(RusticBOPWoods.MODID, "chair"), new ItemStack(ModBlocks.CHAIR_MANGROVE, 4), "P  ", "PPP", "S S", 'P', new ItemStack(BOPBlocks.planks_0, 1, 6), 'S', new ItemStack(Items.STICK));
			GameRegistry.addShapedRecipe(new ResourceLocation(RusticBOPWoods.MODID, "palm_chair"), new ResourceLocation(RusticBOPWoods.MODID, "chair"), new ItemStack(ModBlocks.CHAIR_PALM, 4), "P  ", "PPP", "S S", 'P', new ItemStack(BOPBlocks.planks_0, 1, 7), 'S', new ItemStack(Items.STICK));
			GameRegistry.addShapedRecipe(new ResourceLocation(RusticBOPWoods.MODID, "redwood_chair"), new ResourceLocation(RusticBOPWoods.MODID, "chair"), new ItemStack(ModBlocks.CHAIR_REDWOOD, 4), "P  ", "PPP", "S S", 'P', new ItemStack(BOPBlocks.planks_0, 1, 8), 'S', new ItemStack(Items.STICK));
			GameRegistry.addShapedRecipe(new ResourceLocation(RusticBOPWoods.MODID, "willow_chair"), new ResourceLocation(RusticBOPWoods.MODID, "chair"), new ItemStack(ModBlocks.CHAIR_WILLOW, 4), "P  ", "PPP", "S S", 'P', new ItemStack(BOPBlocks.planks_0, 1, 9), 'S', new ItemStack(Items.STICK));
			GameRegistry.addShapedRecipe(new ResourceLocation(RusticBOPWoods.MODID, "pine_chair"), new ResourceLocation(RusticBOPWoods.MODID, "chair"), new ItemStack(ModBlocks.CHAIR_PINE, 4), "P  ", "PPP", "S S", 'P', new ItemStack(BOPBlocks.planks_0, 1, 10), 'S', new ItemStack(Items.STICK));
			GameRegistry.addShapedRecipe(new ResourceLocation(RusticBOPWoods.MODID, "hellbark_chair"), new ResourceLocation(RusticBOPWoods.MODID, "chair"), new ItemStack(ModBlocks.CHAIR_HELLBARK, 4), "P  ", "PPP", "S S", 'P', new ItemStack(BOPBlocks.planks_0, 1, 11), 'S', new ItemStack(Items.STICK));
			GameRegistry.addShapedRecipe(new ResourceLocation(RusticBOPWoods.MODID, "jacaranda_chair"), new ResourceLocation(RusticBOPWoods.MODID, "chair"), new ItemStack(ModBlocks.CHAIR_JACARANDA, 4), "P  ", "PPP", "S S", 'P', new ItemStack(BOPBlocks.planks_0, 1, 12), 'S', new ItemStack(Items.STICK));
			GameRegistry.addShapedRecipe(new ResourceLocation(RusticBOPWoods.MODID, "mahogany_chair"), new ResourceLocation(RusticBOPWoods.MODID, "chair"), new ItemStack(ModBlocks.CHAIR_MAHOGANY, 4), "P  ", "PPP", "S S", 'P', new ItemStack(BOPBlocks.planks_0, 1, 13), 'S', new ItemStack(Items.STICK));
			GameRegistry.addShapedRecipe(new ResourceLocation(RusticBOPWoods.MODID, "ebony_chair"), new ResourceLocation(RusticBOPWoods.MODID, "chair"), new ItemStack(ModBlocks.CHAIR_EBONY, 4), "P  ", "PPP", "S S", 'P', new ItemStack(BOPBlocks.planks_0, 1, 14), 'S', new ItemStack(Items.STICK));
			GameRegistry.addShapedRecipe(new ResourceLocation(RusticBOPWoods.MODID, "eucalyptus_chair"), new ResourceLocation(RusticBOPWoods.MODID, "chair"), new ItemStack(ModBlocks.CHAIR_EUCALYPTUS, 4), "P  ", "PPP", "S S", 'P', new ItemStack(BOPBlocks.planks_0, 1, 15), 'S', new ItemStack(Items.STICK));
		}
		if (Config.ENABLE_TABLES) {
			GameRegistry.addShapedRecipe(new ResourceLocation(RusticBOPWoods.MODID, "sacred_oak_table"), new ResourceLocation(RusticBOPWoods.MODID, "table"), new ItemStack(ModBlocks.TABLE_SACRED_OAK, 2), "PPP", "S S", 'P', new ItemStack(BOPBlocks.planks_0, 1, 0), 'S', new ItemStack(Items.STICK));
			GameRegistry.addShapedRecipe(new ResourceLocation(RusticBOPWoods.MODID, "cherry_table"), new ResourceLocation(RusticBOPWoods.MODID, "table"), new ItemStack(ModBlocks.TABLE_CHERRY, 2), "PPP", "S S", 'P', new ItemStack(BOPBlocks.planks_0, 1, 1), 'S', new ItemStack(Items.STICK));
			GameRegistry.addShapedRecipe(new ResourceLocation(RusticBOPWoods.MODID, "umbran_table"), new ResourceLocation(RusticBOPWoods.MODID, "table"), new ItemStack(ModBlocks.TABLE_UMBRAN, 2), "PPP", "S S", 'P', new ItemStack(BOPBlocks.planks_0, 1, 2), 'S', new ItemStack(Items.STICK));
			GameRegistry.addShapedRecipe(new ResourceLocation(RusticBOPWoods.MODID, "fir_table"), new ResourceLocation(RusticBOPWoods.MODID, "table"), new ItemStack(ModBlocks.TABLE_FIR, 2), "PPP", "S S", 'P', new ItemStack(BOPBlocks.planks_0, 1, 3), 'S', new ItemStack(Items.STICK));
			GameRegistry.addShapedRecipe(new ResourceLocation(RusticBOPWoods.MODID, "ethereal_table"), new ResourceLocation(RusticBOPWoods.MODID, "table"), new ItemStack(ModBlocks.TABLE_ETHEREAL, 2), "PPP", "S S", 'P', new ItemStack(BOPBlocks.planks_0, 1, 4), 'S', new ItemStack(Items.STICK));
			GameRegistry.addShapedRecipe(new ResourceLocation(RusticBOPWoods.MODID, "magic_table"), new ResourceLocation(RusticBOPWoods.MODID, "table"), new ItemStack(ModBlocks.TABLE_MAGIC, 2), "PPP", "S S", 'P', new ItemStack(BOPBlocks.planks_0, 1, 5), 'S', new ItemStack(Items.STICK));
			GameRegistry.addShapedRecipe(new ResourceLocation(RusticBOPWoods.MODID, "mangrove_table"), new ResourceLocation(RusticBOPWoods.MODID, "table"), new ItemStack(ModBlocks.TABLE_MANGROVE, 2), "PPP", "S S", 'P', new ItemStack(BOPBlocks.planks_0, 1, 6), 'S', new ItemStack(Items.STICK));
			GameRegistry.addShapedRecipe(new ResourceLocation(RusticBOPWoods.MODID, "palm_table"), new ResourceLocation(RusticBOPWoods.MODID, "table"), new ItemStack(ModBlocks.TABLE_PALM, 2), "PPP", "S S", 'P', new ItemStack(BOPBlocks.planks_0, 1, 7), 'S', new ItemStack(Items.STICK));
			GameRegistry.addShapedRecipe(new ResourceLocation(RusticBOPWoods.MODID, "redwood_table"), new ResourceLocation(RusticBOPWoods.MODID, "table"), new ItemStack(ModBlocks.TABLE_REDWOOD, 2), "PPP", "S S", 'P', new ItemStack(BOPBlocks.planks_0, 1, 8), 'S', new ItemStack(Items.STICK));
			GameRegistry.addShapedRecipe(new ResourceLocation(RusticBOPWoods.MODID, "willow_table"), new ResourceLocation(RusticBOPWoods.MODID, "table"), new ItemStack(ModBlocks.TABLE_WILLOW, 2), "PPP", "S S", 'P', new ItemStack(BOPBlocks.planks_0, 1, 9), 'S', new ItemStack(Items.STICK));
			GameRegistry.addShapedRecipe(new ResourceLocation(RusticBOPWoods.MODID, "pine_table"), new ResourceLocation(RusticBOPWoods.MODID, "table"), new ItemStack(ModBlocks.TABLE_PINE, 2), "PPP", "S S", 'P', new ItemStack(BOPBlocks.planks_0, 1, 10), 'S', new ItemStack(Items.STICK));
			GameRegistry.addShapedRecipe(new ResourceLocation(RusticBOPWoods.MODID, "hellbark_table"), new ResourceLocation(RusticBOPWoods.MODID, "table"), new ItemStack(ModBlocks.TABLE_HELLBARK, 2), "PPP", "S S", 'P', new ItemStack(BOPBlocks.planks_0, 1, 11), 'S', new ItemStack(Items.STICK));
			GameRegistry.addShapedRecipe(new ResourceLocation(RusticBOPWoods.MODID, "jacaranda_table"), new ResourceLocation(RusticBOPWoods.MODID, "table"), new ItemStack(ModBlocks.TABLE_JACARANDA, 2), "PPP", "S S", 'P', new ItemStack(BOPBlocks.planks_0, 1, 12), 'S', new ItemStack(Items.STICK));
			GameRegistry.addShapedRecipe(new ResourceLocation(RusticBOPWoods.MODID, "mahogany_table"), new ResourceLocation(RusticBOPWoods.MODID, "table"), new ItemStack(ModBlocks.TABLE_MAHOGANY, 2), "PPP", "S S", 'P', new ItemStack(BOPBlocks.planks_0, 1, 13), 'S', new ItemStack(Items.STICK));
			GameRegistry.addShapedRecipe(new ResourceLocation(RusticBOPWoods.MODID, "ebony_table"), new ResourceLocation(RusticBOPWoods.MODID, "table"), new ItemStack(ModBlocks.TABLE_EBONY, 2), "PPP", "S S", 'P', new ItemStack(BOPBlocks.planks_0, 1, 14), 'S', new ItemStack(Items.STICK));
			GameRegistry.addShapedRecipe(new ResourceLocation(RusticBOPWoods.MODID, "eucalyptus_table"), new ResourceLocation(RusticBOPWoods.MODID, "table"), new ItemStack(ModBlocks.TABLE_EUCALYPTUS, 2), "PPP", "S S", 'P', new ItemStack(BOPBlocks.planks_0, 1, 15), 'S', new ItemStack(Items.STICK));
		}
	}

}
