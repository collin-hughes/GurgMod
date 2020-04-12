package com.github.collinhughes.gurgmod.init;

import com.github.collinhughes.gurgmod.GurgMod;
import com.github.collinhughes.gurgmod.GurgModRegistries;
import com.github.collinhughes.gurgmod.entities.EntityGurglin;
import com.github.collinhughes.gurgmod.entities.EntityVoidGurglin;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.biome.Biome.SpawnListEntry;
import net.minecraftforge.event.RegistryEvent;

public class GurgModEntities {
	
public static EntityType<?> ENTITY_GURGLIN = EntityType.Builder.create(EntityGurglin::new, EntityClassification.MONSTER).build(GurgMod.MODID + ":entity_gurglin").setRegistryName(GurgModRegistries.location("entity_gurglin")); 
public static EntityType<?> ENTITY_VOID_GURGLIN = EntityType.Builder.create(EntityVoidGurglin::new, EntityClassification.MONSTER).build(GurgMod.MODID + ":entity_void_gurglin").setRegistryName(GurgModRegistries.location("entity_void_gurglin")); 
	
	public static void registerEntitySpawnEggs(final RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll
		(
			GurgModItems.entity_gurglin_egg = registerEntitySpawnEgg(ENTITY_GURGLIN, 0xFFADAD, 0xFF5038, "entity_gurglin_egg"),
			GurgModItems.entity_void_gurglin_egg = registerEntitySpawnEgg(ENTITY_VOID_GURGLIN, 0xBE1D1D, 0x8A0605, "entity_void_gurglin_egg")
		);
	}
	
	public static void registerEntityWorldSpawns()
	{
		registerEntityWorldSpawn(ENTITY_GURGLIN, 20, 1, 3, Biomes.PLAINS, Biomes.BEACH, Biomes.JUNGLE, Biomes.FOREST);
		registerEntityWorldSpawn(ENTITY_VOID_GURGLIN, 5, 1, 1, Biomes.PLAINS, Biomes.BEACH, Biomes.JUNGLE, Biomes.FOREST);
	}
	
	public static Item registerEntitySpawnEgg(EntityType<?> type, int color1, int color2, String name)
	{
		SpawnEggItem item = new SpawnEggItem(type, color1, color2, new Item.Properties().group(GurgModRegistries.GURG_ITEMS));
		item.setRegistryName(GurgModRegistries.location(name));
		
		return item;
	}
	
	public static void registerEntityWorldSpawn(EntityType<?> entity, int weight, int minGroupCount, int maxGroupCount, Biome...biomes)
	{
		for(Biome biome : biomes)
		{
			if(biome != null)
			{
				biome.getSpawns(entity.getClassification()).add(new SpawnListEntry(entity, weight, minGroupCount, maxGroupCount));
			}
		}
	}
}

