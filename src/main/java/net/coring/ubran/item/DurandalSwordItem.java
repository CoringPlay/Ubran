
package net.coring.ubran.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.entity.LivingEntity;

import net.coring.ubran.procedures.Durandal_Sword_When_They_WaveProcedure;

public class DurandalSwordItem extends SwordItem {
	public DurandalSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 2280;
			}

			public float getSpeed() {
				return 1f;
			}

			public float getAttackDamageBonus() {
				return 7f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 16;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, -1.5f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant());
	}

	@Override
	public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
		boolean retval = super.onEntitySwing(itemstack, entity);
		Durandal_Sword_When_They_WaveProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ());
		return retval;
	}
}
