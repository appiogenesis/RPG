package com.appiogenesis.rpg.init;

import com.appiogenesis.rpg.block.BlockBasic;

public class ModBlocks {

	public static BlockBasic testBlock;

	public static void init() {
		testBlock = new BlockBasic("testBlock");
	}

}
