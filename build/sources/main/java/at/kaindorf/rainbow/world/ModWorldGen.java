package at.kaindorf.rainbow.world;

import at.kaindorf.rainbow.init.BlockInit;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class ModWorldGen implements IWorldGenerator {
    @Override
    public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider){
        if(world.provider.getDimension()==0){
            generateOverworld(rand, chunkX,chunkZ,world,chunkGenerator,chunkProvider);
        }
    }

    private void generateOverworld(Random rand, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider){
        generateOre(BlockInit.COPPER_ORE.getDefaultState(),world,rand,chunkX * 16, chunkZ * 16,16,64,rand.nextInt(7) + 3, 60);
    }

    private void generateOre(IBlockState ore, World world, Random rand, int x, int z, int minY, int maxY, int size, int chances){
        int deltaY = maxY - minY;

        for(int i = 0; i < chances; i++){
            BlockPos pos = new BlockPos(x + rand.nextInt(16), minY + rand.nextInt(deltaY), z + rand.nextInt(16));
            WorldGenMinable generator = new WorldGenMinable(ore,size);
            generator.generate(world,rand,pos);
        }
    }
}
