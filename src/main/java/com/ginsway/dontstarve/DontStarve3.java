package com.ginsway.dontstarve;

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

	// an instance of our new item
	public static final Item CUSTOM_ITEM =
			Registry.register(Registry.ITEM, new Identifier("tutorial", "custom_item"),
					new Item(new FabricItemSettings().group(ItemGroup.MISC)));// 测试物品

	// 奶酪锭
	public static final Item CHEESE =
			Registry.register(Registry.ITEM, new Identifier("dontstarve3", "cheese"),
					new Item(new FabricItemSettings().group(DontStarve3.DONTSTARVE3).food((new FoodComponent.Builder())
							.hunger(4).saturationModifier(1.0F).build())));//食物属性 hunger 饱食度 saturationModifier 饱和度 build 构建（末尾加）

	//小刀*5
	public static final Item COPPER_KNIFE =
			Registry.register(Registry.ITEM, new Identifier("dontstarve3", "copper_knife"),
					new Item(new FabricItemSettings().group(DontStarve3.DONTSTARVE3)));

	public static final Item GOLD_KNIFE =
			Registry.register(Registry.ITEM, new Identifier("dontstarve3", "gold_knife"),
					new Item(new FabricItemSettings().group(DontStarve3.DONTSTARVE3)));

	public static final Item IRON_KNIFE =
			Registry.register(Registry.ITEM, new Identifier("dontstarve3", "iron_knife"),
					new Item(new FabricItemSettings().group(DontStarve3.DONTSTARVE3)));

	public static final Item DIAMOND_KNIFE =
			Registry.register(Registry.ITEM, new Identifier("dontstarve3", "diamond_knife"),
					new Item(new FabricItemSettings().group(DontStarve3.DONTSTARVE3)));

	public static final Item NETHERITE_KNIFE =
			Registry.register(Registry.ITEM, new Identifier("dontstarve3", "netherite_knife"),
					new Item(new FabricItemSettings().group(DontStarve3.DONTSTARVE3)));

	//烤胡萝贝
	public static final Item ROAST_CARROT =
			Registry.register(Registry.ITEM, new Identifier("dontstarve3", "roast_carrot"),
					new Item(new FabricItemSettings().group(DontStarve3.DONTSTARVE3).food((new FoodComponent.Builder())
							.hunger(8).saturationModifier(1.0F).build())));
	//烤甘蔗
	public static final Item ROAST_REEDS =
			Registry.register(Registry.ITEM, new Identifier("dontstarve3", "roast_reeds"),
					new Item(new FabricItemSettings().group(DontStarve3.DONTSTARVE3).food((new FoodComponent.Builder())
							.hunger(4).saturationModifier(1.0F).build())));
	//烤睡莲
	public static final Item ROAST_WATERLILY =
			Registry.register(Registry.ITEM, new Identifier("dontstarve3", "roast_waterlily"),
					new Item(new FabricItemSettings().group(DontStarve3.DONTSTARVE3).food((new FoodComponent.Builder())
							.hunger(2).saturationModifier(2.0F).build())));
	//烤藤蔓
	public static final Item ROAST_VINE =
			Registry.register(Registry.ITEM, new Identifier("dontstarve3", "roast_vine"),
					new Item(new FabricItemSettings().group(DontStarve3.DONTSTARVE3).food((new FoodComponent.Builder())
							.hunger(1).saturationModifier(4.0F).build())));
	//烤蘑菇
	public static final Item ROAST_BROWN_MUSHROOM =
			Registry.register(Registry.ITEM, new Identifier("dontstarve3", "roast_brown_mushroom"),
					new Item(new FabricItemSettings().group(DontStarve3.DONTSTARVE3).food((new FoodComponent.Builder())
							.hunger(2).saturationModifier(1.0F).build())));
	public static final Item ROAST_RED_MUSHROOM =
			Registry.register(Registry.ITEM, new Identifier("dontstarve3", "roast_red_mushroom"),
					new Item(new FabricItemSettings().group(DontStarve3.DONTSTARVE3).food((new FoodComponent.Builder())
							.hunger(2).saturationModifier(1.0F).build())));
	//烤种子
	public static final Item ROAST_WHEAT_SEEDS =
			Registry.register(Registry.ITEM, new Identifier("dontstarve3", "roast_wheat_seeds"),
					new Item(new FabricItemSettings().group(DontStarve3.DONTSTARVE3).food((new FoodComponent.Builder())
							.hunger(1).saturationModifier(3.0F).build())));
	public static final Item ROAST_MELON_SEEDS =
			Registry.register(Registry.ITEM, new Identifier("dontstarve3", "roast_melon_seeds"),
					new Item(new FabricItemSettings().group(DontStarve3.DONTSTARVE3).food((new FoodComponent.Builder())
							.hunger(1).saturationModifier(3.0F).build())));
	public static final Item ROAST_PUMPKIN_SEEDS =
			Registry.register(Registry.ITEM, new Identifier("dontstarve3", "roast_pumpkin_seeds"),
					new Item(new FabricItemSettings().group(DontStarve3.DONTSTARVE3).food((new FoodComponent.Builder())
							.hunger(1).saturationModifier(3.0F).build())));
	//烤浆果

	// 物品组
	public static final ItemGroup DONTSTARVE3 = FabricItemGroupBuilder.create(
					new Identifier("dontstarve3", "item_group"))
			.icon(() -> new ItemStack(CHEESE))//图标
			.appendItems(stacks -> {//在此处添加物品组中的物品
				stacks.add(new ItemStack(CHEESE));
				stacks.add(new ItemStack(COPPER_KNIFE));
				stacks.add(new ItemStack(GOLD_KNIFE));
				stacks.add(new ItemStack(IRON_KNIFE));
				stacks.add(new ItemStack(DIAMOND_KNIFE));
				stacks.add(new ItemStack(NETHERITE_KNIFE));
				stacks.add(new ItemStack(ROAST_REEDS));
				stacks.add(new ItemStack(ROAST_CARROT));
				stacks.add(new ItemStack(ROAST_VINE));
				stacks.add(new ItemStack(ROAST_WATERLILY));
				stacks.add(new ItemStack(ROAST_RED_MUSHROOM));
				stacks.add(new ItemStack(ROAST_BROWN_MUSHROOM));
				stacks.add(new ItemStack(ROAST_WHEAT_SEEDS));
				stacks.add(new ItemStack(ROAST_MELON_SEEDS));
				stacks.add(new ItemStack(ROAST_PUMPKIN_SEEDS));
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
