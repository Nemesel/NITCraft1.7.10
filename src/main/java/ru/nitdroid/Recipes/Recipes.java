package ru.nitdroid.Recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import ru.nitdroid.blocks.Blocks;
import ru.nitdroid.food.Foods;
import ru.nitdroid.items.Items;
import ru.nitdroid.tools.Tools;

public class Recipes {





    public static void init()
    {
        //Блок красного алмаза
        GameRegistry.addRecipe(new ItemStack(Blocks.red_diamond_block), "XXX", "XXX", "XXX", 'X', Items.red_diamond);
        //И обратно
        GameRegistry.addShapelessRecipe(new ItemStack(Items.red_diamond, 9), Blocks.red_diamond_block);

        GameRegistry.addSmelting(new ItemStack(Items.red_diamond) , new ItemStack(Foods.cooked_red_diamond), 3.2F );
        GameRegistry.addSmelting(new ItemStack(Items.red_diamond_dust), new ItemStack(Blocks.red_diamond_glass), 5.0F);

        GameRegistry.addRecipe(new ItemStack((Tools.red_diamond_axe)),"DD ","DS "," S ", ('D'),Items.red_diamond,('S'), net.minecraft.init.Items.stick);
        GameRegistry.addRecipe(new ItemStack((Tools.red_diamond_shovel))," D "," S "," S ", ('D'),Items.red_diamond,('S'), net.minecraft.init.Items.stick);
        GameRegistry.addRecipe(new ItemStack((Tools.red_diamond_sword))," D "," D "," S ", ('D'),Items.red_diamond,('S'), net.minecraft.init.Items.stick);
        GameRegistry.addRecipe(new ItemStack((Tools.red_diamond_pickaxe)),"DDD"," S "," S ", ('D'),Items.red_diamond,('S'), net.minecraft.init.Items.stick);
        GameRegistry.addRecipe(new ItemStack((Tools.red_diamond_hoe)),"DD "," S "," S ", ('D'),Items.red_diamond,('S'), net.minecraft.init.Items.stick);
        GameRegistry.addRecipe(new ItemStack((Items.obsidian_stick)),"S  ","S  ","   ",('S'), net.minecraft.init.Blocks.obsidian);



    }
}
