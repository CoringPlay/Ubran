
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ubran.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.ubran.client.model.Modelmushroom_walker;
import net.mcreator.ubran.client.model.Modelflama;
import net.mcreator.ubran.client.model.Modeldeer;
import net.mcreator.ubran.client.model.Modelcreeper_mushroom;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class UbranModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelcreeper_mushroom.LAYER_LOCATION, Modelcreeper_mushroom::createBodyLayer);
		event.registerLayerDefinition(Modelflama.LAYER_LOCATION, Modelflama::createBodyLayer);
		event.registerLayerDefinition(Modeldeer.LAYER_LOCATION, Modeldeer::createBodyLayer);
		event.registerLayerDefinition(Modelmushroom_walker.LAYER_LOCATION, Modelmushroom_walker::createBodyLayer);
	}
}
