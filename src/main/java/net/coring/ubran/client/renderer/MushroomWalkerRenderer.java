
package net.coring.ubran.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.coring.ubran.entity.MushroomWalkerEntity;
import net.coring.ubran.client.model.Modelmushroom_walker;

public class MushroomWalkerRenderer extends MobRenderer<MushroomWalkerEntity, Modelmushroom_walker<MushroomWalkerEntity>> {
	public MushroomWalkerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmushroom_walker(context.bakeLayer(Modelmushroom_walker.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public ResourceLocation getTextureLocation(MushroomWalkerEntity entity) {
		return new ResourceLocation("ubran:textures/entities/mushroom_walker.png");
	}
}
