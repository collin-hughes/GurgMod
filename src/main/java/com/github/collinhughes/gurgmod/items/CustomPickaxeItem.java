package com.github.collinhughes.gurgmod.items;

import net.minecraft.item.IItemTier;
import net.minecraft.item.PickaxeItem;

public class CustomPickaxeItem extends PickaxeItem{

	public CustomPickaxeItem(IItemTier tier, int attackDamage, float attackSpeedIn, Properties builder) {
		super(tier, attackDamage, attackSpeedIn, builder);
	}

}
