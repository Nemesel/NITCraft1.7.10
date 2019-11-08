package ru.nitdroid.entity;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityList;
import ru.nitdroid.common.Main;

import static ru.nitdroid.common.Main.instance;

public class Entity {


    public static void init()
    {
        EntityRegistry.registerModEntity(RedBullet.class, "EMP", 0, Main.MODID, 64, 10, true);
    }

}
    public static void registerEntity(Class entityClass, String name, int primaryColor, int secondaryColor)
    {
        int entityID = EntityRegistry.findGlobalUniqueEntityId();
        long seed = name.hashCode();

        EntityRegistry.registerGlobalEntityID(entityClass, name, entityID);
        EntityRegistry.registerModEntity(entityClass, name, entityID, instance, 64, 1, true); //эта строка не нужна(зачем она?)
        EntityList.entityEggs.put(Integer.valueOf(entityID), new EntityList.EntityEggInfo(entityID, primaryColor, secondaryColor));
    }