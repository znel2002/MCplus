package net.znel.mcplus.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.znel.mcplus.MCplus;
import net.znel.mcplus.item.custom.*;


public class MCplusItems {
    /*
    * Creating CYANIDE_ITEMS
    */
    public static final Item CYANIDE_INGOT = registerItem("cyanide_ingot",
            new Item(new FabricItemSettings().group(MCplusItemGroup.MCPLUS)));
    public static final Item CYANIDE_NUGGET = registerItem("cyanide_nugget",
            new Item(new FabricItemSettings().group(MCplusItemGroup.MCPLUS)));
    public static final Item RAW_CYANIDE = registerItem("raw_cyanide",
            new Item(new FabricItemSettings().group(MCplusItemGroup.MCPLUS)));
    public static final Item DOWSING_ROD = registerItem("dowsing_rod",
            new DowsingRodItem(new FabricItemSettings().group(MCplusItemGroup.MCPLUS)));
    public static final Item CYANIDE_COAL = registerItem("cyanide_coal",
        new Item(new FabricItemSettings().group(MCplusItemGroup.MCPLUS)));
    public static final Item RITUAL_STAFF = registerItem("ritual_staff",
        new RitualStaff(new FabricItemSettings().group(MCplusItemGroup.MCPLUS)));

    // Tools
    public static final Item CYANIDE_SWORD = registerItem("cyanide_sword",
            new MCplusBlindnissSword(MCplusToolMaterials.CYANIDE , 24, 2, new FabricItemSettings().group(MCplusItemGroup.MCPLUS)));
    public static final Item CYANIDE_AXE = registerItem("cyanide_axe",
            new MCplusAxeItem(MCplusToolMaterials.CYANIDE , 54, 1, new FabricItemSettings().group(MCplusItemGroup.MCPLUS)));
    public static final Item CYANIDE_HOE = registerItem("cyanide_hoe",
            new MCplusHoeItem(MCplusToolMaterials.CYANIDE , 12, 3, new FabricItemSettings().group(MCplusItemGroup.MCPLUS)));
    public static final Item CYANIDE_SHOVEL = registerItem("cyanide_shovel",
            new MCplusShovelItem(MCplusToolMaterials.CYANIDE , 12, 3, new FabricItemSettings().group(MCplusItemGroup.MCPLUS)));
    public static final Item CYANIDE_PICKAXE = registerItem("cyanide_pickaxe",
            new MCplusPickaxeItem(MCplusToolMaterials.CYANIDE , 12, 0, new FabricItemSettings().group(MCplusItemGroup.MCPLUS)));
    // Armour
    public static final Item CYANIDE_HELMET = registerItem("cyanide_helmet",
            new MCplusArmorItem(MCplusArmorMaterials.CYANIDE , EquipmentSlot.HEAD,new FabricItemSettings().group(MCplusItemGroup.MCPLUS)));
    public static final Item CYANIDE_CHESTPLATE = registerItem("cyanide_chestplate",
            new MCplusArmorItem(MCplusArmorMaterials.CYANIDE , EquipmentSlot.CHEST,new FabricItemSettings().group(MCplusItemGroup.MCPLUS)));
    public static final Item CYANIDE_LEGGINGS = registerItem("cyanide_leggings",
            new MCplusArmorItem(MCplusArmorMaterials.CYANIDE , EquipmentSlot.LEGS,new FabricItemSettings().group(MCplusItemGroup.MCPLUS)));
    public static final Item CYANIDE_BOOTS = registerItem("cyanide_boots",
            new MCplusArmorItem(MCplusArmorMaterials.CYANIDE , EquipmentSlot.FEET,new FabricItemSettings().group(MCplusItemGroup.MCPLUS)));



    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(MCplus.MOD_ID, name), item);
    }


    public static void registerModItems(){
        MCplus.LOGGER.info("Loading items for " + MCplus.MOD_ID);
    }

}
