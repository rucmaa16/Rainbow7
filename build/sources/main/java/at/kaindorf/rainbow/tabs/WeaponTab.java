package at.kaindorf.rainbow.tabs;

import at.kaindorf.rainbow.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class WeaponTab extends CreativeTabs {
    public WeaponTab(String label) { super("weapontab");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemInit.INGOT_COPPER);
    }


}
