package com.ginsway.dontstarve.init;

import com.ginsway.dontstarve.DontStarve3;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ItemGroupInit {
    public static final ItemGroup DONTSTARVE = FabricItemGroup.builder(new Identifier(DontStarve3.MOD_ID, "group")).icon(() -> new ItemStack((ItemInit.CHEESE))).build();

}
