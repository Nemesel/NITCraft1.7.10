package ru.nitdroid.tools;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class Tools {
    public static Item red_diamond_pickaxe;
    public static Item red_diamond_shovel;
    public static Item red_diamond_sword;
    public static Item red_diamond_hoe;
    public static Item red_diamond_axe;
//diamond level 3
    private static final Item.ToolMaterial redDiamondMaterial = EnumHelper.addToolMaterial("redDiamondToolMaterial",4,2500,10.0F,0.5F, 15);
    public static void init()
    {
        red_diamond_pickaxe =   new RedDiamondPickaxe(redDiamondMaterial);//Ready
        red_diamond_shovel  =   new RedDiamondShovel(redDiamondMaterial);//Ready
        red_diamond_sword   =   new RedDiamondSword(redDiamondMaterial);//Ready
        red_diamond_axe     =   new RedDiamondAxe(redDiamondMaterial);//Ready
        red_diamond_hoe     =   new RedDiamondHoe(redDiamondMaterial);//Ready

    }
}
