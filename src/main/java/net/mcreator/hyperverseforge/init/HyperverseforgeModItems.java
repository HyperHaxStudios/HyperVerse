
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hyperverseforge.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.hyperverseforge.item.SuperHyperArmorItem;
import net.mcreator.hyperverseforge.item.HypeSwordItem;
import net.mcreator.hyperverseforge.item.HypeShovelItem;
import net.mcreator.hyperverseforge.item.HypePickaxeItem;
import net.mcreator.hyperverseforge.item.HypeItem;
import net.mcreator.hyperverseforge.item.HypeHoeItem;
import net.mcreator.hyperverseforge.item.HypeAxeItem;
import net.mcreator.hyperverseforge.item.HypeArmorItem;
import net.mcreator.hyperverseforge.HyperverseforgeMod;

public class HyperverseforgeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, HyperverseforgeMod.MODID);
	public static final RegistryObject<Item> HYPE_ARMOR_HELMET = REGISTRY.register("hype_armor_helmet", () -> new HypeArmorItem.Helmet());
	public static final RegistryObject<Item> HYPE_ARMOR_CHESTPLATE = REGISTRY.register("hype_armor_chestplate", () -> new HypeArmorItem.Chestplate());
	public static final RegistryObject<Item> HYPE_ARMOR_LEGGINGS = REGISTRY.register("hype_armor_leggings", () -> new HypeArmorItem.Leggings());
	public static final RegistryObject<Item> HYPE_ARMOR_BOOTS = REGISTRY.register("hype_armor_boots", () -> new HypeArmorItem.Boots());
	public static final RegistryObject<Item> SUPER_HYPER_ARMOR_HELMET = REGISTRY.register("super_hyper_armor_helmet", () -> new SuperHyperArmorItem.Helmet());
	public static final RegistryObject<Item> SUPER_HYPER_ARMOR_CHESTPLATE = REGISTRY.register("super_hyper_armor_chestplate", () -> new SuperHyperArmorItem.Chestplate());
	public static final RegistryObject<Item> SUPER_HYPER_ARMOR_LEGGINGS = REGISTRY.register("super_hyper_armor_leggings", () -> new SuperHyperArmorItem.Leggings());
	public static final RegistryObject<Item> SUPER_HYPER_ARMOR_BOOTS = REGISTRY.register("super_hyper_armor_boots", () -> new SuperHyperArmorItem.Boots());
	public static final RegistryObject<Item> HYPE_ORE = block(HyperverseforgeModBlocks.HYPE_ORE, HyperverseforgeModTabs.TAB_HYPER_VERSE);
	public static final RegistryObject<Item> HYPE_BLOCK = block(HyperverseforgeModBlocks.HYPE_BLOCK, HyperverseforgeModTabs.TAB_HYPER_VERSE);
	public static final RegistryObject<Item> HYPE_AXE = REGISTRY.register("hype_axe", () -> new HypeAxeItem());
	public static final RegistryObject<Item> HYPE_PICKAXE = REGISTRY.register("hype_pickaxe", () -> new HypePickaxeItem());
	public static final RegistryObject<Item> HYPE_SWORD = REGISTRY.register("hype_sword", () -> new HypeSwordItem());
	public static final RegistryObject<Item> HYPE_SHOVEL = REGISTRY.register("hype_shovel", () -> new HypeShovelItem());
	public static final RegistryObject<Item> HYPE_HOE = REGISTRY.register("hype_hoe", () -> new HypeHoeItem());
	public static final RegistryObject<Item> HYPE = REGISTRY.register("hype", () -> new HypeItem());
	public static final RegistryObject<Item> HYPER_WOOD = block(HyperverseforgeModBlocks.HYPER_WOOD, HyperverseforgeModTabs.TAB_HYPER_VERSE);
	public static final RegistryObject<Item> HYPER_LOG = block(HyperverseforgeModBlocks.HYPER_LOG, HyperverseforgeModTabs.TAB_HYPER_VERSE);
	public static final RegistryObject<Item> HYPER_PLANKS = block(HyperverseforgeModBlocks.HYPER_PLANKS, HyperverseforgeModTabs.TAB_HYPER_VERSE);
	public static final RegistryObject<Item> HYPER_LEAVES = block(HyperverseforgeModBlocks.HYPER_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> HYPER_STAIRS = block(HyperverseforgeModBlocks.HYPER_STAIRS, HyperverseforgeModTabs.TAB_HYPER_VERSE);
	public static final RegistryObject<Item> HYPER_SLAB = block(HyperverseforgeModBlocks.HYPER_SLAB, HyperverseforgeModTabs.TAB_HYPER_VERSE);
	public static final RegistryObject<Item> HYPER_FENCE = block(HyperverseforgeModBlocks.HYPER_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> HYPER_FENCE_GATE = block(HyperverseforgeModBlocks.HYPER_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> HYPER_PRESSURE_PLATE = block(HyperverseforgeModBlocks.HYPER_PRESSURE_PLATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> HYPER_BUTTON = block(HyperverseforgeModBlocks.HYPER_BUTTON, HyperverseforgeModTabs.TAB_HYPER_VERSE);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
