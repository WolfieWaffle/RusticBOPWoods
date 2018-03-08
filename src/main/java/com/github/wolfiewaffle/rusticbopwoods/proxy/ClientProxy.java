package com.github.wolfiewaffle.rusticbopwoods.proxy;

import com.github.wolfiewaffle.rusticbopwoods.block.ModBlocks;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
		ModBlocks.initModels();
	}

}
