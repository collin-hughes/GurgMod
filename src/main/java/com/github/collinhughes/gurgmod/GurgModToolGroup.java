package com.github.collinhughes.gurgmod;

import com.github.collinhughes.gurgmod.init.GurgModItems;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class GurgModToolGroup extends ItemGroup 
{

	public GurgModToolGroup() {
		super("gurg_mod_tools");
		// TODO Auto-generated constructor stub
	}

	@Override
	public ItemStack createIcon() {
		// TODO Auto-generated method stub
		return new ItemStack(GurgModItems.orrin_pickaxe);
	}
	
	
	
}
