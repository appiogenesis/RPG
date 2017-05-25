package com.appiogenesis.rpg.block;

import com.appiogenesis.rpg.RPG;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockBasic extends Block{

	public BlockBasic(String name) {
		super(Material.ROCK);
		setUnlocalizedName(RPG.modId + "." + name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MISC);
		GameRegistry.register(this);
		GameRegistry.register(new ItemBlock(this), getRegistryName());
	}

}
