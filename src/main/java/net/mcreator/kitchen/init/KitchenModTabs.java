
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kitchen.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class KitchenModTabs {
	public static CreativeModeTab TAB_KITCHENBLOCKS;
	public static CreativeModeTab TAB_KITCHENITEMS;

	public static void load() {
		TAB_KITCHENBLOCKS = new CreativeModeTab("tabkitchenblocks") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(KitchenModBlocks.RICEPLANT_4.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_KITCHENITEMS = new CreativeModeTab("tabkitchenitems") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(KitchenModItems.ABOWLOFCOOKEDRICE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
