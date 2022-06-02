package com.chipocraftcustomized.common;


import com.chipocraftcustomized.ChipoCraftCustomized;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGlowstone;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

@SuppressWarnings("Duplicates")
public class BlockLight extends BlockGlowstone {
    public BlockLight(String name) {
        super(Material.GLASS);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(ChipoCraftCustomized.LIGHT_TAB);
        setHardness(1F);
        setLightLevel(1.0F);
        setLightOpacity(1);
        setSoundType(SoundType.GLASS);
    }
}
