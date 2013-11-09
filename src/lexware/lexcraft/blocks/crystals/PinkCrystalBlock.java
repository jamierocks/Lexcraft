package lexware.lexcraft.blocks.crystals;

import java.util.Random;

import lexware.lexcraft.Lexcraft;
import lexware.lexcraft.util.Info;
import cpw.mods.fml.relauncher.*;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;

public class PinkCrystalBlock extends Block {

	public PinkCrystalBlock(int id, Material material) {
		super(id, material);
		this.setCreativeTab(Lexcraft.tabsLC);
	}
	
	@SideOnly(Side.CLIENT)
	public static Icon topIcon;
	
	@SideOnly(Side.CLIENT)
	public static Icon sideIcon;
	
	@SideOnly(Side.CLIENT)
	public static Icon bottomIcon;
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		topIcon = icon.registerIcon(Info.modid + ":" + (this.getUnlocalizedName().substring(5)));
		sideIcon = icon.registerIcon(Info.modid + ":" + (this.getUnlocalizedName().substring(5)) + "_side");
		bottomIcon = icon.registerIcon(Info.modid + ":" + (this.getUnlocalizedName().substring(5)));
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int metadata) {
		if(side == 0) {
			return bottomIcon;
		} else if(side == 1) {
			return topIcon;
		} else {
			return sideIcon;
		}
		
	}
	
}