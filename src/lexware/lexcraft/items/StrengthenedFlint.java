package lexware.lexcraft.items;

import lexware.lexcraft.Lexcraft;
import lexware.lexcraft.util.Info;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class StrengthenedFlint extends Item {

	public StrengthenedFlint(int id) {
		super(id);
		this.setCreativeTab(Lexcraft.tabsLC);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		this.itemIcon = icon.registerIcon(Info.modid + ":" + (this.getUnlocalizedName().substring(5)));
	}

}
