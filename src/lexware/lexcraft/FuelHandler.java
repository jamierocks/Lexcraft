package lexware.lexcraft;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler {
	
	private int burnTime = 2400;

	public int getBurnTime(ItemStack fuel) {
		if(fuel.itemID == Lexcraft.pinkCrystal.itemID) {
			return burnTime;
		} else if(fuel.itemID == Lexcraft.purpleCrystal.itemID) {
			return burnTime;
		} else if(fuel.itemID == Lexcraft.orangeCrystal.itemID) {
			return burnTime;
		} else {
			return 0;
		}
		
	}

}
