package ru.nitdroid.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;
import ru.nitdroid.common.Main;

import static ru.nitdroid.common.Main.tabNitCraft;


public class GlassRedDiamond extends BlockBreakable {

    public static final String name = "red_diamond_glass";

   public GlassRedDiamond(Material materialIn ,boolean ignoreSimilarityIn)
    {
        super(Main.MODID+":"+name,materialIn.glass, ignoreSimilarityIn);
        GameRegistry.registerBlock(this,name);
        setBlockName(name);
        setBlockTextureName(Main.MODID+":"+name);
        setCreativeTab(tabNitCraft);
        setLightOpacity(3);
        setStepSound(soundTypeGlass);
    }





}
