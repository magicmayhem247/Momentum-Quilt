package com.magicmayhem247.common.registry.block;

import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;

public class MomentumBlocks
{
    //Debug
    public static final Block MOMENTUM_DETECTOR = new Block(QuiltBlockSettings.of(Material.METAL)
            .strength(4.0f)
            .hardness(4.0f)
            .requiresTool());

    public static void registerBlocks ()
    {
        Registry.register(Registry.BLOCK, new Identifier("momentum","momentum_detector"), MOMENTUM_DETECTOR);
    }
}
