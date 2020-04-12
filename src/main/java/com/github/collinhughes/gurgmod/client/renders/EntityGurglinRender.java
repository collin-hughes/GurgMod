package com.github.collinhughes.gurgmod.client.renders;

import com.github.collinhughes.gurgmod.GurgModRegistries;
import com.github.collinhughes.gurgmod.client.models.EntityGurglinModel;
import com.github.collinhughes.gurgmod.entities.EntityGurglin;

import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

@OnlyIn(Dist.CLIENT)
public class EntityGurglinRender extends BipedRenderer<EntityGurglin, EntityGurglinModel> {

	public EntityGurglinRender(EntityRendererManager rendererManager) {
		super(rendererManager, new EntityGurglinModel(), 0f);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityGurglin entity) {
		// TODO Auto-generated method stub
		return GurgModRegistries.location("textures/entity/entity_gurglin.png");
	}

	public static class RenderFactory implements IRenderFactory<EntityGurglin>
	{

		@Override
		public EntityRenderer<? super EntityGurglin> createRenderFor(EntityRendererManager manager) {
			// TODO Auto-generated method stub
			return new EntityGurglinRender(manager);
		}
		
	}
	
}
