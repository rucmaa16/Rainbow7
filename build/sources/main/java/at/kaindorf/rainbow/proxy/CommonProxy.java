package at.kaindorf.rainbow.proxy;

import at.kaindorf.rainbow.Rainbow;
import at.kaindorf.rainbow.init.BiomeInit;
import at.kaindorf.rainbow.init.ItemInit;
import at.kaindorf.rainbow.items.BurstRifle;
import at.kaindorf.rainbow.items.VectorE;
import at.kaindorf.rainbow.items.WeaponItem;
import at.kaindorf.rainbow.items.shotgun;
import at.kaindorf.rainbow.items.tools.ToolSledgeHammer;
import at.kaindorf.rainbow.objects.ArmorBase;
import at.kaindorf.rainbow.tabs.WeaponTab;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Rainbow.MODID)
public class CommonProxy {


    public static final CreativeTabs weapontab = new WeaponTab("weapontab");

    public static Item VECTOR = new BurstRifle("vector");
    public static Item VECTOR1 = new VectorE("pistol");
    public static Item TOMMYGUN = new VectorE("tommygun");
    public static Item PISTOL2 = new VectorE("pistol2");
    public static Item GRIFF = new WeaponItem("griff");
    public static Item LAUF = new WeaponItem("lauf");
    public static Item SCHAFT = new WeaponItem("schaft");
    public static Item SCHIENE = new WeaponItem("schiene");
    public static Item SHOTGUN = new shotgun("shotgun");
    public static Item MAGAZINE = new WeaponItem("magazine");
    public static Item BULLET = new WeaponItem("bullet");
    public static Item SHOTGUNBULLET = new WeaponItem("shotgun_bullets");

    public static final Item.ToolMaterial MATERIAL_SLEDGE = EnumHelper.addToolMaterial("material_ruby", 10, 2000, 100.0f, 3.0f, 10);
    public static final ItemAxe SLEDGEHAMMER = new ToolSledgeHammer("sledgehammer", MATERIAL_SLEDGE);

    public static final ItemArmor.ArmorMaterial ARMOR_LORD = EnumHelper.addArmorMaterial("armor_lord",Rainbow.MODID + ":lord", 50, new int[] {10, 20, 18, 15}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,5.0f);
    public static final Item LORD_HELMET = new ArmorBase("lord_helmet", ARMOR_LORD, 1, EntityEquipmentSlot.HEAD);
    public static final Item LORD_CHESTPLATE = new ArmorBase("lord_chestplate", ARMOR_LORD, 1, EntityEquipmentSlot.CHEST);
    public static final Item LORD_LEGGINGS = new ArmorBase("lord_leggings", ARMOR_LORD, 2, EntityEquipmentSlot.LEGS);
    public static final Item LORD_BOOTS = new ArmorBase("lord_boots", ARMOR_LORD, 1, EntityEquipmentSlot.FEET);




    public void preInit(FMLPreInitializationEvent e) {

        BiomeInit.registerBiomes();
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
        event.getRegistry().registerAll(TOMMYGUN);
        event.getRegistry().registerAll(VECTOR1);
        event.getRegistry().registerAll(PISTOL2);
        event.getRegistry().registerAll(GRIFF);
        event.getRegistry().registerAll(LAUF);
        event.getRegistry().registerAll(SCHAFT);
        event.getRegistry().registerAll(SCHIENE);
        event.getRegistry().registerAll(SHOTGUN);
        event.getRegistry().registerAll(SLEDGEHAMMER);
        event.getRegistry().registerAll(MAGAZINE);
        event.getRegistry().registerAll(BULLET);

        event.getRegistry().registerAll(LORD_BOOTS);
        event.getRegistry().registerAll(LORD_CHESTPLATE);
        event.getRegistry().registerAll(LORD_HELMET);
        event.getRegistry().registerAll(LORD_LEGGINGS);
        event.getRegistry().registerAll(SHOTGUNBULLET);

    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
        registerRender(MAGAZINE);
        registerRender(VECTOR);
        registerRender(VECTOR1);
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

        registerRender(LORD_BOOTS);
        registerRender(LORD_CHESTPLATE);
        registerRender(LORD_HELMET);
        registerRender(LORD_LEGGINGS);
        registerRender(SHOTGUNBULLET);

    }

    private static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
        for(Item item1 : ItemInit.ITEMS)
        {
            Rainbow.proxy.registerItemRenderer(item1, 0, "inventory");
        }
    }
    public void registerItemRenderer(Item item, int meta, String id){

    }

    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> event) {

    }









}
