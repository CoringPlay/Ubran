
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

import net.coring.ubran.block.ZoologistsTableBlock;
import net.coring.ubran.block.MendingBlockBlock;
import net.coring.ubran.block.LavaSpongeBlock;
import net.coring.ubran.block.BlockOfBlessingBlock;
import net.coring.ubran.block.BlockOfBlessedGoldIngotBlock;
import net.coring.ubran.UbranMod;

public class UbranModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, UbranMod.MODID);
	public static final RegistryObject<Block> MENDING_BLOCK = REGISTRY.register("mending_block", () -> new MendingBlockBlock());
	public static final RegistryObject<Block> ZOOLOGISTS_TABLE = REGISTRY.register("zoologists_table", () -> new ZoologistsTableBlock());
	public static final RegistryObject<Block> LAVA_SPONGE = REGISTRY.register("lava_sponge", () -> new LavaSpongeBlock());
	public static final RegistryObject<Block> BLOCK_OF_BLESSED_GOLD = REGISTRY.register("block_of_blessed_gold", () -> new BlockOfBlessedGoldIngotBlock());
	public static final RegistryObject<Block> BLOCK_OF_BLESSING = REGISTRY.register("block_of_blessing", () -> new BlockOfBlessingBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			MendingBlockBlock.registerRenderLayer();
			ZoologistsTableBlock.registerRenderLayer();
		}
	}
}
