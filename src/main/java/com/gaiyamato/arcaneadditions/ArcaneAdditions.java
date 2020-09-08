package com.gaiyamato.arcaneadditions;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
//import net.minecraftforge.fml.common.SidedProxy;
//import net.minecraftforge.fml.common.event.*;
import org.apache.logging.log4j.Logger;

@Mod(modid = ArcaneAdditions.MODID, name = ArcaneAdditions.NAME, version = ArcaneAdditions.VERSION)
public class ArcaneAdditions
{
    public static final String MODID = "arcaneadditions";
    public static final String NAME = "Arcane Additions";
    public static final String VERSION = "GRADLE:VERSION";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
