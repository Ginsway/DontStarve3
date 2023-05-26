package com.ginsway.dontstarve.init;

import com.ginsway.dontstarve.DontStarve3;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BlockInit {
    public static final Block CHEESE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(4.0f));

    public static void init(){
        Registry.register(Registries.BLOCK,new Identifier(DontStarve3.MOD_ID,"cheese_block"),CHEESE_BLOCK);
        Registry.register(Registries.ITEM,new Identifier(DontStarve3.MOD_ID,"cheese_block"),new BlockItem(CHEESE_BLOCK,new FabricItemSettings()));
    }
}
