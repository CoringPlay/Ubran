
package net.mcreator.ubran.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.ubran.entity.FlameEntity;
import net.mcreator.ubran.client.model.Modelflama;

public class FlameRenderer extends MobRenderer<FlameEntity, Modelflama<FlameEntity>> {
	public FlameRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelflama(context.bakeLayer(Modelflama.LAYER_LOCATION)), 0.2f);
		this.addLayer(new EyesLayer<FlameEntity, Modelflama<FlameEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("ubran:textures/entities/flama.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(FlameEntity entity) {
		return new ResourceLocation("ubran:textures/entities/flama.png");
	}
}
