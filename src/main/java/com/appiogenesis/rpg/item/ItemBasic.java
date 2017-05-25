package com.appiogenesis.rpg.item;

import com.appiogenesis.rpg.RPG;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemBasic extends Item{

	public ItemBasic(String name) {
		setUnlocalizedName(RPG.modId + "." + name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MISC);
		GameRegistry.register(this);
	}

}
