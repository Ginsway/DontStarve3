package com.ginsway.dontstarve.init;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemInit {
    // an instance of our new item
    public static final Item CUSTOM_ITEM = new Item(new FabricItemSettings().group(ItemGroup.MISC));// 测试物品
    // 奶酪锭
    public static final Item CHEESE = new Item(new FabricItemSettings().food((new FoodComponent.Builder())
            .hunger(4).saturationModifier(1.0F).build()));//食物属性 hunger 饱食度 saturationModifier 饱和度 build 构建食物（末尾加）
    //小刀*5
    public static final Item COPPER_KNIFE = new Item(new FabricItemSettings());
    public static final Item GOLD_KNIFE = new Item(new FabricItemSettings());

    public static final Item IRON_KNIFE = new Item(new FabricItemSettings());

    public static final Item DIAMOND_KNIFE = new Item(new FabricItemSettings());

    public static final Item NETHERITE_KNIFE = new Item(new FabricItemSettings());
    //烤胡萝贝
    public static final Item ROAST_CARROT = new Item(new FabricItemSettings().food((new FoodComponent.Builder())
            .hunger(8).saturationModifier(1.0F).build()));
    //烤甘蔗
    public static final Item ROAST_REEDS = new Item(new FabricItemSettings().food((new FoodComponent.Builder())
            .hunger(4).saturationModifier(1.0F).build()));
    //烤睡莲
    public static final Item ROAST_WATERLILY = new Item(new FabricItemSettings().food((new FoodComponent.Builder())
            .hunger(2).saturationModifier(2.0F).build()));
    //烤藤蔓
    public static final Item ROAST_VINE = new Item(new FabricItemSettings().food((new FoodComponent.Builder())
            .hunger(1).saturationModifier(4.0F).build()));
    //烤蘑菇
    public static final Item ROAST_BROWN_MUSHROOM = new Item(new FabricItemSettings().food((new FoodComponent.Builder())
            .hunger(2).saturationModifier(1.0F).build()));
    public static final Item ROAST_RED_MUSHROOM = new Item(new FabricItemSettings().food((new FoodComponent.Builder())
            .hunger(2).saturationModifier(1.0F).build()));
    //烤种子
    public static final Item ROAST_WHEAT_SEEDS = new Item(new FabricItemSettings().food((new FoodComponent.Builder())
            .hunger(1).saturationModifier(3.0F).build()));
    public static final Item ROAST_MELON_SEEDS = new Item(new FabricItemSettings().food((new FoodComponent.Builder())
            .hunger(1).saturationModifier(3.0F).build()));
    public static final Item ROAST_PUMPKIN_SEEDS =
            new Item(new FabricItemSettings().food((new FoodComponent.Builder())
                    .hunger(1).saturationModifier(3.0F).build()));


    public static void init() {
        Registry.register(Registry.ITEM, new Identifier("dontstarve3", "custom_item"), CUSTOM_ITEM);
        Registry.register(Registry.ITEM, new Identifier("dontstarve3", "cheese"), CHEESE);
        Registry.register(Registry.ITEM, new Identifier("dontstarve3", "copper_knife"), COPPER_KNIFE);
        Registry.register(Registry.ITEM, new Identifier("dontstarve3", "gold_knife"), GOLD_KNIFE);
        Registry.register(Registry.ITEM, new Identifier("dontstarve3", "iron_knife"), IRON_KNIFE);
        Registry.register(Registry.ITEM, new Identifier("dontstarve3", "diamond_knife"), DIAMOND_KNIFE);
        Registry.register(Registry.ITEM, new Identifier("dontstarve3", "netherite_knife"), NETHERITE_KNIFE);
        Registry.register(Registry.ITEM, new Identifier("dontstarve3", "roast_carrot"), ROAST_CARROT);
        Registry.register(Registry.ITEM, new Identifier("dontstarve3", "roast_reeds"), ROAST_REEDS);
        Registry.register(Registry.ITEM, new Identifier("dontstarve3", "roast_waterlily"), ROAST_WATERLILY);
        Registry.register(Registry.ITEM, new Identifier("dontstarve3", "roast_vine"), ROAST_VINE);
        Registry.register(Registry.ITEM, new Identifier("dontstarve3", "roast_brown_mushroom"), ROAST_BROWN_MUSHROOM);
        Registry.register(Registry.ITEM, new Identifier("dontstarve3", "roast_red_mushroom"), ROAST_RED_MUSHROOM);
        Registry.register(Registry.ITEM, new Identifier("dontstarve3", "roast_wheat_seeds"), ROAST_WHEAT_SEEDS);
        Registry.register(Registry.ITEM, new Identifier("dontstarve3", "roast_melon_seeds"), ROAST_MELON_SEEDS);
        Registry.register(Registry.ITEM, new Identifier("dontstarve3", "roast_pumpkin_seeds"), ROAST_PUMPKIN_SEEDS);


    }
}
