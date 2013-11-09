package lexware.lexcraft.creativetabs;

import lexware.lexcraft.Lexcraft;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.*;

public class ServerStuffCreativeTab extends CreativeTabs {

    public ServerStuffCreativeTab(String label) {
        super(label);
    }

    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex() {
    	return Lexcraft.infoBlock.blockID;
    }

}