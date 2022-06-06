package net.znel.mcplus.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.StackReference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.Items;
import net.minecraft.screen.slot.Slot;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ClickType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.znel.mcplus.MCplus;
import net.znel.mcplus.block.MCplusBlocks;


public class RitualStaff extends Item {
    public RitualStaff(Settings settings){
        super(settings);

    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if(!context.getWorld().isClient()){
            BlockPos positionClicked = context.getBlockPos();
            PlayerEntity player = context.getPlayer();
            World world = context.getWorld();

            createArea(context);

        }

        return super.useOnBlock(context);
    }

    private static void createArea(ItemUsageContext context){
        BlockPos positionClicked = context.getBlockPos();
        PlayerEntity player = context.getPlayer();
        World world = context.getWorld();

        // First 3x3 area //
        world.setBlockState(positionClicked, Blocks.DIAMOND_BLOCK.getDefaultState());
        world.setBlockState(new BlockPos(positionClicked.getX()-1, positionClicked.getY(), positionClicked.getZ()), Blocks.PRISMARINE_BRICKS.getDefaultState());
        world.setBlockState(new BlockPos(positionClicked.getX()+1, positionClicked.getY(), positionClicked.getZ()), Blocks.PRISMARINE_BRICKS.getDefaultState());

        world.setBlockState(new BlockPos(positionClicked.getX(), positionClicked.getY(), positionClicked.getZ()+1), Blocks.PRISMARINE_BRICKS.getDefaultState());
        world.setBlockState(new BlockPos(positionClicked.getX(), positionClicked.getY(), positionClicked.getZ()-1), Blocks.PRISMARINE_BRICKS.getDefaultState());

        world.setBlockState(new BlockPos(positionClicked.getX()-1, positionClicked.getY(), positionClicked.getZ()+1), Blocks.SEA_LANTERN.getDefaultState());
        world.setBlockState(new BlockPos(positionClicked.getX()+1, positionClicked.getY(), positionClicked.getZ()-1), Blocks.SEA_LANTERN.getDefaultState());


        world.setBlockState(new BlockPos(positionClicked.getX()-1, positionClicked.getY(), positionClicked.getZ()-1), Blocks.SEA_LANTERN.getDefaultState());
        world.setBlockState(new BlockPos(positionClicked.getX()+1, positionClicked.getY(), positionClicked.getZ()+1), Blocks.SEA_LANTERN.getDefaultState());
        // Pillars //

        world.setBlockState(new BlockPos(positionClicked.getX()-2, positionClicked.getY()+1, positionClicked.getZ()-2), Blocks.PRISMARINE_BRICKS.getDefaultState());
        world.setBlockState(new BlockPos(positionClicked.getX()-2, positionClicked.getY()+2, positionClicked.getZ()-2), Blocks.PRISMARINE_BRICKS.getDefaultState());
        world.setBlockState(new BlockPos(positionClicked.getX()-2, positionClicked.getY()+3, positionClicked.getZ()-2), Blocks.PRISMARINE_BRICKS.getDefaultState());

        world.setBlockState(new BlockPos(positionClicked.getX()+2, positionClicked.getY()+1, positionClicked.getZ()-2), Blocks.PRISMARINE_BRICKS.getDefaultState());
        world.setBlockState(new BlockPos(positionClicked.getX()+2, positionClicked.getY()+2, positionClicked.getZ()-2), Blocks.PRISMARINE_BRICKS.getDefaultState());
        world.setBlockState(new BlockPos(positionClicked.getX()+2, positionClicked.getY()+3, positionClicked.getZ()-2), Blocks.PRISMARINE_BRICKS.getDefaultState());

        world.setBlockState(new BlockPos(positionClicked.getX()-2, positionClicked.getY()+1, positionClicked.getZ()+2), Blocks.PRISMARINE_BRICKS.getDefaultState());
        world.setBlockState(new BlockPos(positionClicked.getX()-2, positionClicked.getY()+2, positionClicked.getZ()+2), Blocks.PRISMARINE_BRICKS.getDefaultState());
        world.setBlockState(new BlockPos(positionClicked.getX()-2, positionClicked.getY()+3, positionClicked.getZ()+2), Blocks.PRISMARINE_BRICKS.getDefaultState());

        world.setBlockState(new BlockPos(positionClicked.getX()+2, positionClicked.getY()+1, positionClicked.getZ()+2), Blocks.PRISMARINE_BRICKS.getDefaultState());
        world.setBlockState(new BlockPos(positionClicked.getX()+2, positionClicked.getY()+2, positionClicked.getZ()+2), Blocks.PRISMARINE_BRICKS.getDefaultState());
        world.setBlockState(new BlockPos(positionClicked.getX()+2, positionClicked.getY()+3, positionClicked.getZ()+2), Blocks.PRISMARINE_BRICKS.getDefaultState());
    }
}
