package at.kaindorf.rainbow;

import at.kaindorf.rainbow.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Rainbow.MODID, name = Rainbow.NAME, version = Rainbow.VERSION)
public class Rainbow {
    public static final String MODID = "rainbow";
    public static final String NAME = "Rainbow 7";
    public static final String VERSION = "0.8";

    @Mod.Instance
    public static Rainbow instance;

    @SidedProxy(clientSide = "at.kaindorf.rainbow.proxy.ClientProxy", serverSide = "at.kaindorf.rainbow.proxy.ServerProxy")
    public static CommonProxy proxy;


    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
