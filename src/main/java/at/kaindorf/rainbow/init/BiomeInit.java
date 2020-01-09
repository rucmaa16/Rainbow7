package at.kaindorf.rainbow.init;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeJungle;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.common.registry.ForgeRegistries;


public class BiomeInit {

    public static final Biome JUNGLE_GUN = new JungleBiome();

    public static void registerBiomes(){
        initBiome(JUNGLE_GUN, "JUNGLE_GUN", BiomeManager.BiomeType.ICY,BiomeDictionary.Type.DRY);
    }

    private static Biome initBiome(Biome biome, String name, BiomeManager.BiomeType biomeType, BiomeDictionary.Type type){
        biome.setRegistryName(name);
        ForgeRegistries.BIOMES.register(biome);
        System.out.println("Biome Registered");
        BiomeDictionary.addTypes(biome,type);
        BiomeManager.addBiome(biomeType, new BiomeManager.BiomeEntry(biome,100000000));
        System.out.println("Biome Added");
        return biome;
    }
}
