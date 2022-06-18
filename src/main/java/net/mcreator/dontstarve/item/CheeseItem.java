
package net.mcreator.dontstarve.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.dontstarve.init.Dontstarve3ModTabs;

public class CheeseItem extends Item {
	public CheeseItem() {
		super(new Item.Properties().tab(Dontstarve3ModTabs.TAB_DONT_STARVE_3).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(1).saturationMod(4f)

						.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 32;
	}
}
