
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dontstarve.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class Dontstarve3ModTabs {
	public static CreativeModeTab TAB_DONT_STARVE_3;

	public static void load() {
		TAB_DONT_STARVE_3 = new CreativeModeTab("tabdont_starve_3") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Dontstarve3ModItems.A_LEAVES.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
