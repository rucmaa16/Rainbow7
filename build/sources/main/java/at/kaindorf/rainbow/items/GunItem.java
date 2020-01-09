package at.kaindorf.rainbow.items;

import at.kaindorf.rainbow.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class GunItem extends Item {
    public GunItem(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CommonProxy.weapontab);
        setMaxStackSize(1);
    }
}
