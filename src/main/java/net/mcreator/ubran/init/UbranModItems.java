
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ubran.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.ubran.item.ScytheItem;
import net.mcreator.ubran.UbranMod;

public class UbranModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, UbranMod.MODID);
	public static final RegistryObject<Item> FLAME = REGISTRY.register("flame_spawn_egg",
			() -> new ForgeSpawnEggItem(UbranModEntities.FLAME, -52480, -13108, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SCYTHE = REGISTRY.register("scythe", () -> new ScytheItem());
	public static final RegistryObject<Item> DEER = REGISTRY.register("deer_spawn_egg",
			() -> new ForgeSpawnEggItem(UbranModEntities.DEER, -6791362, -2640496, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> MUSHROOM_WALKER = REGISTRY.register("mushroom_walker_spawn_egg",
			() -> new ForgeSpawnEggItem(UbranModEntities.MUSHROOM_WALKER, -3355444, -6750208, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> OAK_WOOD_WITH_A_HOLLOW = block(UbranModBlocks.OAK_WOOD_WITH_A_HOLLOW,
			CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
