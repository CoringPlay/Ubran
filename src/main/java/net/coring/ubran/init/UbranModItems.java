
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

import net.coring.ubran.item.WorriendRhythmItem;
import net.coring.ubran.item.VenisonItem;
import net.coring.ubran.item.ScytheItem;
import net.coring.ubran.item.FanerisSwordItem;
import net.coring.ubran.item.DurandalSwordItem;
import net.coring.ubran.item.DivingCylinderItem;
import net.coring.ubran.item.CookedVenisonItem;
import net.coring.ubran.item.AngelAxeItem;
import net.coring.ubran.UbranMod;

public class UbranModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, UbranMod.MODID);
	public static final RegistryObject<Item> FLAME_SPAWN_EGG = REGISTRY.register("flame_spawn_egg", () -> new ForgeSpawnEggItem(UbranModEntities.FLAME, -52480, -13108, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SCYTHE = REGISTRY.register("scythe", () -> new ScytheItem());
	public static final RegistryObject<Item> DEER_SPAWN_EGG = REGISTRY.register("deer_spawn_egg", () -> new ForgeSpawnEggItem(UbranModEntities.DEER, -6791362, -2640496, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> MUSHROOM_WALKER_SPAWN_EGG = REGISTRY.register("mushroom_walker_spawn_egg",
			() -> new ForgeSpawnEggItem(UbranModEntities.MUSHROOM_WALKER, -3355444, -6750208, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> CREEPER_MUSHROOM_SPAWN_EGG = REGISTRY.register("creeper_mushroom_spawn_egg",
			() -> new ForgeSpawnEggItem(UbranModEntities.CREEPER_MUSHROOM, -6750208, -3355444, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> ANGEL_AXE = REGISTRY.register("angel_axe", () -> new AngelAxeItem());
	public static final RegistryObject<Item> VENISON = REGISTRY.register("venison", () -> new VenisonItem());
	public static final RegistryObject<Item> DURANDAL_SWORD = REGISTRY.register("durandal_sword", () -> new DurandalSwordItem());
	public static final RegistryObject<Item> COOKED_VENISON = REGISTRY.register("cooked_venison", () -> new CookedVenisonItem());
	public static final RegistryObject<Item> WORRIEND_RHYTHM = REGISTRY.register("worriend_rhythm", () -> new WorriendRhythmItem());
	public static final RegistryObject<Item> FANERIS_SWORD = REGISTRY.register("faneris_sword", () -> new FanerisSwordItem());
	public static final RegistryObject<Item> MENDING_BLOCK = block(UbranModBlocks.MENDING_BLOCK, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> DIVING_CYLINDER = REGISTRY.register("diving_cylinder", () -> new DivingCylinderItem());
	public static final RegistryObject<Item> ZOOLOGISTS_TABLE = block(UbranModBlocks.ZOOLOGISTS_TABLE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> LAVA_SPONGE = block(UbranModBlocks.LAVA_SPONGE, null);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
