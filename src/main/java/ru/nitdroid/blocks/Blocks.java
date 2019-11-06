package ru.nitdroid.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.StatCollector;
import net.minecraftforge.fluids.Fluid;

public class Blocks {

    public static Block red_diamond_block;
    public static Block red_diamond_ore;
    public static Block red_diamond_glass;

    public static void init()
    {
        red_diamond_block = new BlockRedDiamond();
        red_diamond_ore = new OreRedDiamond();
        red_diamond_glass = new GlassRedDiamond(Material.glass,false);
    }


}


