
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kitchen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.kitchen.block.SteamerBlock;
import net.mcreator.kitchen.block.RiceplantBlock;
import net.mcreator.kitchen.block.Riceplant4Block;
import net.mcreator.kitchen.block.FrypanBlock;
import net.mcreator.kitchen.KitchenMod;

public class KitchenModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, KitchenMod.MODID);
	public static final RegistryObject<Block> FRYPAN = REGISTRY.register("frypan", () -> new FrypanBlock());
	public static final RegistryObject<Block> RICEPLANT_4 = REGISTRY.register("riceplant_4", () -> new Riceplant4Block());
	public static final RegistryObject<Block> STEAMER = REGISTRY.register("steamer", () -> new SteamerBlock());
	public static final RegistryObject<Block> RICEPLANT = REGISTRY.register("riceplant", () -> new RiceplantBlock());
}
