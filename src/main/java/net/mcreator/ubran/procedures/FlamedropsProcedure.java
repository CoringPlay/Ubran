package net.mcreator.ubran.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;

public class FlamedropsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.7) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.BLAZE_POWDER));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.BLAZE_POWDER));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
		if (Math.random() < 0.3) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.BLAZE_POWDER));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}
