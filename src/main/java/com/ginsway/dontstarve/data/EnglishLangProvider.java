package com.ginsway.dontstarve.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

import java.nio.file.Path;

import static com.ginsway.dontstarve.init.ItemInit.*;

public class EnglishLangProvider extends FabricLanguageProvider {
    public EnglishLangProvider(FabricDataGenerator dataGenerator){
        // Specifying en_us is optional, by default is en_us.
        super(dataGenerator,"en_us");
    }
    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(CUSTOM_ITEM, "Custom Item");

        try {
            Path existingFilePath = dataGenerator.getModContainer().findPath("assets/dontstarve3/lang/en_us.json").get();
            translationBuilder.add(existingFilePath);
        } catch (Exception e) {
            throw new RuntimeException("Failed to add existing language file!", e);
        }
    }
}
