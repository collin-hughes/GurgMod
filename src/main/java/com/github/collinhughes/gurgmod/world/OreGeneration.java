package com.github.collinhughes.gurgmod.world;

import com.github.collinhughes.gurgmod.config.OregenConfig;
import com.github.collinhughes.gurgmod.init.GurgModBlocks;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig.FillerBlockType;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGeneration {
	
	
	public static void setupOreGeneration()
	{
		if(OregenConfig.generate_overworld.get())
		{
			for(Biome biome : ForgeRegistries.BIOMES)
			{				
				biome.addFeature(Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NATURAL_STONE, GurgModBlocks.orrin_essence_ore.getDefaultState(), OregenConfig.orrin_chance.get()), Placement.COUNT_RANGE, new CountRangeConfig(10, 5, 0, 128)));
//				biome.addFeature(Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NETHERRACK, GurgModBlocks.orrin_essence_ore.getDefaultState(), OregenConfig.orrin_chance.get()), Placement.COUNT_RANGE, new CountRangeConfig(10, 20, 0, 100)));
			
				biome.addFeature(Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NATURAL_STONE, GurgModBlocks.gregory_essence_ore.getDefaultState(), OregenConfig.gregory_chance.get()), Placement.COUNT_RANGE, new CountRangeConfig(6, 5, 0, 64)));
//				biome.addFeature(Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NETHERRACK, GurgModBlocks.gregory_essence_ore.getDefaultState(), OregenConfig.gregory_chance.get()), Placement.COUNT_RANGE, new CountRangeConfig(10, 20, 0, 100)));
			
				biome.addFeature(Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NATURAL_STONE, GurgModBlocks.keith_essence_ore.getDefaultState(), OregenConfig.keith_chance.get()), Placement.COUNT_RANGE, new CountRangeConfig(4, 5, 0, 48)));
//				biome.addFeature(Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NETHERRACK, GurgModBlocks.keith_essence_ore.getDefaultState(), OregenConfig.keith_chance.get()), Placement.COUNT_RANGE, new CountRangeConfig(10, 20, 0, 100)));

				biome.addFeature(Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NATURAL_STONE, GurgModBlocks.leslie_essence_ore.getDefaultState(), OregenConfig.leslie_chance.get()), Placement.COUNT_RANGE, new CountRangeConfig(2, 5, 0, 32)));
//				biome.addFeature(Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NETHERRACK, GurgModBlocks.leslie_essence_ore.getDefaultState(), OregenConfig.leslie_chance.get()), Placement.COUNT_RANGE, new CountRangeConfig(10, 20, 0, 100)));

				biome.addFeature(Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NATURAL_STONE, GurgModBlocks.franklin_essence_ore.getDefaultState(), OregenConfig.franklin_chance.get()), Placement.COUNT_RANGE, new CountRangeConfig(2, 5, 0, 24)));
//				biome.addFeature(Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NETHERRACK, GurgModBlocks.franklin_essence_ore.getDefaultState(), OregenConfig.franklin_chance.get()), Placement.COUNT_RANGE, new CountRangeConfig(10, 20, 0, 100)));
			}
		}
	}
}
