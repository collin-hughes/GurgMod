package com.github.collinhughes.gurgmod.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class OregenConfig {
	public static ForgeConfigSpec.IntValue orrin_chance;
	public static ForgeConfigSpec.IntValue gregory_chance;
	public static ForgeConfigSpec.IntValue keith_chance;
	public static ForgeConfigSpec.IntValue leslie_chance;
	public static ForgeConfigSpec.IntValue franklin_chance;
	
	public static ForgeConfigSpec.BooleanValue generate_overworld;
	
	public static void init(ForgeConfigSpec.Builder server, ForgeConfigSpec.Builder client)
	{
		server.comment("Oregen Config");
		
		orrin_chance = server
				.comment("Maximum number of orrin ore veins that can spawn in one chunk.")
				.defineInRange("oregen.orrin_chance", 20, 1, 100);
		
		gregory_chance = server
				.comment("Maximum number of gregory ore veins that can spawn in one chunk.")
				.defineInRange("oregen.gregory_chance", 16, 1, 100);
		
		keith_chance = server
				.comment("Maximum number of keith ore veins that can spawn in one chunk.")
				.defineInRange("oregen.keith_chance", 12, 1, 100);
		
		leslie_chance = server
				.comment("Maximum number of leslie ore veins that can spawn in one chunk.")
				.defineInRange("oregen.leslie_chance", 8, 1, 100);

		franklin_chance = server
				.comment("Maximum number of franklin ore veins that can spawn in one chunk.")
				.defineInRange("oregen.franklin_chance", 4, 1, 100);
				
		generate_overworld = server
				.comment("Decide if you want Tutorial Mod ores to spawn in the overworld")
				.define("oregen.generate_overworld", true);
	}
}
