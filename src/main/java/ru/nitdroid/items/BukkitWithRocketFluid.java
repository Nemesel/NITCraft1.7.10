package ru.nitdroid.items;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBucket;
import ru.nitdroid.common.Main;

public class BukkitWithRocketFluid extends ItemBucket{

    public BukkitWithRocketFluid(Block fluidblock) {
        super(fluidblock);
        this.setCreativeTab(Main.tabNitCraft);
        this.setContainerItem(Items.bucket);
        this.setUnlocalizedName("diamondliquidbucket");
        this.setTextureName(Main.MODID + ":" + "diamondliquidbucket");
    }

}