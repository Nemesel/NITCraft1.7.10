package ru.nitdroid.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import ru.nitdroid.common.Main;

import static ru.nitdroid.common.Main.tabNitCraft;

public class PlateTier3 extends Item
{
    private static final String name = "plate_tier_3";

    PlateTier3()
    {
        GameRegistry.registerItem(this, name);
        setCreativeTab(tabNitCraft);
        setTextureName(Main.MODID+":"+name);
        setUnlocalizedName(name);
    }
}
