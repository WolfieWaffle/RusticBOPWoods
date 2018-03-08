package com.github.wolfiewaffle.rusticbopwoods;

import org.apache.logging.log4j.Logger;

import com.github.wolfiewaffle.rusticbopwoods.crafting.Recipes;
import com.github.wolfiewaffle.rusticbopwoods.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = RusticBOPWoods.MODID, name = RusticBOPWoods.NAME, version = RusticBOPWoods.VERSION, dependencies = "required-after:rustic;required-after:biomesoplenty")
public class RusticBOPWoods {
	public static final String MODID = "rusticbopwoods";
	public static final String NAME = "Rustic BOP Woods";
	public static final String VERSION = "1.0";

	@SuppressWarnings("unused")
	private static Logger logger;

	@SidedProxy(clientSide = "com.github.wolfiewaffle.rusticbopwoods.proxy.ClientProxy", serverSide = "com.github.wolfiewaffle.rusticbopwoods.proxy.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
		logger = event.getModLog();
		Recipes.init();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}

}
