
package net.coring.ubran.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.coring.ubran.init.UbranModSounds;

public class WorriendRhythmItem extends RecordItem {
	public WorriendRhythmItem() {
		super(4, UbranModSounds.REGISTRY.get(new ResourceLocation("ubran:music.worriend_rhythm")), new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE));
	}
}
