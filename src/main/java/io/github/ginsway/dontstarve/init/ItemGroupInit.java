package io.github.ginsway.dontstarve.init;

import io.github.ginsway.dontstarve.DontStarve3;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import static io.github.ginsway.dontstarve.init.ItemInit.*;
import static io.github.ginsway.dontstarve.init.BlockInit.*;

public class ItemGroupInit {
    public static final ItemGroup DONTSTARVE = FabricItemGroup.builder(new Identifier(DontStarve3.MOD_ID, "group"))
            .icon(() -> new ItemStack((ItemInit.CHEESE)))
            .entries((enabledFeatures, entries)-> {
                entries.add(new ItemStack(ItemInit.CHEESE));
                entries.add(new ItemStack(COPPER_KNIFE));
                entries.add(new ItemStack(IRON_KNIFE));
                entries.add(new ItemStack(GOLD_KNIFE));
                entries.add(new ItemStack(DIAMOND_KNIFE));
                entries.add(new ItemStack(NETHERITE_KNIFE));
                entries.add(new ItemStack(CHOCOLATE));
                entries.add(new ItemStack(CHOCOLATE_BLOCK));
                entries.add(new ItemStack(CHEESE_BLOCK));
                entries.add(new ItemStack(CHEESE_STICK));
            }
    ).build();

}
