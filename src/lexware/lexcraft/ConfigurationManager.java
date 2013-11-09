package lexware.lexcraft;

import java.io.File;

import net.minecraftforge.common.Configuration;

public class ConfigurationManager {
	
	public void defaultConfig(File configPath){
		
		Configuration cfg = new Configuration(configPath);

		cfg.load();
		
		//Blocks
		Lexcraft.infoBlockID = cfg.getBlock("Information Block", 500).getInt();
		Lexcraft.glowingInfoBlockID = cfg.getBlock("Glowing Information Block", 501).getInt();
		Lexcraft.indicatorBlockID = cfg.getBlock("Indicator Block", 502).getInt();
		Lexcraft.glowingIndicatorBlockID = cfg.getBlock("Glowing Indicator Block", 503).getInt();
		
		//Ores
		Lexcraft.pinkCrystalOreID = cfg.getBlock("Pink Crystal Ore", 600).getInt();
		Lexcraft.purpleCrystalOreID = cfg.getBlock("Purple Crystal Ore", 601).getInt();
		Lexcraft.rubyOreID = cfg.getBlock("Ruby Ore", 602).getInt();
		Lexcraft.sapphireOreID = cfg.getBlock("Sapphire Ore", 603).getInt();
		
		//Crystal Blocks
		Lexcraft.pinkCrystalBlockID = cfg.getBlock("Pink Crystal Block", 604).getInt();
		Lexcraft.purpleCrystalBlockID = cfg.getBlock("Purple Crystal Block", 605).getInt();
		Lexcraft.rubyBlockID = cfg.getBlock("Ruby Block", 606).getInt();
		Lexcraft.sapphireBlockID = cfg.getBlock("Blue Crystal Block", 607).getInt();
		
		Lexcraft.orangeCrystalOreID = cfg.getBlock("Orange Crystal Ore", 609).getInt();
		
		Lexcraft.orangeCrystalBlockID = cfg.getBlock("Orange Crystal Block", 611).getInt();
		
		//torches
		Lexcraft.pinkCrystalTorchID = cfg.getBlock("Pink Crystal Torch", 612).getInt();
		Lexcraft.purpleCrystalTorchID = cfg.getBlock("Purple Crystal Torch", 613).getInt();
		Lexcraft.orangeCrystalTorchID = cfg.getBlock("Orange Crystal Torch", 617).getInt();
		
		Lexcraft.clearCrystalOreID = cfg.getBlock("Clear Crystal Ore", 618).getInt();
		Lexcraft.yellowCrystalOreID = cfg.getBlock("Yellow Crystal Ore", 619).getInt();
		
		Lexcraft.yellowCrystalTorchID = cfg.getBlock("Yellow Crystal Torch", 620).getInt();
		
		//Items
		Lexcraft.pinkCrystalID = cfg.getItem("Pink Crystal", 5000).getInt();
		Lexcraft.purpleCrystalID = cfg.getItem("Purple Crystal", 5001).getInt();
		Lexcraft.rubyID = cfg.getItem("Ruby", 5002).getInt();
		Lexcraft.sapphireID = cfg.getItem("Sapphire", 5003).getInt();
		Lexcraft.orangeCrystalID = cfg.getItem("Orange Crystal", 5005).getInt();
		Lexcraft.strenghthenedFlintID = cfg.getItem("Strenghthened Flint", 5006).getInt();
		Lexcraft.clearCrystalID = cfg.getItem("Clear Crystal", 5007).getInt();
		Lexcraft.yellowCrystalID = cfg.getItem("Yellow Crystal", 5008).getInt();
		
		//Swords
		Lexcraft.pinkCrystalSwordID = cfg.getItem("Pink Crystal Sword", 7000).getInt();
		Lexcraft.purpleCrystalSwordID = cfg.getItem("Purple Crystal Sword", 7001).getInt();
		Lexcraft.rubySwordID = cfg.getItem("Ruby Sword", 7002).getInt();
		Lexcraft.sapphireSwordID = cfg.getItem("Sapphire Sword", 7003).getInt();
		Lexcraft.emeraldSwordID = cfg.getItem("Emerald Sword", 7004).getInt();
		Lexcraft.orangeCrystalSwordID = cfg.getItem("Orange Crystal Sword", 7005).getInt();
		Lexcraft.obsidianSwordID = cfg.getItem("Obsidian Sword", 7006).getInt();
		Lexcraft.flintSwordID = cfg.getItem("Flint Sword", 7007).getInt();
		Lexcraft.yellowCrystalSwordID = cfg.getItem("Yellow Crystal Sword", 7008).getInt();
		
		cfg.save();
		
	}
}
