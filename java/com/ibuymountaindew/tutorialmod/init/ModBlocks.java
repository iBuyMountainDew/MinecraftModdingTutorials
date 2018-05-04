package com.ibuymountaindew.tutorialmod.init;

import java.util.ArrayList;
import java.util.List;

import com.ibuymountaindew.tutorialmod.objects.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block CRINGIUM_BLOCK = new BlockBase("cringium_block", Material.IRON);
	public static final Block EXAMPLE_BLOCK = new BlockBase("example_block", Material.ANVIL);
}
