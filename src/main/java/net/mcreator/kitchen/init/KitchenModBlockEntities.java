
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kitchen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.kitchen.block.entity.SteamerBlockEntity;
import net.mcreator.kitchen.block.entity.FrypanBlockEntity;
import net.mcreator.kitchen.KitchenMod;

public class KitchenModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, KitchenMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> FRYPAN = register("frypan", KitchenModBlocks.FRYPAN, FrypanBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> STEAMER = register("steamer", KitchenModBlocks.STEAMER, SteamerBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
