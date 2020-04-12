package com.github.collinhughes.gurgmod.client.renders;

import com.github.collinhughes.gurgmod.entities.EntityGurglin;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

@OnlyIn(Dist.CLIENT)
public class GurgModRenderRegistries {
	public static void registryEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityGurglin.class, new EntityGurglinRender.RenderFactory());
	}
}
