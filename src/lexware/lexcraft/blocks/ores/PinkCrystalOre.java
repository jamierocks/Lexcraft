package lexware.lexcraft.blocks.ores;

import java.util.Random;

import lexware.lexcraft.Lexcraft;
import lexware.lexcraft.util.Info;
import cpw.mods.fml.relauncher.*;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class PinkCrystalOre extends Block {

	public PinkCrystalOre(int id, Material material) {
		super(id, material);
		this.setCreativeTab(Lexcraft.tabsLC);
	}
	
	public int idDropped(int par1, Random par2Random, int par3) {
		return Lexcraft.pinkCrystal.itemID;
	}
	
	public int quantityDropped(Random rand) {
		return 2 + rand.nextInt(2);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		this.blockIcon = icon.registerIcon(Info.modid + ":" + (this.getUnlocalizedName().substring(5)));
	}
	
	public void dropBlockAsItemWithChance(World world, int par2, int par3, int par4, int par5, float par6, int par7) {
		super.dropBlockAsItemWithChance(world, par2, par3, par4, par5, par6, par7);
		
		if(this.idDropped(par5, world.rand, par7) != this.blockID) {
			int xp = 0;
			xp = MathHelper.getRandomIntegerInRange(world.rand, 2, 12);
			
			this.dropXpOnBlockBreak(world, par2, par3, par4, xp);
		}
	}
	
}