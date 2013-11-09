package lexware.lexcraft.blocks;

import lexware.lexcraft.Lexcraft;
import lexware.lexcraft.util.Info;
import cpw.mods.fml.relauncher.*;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;

public class BlockInfo extends Block {

	public BlockInfo(int id, Material material) {
		super(id, material);
		this.setCreativeTab(Lexcraft.tabsSS);
	}
	
	@SideOnly(Side.CLIENT)
	public static Icon topIcon;
	
	@SideOnly(Side.CLIENT)
	public static Icon sideIcon;
	
	@SideOnly(Side.CLIENT)
	public static Icon bottomIcon;
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		topIcon = icon.registerIcon(Info.modid + ":" + "infoBlock");
		sideIcon = icon.registerIcon(Info.modid + ":" + "infoBlock" + "_side");
		bottomIcon = icon.registerIcon(Info.modid + ":" + "infoBlock");
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
