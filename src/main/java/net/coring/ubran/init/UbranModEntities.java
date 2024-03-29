
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.coring.ubran.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.coring.ubran.entity.MushroomWalkerEntity;
import net.coring.ubran.entity.FlameEntity;
import net.coring.ubran.entity.DeerEntity;
import net.coring.ubran.entity.CreeperMushroomEntity;
import net.coring.ubran.UbranMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class UbranModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, UbranMod.MODID);
	public static final RegistryObject<EntityType<FlameEntity>> FLAME = register("flame",
			EntityType.Builder.<FlameEntity>of(FlameEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FlameEntity::new).fireImmune().sized(0.6f, 0.9f));
	public static final RegistryObject<EntityType<DeerEntity>> DEER = register("deer",
			EntityType.Builder.<DeerEntity>of(DeerEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DeerEntity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<MushroomWalkerEntity>> MUSHROOM_WALKER = register("mushroom_walker",
			EntityType.Builder.<MushroomWalkerEntity>of(MushroomWalkerEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MushroomWalkerEntity::new)

					.sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CreeperMushroomEntity>> CREEPER_MUSHROOM = register("creeper_mushroom",
			EntityType.Builder.<CreeperMushroomEntity>of(CreeperMushroomEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CreeperMushroomEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			FlameEntity.init();
			DeerEntity.init();
			MushroomWalkerEntity.init();
			CreeperMushroomEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(FLAME.get(), FlameEntity.createAttributes().build());
		event.put(DEER.get(), DeerEntity.createAttributes().build());
		event.put(MUSHROOM_WALKER.get(), MushroomWalkerEntity.createAttributes().build());
		event.put(CREEPER_MUSHROOM.get(), CreeperMushroomEntity.createAttributes().build());
	}
}
