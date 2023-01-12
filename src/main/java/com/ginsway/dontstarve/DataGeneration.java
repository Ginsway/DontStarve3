package com.ginsway.dontstarve;

import com.ginsway.dontstarve.data.EnglishLangProvider;
import com.ginsway.dontstarve.data.TagGenerator;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class DataGeneration implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        fabricDataGenerator.addProvider(EnglishLangProvider::new);
        fabricDataGenerator.addProvider(TagGenerator::new);
    }
}
