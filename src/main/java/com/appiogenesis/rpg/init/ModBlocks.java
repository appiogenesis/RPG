package com.appiogenesis.rpg.init;

import com.appiogenesis.rpg.block.BlockBasic;
import com.appiogenesis.rpg.block.DataBlock;

public class ModBlocks {

	public static BlockBasic testBlock;
	public static DataBlock dataBlock;

	public static void init() {
		testBlock = new BlockBasic("testBlock");
		dataBlock = new DataBlock();
	}

}
