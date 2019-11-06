package ru.nitdroid.tools;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemSword;
import ru.nitdroid.common.Main;

import static ru.nitdroid.common.Main.tabNitCraft;

public class RedDiamondSword extends ItemSword {
    public static final String name = "red_diamond_sword";

     RedDiamondSword(ToolMaterial material) {
        super(material);
        GameRegistry.registerItem(this,name);
        setCreativeTab(tabNitCraft);
        setTextureName(Main.MODID+":"+name);
        setUnlocalizedName(name);
    }
}
