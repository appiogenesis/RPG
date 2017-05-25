package com.appiogenesis.rpg.proxy;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import com.appiogenesis.rpg.init.ModBlocks;
import com.appiogenesis.rpg.init.ModItems;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
        // Init blocks and items
        ModBlocks.init();
        //ModItems.init();
    }
    public void init(FMLPreInitializationEvent e) {

    }
    public void postInit(FMLPreInitializationEvent e) {

    }

}
