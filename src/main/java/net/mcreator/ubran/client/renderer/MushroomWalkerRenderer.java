
package net.mcreator.ubran.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.ubran.entity.MushroomWalkerEntity;
import net.mcreator.ubran.client.model.Modelmushroom_walker;

public class MushroomWalkerRenderer extends MobRenderer<MushroomWalkerEntity, Modelmushroom_walker<MushroomWalkerEntity>> {
	public MushroomWalkerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmushroom_walker(context.bakeLayer(Modelmushroom_walker.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public ResourceLocation getTextureLocation(MushroomWalkerEntity entity) {
		return new ResourceLocation("ubran:textures/mushroom_walker.png");
	}
}
