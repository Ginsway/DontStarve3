package io.github.ginsway.dontstarve.init;

import io.github.ginsway.dontstarve.DontStarve3;
import io.github.ginsway.dontstarve.item.Knife;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static io.github.ginsway.dontstarve.init.ItemGroupInit.*;

public class ItemInit {
    // an instance of our new item
//   public static final Item CUSTOM_ITEM = new Item(new FabricItemSettings().group(ItemGroup.MISC));// 测试物品
    // 奶酪锭
    public static final Item CHEESE = itemRegister("cheese",new Item(new FabricItemSettings().food((new FoodComponent.Builder())
            .hunger(4).saturationModifier(1.0F).build())),DONTSTARVE);//食物属性 hunger 饱食度 saturationModifier 饱和度 build 构建食物（末尾加）
    //小刀*5
    public static final FabricItemSettings KNIFE = new FabricItemSettings().maxCount(1);
    public static final Item COPPER_KNIFE = itemRegister("copper_knife",new Knife(KNIFE),DONTSTARVE);
    public static final Item GOLD_KNIFE = itemRegister("gold_knife",new Knife(KNIFE),DONTSTARVE);

    public static final Item IRON_KNIFE = itemRegister("iron_knife",new Knife(KNIFE),DONTSTARVE);

    public static final Item DIAMOND_KNIFE = itemRegister("diamond_knife",new Knife(KNIFE),DONTSTARVE);

    public static final Item NETHERITE_KNIFE = itemRegister("netherite_knife",new Knife(KNIFE),DONTSTARVE);
    //烤胡萝贝
    public static final Item STEAMED_CARROT = itemRegister("steamed_carrot",new Item(new FabricItemSettings().food((new FoodComponent.Builder())
            .hunger(8).saturationModifier(1.0F).build())),DONTSTARVE);
    //烤甘蔗
    public static final Item BAKED_SUGAR_CANE = itemRegister("baked_sugar_cane",new Item(new FabricItemSettings().food((new FoodComponent.Builder())
            .hunger(4).saturationModifier(1.0F).build())),DONTSTARVE);
    //烤睡莲
    public static final Item ROAST_WATERLILY = itemRegister("roast_waterlily",new Item(new FabricItemSettings().food((new FoodComponent.Builder())
            .hunger(2).saturationModifier(2.0F).build())),DONTSTARVE);
    //烤藤蔓
    public static final Item ROAST_VINE = itemRegister("roast_vine",new Item(new FabricItemSettings().food((new FoodComponent.Builder())
            .hunger(1).saturationModifier(4.0F).build())),DONTSTARVE);
    //烤蘑菇
    public static final Item ROAST_BROWN_MUSHROOM = itemRegister("roast_brown_mushroom",new Item(new FabricItemSettings().food((new FoodComponent.Builder())
            .hunger(2).saturationModifier(1.0F).build())),DONTSTARVE);
    public static final Item ROAST_RED_MUSHROOM = itemRegister("roast_red_mushroom",new Item(new FabricItemSettings().food((new FoodComponent.Builder())
            .hunger(2).saturationModifier(1.0F).build())),DONTSTARVE);
    //烤种子
    public static final Item ROAST_WHEAT_SEEDS = itemRegister("roast_wheat_seeds",new Item(new FabricItemSettings().food((new FoodComponent.Builder())
            .hunger(1).saturationModifier(3.0F).build())),DONTSTARVE);
    public static final Item ROAST_MELON_SEEDS =itemRegister("roast_melon_seeds",new Item(new FabricItemSettings().food((new FoodComponent.Builder())
            .hunger(1).saturationModifier(3.0F).build())),DONTSTARVE);
    public static final Item ROAST_PUMPKIN_SEEDS =
            itemRegister("roast_pumpkin_seeds", new Item(new FabricItemSettings().food((new FoodComponent.Builder())
                    .hunger(1).saturationModifier(3.0F).build())),DONTSTARVE);
    public static final Item SLIME_FUDGE =
            itemRegister("slime_fudge", new Item(new FabricItemSettings().food((new FoodComponent.Builder())
                    .hunger(1).saturationModifier(3.0F).build())),DONTSTARVE);
    public static final Item MARSHMALLOWS =
            itemRegister("marshmallows", new Item(new FabricItemSettings().food((new FoodComponent.Builder())
                    .hunger(1).saturationModifier(3.0F).build())),DONTSTARVE);
    public static final Item POPSICLE =
            itemRegister("popsicle", new Item(new FabricItemSettings().food((new FoodComponent.Builder())
                    .hunger(1).saturationModifier(3.0F).build())),DONTSTARVE);
    public static final Item ICE_CREAM =
            itemRegister("ice_cream", new Item(new FabricItemSettings().food((new FoodComponent.Builder())
                    .hunger(1).saturationModifier(3.0F).build())),DONTSTARVE);
    public static final Item ROAST_GLOW_BERRIES =
            itemRegister("roast_glow_berries", new Item(new FabricItemSettings().food((new FoodComponent.Builder())
                    .hunger(1).saturationModifier(3.0F).build())),DONTSTARVE);
    public static final Item CHOCOLATE =
            itemRegister("chocolate", new Item(new FabricItemSettings().food((new FoodComponent.Builder())
                    .hunger(1).saturationModifier(3.0F).build())),DONTSTARVE);
    public static final Item ROAST_BERRIES =
            itemRegister("roast_berries", new Item(new FabricItemSettings().food((new FoodComponent.Builder())
                    .hunger(1).saturationModifier(3.0F).build())),DONTSTARVE);
    public static final Item CHEESE_STICK =
            itemRegister("cheese_stick", new Item(new FabricItemSettings().food((new FoodComponent.Builder())
                    .hunger(1).saturationModifier(3.0F).build())),DONTSTARVE);

    public static Item itemRegister(String name, Item item, ItemGroup... itemGroups ){
        Item registeredItem = Registry.register(Registries.ITEM, new Identifier(DontStarve3.MOD_ID, name), item);
        for (ItemGroup itemGroup:itemGroups){
            ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> entries.add(registeredItem));
        }
        return registeredItem;
    }
    public static void init() {
//        itemRegister( "custom_item", CUSTOM_ITEM);
//        itemRegister( "cheese", CHEESE,DONTSTARVE);
//        itemRegister( "copper_knife", COPPER_KNIFE,DONTSTARVE);
//        itemRegister( "gold_knife", GOLD_KNIFE,DONTSTARVE);
//        itemRegister( "iron_knife", IRON_KNIFE,DONTSTARVE);
//        itemRegister( "diamond_knife", DIAMOND_KNIFE,DONTSTARVE);
//        itemRegister( "netherite_knife", NETHERITE_KNIFE,DONTSTARVE);
//        itemRegister( "steamed_carrot", STEAMED_CARROT,DONTSTARVE);
//        itemRegister( "baked_sugar_cane", BAKED_SUGAR_CANE,DONTSTARVE);
//        itemRegister( "roast_waterlily", ROAST_WATERLILY,DONTSTARVE);
//        itemRegister( "roast_vine", ROAST_VINE,DONTSTARVE);
//        itemRegister( "roast_brown_mushroom", ROAST_BROWN_MUSHROOM,DONTSTARVE);
//        itemRegister( "roast_red_mushroom", ROAST_RED_MUSHROOM,DONTSTARVE);
//        itemRegister( "roast_wheat_seeds", ROAST_WHEAT_SEEDS,DONTSTARVE);
//        itemRegister( "roast_melon_seeds", ROAST_MELON_SEEDS,DONTSTARVE);
//        itemRegister( "roast_pumpkin_seeds", ROAST_PUMPKIN_SEEDS,DONTSTARVE);
//        itemRegister( "slime_fudge", SLIME_FUDGE,DONTSTARVE);
//        itemRegister( "marshmallows", MARSHMALLOWS,DONTSTARVE);
//        itemRegister( "popsicle", POPSICLE,DONTSTARVE);
//        itemRegister( "ice_cream", ICE_CREAM,DONTSTARVE);
//        itemRegister( "chocolate", CHOCOLATE,DONTSTARVE);
//        itemRegister( "roast_berries", ROAST_BERRIES,DONTSTARVE);
//        itemRegister( "cheese_stick", CHEESE_STICK,DONTSTARVE);
//        itemRegister( "roast_glow_berries", ROAST_GLOW_BERRIES,DONTSTARVE);


    }
}
