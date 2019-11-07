package ru.nitdroid.liquids;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class RocketFluidEnriched extends Fluid
{
    public static final String name = "rocket_fluid_enriched";
    public RocketFluidEnriched()
    {
        super(name);
        setDensity(5);
        setViscosity(800);
        FluidRegistry.registerFluid(this);
        setBlock(Liquids.rocket_fluid_enriched_block);
        setUnlocalizedName(name);
    }
}
