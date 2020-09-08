package com.gaiyamato.arcaneadditions;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;
import org.apache.logging.log4j.Logger;

@Mod(modid = ArcaneAdditions.MODID, name = ArcaneAdditions.NAME, version = ArcaneAdditions.VERSION)
public class ArcaneAdditions
{
    public static final String MODID = "arcaneadditions";
    public static final String NAME = "Arcane Additions";
    public static final String VERSION = "GRADLE:VERSION";

    private static Logger logger;
    @SidedProxy(clientSide = "com.gaiyamato.arcaneadditions.proxy.ClientProxy", serverSide = "com.gaiyamato.arcaneadditions.proxy.CommonProxy")
	public static CommonProxy proxy;

    @EventHandler
	public static void preInit (FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}

	@EventHandler
	public static void init (FMLInitializationEvent event) {
		proxy.init(event);
	}

	@EventHandler
	public static void postInit (FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}

	@EventHandler
	public static void serverStarting (FMLServerStartingEvent event) {
		proxy.serverStarting(event);
	}

	@EventHandler
	public static void serverStarted (FMLServerStartedEvent event) {
		proxy.serverStarted(event);
	}

	@EventHandler
	public static void loadComplete (FMLLoadCompleteEvent event) {
		proxy.loadComplete(event);
	}

	public static ResourceLocation location (String string) {
		return new ResourceLocation(MODID, string);
	}
}
