package com.ginsway.dontstarve.init;

import com.ginsway.dontstarve.DontStarve3;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemInit {
    // an instance of our new item
//    public static final Item CUSTOM_ITEM = new Item(new FabricItemSettings().group(ItemGroup.MISC));// 测试物品
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
    public static final Item SLIME_FUDGE =
            new Item(new FabricItemSettings().food((new FoodComponent.Builder())
                    .hunger(1).saturationModifier(3.0F).build()));
    public static final Item MARSHMALLOWS =
            new Item(new FabricItemSettings().food((new FoodComponent.Builder())
                    .hunger(1).saturationModifier(3.0F).build()));
    public static final Item POPSICLE =
            new Item(new FabricItemSettings().food((new FoodComponent.Builder())
                    .hunger(1).saturationModifier(3.0F).build()));
    public static final Item ICE_CREAM =
            new Item(new FabricItemSettings().food((new FoodComponent.Builder())
                    .hunger(1).saturationModifier(3.0F).build()));
    public static final Item ROAST_GLOW_BERRIES =
            new Item(new FabricItemSettings().food((new FoodComponent.Builder())
                    .hunger(1).saturationModifier(3.0F).build()));
    public static final Item CHOCOLATE =
            new Item(new FabricItemSettings().food((new FoodComponent.Builder())
                    .hunger(1).saturationModifier(3.0F).build()));
    public static final Item ROAST_BERRIES =
            new Item(new FabricItemSettings().food((new FoodComponent.Builder())
                    .hunger(1).saturationModifier(3.0F).build()));
    public static final Item CHEESE_STICK =
            new Item(new FabricItemSettings().food((new FoodComponent.Builder())
                    .hunger(1).saturationModifier(3.0F).build()));


    public static void init() {
//        Registry.register(Registries.ITEM, new Identifier(DontStarve3.MOD_ID, "custom_item"), CUSTOM_ITEM);
        Registry.register(Registries.ITEM, new Identifier(DontStarve3.MOD_ID, "cheese"), CHEESE);
        Registry.register(Registries.ITEM, new Identifier(DontStarve3.MOD_ID, "copper_knife"), COPPER_KNIFE);
        Registry.register(Registries.ITEM, new Identifier(DontStarve3.MOD_ID, "gold_knife"), GOLD_KNIFE);
        Registry.register(Registries.ITEM, new Identifier(DontStarve3.MOD_ID, "iron_knife"), IRON_KNIFE);
        Registry.register(Registries.ITEM, new Identifier(DontStarve3.MOD_ID, "diamond_knife"), DIAMOND_KNIFE);
        Registry.register(Registries.ITEM, new Identifier(DontStarve3.MOD_ID, "netherite_knife"), NETHERITE_KNIFE);
        Registry.register(Registries.ITEM, new Identifier(DontStarve3.MOD_ID, "roast_carrot"), ROAST_CARROT);
        Registry.register(Registries.ITEM, new Identifier(DontStarve3.MOD_ID, "roast_reeds"), ROAST_REEDS);
        Registry.register(Registries.ITEM, new Identifier(DontStarve3.MOD_ID, "roast_waterlily"), ROAST_WATERLILY);
        Registry.register(Registries.ITEM, new Identifier(DontStarve3.MOD_ID, "roast_vine"), ROAST_VINE);
        Registry.register(Registries.ITEM, new Identifier(DontStarve3.MOD_ID, "roast_brown_mushroom"), ROAST_BROWN_MUSHROOM);
        Registry.register(Registries.ITEM, new Identifier(DontStarve3.MOD_ID, "roast_red_mushroom"), ROAST_RED_MUSHROOM);
        Registry.register(Registries.ITEM, new Identifier(DontStarve3.MOD_ID, "roast_wheat_seeds"), ROAST_WHEAT_SEEDS);
        Registry.register(Registries.ITEM, new Identifier(DontStarve3.MOD_ID, "roast_melon_seeds"), ROAST_MELON_SEEDS);
        Registry.register(Registries.ITEM, new Identifier(DontStarve3.MOD_ID, "roast_pumpkin_seeds"), ROAST_PUMPKIN_SEEDS);
        Registry.register(Registries.ITEM, new Identifier(DontStarve3.MOD_ID, "slime_fudge"), SLIME_FUDGE);
        Registry.register(Registries.ITEM, new Identifier(DontStarve3.MOD_ID, "marshmallows"), MARSHMALLOWS);
        Registry.register(Registries.ITEM, new Identifier(DontStarve3.MOD_ID, "popsicle"), POPSICLE);
        Registry.register(Registries.ITEM, new Identifier(DontStarve3.MOD_ID, "ice_cream"), ICE_CREAM);
        Registry.register(Registries.ITEM, new Identifier(DontStarve3.MOD_ID, "chocolate"), CHOCOLATE);
        Registry.register(Registries.ITEM, new Identifier(DontStarve3.MOD_ID, "roast_berries"), ROAST_BERRIES);
        Registry.register(Registries.ITEM, new Identifier(DontStarve3.MOD_ID, "cheese_stick"), CHEESE_STICK);
        Registry.register(Registries.ITEM, new Identifier(DontStarve3.MOD_ID, "roast_glow_berries"), ROAST_GLOW_BERRIES);


    }
}
