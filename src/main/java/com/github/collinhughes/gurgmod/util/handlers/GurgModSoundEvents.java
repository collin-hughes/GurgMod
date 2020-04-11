package com.github.collinhughes.gurgmod.util.handlers;

import com.github.collinhughes.gurgmod.GurgMod;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public class GurgModSoundEvents {

	   public static final SoundEvent ITEM_ARMOR_EQUIP_GURGMOD = register("gurgmod:void");
	
	  	private static SoundEvent register(String key) {
	  		ResourceLocation location = new ResourceLocation(GurgMod.MODID, key);
	  		SoundEvent event = new SoundEvent(location);
	  		//event.setRegistryName(location);
	  		return event;
	  	}
}
