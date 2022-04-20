package com.magicmayhem247.common.registry.item;

import com.magicmayhem247.Momentum;
import com.magicmayhem247.common.registry.block.MomentumBlocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class MomentumItems
{
    //Crafting Materials
    public static final Item INERT_CRYSTAL = new Item(new Item.Settings().group(Momentum.MOMENTUM_ITEM_GROUP));
    public static final Item CHARGED_CRYSTAL = new Item(new Item.Settings().group(Momentum.MOMENTUM_ITEM_GROUP));


    //Advanced Materials
    public static final Item KINETIC_CRYSTAL = new Item(new Item.Settings().group(Momentum.MOMENTUM_ITEM_GROUP));
    public static final Item POTENTIAL_CRYSTAL = new Item(new Item.Settings().group(Momentum.MOMENTUM_ITEM_GROUP));

    //Tools

    public static void registerItems ()
    {
    //Items
        //Crafting Materials
        Registry.register(Registry.ITEM, new Identifier(Momentum.MOD_ID, "inert_crystal"), INERT_CRYSTAL);
        Registry.register(Registry.ITEM, new Identifier(Momentum.MOD_ID, "charged_crystal"), CHARGED_CRYSTAL);

        //Advanced Materials
        Registry.register(Registry.ITEM, new Identifier(Momentum.MOD_ID, "kinetic_crystal"), KINETIC_CRYSTAL);
        Registry.register(Registry.ITEM, new Identifier(Momentum.MOD_ID, "potential_crystal"), POTENTIAL_CRYSTAL);

    //BlockItems
        //Debug
        Registry.register(Registry.ITEM, new Identifier("momentum", "momentum_detector"), new BlockItem(MomentumBlocks.MOMENTUM_DETECTOR, new QuiltItemSettings().group(Momentum.MOMENTUM_ITEM_GROUP)));
    }

}
