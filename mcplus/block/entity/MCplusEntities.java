package net.znel.mcplus.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.znel.mcplus.MCplus;
import net.znel.mcplus.block.MCplusBlocks;


public class MCplusEntities {
    public static BlockEntityType<MCplusInfuserEntity> INFUSER;

    public static void registerAllBlockEntities(){
        INFUSER = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(MCplus.MOD_ID, "infuser"),
                FabricBlockEntityTypeBuilder.create(MCplusInfuserEntity::new,
                        MCplusBlocks.INFUSER).build(null));
    }
}
