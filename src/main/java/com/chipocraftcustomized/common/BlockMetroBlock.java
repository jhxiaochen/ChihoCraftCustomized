package com.chipocraftcustomized.common;

import com.chipocraftcustomized.ChipoCraftCustomized;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockMetroBlock extends Block {
    public BlockMetroBlock(String name) {
        super(Material.ROCK);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(ChipoCraftCustomized.METRO_TAB);
        this.setHardness(1.8F);
        this.setSoundType(SoundType.STONE);
    }
}
