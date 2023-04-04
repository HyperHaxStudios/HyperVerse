
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hyperverseforge.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class HyperverseforgeModTabs {
	public static CreativeModeTab TAB_HYPER_VERSE;

	public static void load() {
		TAB_HYPER_VERSE = new CreativeModeTab("tabhyper_verse") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(HyperverseforgeModBlocks.HYPE_BLOCK.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
