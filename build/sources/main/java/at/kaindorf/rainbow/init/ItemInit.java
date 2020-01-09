package at.kaindorf.rainbow.init;

import at.kaindorf.rainbow.items.GunItem;
import at.kaindorf.rainbow.items.WeaponItem;
import at.kaindorf.rainbow.items.tools.ToolPickaxe;
import at.kaindorf.rainbow.items.tools.ToolSword;
import at.kaindorf.rainbow.objects.ItemBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {
    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final Item INGOT_COPPER = new ItemBase("ingot_copper");

    //Materials
    public static final Item.ToolMaterial MATERIAL_COPPER = EnumHelper.addToolMaterial("material_copper", 2, 500, 7.0F,3.0F, 14);

    //Tools
    public static final ItemSword COPPER_SWORD = new ToolSword("copper_sword", MATERIAL_COPPER);
    public static final ItemPickaxe COPPER_PICKAXE = new ToolPickaxe("copper_pickaxe", MATERIAL_COPPER);



}
