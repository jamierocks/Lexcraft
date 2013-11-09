package lexware.lexcraft.items.swords;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import lexware.lexcraft.Lexcraft;
import lexware.lexcraft.util.Info;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;

public class YellowCrystalSword extends ItemSword {

	public YellowCrystalSword(int id, EnumToolMaterial toolMaterial) {
		super(id, toolMaterial);
		this.setCreativeTab(Lexcraft.tabsLC);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		this.itemIcon = icon.registerIcon(Info.modid + ":" + (this.getUnlocalizedName().substring(5)));
	}

}
