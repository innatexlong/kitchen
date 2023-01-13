
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kitchen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.kitchen.world.features.plants.Riceplant4Feature;
import net.mcreator.kitchen.KitchenMod;

@Mod.EventBusSubscriber
public class KitchenModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, KitchenMod.MODID);
	public static final RegistryObject<Feature<?>> RICEPLANT_4 = REGISTRY.register("riceplant_4", Riceplant4Feature::feature);
}
