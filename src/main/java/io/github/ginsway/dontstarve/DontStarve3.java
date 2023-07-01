package io.github.ginsway.dontstarve;

import io.github.ginsway.dontstarve.init.BlockInit;
import io.github.ginsway.dontstarve.init.ItemGroupInit;
import io.github.ginsway.dontstarve.init.ItemInit;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DontStarve3 implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("dontstarve3");//定义崩溃记录器的MODID

	public static final String MOD_ID = "dontstarve3" ;

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ItemInit.init();
		BlockInit.init();
		ItemGroupEvents.modifyEntriesEvent(ItemGroupInit.DONTSTARVE);
		LOGGER.info("Hello Fabric world!");
	}
}
