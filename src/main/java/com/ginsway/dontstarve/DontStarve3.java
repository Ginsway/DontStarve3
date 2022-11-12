package com.ginsway.dontstarve;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DontStarve3 implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("dontstarve3");//定义崩溃记录器的MODID

	// an instance of our new item
	public static final Item CUSTOM_ITEM =
			Registry.register(Registry.ITEM, new Identifier("tutorial", "custom_item"),
					new Item(new FabricItemSettings().group(ItemGroup.MISC)));// 测试物品

	// 奶酪锭
	public static final Item CHEESE =
			Registry.register(Registry.ITEM, new Identifier("dontstarve3", "cheese"),
					new Item(new FabricItemSettings().group(ItemGroup.MISC)));
	// 物品组
	public static final ItemGroup DONTSTARVE3 = FabricItemGroupBuilder.create(
					new Identifier("dontstarve3", "item_group"))
			.icon(() -> new ItemStack(CHEESE))//图标
			.appendItems(stacks -> {//在此处添加物品组中的物品
				stacks.add(new ItemStack(CHEESE));
			})
			.build();
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
	}
}
