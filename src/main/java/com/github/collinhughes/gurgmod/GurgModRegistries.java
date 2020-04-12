package com.github.collinhughes.gurgmod;

import org.apache.logging.log4j.Logger;

import com.github.collinhughes.gurgmod.init.GurgModArmorMaterials;
import com.github.collinhughes.gurgmod.init.GurgModBlocks;
import com.github.collinhughes.gurgmod.init.GurgModEntities;
import com.github.collinhughes.gurgmod.init.GurgModFoods;
import com.github.collinhughes.gurgmod.init.GurgModItems;
import com.github.collinhughes.gurgmod.init.GurgModToolMaterials;
import com.github.collinhughes.gurgmod.items.CustomAxeItem;
import com.github.collinhughes.gurgmod.items.CustomPickaxeItem;
import com.github.collinhughes.gurgmod.util.handlers.GurgModSoundEvents;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class GurgModRegistries {
	
	public static final ItemGroup GURG_ITEMS = GurgMod.GURG_ITEMS;
	public static final ItemGroup GURG_TOOLS = GurgMod.GURG_TOOLS;
	public static final ItemGroup GURG_ARMOR = GurgMod.GURG_ARMOR;
	public static final Logger LOGGER = GurgMod.LOGGER;
	public static final String MODID = GurgMod.MODID;
	
	@SubscribeEvent
	public static void registerSounds(final RegistryEvent.Register<SoundEvent> event)
	{
		event.getRegistry().registerAll(
				GurgModSoundEvents.ITEM_ARMOR_EQUIP_GURGMOD
				);
		
		LOGGER.info("Sounds registered");
	}
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(
				
				//Orrin Level Items
				GurgModItems.orrin_essence = new Item(new Item.Properties().group(GURG_ITEMS)).setRegistryName(location("orrin_essence")),
				GurgModItems.orrin_essence_pure = new Item(new Item.Properties().group(GURG_ITEMS)).setRegistryName(location("orrin_essence_pure")),
				GurgModItems.orrin_ingot = new Item(new Item.Properties().group(GURG_ITEMS)).setRegistryName(location("orrin_ingot")),
				
				GurgModItems.orrin_axe = new CustomAxeItem(GurgModToolMaterials.orrin, -1.0f, 6.0f, new Item.Properties().group(GURG_TOOLS)).setRegistryName(location("orrin_axe")),
				GurgModItems.orrin_pickaxe = new CustomPickaxeItem(GurgModToolMaterials.orrin, -2, 6.0f, new Item.Properties().group(GURG_TOOLS)).setRegistryName(location("orrin_pickaxe")),
				GurgModItems.orrin_hoe = new HoeItem(GurgModToolMaterials.orrin, 6.0f, new Item.Properties().group(GURG_TOOLS)).setRegistryName(location("orrin_hoe")),
				GurgModItems.orrin_shovel = new ShovelItem(GurgModToolMaterials.orrin, -3.0f, 6.0f, new Item.Properties().group(GURG_TOOLS)).setRegistryName(location("orrin_shovel")),
				GurgModItems.orrin_sword = new SwordItem(GurgModToolMaterials.orrin, 0, 6.0f, new Item.Properties().group(GURG_TOOLS)).setRegistryName(location("orrin_sword")),
				
				GurgModItems.orrin_helmet = new ArmorItem(GurgModArmorMaterials.orrin, EquipmentSlotType.HEAD, new Item.Properties().group(GURG_ARMOR)).setRegistryName(location("orrin_helmet")),
				GurgModItems.orrin_chestplate = new ArmorItem(GurgModArmorMaterials.orrin, EquipmentSlotType.CHEST, new Item.Properties().group(GURG_ARMOR)).setRegistryName(location("orrin_chestplate")),
				GurgModItems.orrin_leggings = new ArmorItem(GurgModArmorMaterials.orrin, EquipmentSlotType.LEGS, new Item.Properties().group(GURG_ARMOR)).setRegistryName(location("orrin_leggings")),
				GurgModItems.orrin_boots = new ArmorItem(GurgModArmorMaterials.orrin, EquipmentSlotType.FEET, new Item.Properties().group(GURG_ARMOR)).setRegistryName(location("orrin_boots")),
				
				GurgModItems.orrin_essence_block = new BlockItem(GurgModBlocks.orrin_essence_block, new Item.Properties().group(GURG_ITEMS)).setRegistryName(GurgModBlocks.orrin_essence_block.getRegistryName()),
				GurgModItems.orrin_essence_ore = new BlockItem(GurgModBlocks.orrin_essence_ore, new Item.Properties().group(GURG_ITEMS)).setRegistryName(GurgModBlocks.orrin_essence_ore.getRegistryName()),
		
				//Gregory Level Items
				GurgModItems.gregory_essence = new Item(new Item.Properties().group(GURG_ITEMS)).setRegistryName(location("gregory_essence")),
				GurgModItems.gregory_essence_pure = new Item(new Item.Properties().group(GURG_ITEMS)).setRegistryName(location("gregory_essence_pure")),
				GurgModItems.gregory_ingot = new Item(new Item.Properties().group(GURG_ITEMS)).setRegistryName(location("gregory_ingot")),
				             
				GurgModItems.gregory_axe = new CustomAxeItem(GurgModToolMaterials.gregory, -1.0f, 6.0f, new Item.Properties().group(GURG_TOOLS)).setRegistryName(location("gregory_axe")),
				GurgModItems.gregory_pickaxe = new CustomPickaxeItem(GurgModToolMaterials.gregory, -2, 6.0f, new Item.Properties().group(GURG_TOOLS)).setRegistryName(location("gregory_pickaxe")),
				GurgModItems.gregory_hoe = new HoeItem(GurgModToolMaterials.gregory, 6.0f, new Item.Properties().group(GURG_TOOLS)).setRegistryName(location("gregory_hoe")),
				GurgModItems.gregory_shovel = new ShovelItem(GurgModToolMaterials.gregory, -3.0f, 6.0f, new Item.Properties().group(GURG_TOOLS)).setRegistryName(location("gregory_shovel")),
				GurgModItems.gregory_sword = new SwordItem(GurgModToolMaterials.gregory, 0, 6.0f, new Item.Properties().group(GURG_TOOLS)).setRegistryName(location("gregory_sword")),
				             
				GurgModItems.gregory_helmet = new ArmorItem(GurgModArmorMaterials.gregory, EquipmentSlotType.HEAD, new Item.Properties().group(GURG_ARMOR)).setRegistryName(location("gregory_helmet")),
				GurgModItems.gregory_chestplate = new ArmorItem(GurgModArmorMaterials.gregory, EquipmentSlotType.CHEST, new Item.Properties().group(GURG_ARMOR)).setRegistryName(location("gregory_chestplate")),
				GurgModItems.gregory_leggings = new ArmorItem(GurgModArmorMaterials.gregory, EquipmentSlotType.LEGS, new Item.Properties().group(GURG_ARMOR)).setRegistryName(location("gregory_leggings")),
				GurgModItems.gregory_boots = new ArmorItem(GurgModArmorMaterials.gregory, EquipmentSlotType.FEET, new Item.Properties().group(GURG_ARMOR)).setRegistryName(location("gregory_boots")),
				             
				GurgModItems.gregory_essence_block = new BlockItem(GurgModBlocks.gregory_essence_block, new Item.Properties().group(GURG_ITEMS)).setRegistryName(GurgModBlocks.gregory_essence_block.getRegistryName()),
				GurgModItems.gregory_essence_ore = new BlockItem(GurgModBlocks.gregory_essence_ore, new Item.Properties().group(GURG_ITEMS)).setRegistryName(GurgModBlocks.gregory_essence_ore.getRegistryName()),
				
				//Keith Level Items
				GurgModItems.keith_essence = new Item(new Item.Properties().group(GURG_ITEMS)).setRegistryName(location("keith_essence")),
				GurgModItems.keith_essence_pure = new Item(new Item.Properties().group(GURG_ITEMS)).setRegistryName(location("keith_essence_pure")),
				GurgModItems.keith_ingot = new Item(new Item.Properties().group(GURG_ITEMS)).setRegistryName(location("keith_ingot")),
				             
				GurgModItems.keith_axe = new CustomAxeItem(GurgModToolMaterials.keith, -1.0f, 6.0f, new Item.Properties().group(GURG_TOOLS)).setRegistryName(location("keith_axe")),
				GurgModItems.keith_pickaxe = new CustomPickaxeItem(GurgModToolMaterials.keith, -2, 6.0f, new Item.Properties().group(GURG_TOOLS)).setRegistryName(location("keith_pickaxe")),
				GurgModItems.keith_hoe = new HoeItem(GurgModToolMaterials.keith, 6.0f, new Item.Properties().group(GURG_TOOLS)).setRegistryName(location("keith_hoe")),
				GurgModItems.keith_shovel = new ShovelItem(GurgModToolMaterials.keith, -3.0f, 6.0f, new Item.Properties().group(GURG_TOOLS)).setRegistryName(location("keith_shovel")),
				GurgModItems.keith_sword = new SwordItem(GurgModToolMaterials.keith, 0, 6.0f, new Item.Properties().group(GURG_TOOLS)).setRegistryName(location("keith_sword")),
				             
				GurgModItems.keith_helmet = new ArmorItem(GurgModArmorMaterials.keith, EquipmentSlotType.HEAD, new Item.Properties().group(GURG_ARMOR)).setRegistryName(location("keith_helmet")),
				GurgModItems.keith_chestplate = new ArmorItem(GurgModArmorMaterials.keith, EquipmentSlotType.CHEST, new Item.Properties().group(GURG_ARMOR)).setRegistryName(location("keith_chestplate")),
				GurgModItems.keith_leggings = new ArmorItem(GurgModArmorMaterials.keith, EquipmentSlotType.LEGS, new Item.Properties().group(GURG_ARMOR)).setRegistryName(location("keith_leggings")),
				GurgModItems.keith_boots = new ArmorItem(GurgModArmorMaterials.keith, EquipmentSlotType.FEET, new Item.Properties().group(GURG_ARMOR)).setRegistryName(location("keith_boots")),
				             
				GurgModItems.keith_essence_block = new BlockItem(GurgModBlocks.keith_essence_block, new Item.Properties().group(GURG_ITEMS)).setRegistryName(GurgModBlocks.keith_essence_block.getRegistryName()),
				GurgModItems.keith_essence_ore = new BlockItem(GurgModBlocks.keith_essence_ore, new Item.Properties().group(GURG_ITEMS)).setRegistryName(GurgModBlocks.keith_essence_ore.getRegistryName()),
				     
				//Leslie Level Items
				GurgModItems.leslie_essence = new Item(new Item.Properties().group(GURG_ITEMS)).setRegistryName(location("leslie_essence")),
				GurgModItems.leslie_essence_pure = new Item(new Item.Properties().group(GURG_ITEMS)).setRegistryName(location("leslie_essence_pure")),
				GurgModItems.leslie_ingot = new Item(new Item.Properties().group(GURG_ITEMS)).setRegistryName(location("leslie_ingot")),
				
				GurgModItems.leslie_axe = new CustomAxeItem(GurgModToolMaterials.leslie, -1.0f, 6.0f, new Item.Properties().group(GURG_TOOLS)).setRegistryName(location("leslie_axe")),
				GurgModItems.leslie_pickaxe = new CustomPickaxeItem(GurgModToolMaterials.leslie, -2, 6.0f, new Item.Properties().group(GURG_TOOLS)).setRegistryName(location("leslie_pickaxe")),
				GurgModItems.leslie_hoe = new HoeItem(GurgModToolMaterials.leslie, 6.0f, new Item.Properties().group(GURG_TOOLS)).setRegistryName(location("leslie_hoe")),
				GurgModItems.leslie_shovel = new ShovelItem(GurgModToolMaterials.leslie, -3.0f, 6.0f, new Item.Properties().group(GURG_TOOLS)).setRegistryName(location("leslie_shovel")),
				GurgModItems.leslie_sword = new SwordItem(GurgModToolMaterials.leslie, 0, 6.0f, new Item.Properties().group(GURG_TOOLS)).setRegistryName(location("leslie_sword")),
				             
				GurgModItems.leslie_helmet = new ArmorItem(GurgModArmorMaterials.leslie, EquipmentSlotType.HEAD, new Item.Properties().group(GURG_ARMOR)).setRegistryName(location("leslie_helmet")),
				GurgModItems.leslie_chestplate = new ArmorItem(GurgModArmorMaterials.leslie, EquipmentSlotType.CHEST, new Item.Properties().group(GURG_ARMOR)).setRegistryName(location("leslie_chestplate")),
				GurgModItems.leslie_leggings = new ArmorItem(GurgModArmorMaterials.leslie, EquipmentSlotType.LEGS, new Item.Properties().group(GURG_ARMOR)).setRegistryName(location("leslie_leggings")),
				GurgModItems.leslie_boots = new ArmorItem(GurgModArmorMaterials.leslie, EquipmentSlotType.FEET, new Item.Properties().group(GURG_ARMOR)).setRegistryName(location("leslie_boots")),
				             
				GurgModItems.leslie_essence_block = new BlockItem(GurgModBlocks.leslie_essence_block, new Item.Properties().group(GURG_ITEMS)).setRegistryName(GurgModBlocks.leslie_essence_block.getRegistryName()),
				GurgModItems.leslie_essence_ore = new BlockItem(GurgModBlocks.leslie_essence_ore, new Item.Properties().group(GURG_ITEMS)).setRegistryName(GurgModBlocks.leslie_essence_ore.getRegistryName()),
				     
				//Franklin Level Items
				GurgModItems.franklin_essence = new Item(new Item.Properties().group(GURG_ITEMS)).setRegistryName(location("franklin_essence")),
				GurgModItems.franklin_essence_pure = new Item(new Item.Properties().group(GURG_ITEMS)).setRegistryName(location("franklin_essence_pure")),
				GurgModItems.franklin_ingot = new Item(new Item.Properties().group(GURG_ITEMS)).setRegistryName(location("franklin_ingot")),
				
				GurgModItems.franklin_axe = new CustomAxeItem(GurgModToolMaterials.franklin, -1.0f, 6.0f, new Item.Properties().group(GURG_TOOLS)).setRegistryName(location("franklin_axe")),
				GurgModItems.franklin_pickaxe = new CustomPickaxeItem(GurgModToolMaterials.franklin, -2, 6.0f, new Item.Properties().group(GURG_TOOLS)).setRegistryName(location("franklin_pickaxe")),
				GurgModItems.franklin_hoe = new HoeItem(GurgModToolMaterials.franklin, 6.0f, new Item.Properties().group(GURG_TOOLS)).setRegistryName(location("franklin_hoe")),
				GurgModItems.franklin_shovel = new ShovelItem(GurgModToolMaterials.franklin, -3.0f, 6.0f, new Item.Properties().group(GURG_TOOLS)).setRegistryName(location("franklin_shovel")),
				GurgModItems.franklin_sword = new SwordItem(GurgModToolMaterials.franklin, 0, 6.0f, new Item.Properties().group(GURG_TOOLS)).setRegistryName(location("franklin_sword")),
				             
				GurgModItems.franklin_helmet = new ArmorItem(GurgModArmorMaterials.franklin, EquipmentSlotType.HEAD, new Item.Properties().group(GURG_ARMOR)).setRegistryName(location("franklin_helmet")),
				GurgModItems.franklin_chestplate = new ArmorItem(GurgModArmorMaterials.franklin, EquipmentSlotType.CHEST, new Item.Properties().group(GURG_ARMOR)).setRegistryName(location("franklin_chestplate")),
				GurgModItems.franklin_leggings = new ArmorItem(GurgModArmorMaterials.franklin, EquipmentSlotType.LEGS, new Item.Properties().group(GURG_ARMOR)).setRegistryName(location("franklin_leggings")),
				GurgModItems.franklin_boots = new ArmorItem(GurgModArmorMaterials.franklin, EquipmentSlotType.FEET, new Item.Properties().group(GURG_ARMOR)).setRegistryName(location("franklin_boots")),
				             
				GurgModItems.franklin_essence_block = new BlockItem(GurgModBlocks.franklin_essence_block, new Item.Properties().group(GURG_ITEMS)).setRegistryName(GurgModBlocks.franklin_essence_block.getRegistryName()),
				GurgModItems.franklin_essence_ore = new BlockItem(GurgModBlocks.franklin_essence_ore, new Item.Properties().group(GURG_ITEMS)).setRegistryName(GurgModBlocks.franklin_essence_ore.getRegistryName()),
				
				//Gurg Level Items
				GurgModItems.gurg_axe = new CustomAxeItem(GurgModToolMaterials.gurg, -1.0f, 6.0f, new Item.Properties().group(GURG_TOOLS)).setRegistryName(location("gurg_axe")),
				GurgModItems.gurg_pickaxe = new CustomPickaxeItem(GurgModToolMaterials.gurg, -2, 6.0f, new Item.Properties().group(GURG_TOOLS)).setRegistryName(location("gurg_pickaxe")),
				GurgModItems.gurg_hoe = new HoeItem(GurgModToolMaterials.gurg, 6.0f, new Item.Properties().group(GURG_TOOLS)).setRegistryName(location("gurg_hoe")),
				GurgModItems.gurg_shovel = new ShovelItem(GurgModToolMaterials.gurg, -3.0f, 6.0f, new Item.Properties().group(GURG_TOOLS)).setRegistryName(location("gurg_shovel")),
				GurgModItems.gurg_sword = new SwordItem(GurgModToolMaterials.gurg, 0, 6.0f, new Item.Properties().group(GURG_TOOLS)).setRegistryName(location("gurg_sword")),
				            
				GurgModItems.gurg_helmet = new ArmorItem(GurgModArmorMaterials.gurg, EquipmentSlotType.HEAD, new Item.Properties().group(GURG_ARMOR)).setRegistryName(location("gurg_helmet")),
				GurgModItems.gurg_chestplate = new ArmorItem(GurgModArmorMaterials.gurg, EquipmentSlotType.CHEST, new Item.Properties().group(GURG_ARMOR)).setRegistryName(location("gurg_chestplate")),
				GurgModItems.gurg_leggings = new ArmorItem(GurgModArmorMaterials.gurg, EquipmentSlotType.LEGS, new Item.Properties().group(GURG_ARMOR)).setRegistryName(location("gurg_leggings")),
				GurgModItems.gurg_boots = new ArmorItem(GurgModArmorMaterials.gurg, EquipmentSlotType.FEET, new Item.Properties().group(GURG_ARMOR)).setRegistryName(location("gurg_boots")),
				             
				GurgModItems.gurglin_hide = new Item(new Item.Properties().group(GURG_ITEMS)).setRegistryName(location("gurglin_hide")),
				GurgModItems.gurglin_tendie = new Item(new Item.Properties().group(GURG_ITEMS).food(GurgModFoods.GURGLIN_TENDIE)).setRegistryName(location("gurglin_tendie")),
				GurgModItems.raw_gurglin_meat = new Item(new Item.Properties().group(GURG_ITEMS).food(GurgModFoods.RAW_GURGLIN_MEAT)).setRegistryName(location("raw_gurglin_meat"))
				);
		
		GurgModEntities.registerEntitySpawnEggs(event);
		
		LOGGER.info("Items registered");
	}
	
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(
				GurgModBlocks.orrin_essence_block = new Block(Block.Properties
						.create(Material.IRON)
						.hardnessAndResistance(1.0f, 3.0f)
						.sound(SoundType.STONE))
						.setRegistryName(location("orrin_essence_block")),
						
				GurgModBlocks.orrin_essence_ore = new Block(Block.Properties
						.create(Material.ROCK)
						.hardnessAndResistance(1.0f, 3.0f)
						.sound(SoundType.STONE))
						.setRegistryName(location("orrin_essence_ore")),
		
				GurgModBlocks.gregory_essence_block = new Block(Block.Properties
						.create(Material.IRON)
						.hardnessAndResistance(2.0f, 3.0f)
						.sound(SoundType.STONE))
						.setRegistryName(location("gregory_essence_block")),
				
				GurgModBlocks.gregory_essence_ore = new Block(Block.Properties
						.create(Material.ROCK)
						.hardnessAndResistance(2.0f, 3.0f)
						.sound(SoundType.STONE))
						.setRegistryName(location("gregory_essence_ore")),
						
				GurgModBlocks.keith_essence_block = new Block(Block.Properties
						.create(Material.IRON)
						.hardnessAndResistance(2.0f, 3.0f)
						.sound(SoundType.STONE))
						.setRegistryName(location("keith_essence_block")),
								
				GurgModBlocks.keith_essence_ore = new Block(Block.Properties
						.create(Material.ROCK)
						.hardnessAndResistance(2.0f, 3.0f)
						.sound(SoundType.STONE))
						.setRegistryName(location("keith_essence_ore")),
							
				GurgModBlocks.leslie_essence_block = new Block(Block.Properties
						.create(Material.IRON)
						.hardnessAndResistance(3.0f, 3.0f)
						.sound(SoundType.STONE))
						.setRegistryName(location("leslie_essence_block")),
										
				GurgModBlocks.leslie_essence_ore = new Block(Block.Properties
						.create(Material.ROCK)
						.hardnessAndResistance(3.0f, 3.0f)
						.sound(SoundType.STONE))
						.setRegistryName(location("leslie_essence_ore")),
										
				GurgModBlocks.franklin_essence_block = new Block(Block.Properties
						.create(Material.IRON)
						.hardnessAndResistance(3.0f, 3.0f)
						.sound(SoundType.STONE))
						.setRegistryName(location("franklin_essence_block")),
												
				GurgModBlocks.franklin_essence_ore = new Block(Block.Properties
						.create(Material.ROCK)
						.hardnessAndResistance(3.0f, 3.0f)
						.sound(SoundType.STONE))
						.setRegistryName(location("franklin_essence_ore"))
						
//				GurgModBlocks.gurg_essence_block = new Block(Block.Properties
//						.create(Material.IRON)
//						.hardnessAndResistance(3.0f, 3.0f)
//						.sound(SoundType.STONE))
//						.setRegistryName(location("gurg_essence_block")),
//						
//				GurgModBlocks.gurg_essence_ore = new Block(Block.Properties
//						.create(Material.ROCK)
//						.hardnessAndResistance(3.0f, 3.0f)
//						.sound(SoundType.STONE))
//						.setRegistryName(location("gurg_essence_ore"))
				);
		
		LOGGER.info("Blocks registered");
	}
	
	@SubscribeEvent
	public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event)
	{
		event.getRegistry().registerAll
		(
				GurgModEntities.ENTITY_GURGLIN,
				GurgModEntities.ENTITY_VOID_GURGLIN
		);
		
		GurgModEntities.registerEntityWorldSpawns();
		
		LOGGER.info("Entities registered");
	}
	
//	@SubscribeEvent
//	public static void registerBiomes(final RegistryEvent.Register<Biome> event)
//	{
//		event.getRegistry().registerAll
//		(
//				TutorialBiomes.tutorial_biome = new TutorialBiome()
//		);
//		
//		TutorialBiomes.registerBiomes();
//		
//		LOGGER.info("Biomes registered");
//	}
	
	
	public static ResourceLocation location(String name)
	{
		return new ResourceLocation(MODID, name);
	}
}
