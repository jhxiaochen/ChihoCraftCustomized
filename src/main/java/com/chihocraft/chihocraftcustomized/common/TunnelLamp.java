package com.chihocraft.chihocraftcustomized.common;

import com.chihocraft.chihocraftcustomized.ChihoCraftCustomized;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nonnull;
import java.util.LinkedList;

public class TunnelLamp extends Block
{
    public static final AxisAlignedBB WEST_AABB = new AxisAlignedBB(0.9D, 0.65D, 0.2D, 1D, 0.875D, 0.8D);
    public static final AxisAlignedBB NORTH_AABB = new AxisAlignedBB(0.2D, 0.65D, 0.9D, 0.8D, 0.875D, 1.0D);
    public static final AxisAlignedBB EAST_AABB = new AxisAlignedBB(0.0D, 0.65D, 0.2D, 0.1D, 0.875D, 0.8D);
    public static final AxisAlignedBB SOUTH_AABB = new AxisAlignedBB(0.2D, 0.65D, 0.0D, 0.8D, 0.875D, 0.1D);
    public static final PropertyDirection FACING = BlockHorizontal.FACING;
    public TunnelLamp(String name) {
        super(Material.GLASS);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(ChihoCraftCustomized.LIGHT_TAB);
        this.setHardness(1.5F);
        this.setLightLevel(1.0F);
        this.setLightOpacity(1);
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
        this.setSoundType(SoundType.GLASS);
    }

    @SideOnly(Side.CLIENT)
    @Override
    @Nonnull
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }

    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        switch (((EnumFacing)state.getValue(FACING)))
        {
            case EAST:
            default:
                return EAST_AABB;
            case NORTH:
                return NORTH_AABB;
            case SOUTH:
                return SOUTH_AABB;
            case WEST:
                return WEST_AABB;
        }
    }

    @Override
    public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face) {
        return BlockFaceShape.UNDEFINED;
    }


    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[]{FACING});
    }

    @Override
    public IBlockState getStateForPlacement(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase player) {
        IBlockState state = super.getStateForPlacement(world, pos, facing, hitX, hitY, hitZ, meta, player);
        state = state.withProperty(FACING, player.getHorizontalFacing().getOpposite());
        return state;
    }

    @Override
    public IBlockState withRotation(IBlockState state, Rotation rot) {
        return state.withProperty(FACING, rot.rotate((EnumFacing) state.getValue(FACING)));
    }

    @Override
    public IBlockState withMirror(IBlockState state, Mirror mirrorIn) {
        return state.withRotation(mirrorIn.toRotation((EnumFacing) state.getValue(FACING)));
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(FACING, EnumFacing.getHorizontal(meta));
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return state.getValue(FACING).getHorizontalIndex();
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }
}

