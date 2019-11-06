package ru.nitdroid.food;


import net.minecraft.item.ItemFood;

public class Foods {
    public static ItemFood cooked_red_diamond;

    public static  void init()
    {
        cooked_red_diamond = new CookedRedDiamond();


    }

}
