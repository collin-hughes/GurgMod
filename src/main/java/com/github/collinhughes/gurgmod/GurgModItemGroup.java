package com.github.collinhughes.gurgmod;

import com.github.collinhughes.gurgmod.init.GurgModItems;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class GurgModItemGroup extends ItemGroup 
{

	public GurgModItemGroup() {
		super("gurg_mod_items");
		// TODO Auto-generated constructor stub
	}

	@Override
	public ItemStack createIcon() {
		// TODO Auto-generated method stub
		return new ItemStack(GurgModItems.orrin_essence);
	}
	
	
	
}
