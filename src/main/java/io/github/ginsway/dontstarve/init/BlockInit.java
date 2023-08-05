package io.github.ginsway.dontstarve.init;

import io.github.ginsway.dontstarve.DontStarve3;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static io.github.ginsway.dontstarve.init.ItemGroupInit.DONTSTARVE;

public class BlockInit {
    public static final Block CHEESE_BLOCK = BlockRegister("cheese_block",new Block(FabricBlockSettings.of(Material.METAL).hardness(4.0f)),DONTSTARVE);
    public static final Block CHOCOLATE_BLOCK = BlockRegister("chocolate_block",new Block(FabricBlockSettings.of(Material.METAL).hardness(4.0f)),DONTSTARVE);
    public static Block BlockRegister(String name, Block block, ItemGroup... itemGroups ){
        Block registeredBlock = Registry.register(Registries.BLOCK, new Identifier(DontStarve3.MOD_ID, name), block);
        BlockItem registeredBlockItem = Registry.register(Registries.ITEM,new Identifier(DontStarve3.MOD_ID,name),new BlockItem(block,new FabricItemSettings()));
        for (ItemGroup itemGroup:itemGroups){
            ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> entries.add(registeredBlockItem));
        }
        return registeredBlock;
    }
    public static void init(){
//        Registry.register(Registries.BLOCK,new Identifier(DontStarve3.MOD_ID,"cheese_block"),CHEESE_BLOCK);
//        Registry.register(Registries.ITEM,new Identifier(DontStarve3.MOD_ID,"cheese_block"),new BlockItem(CHEESE_BLOCK,new FabricItemSettings()));
//        Registry.register(Registries.BLOCK,new Identifier(DontStarve3.MOD_ID,"chocolate_block"),CHOCOLATE_BLOCK);
//        Registry.register(Registries.ITEM,new Identifier(DontStarve3.MOD_ID,"chocolate_block"),new BlockItem(CHOCOLATE_BLOCK,new FabricItemSettings()));
    }
}
