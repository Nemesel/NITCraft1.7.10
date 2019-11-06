package ru.nitdroid.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class RedBullet extends EntityThrowable {
    public static final float explosionPower = 0.75F;

    public RedBullet (World world)
    {
        super(world);
    }

    public RedBullet (World world, EntityLivingBase entityLivingBase)
    {
        super(world,entityLivingBase);
    }


    private void explode()
    {
        int bx = (int)posX;
        int by = (int)posY;
        int bz = (int)posZ;
        worldObj.createExplosion(this,posX,posY,posZ,explosionPower,true);
        setDead();
    }
    public void onUpdate(){
        super.onUpdate();
        if(ticksExisted > 100){
            explode();
        }

        for (int i=0;i<10;i++)
        {
            double x = (double)(rand.nextInt(10)-5) /8.0D;
            double y = (double)(rand.nextInt(10)-5) /8.0D;
            double z = (double)(rand.nextInt(10)-5) /8.0D;
            worldObj.spawnParticle("reddust", posX, posY, posZ, x, y, z);
        }
    }
    @Override
    protected float getGravityVelocity()
    {
        return 0.0000005F;
    }

    @Override
    public void onImpact(MovingObjectPosition movingObjectPosition)
    {
        explode();
    }
}
