
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kitchen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.kitchen.world.inventory.SteamerguiMenu;
import net.mcreator.kitchen.world.inventory.FrypanguiMenu;
import net.mcreator.kitchen.KitchenMod;

public class KitchenModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, KitchenMod.MODID);
	public static final RegistryObject<MenuType<FrypanguiMenu>> FRYPANGUI = REGISTRY.register("frypangui",
			() -> IForgeMenuType.create(FrypanguiMenu::new));
	public static final RegistryObject<MenuType<SteamerguiMenu>> STEAMERGUI = REGISTRY.register("steamergui",
			() -> IForgeMenuType.create(SteamerguiMenu::new));
}
