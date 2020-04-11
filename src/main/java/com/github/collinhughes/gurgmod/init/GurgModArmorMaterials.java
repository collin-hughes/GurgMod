package com.github.collinhughes.gurgmod.init;


import com.github.collinhughes.gurgmod.GurgMod;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import com.github.collinhughes.gurgmod.util.handlers.GurgModSoundEvents;

public enum GurgModArmorMaterials implements IArmorMaterial{
	orrin("orrin", 400, new int[] {2, 4, 3, 1}, 25, GurgModItems.orrin_ingot, GurgModSoundEvents.ITEM_ARMOR_EQUIP_GURGMOD, 0.0f),
	gregory("gregory", 600, new int[] {3, 6, 4, 2}, 25, GurgModItems.gregory_ingot, GurgModSoundEvents.ITEM_ARMOR_EQUIP_GURGMOD, 0.0f),
	keith("keith", 800, new int[] {5, 8, 7, 4}, 25, GurgModItems.keith_ingot, GurgModSoundEvents.ITEM_ARMOR_EQUIP_GURGMOD, 0.0f),
	leslie("leslie", 1200, new int[] {8, 10, 9, 7}, 25, GurgModItems.leslie_ingot, GurgModSoundEvents.ITEM_ARMOR_EQUIP_GURGMOD, 0.0f),
	franklin("franklin", 1400, new int[] {10, 13, 12, 9}, 25, GurgModItems.franklin_ingot, GurgModSoundEvents.ITEM_ARMOR_EQUIP_GURGMOD, 2.0f),
	gurg("gurg", 2000, new int[] {15, 22, 21, 14}, 25, GurgModItems.gurg_ingot, GurgModSoundEvents.ITEM_ARMOR_EQUIP_GURGMOD, 10.0f);

	private static final int[] max_damage_array = new int[] {13, 15, 16, 11};
	private String name;
	private SoundEvent equipSound;
	private int durability;
	private int enchantability;
	private int[] damageReductionAmounts;
	private Item repairItem;
	private float toughness;
	
	private GurgModArmorMaterials(String name, int durability, int[] damageReductionAmounts, int enchantability, Item repairItem, SoundEvent equipSound, float toughness)
	{
		this.name = name;
		this.equipSound = equipSound;
		this.durability = durability;
		this.enchantability = enchantability;
		this.damageReductionAmounts = damageReductionAmounts;
		this.repairItem = repairItem;
		this.toughness = toughness;
	}
	
	@Override
	public int getDurability(EquipmentSlotType slotIn) {
		return max_damage_array[slotIn.getIndex()] * this.durability;
	}

	@Override
	public int getDamageReductionAmount(EquipmentSlotType slotIn) {
		return this.damageReductionAmounts[slotIn.getIndex()];
	}

	@Override
	public int getEnchantability() {
		return this.enchantability;
	}

	@Override
	public SoundEvent getSoundEvent() {
		return equipSound;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return Ingredient.fromItems(this.repairItem);
	}

	@Override
	public String getName() {
		return GurgMod.MODID + ":" + this.name;
	}

	@Override
	public float getToughness() {
		return this.toughness;
	}
}