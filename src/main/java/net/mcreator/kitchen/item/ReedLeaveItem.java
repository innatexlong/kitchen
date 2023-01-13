
package net.mcreator.kitchen.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.kitchen.init.KitchenModTabs;

public class ReedLeaveItem extends Item {
	public ReedLeaveItem() {
		super(new Item.Properties().tab(KitchenModTabs.TAB_KITCHENITEMS).stacksTo(64).rarity(Rarity.COMMON));
	}
}
