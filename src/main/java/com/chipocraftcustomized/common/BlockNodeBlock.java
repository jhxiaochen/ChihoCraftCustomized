package com.chipocraftcustomized.common;

import com.chipocraftcustomized.ChipoCraftCustomized;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockNodeBlock extends Block {
    public BlockNodeBlock(String name) {
        super(Material.ROCK);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(ChipoCraftCustomized.BLOCKS_TAB);
        this.setHardness(4.5F);
        this.setSoundType(SoundType.STONE);
    }

}
