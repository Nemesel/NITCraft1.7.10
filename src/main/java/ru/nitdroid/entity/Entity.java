package ru.nitdroid.entity;

import cpw.mods.fml.common.registry.EntityRegistry;
import ru.nitdroid.common.Main;

public class Entity {


    public static void init()
    {
        EntityRegistry.registerModEntity(RedBullet.class, "EMP", 0, Main.MODID, 64, 10, true);
    }

}
