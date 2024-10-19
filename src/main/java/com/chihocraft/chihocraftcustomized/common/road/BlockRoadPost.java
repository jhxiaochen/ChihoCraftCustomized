package com.chihocraft.chihocraftcustomized.common.road;

import com.chihocraft.chihocraftcustomized.ChihoCraftCustomized;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.List;

public class BlockRoadPost extends Block {
    private static final PropertyBool UP = PropertyBool.create("up");
    private static final PropertyBool DOWN = PropertyBool.create("down");
    private static final PropertyBool NORTH = PropertyBool.create("north");
    private static final PropertyBool EAST = PropertyBool.create("east");
    private static final PropertyBool SOUTH = PropertyBool.create("south");
    private static final PropertyBool WEST = PropertyBool.create("west");

    public static final AxisAlignedBB DOWN_AABB = new AxisAlignedBB(0.4D, 0.0D, 0.4D, 0.6D, 0.375D, 0.6D);
    public static final AxisAlignedBB PILLAR_AABB = new AxisAlignedBB(0.4D, 0.0D, 0.4D, 0.6D, 0.625D, 0.6D);
    public static final AxisAlignedBB BOUND_AABB = new AxisAlignedBB(0.4D, 0.0D, 0.4D, 0.6D, 1.0D, 0.6D);
    public static final AxisAlignedBB UP_AABB = new AxisAlignedBB(0.4D, 0.625D, 0.4D, 0.6D, 1.0D, 0.6D);
    public static final AxisAlignedBB NORTH_AABB = new AxisAlignedBB(0.4D, 0.3D, 0.0D, 0.6D, 0.625D, 0.6D);
    public static final AxisAlignedBB SOUTH_AABB = new AxisAlignedBB(0.4D, 0.3D, 0.4D, 0.6D, 0.625D, 1.0D);
    public static final AxisAlignedBB WEST_AABB = new AxisAlignedBB(0.4D, 0.3D, 0.4D, 1.0D, 0.625D, 0.6D);
    public static final AxisAlignedBB EAST_AABB = new AxisAlignedBB(0.0D, 0.3D, 0.4D, 0.6D, 0.625D, 0.6D);
    public BlockRoadPost() {
        super(Material.IRON);
        this.setRegistryName("road_sign_post");
        this.setUnlocalizedName("road_sign_post");
        this.setDefaultState(this.blockState.getBaseState().withProperty(UP, false)
                .withProperty(DOWN, false).withProperty(NORTH, false)
                .withProperty(EAST, false).withProperty(SOUTH, false)
                .withProperty(WEST,false));
        this.setCreativeTab(ChihoCraftCustomized.ROADOTHERS_TAB);
        this.setHardness(1.0F);
    }

    @Override
    public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, Entity entityIn, boolean isActualState) {
        if (!isActualState)
        {
            state = state.getActualState(worldIn, pos);
        }

        addCollisionBoxToList(pos, entityBox, collidingBoxes, PILLAR_AABB);

        if (((Boolean)state.getValue(NORTH)).booleanValue())
        {
            addCollisionBoxToList(pos, entityBox, collidingBoxes, NORTH_AABB);
        }

        if (((Boolean)state.getValue(EAST)).booleanValue())
        {
            addCollisionBoxToList(pos, entityBox, collidingBoxes, EAST_AABB);
        }

        if (((Boolean)state.getValue(SOUTH)).booleanValue())
        {
            addCollisionBoxToList(pos, entityBox, collidingBoxes, SOUTH_AABB);
        }

        if (((Boolean)state.getValue(WEST)).booleanValue())
        {
            addCollisionBoxToList(pos, entityBox, collidingBoxes, WEST_AABB);
        }
        if (((Boolean)state.getValue(UP)).booleanValue())
        {
            addCollisionBoxToList(pos, entityBox, collidingBoxes, UP_AABB);
        }
        if (((Boolean)state.getValue(DOWN)).booleanValue())
        {
            addCollisionBoxToList(pos, entityBox, collidingBoxes, DOWN_AABB);
        }
    }
    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return FULL_BLOCK_AABB;
    }


    @Override
    public boolean canBeConnectedTo(IBlockAccess world, BlockPos pos, EnumFacing facing)
    {
        return canConnectTo(world, pos.offset(facing), facing.getOpposite());
    }

    private boolean canFenceConnectTo(IBlockAccess world, BlockPos pos, EnumFacing facing)
    {
        BlockPos other = pos.offset(facing);
        Block block = world.getBlockState(other).getBlock();
        return block.canBeConnectedTo(world, other, facing.getOpposite()) || canConnectTo(world, other, facing.getOpposite());
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    private boolean canConnectTo(IBlockAccess worldIn, BlockPos pos,EnumFacing facing) {
        IBlockState iblockstate = worldIn.getBlockState(pos);
        BlockFaceShape blockfaceshape = iblockstate.getBlockFaceShape(worldIn, pos, facing);
        Block block = iblockstate.getBlock();
        boolean flag = blockfaceshape == BlockFaceShape.MIDDLE_POLE && (iblockstate.getMaterial() == this.blockMaterial || block instanceof BlockFenceGate || block instanceof BlockRoadSign );
        return !isExcepBlockForAttachWithPiston(block)  && blockfaceshape == BlockFaceShape.SOLID || block instanceof BlockRoadPost || flag;
    }

    public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face)
    {
        return BlockFaceShape.SOLID;
    }

    protected static boolean isExcepBlockForAttachWithPiston(Block p_194142_0_)
    {
        return Block.isExceptBlockForAttachWithPiston(p_194142_0_) || p_194142_0_ == Blocks.BARRIER || p_194142_0_ == Blocks.MELON_BLOCK || p_194142_0_ == Blocks.PUMPKIN || p_194142_0_ == Blocks.LIT_PUMPKIN;
    }

    /**
     * Convert the BlockState into the correct metadata value
     */
    @Override
    public int getMetaFromState(IBlockState state) {
        return 0;
    }

    /**
     * Get the actual Block state of this Block at the given position. This
     * applies properties not visible in the metadata, such as fence
     * connections.
     */
    @Override
    public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
        return state.withProperty(NORTH, canFenceConnectTo(worldIn, pos, EnumFacing.NORTH))
        .withProperty(UP, canFenceConnectTo(worldIn, pos, EnumFacing.UP))
        .withProperty(DOWN, canFenceConnectTo(worldIn, pos, EnumFacing.DOWN))
                .withProperty(EAST,  canFenceConnectTo(worldIn, pos, EnumFacing.EAST))
                .withProperty(SOUTH, canFenceConnectTo(worldIn, pos, EnumFacing.SOUTH))
                .withProperty(WEST,  canFenceConnectTo(worldIn, pos, EnumFacing.WEST));
    }

    /**
     * Returns the blockstate with the given rotation from the passed
     * blockstate. If inapplicable, returns the passed blockstate.
     */
    @Override
    public IBlockState withRotation(IBlockState state, Rotation rot) {
        switch (rot) {
            case CLOCKWISE_180:
                return state.withProperty(NORTH, state.getValue(SOUTH)).withProperty(EAST, state.getValue(WEST))
                        .withProperty(SOUTH, state.getValue(NORTH)).withProperty(WEST, state.getValue(EAST));
            case COUNTERCLOCKWISE_90:
                return state.withProperty(NORTH, state.getValue(EAST)).withProperty(EAST, state.getValue(SOUTH))
                        .withProperty(SOUTH, state.getValue(WEST)).withProperty(WEST, state.getValue(NORTH));
            case CLOCKWISE_90:
                return state.withProperty(NORTH, state.getValue(WEST)).withProperty(EAST, state.getValue(NORTH))
                        .withProperty(SOUTH, state.getValue(EAST)).withProperty(WEST, state.getValue(SOUTH));
            default:
                return state;
        }
    }

    @SuppressWarnings("deprecation")
    @Override
    public IBlockState withMirror(IBlockState state, Mirror mirrorIn) {
        switch (mirrorIn) {
            case LEFT_RIGHT:
                return state.withProperty(NORTH, state.getValue(SOUTH)).withProperty(SOUTH, state.getValue(NORTH));
            case FRONT_BACK:
                return state.withProperty(EAST, state.getValue(WEST)).withProperty(WEST, state.getValue(EAST));
            default:
                return super.withMirror(state, mirrorIn);
        }
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, UP, DOWN, NORTH, EAST, WEST, SOUTH);
    }
}