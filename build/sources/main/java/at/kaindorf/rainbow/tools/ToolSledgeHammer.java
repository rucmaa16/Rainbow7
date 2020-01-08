package at.kaindorf.rainbow.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class ToolSledgeHammer extends ItemAxe {
    public ToolSledgeHammer(String name, ToolMaterial material){
        super(material, 50.0f, 1.0f);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.COMBAT);
    }
}
