package at.kaindorf.rainbow.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class WeaponItem extends Item {
    public WeaponItem(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.COMBAT);
    }
}
