package ru.nitdroid.tools;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemSpade;
import ru.nitdroid.common.Main;

import static ru.nitdroid.common.Main.tabNitCraft;

 class RedDiamondShovel extends ItemSpade {
    private static final String name = "red_diamond_shovel";
     RedDiamondShovel(ToolMaterial material) {
        super(material);
        GameRegistry.registerItem(this,name);
        setCreativeTab(tabNitCraft);
        setTextureName(Main.MODID+":"+name);
        setUnlocalizedName(name);

    }

}
