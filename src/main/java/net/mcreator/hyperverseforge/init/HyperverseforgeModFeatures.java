
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hyperverseforge.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.hyperverseforge.world.features.ores.HypeOreFeature;
import net.mcreator.hyperverseforge.HyperverseforgeMod;

@Mod.EventBusSubscriber
public class HyperverseforgeModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, HyperverseforgeMod.MODID);
	public static final RegistryObject<Feature<?>> HYPE_ORE = REGISTRY.register("hype_ore", HypeOreFeature::feature);
}
