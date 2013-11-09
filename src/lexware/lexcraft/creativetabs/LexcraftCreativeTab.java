package lexware.lexcraft.creativetabs;

import lexware.lexcraft.Lexcraft;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.*;

public class LexcraftCreativeTab extends CreativeTabs {

    public LexcraftCreativeTab(String label) {
        super(label);
    }

    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex() {
        return Lexcraft.pinkCrystalSword.itemID;
    }

}