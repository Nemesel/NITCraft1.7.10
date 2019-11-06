package ru.nitdroid.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import ru.nitdroid.common.Main;

import static ru.nitdroid.common.Main.tabNitCraft;

class BlockRedDiamond extends Block {
    private static final String name = "red_diamond_block";

    BlockRedDiamond()
    {
        super(Material.rock);
        GameRegistry.registerBlock(this, name);
        setBlockName(name);
        setBlockTextureName(Main.MODID + ":" + name);
        setCreativeTab(tabNitCraft);
    }
}
