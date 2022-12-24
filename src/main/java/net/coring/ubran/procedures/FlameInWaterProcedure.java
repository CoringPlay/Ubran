package net.coring.ubran.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

public class FlameInWaterProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.isInWaterRainOrBubble()) {
			entity.hurt(DamageSource.GENERIC, 2);
		}
	}
}
