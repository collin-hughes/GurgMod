package com.github.collinhughes.gurgmod.init;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class GurgModFoods 
{
	public static final Food GURGLIN_TENDIE;
	public static final Food RAW_GURGLIN_MEAT;

	
	static {
		GURGLIN_TENDIE = new Food.Builder().hunger(4).saturation(4).meat().build();
		RAW_GURGLIN_MEAT = new Food.Builder().hunger(1).saturation(2).meat().effect(new EffectInstance(Effects.NAUSEA), 100f).build();
	}
}
