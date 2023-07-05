
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.coring.ubran.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.coring.ubran.block.MendingBlockBlock;
import net.coring.ubran.UbranMod;

public class UbranModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, UbranMod.MODID);
	public static final RegistryObject<Block> MENDING_BLOCK = REGISTRY.register("mending_block", () -> new MendingBlockBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			MendingBlockBlock.registerRenderLayer();
		}
	}
}
