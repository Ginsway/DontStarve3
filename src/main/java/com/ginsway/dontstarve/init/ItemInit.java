package com.ginsway.dontstarve.init;

import com.ginsway.dontstarve.DontStarve3;
import com.ginsway.dontstarve.item.Knife;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemInit {
    // an instance of our new item
//   public static final Item CUSTOM_ITEM = new Item(new FabricItemSettings().group(ItemGroup.MISC));// 测试物品
    // 奶酪锭
    public static final Item CHEESE = new Item(new FabricItemSettings().food((new FoodComponent.Builder())
            .hunger(4).saturationModifier(1.0F).build()));//食物属性 hunger 饱食度 saturationModifier 饱和度 build 构建食物（末尾加）
    //小刀*5
    public static final FabricItemSettings KNIFE = new FabricItemSettings().maxCount(1);
    public static final Item COPPER_KNIFE = new Knife(KNIFE);
    public static final Item GOLD_KNIFE = new Knife(KNIFE);

    public static final Item IRON_KNIFE = new Knife(KNIFE);

    public static final Item DIAMOND_KNIFE = new Knife(KNIFE);

    public static final Item NETHERITE_KNIFE = new Knife(KNIFE.fireproof());
    //烤胡萝贝
    public static final Item STEAMED_CARROT = new Item(new FabricItemSettings().food((new FoodComponent.Builder())
            .hunger(8).saturationModifier(1.0F).build()));
    //烤甘蔗
    public static final Item BAKED_SUGAR_CANE = new Item(new FabricItemSettings().food((new FoodComponent.Builder())
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

    public static void item_register(String path, Item obj){
        Registry.register(Registries.ITEM, new Identifier(DontStarve3.MOD_ID, path), obj);
    }
    public static void init() {
//        item_register( "custom_item CUSTOM_ITEM);
        item_register( "cheese", CHEESE);
        item_register( "copper_knife", COPPER_KNIFE);
        item_register( "gold_knife", GOLD_KNIFE);
        item_register( "iron_knife", IRON_KNIFE);
        item_register( "diamond_knife", DIAMOND_KNIFE);
        item_register( "netherite_knife", NETHERITE_KNIFE);
        item_register( "steamed_carrot", STEAMED_CARROT);
        item_register( "baked_sugar_cane", BAKED_SUGAR_CANE);
        item_register( "roast_waterlily", ROAST_WATERLILY);
        item_register( "roast_vine", ROAST_VINE);
        item_register( "roast_brown_mushroom", ROAST_BROWN_MUSHROOM);
        item_register( "roast_red_mushroom", ROAST_RED_MUSHROOM);
        item_register( "roast_wheat_seeds", ROAST_WHEAT_SEEDS);
        item_register( "roast_melon_seeds", ROAST_MELON_SEEDS);
        item_register( "roast_pumpkin_seeds", ROAST_PUMPKIN_SEEDS);
        item_register( "slime_fudge", SLIME_FUDGE);
        item_register( "marshmallows", MARSHMALLOWS);
        item_register( "popsicle", POPSICLE);
        item_register( "ice_cream", ICE_CREAM);
        item_register( "chocolate", CHOCOLATE);
        item_register( "roast_berries", ROAST_BERRIES);
        item_register( "cheese_stick", CHEESE_STICK);
        item_register( "roast_glow_berries", ROAST_GLOW_BERRIES);


    }
}
