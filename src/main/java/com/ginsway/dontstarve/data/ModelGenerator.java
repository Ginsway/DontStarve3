package com.ginsway.dontstarve.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.Item;

import static com.ginsway.dontstarve.init.ItemInit.*;

public class ModelGenerator extends FabricModelProvider {
    public ModelGenerator(FabricDataOutput generator) {
        super(generator);
    }

    public static void genx2(Item item,ItemModelGenerator iMG){
        iMG.register(item, Models.GENERATED);
    }
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        // null
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
//      genx2(CUSTOM_ITEM, itemModelGenerator();
        genx2(CHEESE, itemModelGenerator);
        genx2(COPPER_KNIFE, itemModelGenerator);
        genx2(GOLD_KNIFE, itemModelGenerator);
        genx2(IRON_KNIFE, itemModelGenerator);
        genx2(DIAMOND_KNIFE, itemModelGenerator);
        genx2(NETHERITE_KNIFE, itemModelGenerator);
        genx2(STEAMED_CARROT, itemModelGenerator);
        genx2(BAKED_SUGAR_CANE, itemModelGenerator);
        genx2(ROAST_WATERLILY, itemModelGenerator);
        genx2(ROAST_VINE, itemModelGenerator);
        genx2(ROAST_BROWN_MUSHROOM, itemModelGenerator);
        genx2(ROAST_RED_MUSHROOM, itemModelGenerator);
        genx2(ROAST_WHEAT_SEEDS, itemModelGenerator);
        genx2(ROAST_MELON_SEEDS, itemModelGenerator);
        genx2(ROAST_PUMPKIN_SEEDS, itemModelGenerator);
        genx2(SLIME_FUDGE, itemModelGenerator);
        genx2(MARSHMALLOWS, itemModelGenerator);
        genx2(POPSICLE, itemModelGenerator);
        genx2(ICE_CREAM, itemModelGenerator);
        genx2(CHOCOLATE, itemModelGenerator);
        genx2(ROAST_BERRIES, itemModelGenerator);
        genx2(CHEESE_STICK, itemModelGenerator);
        genx2(ROAST_GLOW_BERRIES, itemModelGenerator);
    }
}
