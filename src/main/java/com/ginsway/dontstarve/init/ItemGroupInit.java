package com.ginsway.dontstarve.init;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ItemGroupInit {
    private static final net.minecraft.item.ItemGroup DONTSTARVE3 = FabricItemGroup.builder(new Identifier("dontstarve3", "item_group"))
            .icon(() -> new ItemStack(ItemInit.CHEESE))
            .build();
    public static void init(){
        ItemGroupEvents.modifyEntriesEvent(DONTSTARVE3).register(content -> {
            content.add(ItemInit.CHEESE);
            content.add(ItemInit.COPPER_KNIFE);
            content.add(ItemInit.GOLD_KNIFE);
            content.add(ItemInit.IRON_KNIFE);
            content.add(ItemInit.DIAMOND_KNIFE);
            content.add(ItemInit.NETHERITE_KNIFE);
            content.add(ItemInit.ROAST_REEDS);
            content.add(ItemInit.ROAST_CARROT);
            content.add(ItemInit.ROAST_VINE);
            content.add(ItemInit.ROAST_WATERLILY);
            content.add(ItemInit.ROAST_RED_MUSHROOM);
            content.add(ItemInit.ROAST_BROWN_MUSHROOM);
            content.add(ItemInit.ROAST_WHEAT_SEEDS);
            content.add(ItemInit.ROAST_MELON_SEEDS);
            content.add(ItemInit.ROAST_PUMPKIN_SEEDS);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
            content.add(ItemInit.CUSTOM_ITEM);
        });
    }
}
