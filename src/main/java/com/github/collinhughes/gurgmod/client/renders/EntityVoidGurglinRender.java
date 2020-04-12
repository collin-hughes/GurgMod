package com.github.collinhughes.gurgmod.client.renders;

import com.github.collinhughes.gurgmod.GurgModRegistries;
import com.github.collinhughes.gurgmod.client.models.EntityVoidGurglinModel;
import com.github.collinhughes.gurgmod.entities.EntityVoidGurglin;

import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

@OnlyIn(Dist.CLIENT)
public class EntityVoidGurglinRender extends BipedRenderer<EntityVoidGurglin, EntityVoidGurglinModel> {

	public EntityVoidGurglinRender(EntityRendererManager rendererManager) {
		super(rendererManager, new EntityVoidGurglinModel(), 0f);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityVoidGurglin entity) {
		// TODO Auto-generated method stub
		return GurgModRegistries.location("textures/entity/entity_void_gurglin.png");
	}

	public static class RenderFactory implements IRenderFactory<EntityVoidGurglin>
	{

		@Override
		public EntityRenderer<? super EntityVoidGurglin> createRenderFor(EntityRendererManager manager) {
			// TODO Auto-generated method stub
			return new EntityVoidGurglinRender(manager);
		}
		
	}
	
}
