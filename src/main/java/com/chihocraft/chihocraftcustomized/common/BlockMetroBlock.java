package com.chihocraft.chihocraftcustomized.common;

import com.chihocraft.chihocraftcustomized.ChihoCraftCustomized;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockMetroBlock extends Block {

    public BlockMetroBlock(String name) {
        super(Material.ROCK);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(ChihoCraftCustomized.METRO_TAB);
        this.setHardness(1.8F);
        this.setSoundType(SoundType.STONE);
    }
}
