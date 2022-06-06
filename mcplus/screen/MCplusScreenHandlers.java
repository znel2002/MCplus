package net.znel.mcplus.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.znel.mcplus.MCplus;

public class MCplusScreenHandlers {
    public static ScreenHandlerType<InfuserScreenHandler> INFUSER_SCREEN_HANDLER;
    public static void registerAllScreenHandlers() {
        INFUSER_SCREEN_HANDLER =  Registry.register(Registry.SCREEN_HANDLER, new Identifier(MCplus.MOD_ID, "infuser"), new ScreenHandlerType<>(InfuserScreenHandler::new));
    }
}
