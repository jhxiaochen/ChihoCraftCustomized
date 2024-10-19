package com.chihocraft.chihocraftcustomized.common;


import com.chihocraft.chihocraftcustomized.ChihoCraftCustomized;
import net.minecraft.block.BlockColored;
import net.minecraft.block.BlockGlowstone;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

@SuppressWarnings("Duplicates")
public class BlockLight extends BlockColored {
    public BlockLight(String name) {
        super(Material.GLASS);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(ChihoCraftCustomized.LIGHT_TAB);
        setHardness(1F);
        setLightLevel(1.0F);
        setLightOpacity(1);
        setSoundType(SoundType.GLASS);
    }

    public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face)
    {

        return BlockFaceShape.UNDEFINED;

    }
}
