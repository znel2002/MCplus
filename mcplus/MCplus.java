package net.znel.mcplus;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.client.MinecraftClient;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.znel.mcplus.block.MCplusBlocks;
import net.znel.mcplus.block.custom.MCplusInfuser;

import net.znel.mcplus.block.entity.MCplusEntities;
import net.znel.mcplus.config.ModConfigs;
import net.znel.mcplus.item.MCplusItemGroup;
import net.znel.mcplus.item.MCplusItems;
import net.znel.mcplus.screen.MCplusScreenHandlers;
import net.znel.mcplus.util.MCplusRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MCplus implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("mcplus");
	public static final String MOD_ID = "mcplus";


	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModConfigs.registerConfigs();
		MCplusItems.registerModItems();
		MCplusBlocks.registerModBlocks();
		MCplusRegistry.registerModStuffs();

		MCplusEntities.registerAllBlockEntities();

		MCplusScreenHandlers.registerAllScreenHandlers();
		LOGGER.info("Hello Fabric world!");
	}
}
