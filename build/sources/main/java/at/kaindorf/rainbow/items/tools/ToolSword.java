package at.kaindorf.rainbow.items.tools;

import at.kaindorf.rainbow.Rainbow;
import at.kaindorf.rainbow.init.ItemInit;
import at.kaindorf.rainbow.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel {

    public ToolSword(String name, ToolMaterial material){
        super(material);
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
