package ru.nitdroid.tools;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemAxe;
import ru.nitdroid.common.Main;

import static ru.nitdroid.common.Main.tabNitCraft;

class RedDiamondAxe extends ItemAxe {
    private static final String name = "red_diamond_axe";
    RedDiamondAxe(ToolMaterial material) {
        super(material);
        GameRegistry.registerItem(this,name);
        setCreativeTab(tabNitCraft);
        setTextureName(Main.MODID+":"+name);
        setUnlocalizedName(name);
    }
}
