package ru.nitdroid.liquids;

import net.minecraft.block.Block;
import net.minecraftforge.fluids.Fluid;


public class Liquids {
public static Fluid rocket_fluid;
public static Block rocket_Fluid_block;
public static Fluid rocket_fluid_enriched;
public static Block rocket_fluid_enriched_block;


    public static void init()
    {
        rocket_fluid = new RocketFluid();
        rocket_Fluid_block = new RocketFluidBlock();
        rocket_fluid_enriched = new RocketFluidEnriched();
        rocket_fluid_enriched_block = new RocketFluidEnrichedBlock();


    }




}