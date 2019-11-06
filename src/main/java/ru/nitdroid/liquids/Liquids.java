package ru.nitdroid.liquids;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;


public class Liquids {



    public static void init()
    {
          Fluid RocketFluidOil = new Fluid("RocketFluid");
            RocketFluidOil.setIcons(RocketFluidOil.getStillIcon());
          Block blockfluid01;
        {
            FluidRegistry.registerFluid(RocketFluidOil);//регистрация самой жидкости
            blockfluid01 = new RocketFluid(RocketFluidOil, Material.water).setBlockName("RocketFluid");//блок и его настройки.
        }

        GameRegistry.registerBlock(blockfluid01, "RocketFluid_Block");//Регистрация блока жидкости.
        LanguageRegistry.addName(blockfluid01, "Rocket Fluid");//Название жидкости

    }




}