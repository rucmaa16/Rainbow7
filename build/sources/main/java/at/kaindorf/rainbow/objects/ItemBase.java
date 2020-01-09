package at.kaindorf.rainbow.objects;

import at.kaindorf.rainbow.Rainbow;
import at.kaindorf.rainbow.init.ItemInit;
import at.kaindorf.rainbow.proxy.ClientProxy;
import at.kaindorf.rainbow.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Rainbow.proxy.registerItemRenderer(this,0,"inventory");
    }
}
