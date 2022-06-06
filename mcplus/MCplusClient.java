package net.znel.mcplus;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.znel.mcplus.screen.InfuserScreen;
import net.znel.mcplus.screen.InfuserScreenHandler;
import net.znel.mcplus.screen.MCplusScreenHandlers;

public class MCplusClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        Registry.register(Registry.SCREEN_HANDLER, new Identifier(MCplus.MOD_ID, "infuser"), new ScreenHandlerType<>(InfuserScreenHandler::new));

    }
}
