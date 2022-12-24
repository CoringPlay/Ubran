
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.coring.ubran.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.coring.ubran.client.renderer.MushroomWalkerRenderer;
import net.coring.ubran.client.renderer.FlameRenderer;
import net.coring.ubran.client.renderer.DeerRenderer;
import net.coring.ubran.client.renderer.CreeperMushroomRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class UbranModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(UbranModEntities.FLAME.get(), FlameRenderer::new);
		event.registerEntityRenderer(UbranModEntities.DEER.get(), DeerRenderer::new);
		event.registerEntityRenderer(UbranModEntities.MUSHROOM_WALKER.get(), MushroomWalkerRenderer::new);
		event.registerEntityRenderer(UbranModEntities.CREEPER_MUSHROOM.get(), CreeperMushroomRenderer::new);
	}
}
