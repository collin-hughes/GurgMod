package com.github.collinhughes.gurgmod.init;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;

public enum GurgModToolMaterials implements IItemTier {
	orrin(4.0f, 3.0f, 200, 1, 25, GurgModItems.orrin_ingot),
	gregory(6.0f, 3.75f, 500, 2, 25, GurgModItems.gregory_ingot),
	keith(8.0f, 5.0f, 800, 2, 25, GurgModItems.keith_ingot),
	leslie(10.0f, 6.0f, 1200, 3, 25, GurgModItems.leslie_ingot),
	franklin(10.0f, 8.0f, 6200, 3, 25, GurgModItems.franklin_ingot),	
	gurg(16.0f, 12.0f, 2000, 3, 25, GurgModItems.gurg_ingot);
	
	private float attackDamage;
	private float efficiency;
	
	private int durability;
	private int harvestLevel;
	private int enchantability;
	
	private Item repairMaterial;
	
	private GurgModToolMaterials(float attackDamage, float efficiency, int durability, int harvestLevel, int enchantability, Item repairMaterial) {
		this.attackDamage = attackDamage;
		this.efficiency = efficiency;
		this.durability = durability;
		this.harvestLevel = harvestLevel;
		this.enchantability = enchantability;
		this.repairMaterial = repairMaterial;
	}

	@Override
	public int getMaxUses() {
		return this.durability;
	}

	@Override
	public float getEfficiency() {
		return this.efficiency;
	}

	@Override
	public float getAttackDamage() {
		return this.attackDamage;
	}

	@Override
	public int getHarvestLevel() {
		return this.harvestLevel;
	}

	@Override
	public int getEnchantability() {
		return this.enchantability;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return Ingredient.fromItems(this.repairMaterial);
	}
}