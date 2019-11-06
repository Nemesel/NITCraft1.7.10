
package ru.nitdroid.items;
import net.minecraft.item.Item;


public class Items {

    public static Item red_diamond;
    public static Item red_diamond_dust;
    public static Item obsidian_stick;
    public static Item magick_stick;

    public static Item plate_tier_1;
    public static Item plate_tier_2;
    public static Item plate_tier_3;


    public static void init()
    {

        red_diamond = new RedDiamond();
        red_diamond_dust = new RedDiamondDust();
        obsidian_stick = new  ObsidianStick();
        magick_stick = new MagicStick();

        plate_tier_1 = new PlateTier1();
        plate_tier_2 = new PlateTier2();
        plate_tier_3 = new PlateTier3();

    }
}
