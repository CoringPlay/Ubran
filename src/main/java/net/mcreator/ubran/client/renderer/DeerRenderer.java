
package net.mcreator.ubran.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.ubran.entity.DeerEntity;
import net.mcreator.ubran.client.model.Modeldeer;

public class DeerRenderer extends MobRenderer<DeerEntity, Modeldeer<DeerEntity>> {
	public DeerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldeer(context.bakeLayer(Modeldeer.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DeerEntity entity) {
		return new ResourceLocation("ubran:textures/deer.png");
	}
}
