package ru.nitdroid.common;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import ru.nitdroid.Recipes.Recipes;
import ru.nitdroid.blocks.Blocks;
import ru.nitdroid.entity.Entity;
import ru.nitdroid.events.Events;
import ru.nitdroid.food.Foods;
import ru.nitdroid.items.Items;
import ru.nitdroid.liquids.Liquids;
import ru.nitdroid.liquids.RocketFluid;
import ru.nitdroid.tools.Tools;


@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION)

public class Main {
    static final String NAME = "NITCraft";
    public static final String MODID = "nitcraft";
    static final String VERSION = "1.7.10-A1.0.0.3";

    public static CreativeTabs tabNitCraft = new CreativeTabs("tabNitCraft") {
        @Override
        public Item getTabIconItem() {
            return new ItemStack(Items.red_diamond).getItem();
        }
    };
     private static OreGen oregen = new OreGen();




    @Mod.Instance("nitcraft")
    public static Main instance;
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        //Регистрация блоков, рецептов, предметов  РЕЦЕПТЫ ВСЕГДА ПОСЛЕДНИМИ!!!!!
//        Liquids.init();


        Liquids.init();
        Items.init();
        Tools.init();
        Blocks.init();
        Foods.init();
        Recipes.init();
        Entity.init();
        GameRegistry.registerWorldGenerator(oregen, 0);


    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        //Регистрация еентов, пакетов, ентити, тайлентити
        MinecraftForge.EVENT_BUS.register(new Events());
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        //Получаем список загруженых предметов, блоков, евентов, пакетов, ентити, тайлентити
    }
}

