package at.kaindorf.rainbow;

import at.kaindorf.rainbow.objects.RecipesBase;
import at.kaindorf.rainbow.proxy.CommonProxy;
import at.kaindorf.rainbow.world.ModWorldGen;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Rainbow.MODID, name = Rainbow.NAME, version = Rainbow.VERSION)
public class Rainbow {
    public static final String MODID = "rainbow";
    public static final String NAME = "Rainbow 7";
    public static final String VERSION = "0.8";
    public static final int ENTITY_BULLET = 251;

    @Mod.Instance
    public static Rainbow instance;

    @SidedProxy(clientSide = "at.kaindorf.rainbow.proxy.ClientProxy", serverSide = "at.kaindorf.rainbow.proxy.ServerProxy")
    public static CommonProxy proxy;


    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
        GameRegistry.registerWorldGenerator(new ModWorldGen(),3);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

        proxy.init(event);
        RecipesBase.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
