
package net.mcreator.ubran.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.ubran.entity.CreeperMushroomEntity;
import net.mcreator.ubran.client.model.Modelcreeper_mushroom;

public class CreeperMushroomRenderer extends MobRenderer<CreeperMushroomEntity, Modelcreeper_mushroom<CreeperMushroomEntity>> {
	public CreeperMushroomRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcreeper_mushroom(context.bakeLayer(Modelcreeper_mushroom.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CreeperMushroomEntity entity) {
		return new ResourceLocation("ubran:textures/entities/creeper_mushroom.png");
	}
}
