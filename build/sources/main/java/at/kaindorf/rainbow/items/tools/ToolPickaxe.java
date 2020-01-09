package at.kaindorf.rainbow.items.tools;

import at.kaindorf.rainbow.Rainbow;
import at.kaindorf.rainbow.init.ItemInit;
import at.kaindorf.rainbow.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class ToolPickaxe extends ItemPickaxe implements IHasModel {

    public ToolPickaxe(String name, Item.ToolMaterial material){
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.TOOLS);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Rainbow.proxy.registerItemRenderer(this,0,"inventory");
    }
}
