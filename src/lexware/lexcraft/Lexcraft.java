package lexware.lexcraft;

import java.io.File;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.*;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.EnumHelper;
import lexware.lexcraft.blocks.*;
import lexware.lexcraft.blocks.crystals.*;
import lexware.lexcraft.blocks.ores.*;
import lexware.lexcraft.blocks.torches.*;
import lexware.lexcraft.creativetabs.*;
import lexware.lexcraft.items.*;
import lexware.lexcraft.items.swords.*;
import lexware.lexcraft.util.*;
import cpw.mods.fml.common.*;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.*;

@Mod(modid = Info.modid, name = Info.name, version = Info.version)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class Lexcraft {
	
	//Variables for configuration file
	protected static File configPath;
	protected static int infoBlockID, glowingInfoBlockID, indicatorBlockID, glowingIndicatorBlockID;
	protected static int pinkCrystalBlockID, purpleCrystalBlockID, rubyBlockID, sapphireBlockID, orangeCrystalBlockID, yellowCrystalBlockID;;
	protected static int pinkCrystalOreID, purpleCrystalOreID, rubyOreID, sapphireOreID, orangeCrystalOreID, clearCrystalOreID, yellowCrystalOreID;
	protected static int pinkCrystalTorchID, purpleCrystalTorchID, orangeCrystalTorchID, yellowCrystalTorchID;
	protected static int obsidianSwordID;
	
	protected static int pinkCrystalID, purpleCrystalID, rubyID, sapphireID, orangeCrystalID, clearCrystalID, yellowCrystalID;
	protected static int strenghthenedFlintID;
	protected static int pinkCrystalSwordID, purpleCrystalSwordID, rubySwordID, sapphireSwordID, emeraldSwordID, orangeCrystalSwordID, flintSwordID, yellowCrystalSwordID;
	
	public static Block infoBlock, glowingInfoBlock, indicatorBlock, glowingIndicatorBlock;
	public static Block pinkCrystalBlock, purpleCrystalBlock, rubyBlock, sapphireBlock, orangeCrystalBlock, yellowCrystalBlock;
	public static Block pinkCrystalOre, purpleCrystalOre, rubyOre, sapphireOre, orangeCrystalOre, clearCrystalOre, yellowCrystalOre;
	public static Block pinkCrystalTorch, purpleCrystalTorch, orangeCrystalTorch, yellowCrystalTorch;
	
	public static Item pinkCrystal, purpleCrystal, ruby, sapphire, orangeCrystal, clearCrystal, yellowCrystal;
	public static Item strenghthenedFlint;
	public static Item pinkCrystalSword, purpleCrystalSword, rubySword, sapphireSword, emeraldSword, orangeCrystalSword, flintSword, yellowCrystalSword;
	public static Item obsidianSword;
	
	public static EnumToolMaterial crystalToolMaterial, obsidianToolMaterial, emeraldToolMaterial, rubyToolMaterial, sapphireToolMaterial, flintToolMaterial;
	
	EventManager eventmanager = new EventManager();
	FuelHandler fuelhandler = new FuelHandler();
	
	public static CreativeTabs tabsLC, tabsSS;
	
	@EventHandler
	public void preInit (FMLPreInitializationEvent event){
		// Process config stuff
		configPath = event.getSuggestedConfigurationFile();
		ConfigurationManager config = new ConfigurationManager();
		config.defaultConfig(configPath);
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event) {
		
		//Creative tab
		Utilities.loadCreativeTabs();
		
		//Enum Tool
		crystalToolMaterial = EnumHelper.addToolMaterial("crystalToolMaterial", 3, 2000, 7.0F, 3.5F, 24);
		obsidianToolMaterial = EnumHelper.addToolMaterial("obsidianToolMaterial", 3, 2500, 9.0F, 4F, 16);
		emeraldToolMaterial = EnumHelper.addToolMaterial("emeraldToolMaterial", 2, 1300, 6.0F, 3.0F, 18);
		rubyToolMaterial = EnumHelper.addToolMaterial("rubyToolMaterial", 2, 1300, 6.0F, 3.0F, 20);
		sapphireToolMaterial = EnumHelper.addToolMaterial("sapphireToolMaterial", 2, 1300, 6.0F, 3.0F, 22);
		flintToolMaterial = EnumHelper.addToolMaterial("flintToolMaterial", 2, 5000, 8.0F, 3.0F, 6);
		
		//Blocks
		infoBlock = new BlockInfo(infoBlockID, Material.rock).setLightValue(0.5F).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("infoBlock");
		glowingInfoBlock = new BlockGlowingInfo(glowingInfoBlockID, Material.rock).setLightValue(1.0F).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("glowingInfoBlock");
		indicatorBlock = new BlockIndicator(indicatorBlockID, Material.rock).setLightValue(0.5F).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("indicatorBlock");
		glowingIndicatorBlock = new BlockGlowingIndicator(glowingIndicatorBlockID, Material.rock).setLightValue(1.0F).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("glowingIndicatorBlock");
		
		//Crystal blocks
		pinkCrystalBlock = new PinkCrystalBlock(pinkCrystalBlockID, Material.rock).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("pinkCrystalBlock");
		purpleCrystalBlock = new PurpleCrystalBlock(purpleCrystalBlockID, Material.rock).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("purpleCrystalBlock");
		rubyBlock = new RubyBlock(rubyBlockID, Material.rock).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("rubyBlock");
		sapphireBlock = new SapphireBlock(sapphireBlockID, Material.rock).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("sapphireBlock");
		orangeCrystalBlock = new OrangeCrystalBlock(orangeCrystalBlockID, Material.rock).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("orangeCrystalBlock");
		yellowCrystalBlock = new YellowCrystalBlock(yellowCrystalBlockID, Material.rock).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("yellowCrystalBlock");
		
		//Ores
		pinkCrystalOre = new PinkCrystalOre(pinkCrystalOreID, Material.rock).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("pinkCrystalOre");
		purpleCrystalOre = new PurpleCrystalOre(purpleCrystalOreID, Material.rock).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("purpleCrystalOre");
		rubyOre = new RubyOre(rubyOreID, Material.rock).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("rubyOre");
		sapphireOre = new SapphireOre(sapphireOreID, Material.rock).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("sapphireOre");
		orangeCrystalOre = new OrangeCrystalOre(orangeCrystalOreID, Material.rock).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("orangeCrystalOre");
		clearCrystalOre = new ClearCrystalOre(clearCrystalOreID, Material.rock).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("clearCrystalOre");
		yellowCrystalOre = new YellowCrystalOre(yellowCrystalOreID, Material.rock).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("yellowCrystalOre");
		
		//Torches
		pinkCrystalTorch = new PinkCrystalTorch(pinkCrystalTorchID).setLightValue(1.0F).setUnlocalizedName("pinkCrystalTorch");
		purpleCrystalTorch = new PurpleCrystalTorch(purpleCrystalTorchID).setLightValue(1.0F).setUnlocalizedName("purpleCrystalTorch");
		orangeCrystalTorch = new OrangeCrystalTorch(orangeCrystalTorchID).setLightValue(1.0F).setUnlocalizedName("orangeCrystalTorch");
		yellowCrystalTorch = new YellowCrystalTorch(yellowCrystalTorchID).setLightValue(1.0F).setUnlocalizedName("yellowCrystalTorch");
		
		//Items
		pinkCrystal = new ItemPinkCrystal(pinkCrystalID).setUnlocalizedName("pinkCrystal");
		purpleCrystal = new ItemPurpleCrystal(purpleCrystalID).setUnlocalizedName("purpleCrystal");
		ruby = new ItemRuby(rubyID).setUnlocalizedName("ruby");
		sapphire = new ItemSapphire(sapphireID).setUnlocalizedName("sapphire");
		orangeCrystal = new ItemOrangeCrystal(orangeCrystalID).setUnlocalizedName("orangeCrystal");
		strenghthenedFlint = new StrengthenedFlint(strenghthenedFlintID).setUnlocalizedName("strenghthenedFlint");
		clearCrystal = new ItemClearCrystal(clearCrystalID).setUnlocalizedName("clearCrystal");
		yellowCrystal = new ItemYellowCrystal(yellowCrystalID).setUnlocalizedName("yellowCrystal");
		
		//Sword
		pinkCrystalSword = new PinkCrystalSword(pinkCrystalSwordID, crystalToolMaterial).setUnlocalizedName("pinkCrystalSword");
		purpleCrystalSword = new PurpleCrystalSword(purpleCrystalSwordID, crystalToolMaterial).setUnlocalizedName("purpleCrystalSword");
		rubySword = new RubySword(rubySwordID, rubyToolMaterial).setUnlocalizedName("rubySword");
		sapphireSword = new SapphireSword(sapphireSwordID, sapphireToolMaterial).setUnlocalizedName("sapphireSword");
		emeraldSword = new EmeraldSword(emeraldSwordID, emeraldToolMaterial).setUnlocalizedName("emeraldSword");
		orangeCrystalSword = new OrangeCrystalSword(orangeCrystalSwordID, crystalToolMaterial).setUnlocalizedName("orangeCrystalSword");
		obsidianSword = new ObsidianSword(obsidianSwordID, obsidianToolMaterial).setUnlocalizedName("obsidianSword");
		flintSword = new FlintSword(flintSwordID, flintToolMaterial).setUnlocalizedName("flintSword");
		yellowCrystalSword = new YellowCrystalSword(yellowCrystalSwordID, crystalToolMaterial).setUnlocalizedName("yellowCrystalSword");
		
		//Blocks
		registerBlock(infoBlock, "Information Block");
		registerBlock(glowingInfoBlock, "Glowing Information Block");
		registerBlock(indicatorBlock, "Indicator Block");
		registerBlock(glowingIndicatorBlock, "Glowing Indicator Block");
		
		//Crystal Blocks
		registerBlock(pinkCrystalBlock, "Pink Crystal Block");
		registerBlock(purpleCrystalBlock, "Purple Crystal Block");
		registerBlock(rubyBlock, "Ruby Block");
		registerBlock(sapphireBlock, "Sapphire Block");
		registerBlock(orangeCrystalBlock, "Orange Crystal Block");
		registerBlock(yellowCrystalBlock, "Yellow Crystal Block");
		
		//Ores
		registerBlock(pinkCrystalOre, "Pink Crystal Ore");
		registerBlock(purpleCrystalOre, "Purple Crystal Ore");
		registerBlock(rubyOre, "Ruby Ore");
		registerBlock(sapphireOre, "Sapphire Ore");
		registerBlock(orangeCrystalOre, "Orange Crystal Ore");
		registerBlock(clearCrystalOre, "Clear Crystal Ore");
		registerBlock(yellowCrystalOre, "Yellow Crystal Ore");
		
		//Torches
		registerBlock(pinkCrystalTorch, "Pink Crystal Torch");
		registerBlock(purpleCrystalTorch, "Purple Crystal Torch");
		registerBlock(orangeCrystalTorch, "Orange Crystal Torch");
		registerBlock(yellowCrystalTorch, "Yellow Crystal Torch");
		
		//Items
		registerItem(pinkCrystal, "Pink Crystal");
		registerItem(purpleCrystal, "Purple Crystal");
		registerItem(ruby, "Ruby");
		registerItem(sapphire, "Sapphire");
		registerItem(orangeCrystal, "Orange Crystal");
		registerItem(strenghthenedFlint, "Strenghthened Flint");
		registerItem(clearCrystal, "Clear Crystal");
		registerItem(yellowCrystal, "Yellow Crystal");
		
		//Swords
		registerItem(pinkCrystalSword, "Pink Crystal Sword");
		registerItem(purpleCrystalSword, "Purple Crystal Sword");
		registerItem(rubySword, "Ruby Sword");
		registerItem(sapphireSword, "Sapphire Sword");
		registerItem(emeraldSword, "Emerald Sword");
		registerItem(orangeCrystalSword, "Orange Crystal Sword");
		registerItem(obsidianSword, "Obsidian Sword");
		registerItem(flintSword, "Flint Sword");
		registerItem(yellowCrystalSword, "Yellow Crystal Sword");
		
		Utilities.loadAllRecipes();
		
		GameRegistry.registerWorldGenerator(eventmanager);
		GameRegistry.registerFuelHandler(fuelhandler);
		
	}
	
	public void registerBlock(Block block, String name) {
		Utilities.registerBlock(block, name, Info.modid);
	}
	
	public void registerItem(Item item, String name) {
		Utilities.registerItem(item, name, Info.modid);
	}

}
