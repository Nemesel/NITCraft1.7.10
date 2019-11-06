package ru.nitdroid.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import ru.nitdroid.common.Main;
import ru.nitdroid.entity.RedBullet;


import static ru.nitdroid.common.Main.tabNitCraft;

public class MagicStick extends net.minecraft.item.Item {
    public static final String name = "magic_stick";

    public MagicStick(){
        setFull3D();
        setCreativeTab(tabNitCraft);
        setTextureName(Main.MODID+":"+name);
        setUnlocalizedName(name);
        setNoRepair();
        setMaxStackSize(1);
        GameRegistry.registerItem(this,name);


    }
    @Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player)
    {
        if(player.capabilities.isCreativeMode || player.inventory.consumeInventoryItem(Items.red_diamond))
        {
            player.swingItem();
            world.playSoundAtEntity(player, Main.MODID+":"+name, 0.5F,1.0F);
            if(!world.isRemote)
            {
                world.spawnEntityInWorld(new RedBullet(world,player));
            }
        }
        return itemStack;
     }
}
