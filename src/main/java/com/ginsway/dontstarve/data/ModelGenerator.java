package com.ginsway.dontstarve.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

import static com.ginsway.dontstarve.init.ItemInit.*;

public class ModelGenerator extends FabricModelProvider {
    public ModelGenerator(FabricDataOutput generator) {
        super(generator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        // null
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
//        itemModelGenerator.register(CUSTOM_ITEM, Models.GENERATED);
        itemModelGenerator.register(CHEESE, Models.GENERATED);
        itemModelGenerator.register(COPPER_KNIFE, Models.GENERATED);
        itemModelGenerator.register(GOLD_KNIFE, Models.GENERATED);
        itemModelGenerator.register(IRON_KNIFE, Models.GENERATED);
        itemModelGenerator.register(DIAMOND_KNIFE, Models.GENERATED);
        itemModelGenerator.register(NETHERITE_KNIFE, Models.GENERATED);
        itemModelGenerator.register(ROAST_CARROT, Models.GENERATED);
        itemModelGenerator.register(ROAST_REEDS, Models.GENERATED);
        itemModelGenerator.register(ROAST_WATERLILY, Models.GENERATED);
        itemModelGenerator.register(ROAST_VINE, Models.GENERATED);
        itemModelGenerator.register(ROAST_BROWN_MUSHROOM, Models.GENERATED);
        itemModelGenerator.register(ROAST_RED_MUSHROOM, Models.GENERATED);
        itemModelGenerator.register(ROAST_WHEAT_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ROAST_MELON_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ROAST_PUMPKIN_SEEDS, Models.GENERATED);
        itemModelGenerator.register(SLIME_FUDGE, Models.GENERATED);
        itemModelGenerator.register(MARSHMALLOWS, Models.GENERATED);
        itemModelGenerator.register(POPSICLE, Models.GENERATED);
        itemModelGenerator.register(ICE_CREAM, Models.GENERATED);
        itemModelGenerator.register(CHOCOLATE, Models.GENERATED);
        itemModelGenerator.register(ROAST_BERRIES, Models.GENERATED);
        itemModelGenerator.register(CHEESE_STICK, Models.GENERATED);
        itemModelGenerator.register(ROAST_GLOW_BERRIES, Models.GENERATED);

    }
}
