package at.kaindorf.rainbow.proxy;

import at.kaindorf.rainbow.Rainbow;
import at.kaindorf.rainbow.items.KeyItem;
import at.kaindorf.rainbow.items.WeaponItem;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Rainbow.MODID)
public class CommonProxy {

    public static Item KEY_GRAY = new KeyItem("graykey");
    public static Item MAGAZINE = new WeaponItem("magazine");
    public static Item VECTOR = new WeaponItem("vector");

    public void preInit(FMLPreInitializationEvent e) {

    }

    public void init(FMLInitializationEvent e) {

    }

    public void postInit(FMLPostInitializationEvent e) {

    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(KEY_GRAY);
        event.getRegistry().registerAll(MAGAZINE);
        event.getRegistry().registerAll(VECTOR);
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
        registerRender(KEY_GRAY);
        registerRender(MAGAZINE);
        registerRender(VECTOR);
    }

    private static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
