
package net.mcreator.kitchen.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.kitchen.init.KitchenModTabs;

public class WheatflourItem extends Item {
	public WheatflourItem() {
		super(new Item.Properties().tab(KitchenModTabs.TAB_KITCHENITEMS).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 32;
	}
}
