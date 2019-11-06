package ru.nitdroid.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import ru.nitdroid.common.Main;
import ru.nitdroid.items.Items;

import java.util.Random;

import static ru.nitdroid.common.Main.tabNitCraft;

class OreRedDiamond extends Block {
    private static final String name = "red_diamond_ore";

    OreRedDiamond()
    {
        super(Material.rock);
        GameRegistry.registerBlock(this,name);
        setBlockName(name);
        setBlockTextureName(Main.MODID + ":" +name);
        setCreativeTab(tabNitCraft);
        setHardness(5.0F);
        setHarvestLevel("pickaxe",4);





    }

    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World world, int x, int y, int z, Random rand) {

        Random random = world.rand;
        double d0 = 0.0625D;

        for (int l = 0; l < 6; ++l)
        {
            double d1 = (double)((float)x + random.nextFloat());
            double d2 = (double)((float)y + random.nextFloat());
            double d3 = (double)((float)z + random.nextFloat());

            if (l == 0 && !world.getBlock(x, y + 1, z).isOpaqueCube())
            {
                d2 = (double)(y + 1) + d0;
            }

            if (l == 1 && !world.getBlock(x, y - 1, z).isOpaqueCube())
            {
                d2 = (double)(y) - d0;
            }

            if (l == 2 && !world.getBlock(x, y, z + 1).isOpaqueCube())
            {
                d3 = (double)(z + 1) + d0;
            }

            if (l == 3 && !world.getBlock(x, y, z - 1).isOpaqueCube())
            {
                d3 = (double)(z) - d0;
            }

            if (l == 4 && !world.getBlock(x + 1, y, z).isOpaqueCube())
            {
                d1 = (double)(x + 1) + d0;
            }

            if (l == 5 && !world.getBlock(x - 1, y, z).isOpaqueCube())
            {
                d1 = (double)(x) - d0;
            }

            if (d1 < (double)x || d1 > (double)(x + 1) || d2 < 0.0D || d2 > (double)(y + 1) || d3 < (double)z || d3 > (double)(z + 1))
            {
                world.spawnParticle("reddust", d1, d2, d3, 0.0D, 0.0D, 0.0D);
            }
        }
    }
    public Item getItemDropped(int metadata, Random random, int fortune){
        return Items.red_diamond;
    }
    public int quantityDropped(Random rand){
        return 0 + rand.nextInt(2);
    }

}
