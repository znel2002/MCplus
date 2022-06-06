package net.znel.mcplus.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.znel.mcplus.MCplus;
import net.znel.mcplus.item.MCplusItems;

public class MCplusRegistry {
    public static void registerModStuffs(){
        registerFuels();
    }

    private static void registerFuels(){
        MCplus.LOGGER.info("Loading Fuels");
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(MCplusItems.CYANIDE_COAL, 200);
    }
}
