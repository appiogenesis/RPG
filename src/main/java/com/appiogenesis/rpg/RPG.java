package com.appiogenesis.rpg;

import com.appiogenesis.rpg.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = RPG.modId, name = RPG.name, version = RPG.version, acceptedMinecraftVersions = "[1.10.2]")
public class RPG {

    public static final String modId = "rpg";
    public static final String name = "RPG";
    public static final String version = "0.0.1";

    @Mod.Instance(modId)
    public static RPG instance;

    @SidedProxy(serverSide = "com.appiogenesis.rpg.proxy.CommonProxy", clientSide = "com.appiogenesis.rpg.proxy.ClientProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e){
        System.out.println(name + " is loading...");
        proxy.preInit(e);
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent e){
	    //proxy.init(e);
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e){
	    //proxy.postInit(e);
    }

}
