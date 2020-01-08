package at.kaindorf.rainbow.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class KeyItem extends Item {
    public KeyItem(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MISC);
    }
}
