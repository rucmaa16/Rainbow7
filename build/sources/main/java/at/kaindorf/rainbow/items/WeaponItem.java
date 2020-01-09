package at.kaindorf.rainbow.items;

import at.kaindorf.rainbow.Rainbow;
import at.kaindorf.rainbow.proxy.CommonProxy;
import at.kaindorf.rainbow.tabs.WeaponTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class WeaponItem extends Item {
    public WeaponItem(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CommonProxy.weapontab);
    }
}
