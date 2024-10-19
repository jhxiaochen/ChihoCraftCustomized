package com.chihocraft.chihocraftcustomized.common.road;

import com.chihocraft.chihocraftcustomized.ChihoCraftCustomized;
import net.minecraft.block.Block;
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
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockRoadStopLineRightSlab extends Block {
    public static final PropertyDirection FACING = BlockHorizontal.FACING;

    public BlockRoadStopLineRightSlab(String name) {
        super(Material.ROCK);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(ChihoCraftCustomized.ROADBLOCK_TAB);
        setHardness(3F);
        setSoundType(SoundType.STONE);
        this.setLightOpacity(255);
        this.setTickRandomly(true);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.CUTOUT;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face)
    {

        return face != EnumFacing.UP && face != EnumFacing.DOWN ? BlockFaceShape.CENTER : BlockFaceShape.MIDDLE_POLE;

    }
    public IBlockState getStateFromMeta(int meta)
    {
        IBlockState iblockstate = this.getDefaultState();

        switch (meta)
        {
            case 0:
                iblockstate = iblockstate.withProperty(FACING, EnumFacing.SOUTH);
                break;
            case 2:
                iblockstate = iblockstate.withProperty(FACING, EnumFacing.WEST);
                break;
            case 4:
                iblockstate = iblockstate.withProperty(FACING, EnumFacing.NORTH);
                break;
            case 6:
                iblockstate = iblockstate.withProperty(FACING, EnumFacing.EAST);
                break;
            default:
                iblockstate = iblockstate.withProperty(FACING, EnumFacing.NORTH);
        }

        return iblockstate;

    }
    public int getMetaFromState(IBlockState state) {
        int i = 0;

        switch ((EnumFacing) state.getValue(FACING)) {
            case SOUTH:
            return i = i | 0;
            case WEST:
            return i = i | 2;
            case NORTH:
            return i = i | 4;
            case EAST:
            return i = i | 6;
        }
        return i;
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

    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {FACING});
    }
}
