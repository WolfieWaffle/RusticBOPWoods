package com.github.wolfiewaffle.rusticbopwoods.block;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import rustic.common.Config;
import rustic.common.blocks.BlockChair;
import rustic.common.blocks.BlockTable;

public class ModBlocks {

	public static BlockChair CHAIR_SACRED_OAK;
	public static BlockChair CHAIR_CHERRY;
	public static BlockChair CHAIR_UMBRAN;
	public static BlockChair CHAIR_FIR;
	public static BlockChair CHAIR_ETHEREAL;
	public static BlockChair CHAIR_MAGIC;
	public static BlockChair CHAIR_MANGROVE;
	public static BlockChair CHAIR_PALM;
	public static BlockChair CHAIR_REDWOOD;
	public static BlockChair CHAIR_WILLOW;
	public static BlockChair CHAIR_PINE;
	public static BlockChair CHAIR_HELLBARK;
	public static BlockChair CHAIR_JACARANDA;
	public static BlockChair CHAIR_MAHOGANY;
	public static BlockChair CHAIR_EBONY;
	public static BlockChair CHAIR_EUCALYPTUS;
	public static BlockTable TABLE_SACRED_OAK;
	public static BlockTable TABLE_CHERRY;
	public static BlockTable TABLE_UMBRAN;
	public static BlockTable TABLE_FIR;
	public static BlockTable TABLE_ETHEREAL;
	public static BlockTable TABLE_MAGIC;
	public static BlockTable TABLE_MANGROVE;
	public static BlockTable TABLE_PALM;
	public static BlockTable TABLE_REDWOOD;
	public static BlockTable TABLE_WILLOW;
	public static BlockTable TABLE_PINE;
	public static BlockTable TABLE_HELLBARK;
	public static BlockTable TABLE_JACARANDA;
	public static BlockTable TABLE_MAHOGANY;
	public static BlockTable TABLE_EBONY;
	public static BlockTable TABLE_EUCALYPTUS;

	public static void init() {
		if (Config.ENABLE_CHAIRS) {
			CHAIR_SACRED_OAK = new BlockChair("sacred_oak");
			CHAIR_CHERRY = new BlockChair("cherry");
			CHAIR_UMBRAN = new BlockChair("umbran");
			CHAIR_FIR = new BlockChair("fir");
			CHAIR_ETHEREAL = new BlockChair("ethereal");
			CHAIR_MAGIC = new BlockChair("magic");
			CHAIR_MANGROVE = new BlockChair("mangrove");
			CHAIR_PALM = new BlockChair("palm");
			CHAIR_REDWOOD = new BlockChair("redwood");
			CHAIR_WILLOW = new BlockChair("willow");
			CHAIR_PINE = new BlockChair("pine");
			CHAIR_HELLBARK = new BlockChair("hellbark");
			CHAIR_JACARANDA = new BlockChair("jacaranda");
			CHAIR_MAHOGANY = new BlockChair("mahogany");
			CHAIR_EBONY = new BlockChair("ebony");
			CHAIR_EUCALYPTUS = new BlockChair("eucalyptus");
		}
		if (Config.ENABLE_TABLES) {
			TABLE_SACRED_OAK = new BlockTable("sacred_oak");
			TABLE_CHERRY = new BlockTable("cherry");
			TABLE_UMBRAN = new BlockTable("umbran");
			TABLE_FIR = new BlockTable("fir");
			TABLE_ETHEREAL = new BlockTable("ethereal");
			TABLE_MAGIC = new BlockTable("magic");
			TABLE_MANGROVE = new BlockTable("mangrove");
			TABLE_PALM = new BlockTable("palm");
			TABLE_REDWOOD = new BlockTable("redwood");
			TABLE_WILLOW = new BlockTable("willow");
			TABLE_PINE = new BlockTable("pine");
			TABLE_HELLBARK = new BlockTable("hellbark");
			TABLE_JACARANDA = new BlockTable("jacaranda");
			TABLE_MAHOGANY = new BlockTable("mahogany");
			TABLE_EBONY = new BlockTable("ebony");
			TABLE_EUCALYPTUS = new BlockTable("eucalyptus");
		}
	}

	@SideOnly(Side.CLIENT)
	public static void initModels() {
		if (Config.ENABLE_CHAIRS) {
			CHAIR_SACRED_OAK.initModel();
			CHAIR_CHERRY.initModel();
			CHAIR_UMBRAN.initModel();
			CHAIR_FIR.initModel();
			CHAIR_ETHEREAL.initModel();
			CHAIR_MAGIC.initModel();
			CHAIR_MANGROVE.initModel();
			CHAIR_PALM.initModel();
			CHAIR_REDWOOD.initModel();
			CHAIR_WILLOW.initModel();
			CHAIR_PINE.initModel();
			CHAIR_HELLBARK.initModel();
			CHAIR_JACARANDA.initModel();
			CHAIR_MAHOGANY.initModel();
			CHAIR_EBONY.initModel();
			CHAIR_EUCALYPTUS.initModel();
		}
		if (Config.ENABLE_TABLES) {
			TABLE_SACRED_OAK.initModel();
			TABLE_CHERRY.initModel();
			TABLE_UMBRAN.initModel();
			TABLE_FIR.initModel();
			TABLE_ETHEREAL.initModel();
			TABLE_MAGIC.initModel();
			TABLE_MANGROVE.initModel();
			TABLE_PALM.initModel();
			TABLE_REDWOOD.initModel();
			TABLE_WILLOW.initModel();
			TABLE_PINE.initModel();
			TABLE_HELLBARK.initModel();
			TABLE_JACARANDA.initModel();
			TABLE_MAHOGANY.initModel();
			TABLE_EBONY.initModel();
			TABLE_EUCALYPTUS.initModel();
		}
	}

}
