package com.ginsway.dontstarve.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.data.DataOutput;
import net.minecraft.data.client.Models;
import net.minecraft.item.Item;

import java.nio.file.Path;

import static com.ginsway.dontstarve.init.ItemInit.*;

public class EnglishLangProvider extends FabricLanguageProvider {
    public EnglishLangProvider(FabricDataOutput dataGenerator){
        // Specifying en_us is optional, by default is en_us.
        super(dataGenerator,"en_us");
    }
    public static void trans_add(Item item, String value,TranslationBuilder ttB){
        ttB.add(item, value);
    }
    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
////        translationBuilder.add(CUSTOM_ITEM, "Custom Item");
        trans_add(CHEESE,"Cheese",translationBuilder);
        trans_add(COPPER_KNIFE,"Copper Knife",translationBuilder);
        trans_add(IRON_KNIFE,"Iron Knife",translationBuilder);


        try {
            Path existingFilePath = dataOutput.getModContainer().findPath("assets/mymod/lang/en_us.existing.json").get();
            translationBuilder.add(existingFilePath);
        } catch (Exception e) {
            throw new RuntimeException("Failed to add existing language file!", e);
        }
    }
}
