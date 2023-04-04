
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hyperverseforge.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.hyperverseforge.block.HyperWoodBlock;
import net.mcreator.hyperverseforge.block.HyperStairsBlock;
import net.mcreator.hyperverseforge.block.HyperSlabBlock;
import net.mcreator.hyperverseforge.block.HyperPressurePlateBlock;
import net.mcreator.hyperverseforge.block.HyperPlanksBlock;
import net.mcreator.hyperverseforge.block.HyperLogBlock;
import net.mcreator.hyperverseforge.block.HyperLeavesBlock;
import net.mcreator.hyperverseforge.block.HyperFenceGateBlock;
import net.mcreator.hyperverseforge.block.HyperFenceBlock;
import net.mcreator.hyperverseforge.block.HyperButtonBlock;
import net.mcreator.hyperverseforge.block.HypeOreBlock;
import net.mcreator.hyperverseforge.block.HypeBlockBlock;
import net.mcreator.hyperverseforge.HyperverseforgeMod;

public class HyperverseforgeModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, HyperverseforgeMod.MODID);
	public static final RegistryObject<Block> HYPE_ORE = REGISTRY.register("hype_ore", () -> new HypeOreBlock());
	public static final RegistryObject<Block> HYPE_BLOCK = REGISTRY.register("hype_block", () -> new HypeBlockBlock());
	public static final RegistryObject<Block> HYPER_WOOD = REGISTRY.register("hyper_wood", () -> new HyperWoodBlock());
	public static final RegistryObject<Block> HYPER_LOG = REGISTRY.register("hyper_log", () -> new HyperLogBlock());
	public static final RegistryObject<Block> HYPER_PLANKS = REGISTRY.register("hyper_planks", () -> new HyperPlanksBlock());
	public static final RegistryObject<Block> HYPER_LEAVES = REGISTRY.register("hyper_leaves", () -> new HyperLeavesBlock());
	public static final RegistryObject<Block> HYPER_STAIRS = REGISTRY.register("hyper_stairs", () -> new HyperStairsBlock());
	public static final RegistryObject<Block> HYPER_SLAB = REGISTRY.register("hyper_slab", () -> new HyperSlabBlock());
	public static final RegistryObject<Block> HYPER_FENCE = REGISTRY.register("hyper_fence", () -> new HyperFenceBlock());
	public static final RegistryObject<Block> HYPER_FENCE_GATE = REGISTRY.register("hyper_fence_gate", () -> new HyperFenceGateBlock());
	public static final RegistryObject<Block> HYPER_PRESSURE_PLATE = REGISTRY.register("hyper_pressure_plate", () -> new HyperPressurePlateBlock());
	public static final RegistryObject<Block> HYPER_BUTTON = REGISTRY.register("hyper_button", () -> new HyperButtonBlock());
}
