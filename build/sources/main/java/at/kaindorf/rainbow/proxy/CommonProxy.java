package at.kaindorf.rainbow.proxy;

import at.kaindorf.rainbow.Rainbow;
import at.kaindorf.rainbow.items.GunItem;
import at.kaindorf.rainbow.items.WeaponItem;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
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
    public static Item TOMMYGUN = new GunItem("tommygun");
    public static Item PISTOL = new GunItem("pistol");
    public static Item VECTOR = new GunItem("vector");
    public static Item PISTOL2 = new GunItem("pistol2");
    public static Item GRIFF = new WeaponItem("griff");
    public static Item LAUF = new WeaponItem("lauf");
    public static Item SCHAFT = new WeaponItem("schaft");
    public static Item SCHIENE = new WeaponItem("schiene");
    public static Item SHOTGUN = new GunItem("shotgun");
    public static Item SLEDGEHAMMER = new GunItem("sledgehammer");
    public static Item MAGAZINE = new WeaponItem("magazine");
    public static Item BULLET = new WeaponItem("bullet");

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
        event.getRegistry().registerAll(VECTOR);
        event.getRegistry().registerAll(PISTOL);
        event.getRegistry().registerAll(TOMMYGUN);
        event.getRegistry().registerAll(PISTOL2);
        event.getRegistry().registerAll(GRIFF);
        event.getRegistry().registerAll(LAUF);
        event.getRegistry().registerAll(SCHAFT);
        event.getRegistry().registerAll(SCHIENE);
        event.getRegistry().registerAll(SHOTGUN);
        event.getRegistry().registerAll(SLEDGEHAMMER);
        event.getRegistry().registerAll(MAGAZINE);
        event.getRegistry().registerAll(BULLET);
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
        registerRender(VECTOR);
        registerRender(PISTOL);
        registerRender(TOMMYGUN);
        registerRender(PISTOL2);
        registerRender(GRIFF);
        registerRender(LAUF);
        registerRender(SCHAFT);
        registerRender(SCHIENE);
        registerRender(SHOTGUN);
        registerRender(SLEDGEHAMMER);
        registerRender(MAGAZINE);
        registerRender(BULLET);
    }

    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
    }

    private static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
