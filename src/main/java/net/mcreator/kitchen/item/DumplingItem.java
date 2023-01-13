
package net.mcreator.kitchen.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.kitchen.init.KitchenModTabs;

public class DumplingItem extends Item {
	public DumplingItem() {
		super(new Item.Properties().tab(KitchenModTabs.TAB_KITCHENITEMS).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.3f)

						.meat().build()));
	}
}
