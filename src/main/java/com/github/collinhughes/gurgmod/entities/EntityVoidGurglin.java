package com.github.collinhughes.gurgmod.entities;

import com.github.collinhughes.gurgmod.init.GurgModEntities;
import com.github.collinhughes.gurgmod.init.GurgModItems;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.ZombiePigmanEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;

public class EntityVoidGurglin extends ZombiePigmanEntity {
	@SuppressWarnings("unchecked")
	public EntityVoidGurglin(EntityType<? extends ZombiePigmanEntity> type, World worldIn) {
		super ((EntityType<? extends ZombiePigmanEntity>) GurgModEntities.ENTITY_VOID_GURGLIN, worldIn);
		this.setChild(false);
	}
	
	@Override
	protected int getExperiencePoints(PlayerEntity player) {
		return super.getExperiencePoints(player);
	}
	
	@Override
	protected void setEquipmentBasedOnDifficulty(DifficultyInstance difficulty) {
		this.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(GurgModItems.gurg_sword));
	}
	
	@Override
	protected boolean shouldBurnInDay() {
		      return false;
	}
	
	@Override
	protected void registerAttributes() {
		super.registerAttributes();
		this.setHealth(40f);
	}
}
