package com.magicmayhem247;

import com.magicmayhem247.common.registry.block.MomentumBlocks;
import com.magicmayhem247.common.registry.item.MomentumItems;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class Momentum implements ModInitializer
{
	//Essentials
	public static final String MOD_ID = "momentum";

	public static final ItemGroup MOMENTUM_ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier("momentum","general"), () -> new ItemStack(MomentumItems.INERT_CRYSTAL));

	@Override
	public void onInitialize(ModContainer mod)
	{
		MomentumItems.registerItems();
		MomentumBlocks.registerBlocks();
	}
}
