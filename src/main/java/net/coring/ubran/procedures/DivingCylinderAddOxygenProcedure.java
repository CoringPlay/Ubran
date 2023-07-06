package net.coring.ubran.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.ChatType;
import net.minecraft.Util;

import net.coring.ubran.network.UbranModVariables;

public class DivingCylinderAddOxygenProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.isInWaterOrBubble() && UbranModVariables.diving_cylinder_number <= 20 && UbranModVariables.diving_cylinder_number >= 1) {
			entity.setAirSupply(100);
			UbranModVariables.diving_cylinder_number = UbranModVariables.diving_cylinder_number - 1;
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastMessage(new TextComponent("-1"), ChatType.SYSTEM, Util.NIL_UUID);
		} else if (UbranModVariables.diving_cylinder_number < 19) {
			UbranModVariables.diving_cylinder_number = UbranModVariables.diving_cylinder_number + 1;
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastMessage(new TextComponent("+1"), ChatType.SYSTEM, Util.NIL_UUID);
		}
	}
}
