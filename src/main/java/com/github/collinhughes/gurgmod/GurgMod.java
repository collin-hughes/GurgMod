package com.github.collinhughes.gurgmod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.github.collinhughes.gurgmod.client.renders.GurgModRenderRegistries;
import com.github.collinhughes.gurgmod.config.Config;
import com.github.collinhughes.gurgmod.world.OreGeneration;

import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;

@Mod("gurgmod")
public class GurgMod {
	public static GurgMod instance;
	public static final String MODID = "gurgmod";
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	
	public static final ItemGroup GURG_ITEMS = new GurgModItemGroup();
	public static final ItemGroup GURG_ARMOR = new GurgModArmorGroup();
	public static final ItemGroup GURG_TOOLS = new GurgModToolGroup();
	
	public GurgMod()
	{
		instance = this;
		
		ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.server_config, "gurgmod-server.toml");
		ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.client_config, "gurgmod-client.toml");
				
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);

		Config.loadConfig(Config.client_config, FMLPaths.CONFIGDIR.get().resolve("gurgmod-client.toml").toString());
		Config.loadConfig(Config.server_config, FMLPaths.CONFIGDIR.get().resolve("gurgmod-server.toml").toString());
		
		MinecraftForge.EVENT_BUS.register(this);
	}

	private void setup(final FMLCommonSetupEvent event) {
		OreGeneration.setupOreGeneration();
		LOGGER.info("Setup method registered.");
	}

	private void clientRegistries(final FMLClientSetupEvent event) {
		GurgModRenderRegistries.registryEntityRenders();
		LOGGER.info("Client Registries method registered.");
	}	
}

