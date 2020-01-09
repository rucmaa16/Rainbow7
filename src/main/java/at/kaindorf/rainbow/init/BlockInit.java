package at.kaindorf.rainbow.init;

import at.kaindorf.rainbow.items.tools.ToolSword;
import at.kaindorf.rainbow.objects.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {

    public static final List<Block> BLOCKS = new ArrayList<Block>();
    public static final Block BLOCK_COPPER = new BlockBase("block_copper", Material.IRON);

    public static final Block COPPER_ORE = new CopperOre("copper_ore", Material.IRON);

}
