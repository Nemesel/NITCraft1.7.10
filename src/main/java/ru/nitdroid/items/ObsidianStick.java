package ru.nitdroid.items;

import cpw.mods.fml.common.registry.GameRegistry;
import ru.nitdroid.common.Main;

import static ru.nitdroid.common.Main.tabNitCraft;

public class ObsidianStick extends net.minecraft.item.Item {
    public static final String name = "obsidian_stick";

    public ObsidianStick() {
        setFull3D();
        setCreativeTab(tabNitCraft);
        setTextureName(Main.MODID+":"+name);
        setUnlocalizedName(name);
        setNoRepair();
        setContainerItem(Items.red_diamond);
        setMaxStackSize(4);
        GameRegistry.registerItem(this,name);
    }
}
