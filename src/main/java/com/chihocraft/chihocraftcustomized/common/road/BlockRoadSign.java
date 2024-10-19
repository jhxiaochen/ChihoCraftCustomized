package com.chihocraft.chihocraftcustomized.common.road;

import com.chihocraft.chihocraftcustomized.ChihoCraftCustomized;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemLead;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class BlockRoadSign extends Block {
    private static final PropertyDirection FACING = BlockHorizontal.FACING;
    public static final PropertyBool NORTH = PropertyBool.create("north");
    public static final PropertyBool EAST = PropertyBool.create("east");
    public static final PropertyBool SOUTH = PropertyBool.create("south");
    public static final PropertyBool WEST = PropertyBool.create("west");
    public static final PropertyBool UP = PropertyBool.create("up");
    public static final PropertyBool DOWN = PropertyBool.create("down");
    protected static final AxisAlignedBB[] BOUNDING_BOXES = new AxisAlignedBB[] {new AxisAlignedBB(0.375D, 0.0D, 0.375D, 0.625D, 1.0D, 0.625D),
            new AxisAlignedBB(0.4D, 0.0D, 0.3D, 0.6D, 1.0D, 1.0D),
            new AxisAlignedBB(0.0D, 0.0D, 0.3D, 0.6D, 1.0D, 0.6D),
            new AxisAlignedBB(0.0D, 0.0D, 0.3D, 0.6D, 1.0D, 1.0D),
            new AxisAlignedBB(0.4D, 0.0D, 0.0D, 0.6D, 1.0D, 0.6D),
            new AxisAlignedBB(0.4D, 0.0D, 0.0D, 0.6D, 1.0D, 1.0D),
            new AxisAlignedBB(0.0D, 0.0D, 0.0D, 0.6D, 1.0D, 0.6D),
            new AxisAlignedBB(0.0D, 0.0D, 0.0D, 0.6D, 1D, 1.0D),
            new AxisAlignedBB(0.4D, 0.0D, 0.4D, 1.0D, 1D, 0.6D),
            new AxisAlignedBB(0.4D, 0.0D, 0.4D, 1.0D, 1D, 1.0D),
            new AxisAlignedBB(0.0D, 0.0D, 0.4D, 1.0D, 1D, 0.6D),
            new AxisAlignedBB(0.0D, 0.0D, 0.4D, 1.0D, 1D, 1.0D),
            new AxisAlignedBB(0.4D, 0.0D, 0.0D, 1.0D, 1D, 0.6D),
            new AxisAlignedBB(0.4D, 0.0D, 0.0D, 1.0D, 1D, 1.0D),
            new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1D, 0.6D),
            new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1D, 1.0D)};
    public static final AxisAlignedBB PILLAR_AABB = new AxisAlignedBB(0.3D, 0.0D, 0.375D, 0.625D, 1.0D, 0.625D);
    public static final AxisAlignedBB SOUTH_AABB = new AxisAlignedBB(0.3D, 0.0D, 0.625D, 0.625D, 1.0D, 1.0D);
    public static final AxisAlignedBB WEST_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.375D, 0.375D, 1.0D, 0.625D);
    public static final AxisAlignedBB NORTH_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.3D, 0.375D, 1.0D, 0.625D);
    public static final AxisAlignedBB EAST_AABB = new AxisAlignedBB(0.7D, 0.0D, 0.375D, 1.0D, 1.0D, 0.625D);

    public BlockRoadSign(String name) {
        super(Material.IRON);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setDefaultState(this.blockState.getBaseState().withProperty(NORTH, false)
                .withProperty(SOUTH, false)
                .withProperty(EAST, false)
                .withProperty(WEST,false)
                .withProperty(DOWN,false)
                .withProperty(UP,false));
        this.setCreativeTab(ChihoCraftCustomized.ROADOTHERS_TAB);
        this.setHardness(1.8F);
        this.setSoundType(SoundType.METAL);
    }

    public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn, boolean isActualState)
    {
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
            addCollisionBoxToList(pos, entityBox, collidingBoxes, WEST_AABB);
        }

        if (((Boolean)state.getValue(SOUTH)).booleanValue())
        {
            addCollisionBoxToList(pos, entityBox, collidingBoxes, SOUTH_AABB);
        }

        if (((Boolean)state.getValue(WEST)).booleanValue())
        {
            addCollisionBoxToList(pos, entityBox, collidingBoxes, EAST_AABB);
        }
    }

    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        state = this.getActualState(state, source, pos);
        return BOUNDING_BOXES[getBoundingBoxIdx(state)];
    }

    private static int getBoundingBoxIdx(IBlockState state)
    {
        int i = 0;

        if (((Boolean)state.getValue(NORTH)).booleanValue())
        {
            i |= 1 << EnumFacing.NORTH.getHorizontalIndex();
        }

        if (((Boolean)state.getValue(EAST)).booleanValue())
        {
            i |= 1 << EnumFacing.EAST.getHorizontalIndex();
        }

        if (((Boolean)state.getValue(SOUTH)).booleanValue())
        {
            i |= 1 << EnumFacing.SOUTH.getHorizontalIndex();
        }

        if (((Boolean)state.getValue(WEST)).booleanValue())
        {
            i |= 1 << EnumFacing.WEST.getHorizontalIndex();
        }

        return i;
    }

    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }

    public boolean isFullCube(IBlockState state)
    {
        return false;
    }

    public boolean isPassable(IBlockAccess worldIn, BlockPos pos)
    {
        return false;
    }

    private boolean canConnectTo(IBlockAccess worldIn, BlockPos pos) {
        IBlockState iblockstate = worldIn.getBlockState(pos);
        Block block = iblockstate.getBlock();
        String blockname = block.getRegistryName().toString();
        try {
            return block instanceof BlockRoadPost || block instanceof BlockRoadSign;/* || block == CCCBlocks.road_traffic_light
                    || block == CCCBlocks.road_pedestrian_traffic_light;*/
        } catch (StringIndexOutOfBoundsException e) {
            return block instanceof BlockRoadPost || block instanceof BlockRoadSign; //block == CCCBlocks.road_traffic_light || block == CCCBlocks.road_pedestrian_traffic_light;
        }
    }


    protected static boolean isExcepBlockForAttachWithPiston(Block p_194142_0_)
    {
        return Block.isExceptBlockForAttachWithPiston(p_194142_0_) || p_194142_0_ == Blocks.BARRIER || p_194142_0_ == Blocks.MELON_BLOCK || p_194142_0_ == Blocks.PUMPKIN || p_194142_0_ == Blocks.LIT_PUMPKIN;
    }

    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side)
    {
        return true;
    }

    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        if (!worldIn.isRemote)
        {
            return ItemLead.attachToFence(playerIn, worldIn, pos);
        }
        else
        {
            ItemStack itemstack = playerIn.getHeldItem(hand);
            return itemstack.getItem() == Items.LEAD || itemstack.isEmpty();
        }
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(FACING, EnumFacing.getHorizontal(meta));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.CUTOUT;
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return state.getValue(FACING).getHorizontalIndex();
    }

    public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos)
    {
        int meta = state.getValue(FACING).getHorizontalIndex();
        switch (meta) {
            case 0:
                return state
                        .withProperty(UP, this.canConnectTo(worldIn, pos.up()))
                        .withProperty(DOWN, this.canConnectTo(worldIn, pos.down()))
                        .withProperty(NORTH, this.canConnectTo(worldIn, pos.north()))
                        .withProperty(SOUTH, this.canConnectTo(worldIn, pos.south()))
                        .withProperty(EAST, this.canConnectTo(worldIn, pos.east()))
                        .withProperty(WEST, this.canConnectTo(worldIn, pos.west()));
            case 1:
                return state
                        .withProperty(UP, this.canConnectTo(worldIn, pos.up()))
                        .withProperty(DOWN, this.canConnectTo(worldIn, pos.down()))
                        .withProperty(NORTH, this.canConnectTo(worldIn, pos.east()))
                        .withProperty(SOUTH, this.canConnectTo(worldIn, pos.west()))
                        .withProperty(EAST, this.canConnectTo(worldIn, pos.south()))
                        .withProperty(WEST, this.canConnectTo(worldIn, pos.north()));
            case 2:
                return state
                        .withProperty(UP, this.canConnectTo(worldIn, pos.up()))
                        .withProperty(DOWN, this.canConnectTo(worldIn, pos.down()))
                        .withProperty(NORTH, this.canConnectTo(worldIn, pos.south()))
                        .withProperty(SOUTH, this.canConnectTo(worldIn, pos.north()))
                        .withProperty(EAST, this.canConnectTo(worldIn, pos.west()))
                        .withProperty(WEST, this.canConnectTo(worldIn, pos.east()));
            case 3:
                return state
                        .withProperty(UP, this.canConnectTo(worldIn, pos.up()))
                        .withProperty(DOWN, this.canConnectTo(worldIn, pos.down()))
                        .withProperty(NORTH, this.canConnectTo(worldIn, pos.west()))
                        .withProperty(SOUTH, this.canConnectTo(worldIn, pos.east()))
                        .withProperty(EAST, this.canConnectTo(worldIn, pos.north()))
                        .withProperty(WEST, this.canConnectTo(worldIn, pos.south()));
            default:
                return state
                        .withProperty(UP, this.canConnectTo(worldIn, pos.up()))
                        .withProperty(DOWN, this.canConnectTo(worldIn, pos.down()))
                        .withProperty(NORTH, this.canConnectTo(worldIn, pos.north()))
                        .withProperty(SOUTH, this.canConnectTo(worldIn, pos.south()))
                        .withProperty(EAST, this.canConnectTo(worldIn, pos.east()))
                        .withProperty(WEST, this.canConnectTo(worldIn, pos.west()));
        }
    }

    public IBlockState withRotation(IBlockState state, Rotation rot)
    {
        switch (rot)
        {
            case CLOCKWISE_180:
                return state.withProperty(NORTH, state.getValue(SOUTH)).withProperty(EAST, state.getValue(WEST)).withProperty(SOUTH, state.getValue(NORTH)).withProperty(WEST, state.getValue(EAST));
            case COUNTERCLOCKWISE_90:
                return state.withProperty(NORTH, state.getValue(EAST)).withProperty(EAST, state.getValue(SOUTH)).withProperty(SOUTH, state.getValue(WEST)).withProperty(WEST, state.getValue(NORTH));
            case CLOCKWISE_90:
                return state.withProperty(NORTH, state.getValue(WEST)).withProperty(EAST, state.getValue(NORTH)).withProperty(SOUTH, state.getValue(EAST)).withProperty(WEST, state.getValue(SOUTH));
            default:
                return state;
        }
    }

    public IBlockState withMirror(IBlockState state, Mirror mirrorIn)
    {
        switch (mirrorIn)
        {
            case LEFT_RIGHT:
                return state.withProperty(NORTH, state.getValue(SOUTH)).withProperty(SOUTH, state.getValue(NORTH));
            case FRONT_BACK:
                return state.withProperty(EAST, state.getValue(WEST)).withProperty(WEST, state.getValue(EAST));
            default:
                return super.withMirror(state, mirrorIn);
        }
    }

    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {NORTH, EAST, WEST, SOUTH, UP ,DOWN, FACING});
    }

    /* ======================================== FORGE START ======================================== */



    /* ======================================== FORGE END ======================================== */

    public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face)
    {
        return face != EnumFacing.UP && face != EnumFacing.DOWN ? BlockFaceShape.MIDDLE_POLE : BlockFaceShape.SOLID;
    }

    @Override
    public IBlockState getStateForPlacement(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer, EnumHand hand) {
        IBlockState state = super.getStateForPlacement(world, pos, facing, hitX, hitY, hitZ, meta, placer, hand);
        state = state.withProperty(FACING, placer.getHorizontalFacing().getOpposite());
        return state;
    }
}