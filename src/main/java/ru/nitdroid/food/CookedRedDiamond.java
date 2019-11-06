package ru.nitdroid.food;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemFood;
import ru.nitdroid.common.Main;

import static ru.nitdroid.common.Main.tabNitCraft;

class CookedRedDiamond extends ItemFood {
    private static final String name = "cooked_red_diamond";

    CookedRedDiamond() {
        super(20, 5F, true);
        setCreativeTab(tabNitCraft);
        GameRegistry.registerItem(this,name);
        setUnlocalizedName(name);
        setTextureName(Main.MODID+":"+name);
    }
}
