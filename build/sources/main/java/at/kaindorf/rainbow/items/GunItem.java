package at.kaindorf.rainbow.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class GunItem extends Item {
    public GunItem(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.COMBAT);
        setMaxStackSize(1);
    }
}
