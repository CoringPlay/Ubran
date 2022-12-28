
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.coring.ubran.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.coring.ubran.item.VenisonItem;
import net.coring.ubran.item.ScytheItem;
import net.coring.ubran.item.DurandalSwordItem;
import net.coring.ubran.item.CookedVenisonItem;
import net.coring.ubran.item.AngelAxeItem;
import net.coring.ubran.UbranMod;

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
	public static final RegistryObject<Item> CREEPER_MUSHROOM = REGISTRY.register("creeper_mushroom_spawn_egg",
			() -> new ForgeSpawnEggItem(UbranModEntities.CREEPER_MUSHROOM, -6750208, -3355444, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> ANGEL_AXE = REGISTRY.register("angel_axe", () -> new AngelAxeItem());
	public static final RegistryObject<Item> VENISON = REGISTRY.register("venison", () -> new VenisonItem());
	public static final RegistryObject<Item> DURANDAL_SWORD = REGISTRY.register("durandal_sword", () -> new DurandalSwordItem());
	public static final RegistryObject<Item> COOKED_VENISON = REGISTRY.register("cooked_venison", () -> new CookedVenisonItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
