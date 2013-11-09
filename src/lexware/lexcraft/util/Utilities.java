package lexware.lexcraft.util;

import lexware.lexcraft.Lexcraft;
import lexware.lexcraft.creativetabs.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.*;

public class Utilities {
	
	public static void registerBlock(Block block, String name, String modid) {
		GameRegistry.registerBlock(block, modid + "_" + block.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(block, name);
	}
	
	public static void registerItem(Item item, String name, String modid) {
		GameRegistry.registerItem(item, modid + "_" + item.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(item, name);
	}
	
	public static void loadCreativeTabs() {
		Lexcraft.tabsLC = new LexcraftCreativeTab("Lexcraft");
		LanguageRegistry.instance().addStringLocalization("itemGroup.Lexcraft", "en_US", "Lexcraft");
		
		Lexcraft.tabsSS = new ServerStuffCreativeTab("LCServerStuff");
		LanguageRegistry.instance().addStringLocalization("itemGroup.LCServerStuff", "en_US", "Lexcraft | Server Stuff");
	}
	
	public static void loadAllRecipes() {
		Recipes.loadRecipes();
		Recipes.loadSmeltingRecipes();
	}

}
