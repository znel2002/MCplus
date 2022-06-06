package net.znel.mcplus.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Box;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.znel.mcplus.MCplus;
import net.minecraft.block.Block;
import net.znel.mcplus.block.custom.MCplusButtonBlock;
import net.znel.mcplus.block.custom.MCplusInfuser;
import net.znel.mcplus.block.custom.MCplusPressurePlate;
import net.znel.mcplus.item.MCplusItemGroup;
import net.znel.mcplus.block.custom.LeviBlock;

import javax.annotation.Nullable;
import java.util.List;

public class MCplusBlocks {

    public static final Block CYANIDE_BLOCK = registerBlock("cyanide_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), MCplusItemGroup.MCPLUS, "tooltip.mcplus.cyanide_block");
    public static final Block CYANIDE_ORE = registerBlock("cyanide_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()),MCplusItemGroup.MCPLUS, "tooltip.mcplus.cyanide_ore");
    public static final Block RAW_CYANIDE_BLOCK = registerBlock("raw_cyanide_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), MCplusItemGroup.MCPLUS, "tooltip.mcplus.raw_cyanide_block");
    public static final Block LeviBlock = registerBlock("jump_tower",
            new LeviBlock(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), MCplusItemGroup.MCPLUS);

    public static final Block CYANIDE_BUTTON = registerBlock("cyanide_button",
            new MCplusButtonBlock(FabricBlockSettings.of(Material.METAL).strength(4.5f).requiresTool().noCollision()), MCplusItemGroup.MCPLUS);
    public static final Block CYANIDE_PRESSURE_PLATE = registerBlock("cyanide_pressure_plate",
            new MCplusPressurePlate(PressurePlateBlock.ActivationRule.EVERYTHING,FabricBlockSettings.of(Material.METAL).strength(4.5f).requiresTool()), MCplusItemGroup.MCPLUS);
    public static final Block CYANIDE_FENCE = registerBlock("cyanide_fence",
            new FenceBlock(FabricBlockSettings.of(Material.METAL).strength(4.5f).requiresTool()), MCplusItemGroup.MCPLUS);
    public static final Block CYANIDE_FENCE_GATE = registerBlock("cyanide_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.METAL).strength(4.5f).requiresTool()), MCplusItemGroup.MCPLUS);
    public static final Block CYANIDE_WALL = registerBlock("cyanide_wall",
            new WallBlock(FabricBlockSettings.of(Material.METAL).strength(5f).requiresTool()), MCplusItemGroup.MCPLUS);

    public static final Block INFUSER = registerBlock("infuser",
            new MCplusInfuser(FabricBlockSettings.of(Material.METAL).strength(5f).requiresTool()), MCplusItemGroup.MCPLUS);

    private static Block registerBlock(String name, Block block, ItemGroup group, String tooltipKey) {
        registerBlockItem(name, block, group, tooltipKey);
        return Registry.register(Registry.BLOCK, new Identifier(MCplus.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group, String tooltipKey) {
        return Registry.register(Registry.ITEM, new Identifier(MCplus.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)) {
                    @Override
                    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                        tooltip.add(new TranslatableText(tooltipKey));
                    }
                });
    }

    public static Block registerBlock(String name, Block block,ItemGroup group ){
        registerBlockItem(name,block,group);
        return Registry.register(Registry.BLOCK, new Identifier(MCplus.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(MCplus.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks(){
        MCplus.LOGGER.info("Loading blocks from" + MCplus.MOD_ID);
    }

}
