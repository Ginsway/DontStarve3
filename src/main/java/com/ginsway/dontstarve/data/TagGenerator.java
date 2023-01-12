package com.ginsway.dontstarve.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.ginsway.dontstarve.init.ItemInit.*;

public class TagGenerator extends FabricTagProvider<Item> {
    public TagGenerator(FabricDataGenerator dataGenerator) {
        super(dataGenerator, Registry.ITEM);
    }
    private static final TagKey<Item> KNIVES = TagKey.of(Registry.ITEM_KEY, new Identifier("dontstarve3:knives"));
    @Override
    protected void generateTags() {
        getOrCreateTagBuilder(KNIVES)
                .add(COPPER_KNIFE)
                .add(IRON_KNIFE)
                .add(GOLD_KNIFE)
                .add(DIAMOND_KNIFE)
                .add(NETHERITE_KNIFE);


    }
}
