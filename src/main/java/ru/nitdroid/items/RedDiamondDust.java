package ru.nitdroid.items;

import cpw.mods.fml.common.registry.GameRegistry;
import ru.nitdroid.common.Main;

import static ru.nitdroid.common.Main.tabNitCraft;

class RedDiamondDust extends net.minecraft.item.Item {
    private static final String name = "red_diamond_dust";

    RedDiamondDust(){
        GameRegistry.registerItem(this,name);
        setCreativeTab(tabNitCraft);
        setTextureName(Main.MODID+":" + name);
        setUnlocalizedName(name);
        setFull3D();
        setMaxStackSize(8);

    }
}
