package ru.nitdroid.liquids;

import net.minecraft.block.Block;
import net.minecraftforge.fluids.Fluid;


public class Liquids {
public static Fluid rocket_fluid;
public static Block rocket_Fluid_block;


    public static void init()
    {
        rocket_fluid = new RocketFluid();
        rocket_Fluid_block = new RocketFluidBlock();


    }




}