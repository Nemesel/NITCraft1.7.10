package ru.nitdroid.liquids;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;


public class RocketFluid extends Fluid
{
    public static final String name = "rocket_fluid";

    public RocketFluid()
    {
        super(name);
        setDensity(10);
        setViscosity(1000);
        FluidRegistry.registerFluid(this);
        setBlock(Liquids.rocket_Fluid_block);
        setUnlocalizedName(name);


    }


}
