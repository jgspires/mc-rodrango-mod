package com.kebeq.rodrangomod;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraftforge.fml.common.Mod;

@Mod(RodrangoMod.MODID)
public class RodrangoMod {
	
	// Define mod id in a common place for everything to reference
    public static final String MODID = "rodrangomod";
    
 // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    
    public RodrangoMod() {
    	
        LOGGER.info("HELLO FROM CONSTRUCTOR");
    }

}
