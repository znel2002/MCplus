package net.znel.mcplus.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.znel.mcplus.MCplus;
import net.minecraft.item.ItemStack;

public class MCplusItemGroup {
    public static final ItemGroup MCPLUS = FabricItemGroupBuilder.build(new Identifier(MCplus.MOD_ID, "mcplus"),
            () -> new ItemStack(MCplusItems.CYANIDE_INGOT));
}
