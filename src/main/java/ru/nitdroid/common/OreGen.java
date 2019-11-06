package ru.nitdroid.common;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class OreGen implements IWorldGenerator {
    @Override
    public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

        generateOverworld(rand, chunkX, chunkZ, world);

    }

    private void generateOverworld(Random rand, int chunkX, int chunkZ, World world) {

        generateOverworld(world, rand, chunkX * 16, chunkZ * 16);

    }


    public void generateOverworld(World world, Random rand, int blockXPos, int blockZPos) {

        addOreSpawn(ru.nitdroid.blocks.Blocks.red_diamond_ore, Blocks.stone, world, rand, blockXPos, blockZPos, 16, 16, 10, 30, 4, 8, 60, 5, 60);

    }



    public static void addOreSpawn(Block ore, Block replace, World world, Random rand, int blockXPos, int blockZPos, int maxX, int maxZ,
                                   int minVeinSize, int maxVeinSize, int minVeinsPerChunk, int maxVeinsPerChunk, int chanceToSpawn, int minY, int maxY) {
        if (rand.nextInt(101) < (100 - chanceToSpawn)) return;
        int veins = rand.nextInt(maxVeinsPerChunk - minVeinsPerChunk + 1) + minVeinsPerChunk;
        for (int i = 0; i < veins; i++) {
            int posX = blockXPos + rand.nextInt(maxX);
            int posY = minY + rand.nextInt(maxY - minY);
            int posZ = blockZPos + rand.nextInt(maxZ);
            (new WorldGenMinable(ore, minVeinSize + rand.nextInt(maxVeinSize - minVeinSize + 1),
                    replace)).generate(world, rand, posX, posY, posZ);
        }  //Тут уже есть свой генератор руды)
    }
}
