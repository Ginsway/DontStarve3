
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dontstarve.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.dontstarve.block.CheeseBlockBlock;
import net.mcreator.dontstarve.Dontstarve3Mod;

public class Dontstarve3ModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, Dontstarve3Mod.MODID);
	public static final RegistryObject<Block> CHEESE_BLOCK = REGISTRY.register("cheese_block", () -> new CheeseBlockBlock());
}
