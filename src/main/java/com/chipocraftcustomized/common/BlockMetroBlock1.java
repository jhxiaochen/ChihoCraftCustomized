package com.chipocraftcustomized.common;

import com.chipocraftcustomized.ChipoCraftCustomized;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;

public class BlockMetroBlock1 extends Block {
    public BlockMetroBlock1(String name) {
        super(Material.ROCK);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(ChipoCraftCustomized.RAILWAY_TAB);
        this.setHardness(1.8F);
        this.setSoundType(SoundType.STONE);
    }

    public EnumRarity getRarity()
    {
        return EnumRarity.UNCOMMON;
    }
}
