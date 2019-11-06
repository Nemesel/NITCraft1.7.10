package ru.nitdroid.events;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.player.PlayerUseItemEvent;
import net.minecraftforge.event.world.BlockEvent;
import ru.nitdroid.blocks.Blocks;
import ru.nitdroid.items.Items;


public class Events {
//    @SubscribeEvent
//    public void onMobDrop(LivingDropsEvent event)
//    {
//        if (event.entity instanceof EntityPig) //TODO Добавляет дроп красного алмаза со свиней
//        {
//            event.drops.clear();
//            ItemStack stack = new ItemStack(Items.red_diamond);
//            EntityItem drop = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, stack);
//            event.drops.add(drop);
//
//        }
//    }
    @SubscribeEvent
    public void onOreBreake(BlockEvent.BreakEvent event) {
        if (event.block == Blocks.red_diamond_ore) {
            System.out.println(event.getPlayer());
            event.world.spawnEntityInWorld(new EntityLightningBolt(event.world, event.x, event.y, event.z));
            event.world.createExplosion(event.getPlayer(),event.x,event.y,event.z,2.0F,true);

        }
    }
    //@SubscribeEvent
//    public void shooting(PlayerUseItemEvent event){
//        //if(event.item == new ItemStack(Items.magick_stick)){
//            Vec3 v3 = event.entityPlayer.getLookVec();
//            EntitySnowball snowball = new EntitySnowball(event.entityPlayer.worldObj,event.entityPlayer.posX,event.entityPlayer.posY+event.entityPlayer.eyeHeight,event.entityPlayer.posZ);
//            //snowball.setVelocity(v3.xCoord,v3.yCoord,v3.zCoord);
//            //(event);
//
//            event.entityPlayer.worldObj.spawnEntityInWorld(snowball);
//            event.entityPlayer.worldObj.playSoundAtEntity(event.entityPlayer,"mob.ghast.fireball",0.5F,0.4F);
//            System.out.println(event);
//
//
//
//
//        //}
//
//    }


}
