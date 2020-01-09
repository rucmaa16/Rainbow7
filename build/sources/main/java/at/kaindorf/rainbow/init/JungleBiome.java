package at.kaindorf.rainbow.init;

import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;

public class JungleBiome extends Biome {

    public JungleBiome(){
            super(new BiomeProperties("Junlge_Gun").setBaseHeight(1.0F).setHeightVariation(1.0F).setTemperature(1.5F).setRainDisabled());
            this.decorator.treesPerChunk = 100;
            this.decorator.flowersPerChunk = 100;
            this.decorator.grassPerChunk = 100;
            this.topBlock = Blocks.OBSIDIAN.getDefaultState();
            this.fillerBlock = Blocks.PACKED_ICE.getDefaultState();
            this.spawnableMonsterList.clear();
            this.spawnableCreatureList.clear();
            this.spawnableCreatureList.add(new SpawnListEntry(EntityCow.class, 10, 50, 100));
            this.spawnableMonsterList.add(new SpawnListEntry(EntityCreeper.class, 10000, 50, 450));
        }

}
