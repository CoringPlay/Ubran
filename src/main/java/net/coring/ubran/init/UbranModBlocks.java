
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.coring.ubran.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.coring.ubran.block.OakWoodWithAHollowBlock;
import net.coring.ubran.UbranMod;

public class UbranModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, UbranMod.MODID);
	public static final RegistryObject<Block> OAK_WOOD_WITH_A_HOLLOW = REGISTRY.register("oak_wood_with_a_hollow",
			() -> new OakWoodWithAHollowBlock());
}
