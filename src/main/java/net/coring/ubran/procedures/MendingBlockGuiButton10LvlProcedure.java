package net.coring.ubran.procedures;

import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.Minecraft;

import java.util.function.Supplier;
import java.util.Random;
import java.util.Map;

public class MendingBlockGuiButton10LvlProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SURVIVAL;
				} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SURVIVAL;
				}
				return false;
			}
		}.checkGamemode(entity)) {
			if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= 10) {
				if (((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)).isDamaged()) {
					if (Math.random() < 0.01) {
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack stack = ((Slot) _slots.get(0)).getItem();
							if (stack != null) {
								if (stack.hurt(-1000, new Random(), null)) {
									stack.shrink(1);
									stack.setDamageValue(0);
								}
								_player.containerMenu.broadcastChanges();
							}
						}
						if (entity instanceof Player _player)
							_player.giveExperienceLevels(-(10));
					} else if (Math.random() > 0.01) {
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack stack = ((Slot) _slots.get(0)).getItem();
							if (stack != null) {
								if (stack.hurt(-100, new Random(), null)) {
									stack.shrink(1);
									stack.setDamageValue(0);
								}
								_player.containerMenu.broadcastChanges();
							}
						}
						if (entity instanceof Player _player)
							_player.giveExperienceLevels(-(10));
					} else if (Math.random() < 0.1) {
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack stack = ((Slot) _slots.get(0)).getItem();
							if (stack != null) {
								if (stack.hurt(-100, new Random(), null)) {
									stack.shrink(1);
									stack.setDamageValue(0);
								}
								_player.containerMenu.broadcastChanges();
							}
						}
						if (entity instanceof Player _player)
							_player.giveExperienceLevels(-(10));
					} else if (Math.random() > 0.1) {
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack stack = ((Slot) _slots.get(0)).getItem();
							if (stack != null) {
								if (stack.hurt(-50, new Random(), null)) {
									stack.shrink(1);
									stack.setDamageValue(0);
								}
								_player.containerMenu.broadcastChanges();
							}
						}
						if (entity instanceof Player _player)
							_player.giveExperienceLevels(-(10));
					} else if (Math.random() < 0.5) {
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack stack = ((Slot) _slots.get(0)).getItem();
							if (stack != null) {
								if (stack.hurt(-50, new Random(), null)) {
									stack.shrink(1);
									stack.setDamageValue(0);
								}
								_player.containerMenu.broadcastChanges();
							}
						}
						if (entity instanceof Player _player)
							_player.giveExperienceLevels(-(10));
					} else if (Math.random() > 0.5) {
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack stack = ((Slot) _slots.get(0)).getItem();
							if (stack != null) {
								if (stack.hurt(-10, new Random(), null)) {
									stack.shrink(1);
									stack.setDamageValue(0);
								}
								_player.containerMenu.broadcastChanges();
							}
						}
						if (entity instanceof Player _player)
							_player.giveExperienceLevels(-(10));
					}
				}
			}
		} else {
			if (((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)).isDamaged()) {
				if (Math.random() < 0.01) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack stack = ((Slot) _slots.get(0)).getItem();
						if (stack != null) {
							if (stack.hurt(-1000, new Random(), null)) {
								stack.shrink(1);
								stack.setDamageValue(0);
							}
							_player.containerMenu.broadcastChanges();
						}
					}
					if (entity instanceof Player _player)
						_player.giveExperienceLevels(-(10));
				} else if (Math.random() > 0.01) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack stack = ((Slot) _slots.get(0)).getItem();
						if (stack != null) {
							if (stack.hurt(-100, new Random(), null)) {
								stack.shrink(1);
								stack.setDamageValue(0);
							}
							_player.containerMenu.broadcastChanges();
						}
					}
					if (entity instanceof Player _player)
						_player.giveExperienceLevels(-(10));
				} else if (Math.random() < 0.1) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack stack = ((Slot) _slots.get(0)).getItem();
						if (stack != null) {
							if (stack.hurt(-100, new Random(), null)) {
								stack.shrink(1);
								stack.setDamageValue(0);
							}
							_player.containerMenu.broadcastChanges();
						}
					}
					if (entity instanceof Player _player)
						_player.giveExperienceLevels(-(10));
				} else if (Math.random() > 0.1) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack stack = ((Slot) _slots.get(0)).getItem();
						if (stack != null) {
							if (stack.hurt(-50, new Random(), null)) {
								stack.shrink(1);
								stack.setDamageValue(0);
							}
							_player.containerMenu.broadcastChanges();
						}
					}
					if (entity instanceof Player _player)
						_player.giveExperienceLevels(-(10));
				} else if (Math.random() < 0.5) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack stack = ((Slot) _slots.get(0)).getItem();
						if (stack != null) {
							if (stack.hurt(-50, new Random(), null)) {
								stack.shrink(1);
								stack.setDamageValue(0);
							}
							_player.containerMenu.broadcastChanges();
						}
					}
					if (entity instanceof Player _player)
						_player.giveExperienceLevels(-(10));
				} else if (Math.random() > 0.5) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack stack = ((Slot) _slots.get(0)).getItem();
						if (stack != null) {
							if (stack.hurt(-10, new Random(), null)) {
								stack.shrink(1);
								stack.setDamageValue(0);
							}
							_player.containerMenu.broadcastChanges();
						}
					}
					if (entity instanceof Player _player)
						_player.giveExperienceLevels(-(10));
				}
			}
		}
	}
}
