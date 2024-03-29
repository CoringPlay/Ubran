package net.coring.ubran.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class ScytheProcedurProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (entity.getXRot() > 35 || entity.getXRot() < -35) {
			if ((world.getBlockState(new BlockPos(x + 1, y, z))).getMaterial() == net.minecraft.world.level.material.Material.LEAVES && !((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.BEDROCK)) {
				{
					BlockPos _pos = new BlockPos(x + 1, y, z);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
			if ((world.getBlockState(new BlockPos(x - 1, y, z))).getMaterial() == net.minecraft.world.level.material.Material.LEAVES && !((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.BEDROCK)) {
				{
					BlockPos _pos = new BlockPos(x - 1, y, z);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
			if ((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getMaterial() == net.minecraft.world.level.material.Material.LEAVES && !((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock() == Blocks.BEDROCK)) {
				{
					BlockPos _pos = new BlockPos(x + 1, y, z + 1);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
			if ((world.getBlockState(new BlockPos(x + 1, y, z - 1))).getMaterial() == net.minecraft.world.level.material.Material.LEAVES && !((world.getBlockState(new BlockPos(x + 1, y, z - 1))).getBlock() == Blocks.BEDROCK)) {
				{
					BlockPos _pos = new BlockPos(x + 1, y, z - 1);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
			if ((world.getBlockState(new BlockPos(x - 1, y, z - 1))).getMaterial() == net.minecraft.world.level.material.Material.LEAVES && !((world.getBlockState(new BlockPos(x - 1, y, z - 1))).getBlock() == Blocks.BEDROCK)) {
				{
					BlockPos _pos = new BlockPos(x - 1, y, z - 1);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
			if ((world.getBlockState(new BlockPos(x - 1, y, z + 1))).getMaterial() == net.minecraft.world.level.material.Material.LEAVES && !((world.getBlockState(new BlockPos(x - 1, y, z + 1))).getBlock() == Blocks.BEDROCK)) {
				{
					BlockPos _pos = new BlockPos(x - 1, y, z + 1);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
			if ((world.getBlockState(new BlockPos(x, y, z + 1))).getMaterial() == net.minecraft.world.level.material.Material.LEAVES && !((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.BEDROCK)) {
				{
					BlockPos _pos = new BlockPos(x, y, z + 1);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
			if ((world.getBlockState(new BlockPos(x, y, z - 1))).getMaterial() == net.minecraft.world.level.material.Material.LEAVES && !((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.BEDROCK)) {
				{
					BlockPos _pos = new BlockPos(x, y, z - 1);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
		} else if ((entity.getDirection()) == Direction.NORTH || (entity.getDirection()) == Direction.SOUTH) {
			if ((world.getBlockState(new BlockPos(x + 1, y, z))).getMaterial() == net.minecraft.world.level.material.Material.LEAVES && !((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.BEDROCK)) {
				{
					BlockPos _pos = new BlockPos(x + 1, y, z);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
			if ((world.getBlockState(new BlockPos(x - 1, y, z))).getMaterial() == net.minecraft.world.level.material.Material.LEAVES && !((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.BEDROCK)) {
				{
					BlockPos _pos = new BlockPos(x - 1, y, z);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
			if ((world.getBlockState(new BlockPos(x + 1, y + 1, z))).getMaterial() == net.minecraft.world.level.material.Material.LEAVES && !((world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock() == Blocks.BEDROCK)) {
				{
					BlockPos _pos = new BlockPos(x + 1, y + 1, z);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
			if ((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getMaterial() == net.minecraft.world.level.material.Material.LEAVES && !((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock() == Blocks.BEDROCK)) {
				{
					BlockPos _pos = new BlockPos(x + 1, y - 1, z);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
			if ((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getMaterial() == net.minecraft.world.level.material.Material.LEAVES && !((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock() == Blocks.BEDROCK)) {
				{
					BlockPos _pos = new BlockPos(x - 1, y - 1, z);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
			if ((world.getBlockState(new BlockPos(x - 1, y + 1, z))).getMaterial() == net.minecraft.world.level.material.Material.LEAVES && !((world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock() == Blocks.BEDROCK)) {
				{
					BlockPos _pos = new BlockPos(x - 1, y + 1, z);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
			if ((world.getBlockState(new BlockPos(x, y + 1, z))).getMaterial() == net.minecraft.world.level.material.Material.LEAVES && !((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.BEDROCK)) {
				{
					BlockPos _pos = new BlockPos(x, y + 1, z);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
			if ((world.getBlockState(new BlockPos(x, y - 1, z))).getMaterial() == net.minecraft.world.level.material.Material.LEAVES && !((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.BEDROCK)) {
				{
					BlockPos _pos = new BlockPos(x, y - 1, z);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
		} else if ((entity.getDirection()) == Direction.WEST || (entity.getDirection()) == Direction.EAST) {
			if ((world.getBlockState(new BlockPos(x, y, z + 1))).getMaterial() == net.minecraft.world.level.material.Material.LEAVES && !((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.BEDROCK)) {
				{
					BlockPos _pos = new BlockPos(x, y, z + 1);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
			if ((world.getBlockState(new BlockPos(x, y, z - 1))).getMaterial() == net.minecraft.world.level.material.Material.LEAVES && !((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.BEDROCK)) {
				{
					BlockPos _pos = new BlockPos(x, y, z - 1);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
			if ((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getMaterial() == net.minecraft.world.level.material.Material.LEAVES && !((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock() == Blocks.BEDROCK)) {
				{
					BlockPos _pos = new BlockPos(x, y + 1, z + 1);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
			if ((world.getBlockState(new BlockPos(x, y - 1, z + 1))).getMaterial() == net.minecraft.world.level.material.Material.LEAVES && !((world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock() == Blocks.BEDROCK)) {
				{
					BlockPos _pos = new BlockPos(x, y - 1, z + 1);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
			if ((world.getBlockState(new BlockPos(x, y - 1, z - 1))).getMaterial() == net.minecraft.world.level.material.Material.LEAVES && !((world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock() == Blocks.BEDROCK)) {
				{
					BlockPos _pos = new BlockPos(x, y - 1, z - 1);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
			if ((world.getBlockState(new BlockPos(x, y + 1, z - 1))).getMaterial() == net.minecraft.world.level.material.Material.LEAVES && !((world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock() == Blocks.BEDROCK)) {
				{
					BlockPos _pos = new BlockPos(x, y + 1, z - 1);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
			if ((world.getBlockState(new BlockPos(x, y + 1, z))).getMaterial() == net.minecraft.world.level.material.Material.LEAVES && !((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.BEDROCK)) {
				{
					BlockPos _pos = new BlockPos(x, y + 1, z);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
			if ((world.getBlockState(new BlockPos(x, y - 1, z))).getMaterial() == net.minecraft.world.level.material.Material.LEAVES && !((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.BEDROCK)) {
				{
					BlockPos _pos = new BlockPos(x, y - 1, z);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
		}
	}
}
