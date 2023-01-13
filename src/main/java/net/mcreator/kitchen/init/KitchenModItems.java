
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kitchen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.kitchen.item.WheatflourItem;
import net.mcreator.kitchen.item.UnhuskedriceItem;
import net.mcreator.kitchen.item.ReedLeaveItem;
import net.mcreator.kitchen.item.RedDateItem;
import net.mcreator.kitchen.item.RedDateBunItem;
import net.mcreator.kitchen.item.RawmooncakesItem;
import net.mcreator.kitchen.item.MooncakesItem;
import net.mcreator.kitchen.item.DumplingItem;
import net.mcreator.kitchen.item.DoughItem;
import net.mcreator.kitchen.item.AlcoholItem;
import net.mcreator.kitchen.item.AbowlofcookedriceItem;
import net.mcreator.kitchen.KitchenMod;

public class KitchenModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, KitchenMod.MODID);
	public static final RegistryObject<Item> FRYPAN = block(KitchenModBlocks.FRYPAN, KitchenModTabs.TAB_KITCHENBLOCKS);
	public static final RegistryObject<Item> RICEPLANT_4 = block(KitchenModBlocks.RICEPLANT_4, KitchenModTabs.TAB_KITCHENBLOCKS);
	public static final RegistryObject<Item> STEAMER = block(KitchenModBlocks.STEAMER, KitchenModTabs.TAB_KITCHENBLOCKS);
	public static final RegistryObject<Item> RICEPLANT = block(KitchenModBlocks.RICEPLANT, KitchenModTabs.TAB_KITCHENBLOCKS);
	public static final RegistryObject<Item> ABOWLOFCOOKEDRICE = REGISTRY.register("abowlofcookedrice", () -> new AbowlofcookedriceItem());
	public static final RegistryObject<Item> UNHUSKEDRICE = REGISTRY.register("unhuskedrice", () -> new UnhuskedriceItem());
	public static final RegistryObject<Item> DOUGH = REGISTRY.register("dough", () -> new DoughItem());
	public static final RegistryObject<Item> WHEATFLOUR = REGISTRY.register("wheatflour", () -> new WheatflourItem());
	public static final RegistryObject<Item> MOONCAKES = REGISTRY.register("mooncakes", () -> new MooncakesItem());
	public static final RegistryObject<Item> RAWMOONCAKES = REGISTRY.register("rawmooncakes", () -> new RawmooncakesItem());
	public static final RegistryObject<Item> ALCOHOL = REGISTRY.register("alcohol", () -> new AlcoholItem());
	public static final RegistryObject<Item> DUMPLING = REGISTRY.register("dumpling", () -> new DumplingItem());
	public static final RegistryObject<Item> REED_LEAVE = REGISTRY.register("reed_leave", () -> new ReedLeaveItem());
	public static final RegistryObject<Item> RED_DATE_BUN = REGISTRY.register("red_date_bun", () -> new RedDateBunItem());
	public static final RegistryObject<Item> RED_DATE = REGISTRY.register("red_date", () -> new RedDateItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
