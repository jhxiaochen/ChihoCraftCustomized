package com.chihocraft.chihocraftcustomized.common;

import com.chihocraft.chihocraftcustomized.ChihoCraftCustomized;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockNodeBlock extends Block {
    public BlockNodeBlock(String name) {
        super(Material.ROCK);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(ChihoCraftCustomized.BLOCKS_TAB);
        this.setHardness(4.5F);
        this.setSoundType(SoundType.STONE);
    }

}
