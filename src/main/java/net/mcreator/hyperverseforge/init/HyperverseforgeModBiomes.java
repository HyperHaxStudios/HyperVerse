
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hyperverseforge.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.hyperverseforge.world.biome.HyperLandsBiome;
import net.mcreator.hyperverseforge.HyperverseforgeMod;

public class HyperverseforgeModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, HyperverseforgeMod.MODID);
	public static final RegistryObject<Biome> HYPER_LANDS = REGISTRY.register("hyper_lands", HyperLandsBiome::createBiome);
}
