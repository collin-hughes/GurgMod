package com.github.collinhughes.gurgmod;

import com.github.collinhughes.gurgmod.init.GurgModItems;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class GurgModArmorGroup extends ItemGroup 
{

	public GurgModArmorGroup() {
		super("gurg_mod_armor");
		// TODO Auto-generated constructor stub
	}

	@Override
	public ItemStack createIcon() {
		// TODO Auto-generated method stub
		return new ItemStack(GurgModItems.orrin_chestplate);
	}
	
	
	
}
