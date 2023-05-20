package com.ginsway.dontstarve.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;

import java.util.concurrent.CompletableFuture;

import static com.ginsway.dontstarve.init.ItemInit.*;

public class TagGenerator extends FabricTagProvider<Item> {
    private static final TagKey<Item> KNIVES = TagKey.of(Registries.ITEM.getKey(), new Identifier("dontstarve3:knives"));

    /**
     * Constructs a new {@link FabricTagProvider} with the default computed path.
     *
     * <p>Common implementations of this class are provided.
     *
     * @param output           the {@link FabricDataOutput} instance
     * @param registryKey
     * @param registriesFuture the backing registry for the tag type
     */
    public TagGenerator(FabricDataOutput output, RegistryKey<? extends Registry<Item>> registryKey, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registryKey, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(KNIVES)
                .add(COPPER_KNIFE)
                .add(IRON_KNIFE)
                .add(GOLD_KNIFE)
                .add(DIAMOND_KNIFE)
                .add(NETHERITE_KNIFE);
    }
}
