package at.kaindorf.rainbow.objects;

import at.kaindorf.rainbow.init.BlockInit;
import at.kaindorf.rainbow.init.ItemInit;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipesBase {
    public static void init(){
        GameRegistry.addSmelting(BlockInit.COPPER_ORE, new ItemStack(ItemInit.INGOT_COPPER,1), 1.5F);
    }
}
