package lexware.lexcraft.util;

import lexware.lexcraft.Lexcraft;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.item.crafting.FurnaceRecipes;

public class Recipes {
	
	public static void loadRecipes() {
		
		GameRegistry.addShapelessRecipe(new ItemStack(Lexcraft.pinkCrystal, 9), new Object[]{
			new ItemStack(Lexcraft.pinkCrystalBlock)
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(Lexcraft.purpleCrystal, 9), new Object[]{
			new ItemStack(Lexcraft.purpleCrystalBlock)
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(Lexcraft.ruby, 9), new Object[]{
			new ItemStack(Lexcraft.rubyBlock)
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(Lexcraft.sapphire, 9), new Object[]{
			new ItemStack(Lexcraft.sapphireBlock)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(Lexcraft.orangeCrystal, 9), new Object[]{
			new ItemStack(Lexcraft.orangeCrystalBlock)
		});
		
		GameRegistry.addRecipe(new ItemStack(Lexcraft.pinkCrystalBlock), new Object[]{
			"XXX",
			"XXX",
			"XXX",
			'X', Lexcraft.pinkCrystal
		});
		
		GameRegistry.addRecipe(new ItemStack(Lexcraft.purpleCrystalBlock), new Object[]{
			"XXX",
			"XXX",
			"XXX",
			'X', Lexcraft.purpleCrystal
		});
		
		GameRegistry.addRecipe(new ItemStack(Lexcraft.rubyBlock), new Object[]{
			"XXX",
			"XXX",
			"XXX",
			'X', Lexcraft.ruby
		});
		
		GameRegistry.addRecipe(new ItemStack(Lexcraft.sapphireBlock), new Object[]{
			"XXX",
			"XXX",
			"XXX",
			'X', Lexcraft.sapphire
		});
		GameRegistry.addRecipe(new ItemStack(Lexcraft.orangeCrystalBlock), new Object[]{
			"XXX",
			"XXX",
			"XXX",
			'X', Lexcraft.orangeCrystal
		});
		
		//Torches
		GameRegistry.addRecipe(new ItemStack(Lexcraft.pinkCrystalTorch, 4), new Object[]{
			"X",
			"Y",
			'X', Lexcraft.pinkCrystal, 'Y', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(Lexcraft.purpleCrystalTorch, 4), new Object[]{
			"X",
			"Y",
			'X', Lexcraft.purpleCrystal, 'Y', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Lexcraft.orangeCrystalTorch, 4), new Object[]{
			"X",
			"Y",
			'X', Lexcraft.orangeCrystal, 'Y', Item.stick
		});
		
		//Diamond making
		GameRegistry.addRecipe(new ItemStack(Item.diamond), new Object[]{
			"XXX",
			"XXX",
			"XXX",
			'X', Lexcraft.pinkCrystalBlock
		});
		GameRegistry.addRecipe(new ItemStack(Item.diamond), new Object[]{
			"XXX",
			"XXX",
			"XXX",
			'X', Lexcraft.purpleCrystalBlock
		});
		GameRegistry.addRecipe(new ItemStack(Item.diamond), new Object[]{
			"XXX",
			"XXX",
			"XXX",
			'X', Lexcraft.orangeCrystalBlock
		});
		
		//Gold making
		GameRegistry.addRecipe(new ItemStack(Item.ingotGold), new Object[]{
			"XX",
			"XX",
			'X', Lexcraft.pinkCrystalBlock
		});
		GameRegistry.addRecipe(new ItemStack(Item.ingotGold), new Object[]{
			"XX",
			"XX",
			'X', Lexcraft.purpleCrystalBlock
		});
		GameRegistry.addRecipe(new ItemStack(Item.ingotGold), new Object[]{
			"XX",
			"XX",
			'X', Lexcraft.orangeCrystalBlock
		});
		
		//Iron making
		GameRegistry.addRecipe(new ItemStack(Item.ingotIron), new Object[]{
			"XX",
			'X', Lexcraft.pinkCrystalBlock
		});
		GameRegistry.addRecipe(new ItemStack(Item.ingotIron), new Object[]{
			"XX",
			'X', Lexcraft.purpleCrystalBlock
		});
		GameRegistry.addRecipe(new ItemStack(Item.ingotIron), new Object[]{
			"XX",
			'X', Lexcraft.orangeCrystalBlock
		});
		
		//Swords
		GameRegistry.addRecipe(new ItemStack(Lexcraft.pinkCrystalSword), new Object[]{
			"X",
			"X",
			"Y",
			'X', Lexcraft.pinkCrystalBlock, 'Y', Item.diamond
		});
		GameRegistry.addRecipe(new ItemStack(Lexcraft.purpleCrystalSword), new Object[]{
			"X",
			"X",
			"Y",
			'X', Lexcraft.purpleCrystalBlock, 'Y', Item.diamond
		});
		GameRegistry.addRecipe(new ItemStack(Lexcraft.rubySword), new Object[]{
			"X",
			"X",
			"Y",
			'X', Lexcraft.ruby, 'Y', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Lexcraft.sapphireSword), new Object[]{
			"X",
			"X",
			"Y",
			'X', Lexcraft.sapphireBlock, 'Y', Item.diamond
		});
		GameRegistry.addRecipe(new ItemStack(Lexcraft.orangeCrystalSword), new Object[]{
			"X",
			"X",
			"Y",
			'X', Lexcraft.orangeCrystalBlock, 'Y', Item.diamond
		});
		
		//Obsidian Sword
		GameRegistry.addRecipe(new ItemStack(Lexcraft.obsidianSword), new Object[]{
			"X",
			"X",
			"Y",
			'X', Block.obsidian, 'Y', Item.diamond
		});
		
		//Emerald Sword 
		GameRegistry.addRecipe(new ItemStack(Lexcraft.emeraldSword), new Object[]{
			"X",
			"X",
			"Y",
			'X', Item.emerald, 'Y', Item.stick
		});
		
		//Flint Sword
		GameRegistry.addRecipe(new ItemStack(Lexcraft.flintSword), new Object[]{
			"X",
			"X",
			"Y",
			'X', Lexcraft.strenghthenedFlint, 'Y', Item.stick
		});
		
		//Convert Clear Crystal
		GameRegistry.addRecipe(new ItemStack(Lexcraft.pinkCrystal), new Object[]{
			"XY",
			'X', Lexcraft.clearCrystal, 'Y', new ItemStack(Item.dyePowder, 1, 9)
		});
		GameRegistry.addRecipe(new ItemStack(Lexcraft.pinkCrystal), new Object[]{
			"YX",
			'X', Lexcraft.clearCrystal, 'Y', new ItemStack(Item.dyePowder, 1, 9)
		});
		
		GameRegistry.addRecipe(new ItemStack(Lexcraft.purpleCrystal), new Object[]{
			"XY",
			'X', Lexcraft.clearCrystal, 'Y', new ItemStack(Item.dyePowder, 1, 5)
		});
		GameRegistry.addRecipe(new ItemStack(Lexcraft.purpleCrystal), new Object[]{
			"YX",
			'X', Lexcraft.clearCrystal, 'Y', new ItemStack(Item.dyePowder, 1, 5)
		});
		
		GameRegistry.addRecipe(new ItemStack(Lexcraft.orangeCrystal), new Object[]{
			"XY",
			'X', Lexcraft.clearCrystal, 'Y', new ItemStack(Item.dyePowder, 1, 14)
		});
		GameRegistry.addRecipe(new ItemStack(Lexcraft.orangeCrystal), new Object[]{
			"YX",
			'X', Lexcraft.clearCrystal, 'Y', new ItemStack(Item.dyePowder, 1, 14)
		});
		
		GameRegistry.addRecipe(new ItemStack(Lexcraft.yellowCrystal), new Object[]{
			"XY",
			'X', Lexcraft.clearCrystal, 'Y', new ItemStack(Item.dyePowder, 1, 11)
		});
		GameRegistry.addRecipe(new ItemStack(Lexcraft.yellowCrystal), new Object[]{
			"YX",
			'X', Lexcraft.clearCrystal, 'Y', new ItemStack(Item.dyePowder, 1, 11)
		});
		
		//Yellow Crystal Sword
		GameRegistry.addRecipe(new ItemStack(Lexcraft.yellowCrystalSword), new Object[]{
			"X",
			"X",
			"Y",
			'X', Lexcraft.yellowCrystalBlock, 'Y', Item.diamond
		});
		
	}
	
	public static void loadSmeltingRecipes() {
		FurnaceRecipes.smelting().addSmelting(Item.flint.itemID, 0, new ItemStack(Lexcraft.strenghthenedFlint), 0.1F);
		
		//Crystals
		FurnaceRecipes.smelting().addSmelting(Lexcraft.pinkCrystalOre.blockID, 0, new ItemStack(Lexcraft.pinkCrystal, 4), 0.1F);
		FurnaceRecipes.smelting().addSmelting(Lexcraft.purpleCrystalOre.blockID, 0, new ItemStack(Lexcraft.purpleCrystal, 4), 0.1F);
		FurnaceRecipes.smelting().addSmelting(Lexcraft.orangeCrystalOre.blockID, 0, new ItemStack(Lexcraft.orangeCrystal, 4), 0.1F);
		FurnaceRecipes.smelting().addSmelting(Lexcraft.yellowCrystalOre.blockID, 0, new ItemStack(Lexcraft.yellowCrystal, 4), 0.1F);
		
		//Ruby and sapphire
		FurnaceRecipes.smelting().addSmelting(Lexcraft.rubyOre.blockID, 0, new ItemStack(Lexcraft.ruby, 4), 0.1F);
		FurnaceRecipes.smelting().addSmelting(Lexcraft.sapphireOre.blockID, 0, new ItemStack(Lexcraft.sapphire, 4), 0.1F);
	}

}
