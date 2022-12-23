package com.ginsway.dontstarve;

import com.ginsway.dontstarve.init.ItemInit;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DontStarve3 implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("dontstarve3");//定义崩溃记录器的MODID
	//烤浆果

	// 物品组
	public static final ItemGroup DONTSTARVE3 = FabricItemGroupBuilder.create(
					new Identifier("dontstarve3", "item_group"))
			.icon(() -> new ItemStack(ItemInit.CHEESE))//图标
			.appendItems(stacks -> {//在此处添加物品组中的物品
				stacks.add(new ItemStack(ItemInit.CHEESE));
				stacks.add(new ItemStack(ItemInit.COPPER_KNIFE));
				stacks.add(new ItemStack(ItemInit.GOLD_KNIFE));
				stacks.add(new ItemStack(ItemInit.IRON_KNIFE));
				stacks.add(new ItemStack(ItemInit.DIAMOND_KNIFE));
				stacks.add(new ItemStack(ItemInit.NETHERITE_KNIFE));
				stacks.add(new ItemStack(ItemInit.ROAST_REEDS));
				stacks.add(new ItemStack(ItemInit.ROAST_CARROT));
				stacks.add(new ItemStack(ItemInit.ROAST_VINE));
				stacks.add(new ItemStack(ItemInit.ROAST_WATERLILY));
				stacks.add(new ItemStack(ItemInit.ROAST_RED_MUSHROOM));
				stacks.add(new ItemStack(ItemInit.ROAST_BROWN_MUSHROOM));
				stacks.add(new ItemStack(ItemInit.ROAST_WHEAT_SEEDS));
				stacks.add(new ItemStack(ItemInit.ROAST_MELON_SEEDS));
				stacks.add(new ItemStack(ItemInit.ROAST_PUMPKIN_SEEDS));
			})
			.build();
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ItemInit.init();
		LOGGER.info("Hello Fabric world!");
	}
}
