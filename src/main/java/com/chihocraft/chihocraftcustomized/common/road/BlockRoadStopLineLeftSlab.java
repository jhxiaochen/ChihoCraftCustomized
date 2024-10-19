package com.chihocraft.chihocraftcustomized.common.road;

import com.chihocraft.chihocraftcustomized.ChihoCraftCustomized;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockRoadStopLineLeftSlab extends Block {
    public static final PropertyEnum<BlockRoadStopLineLeftSlab.SLTYPE> TYPE = PropertyEnum.<BlockRoadStopLineLeftSlab.SLTYPE>create("type", BlockRoadStopLineLeftSlab.SLTYPE.class);
    public static final PropertyDirection FACING = BlockHorizontal.FACING;
    protected static final AxisAlignedBB AABB_BOTTOM_HALF = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D);

    public static enum SLTYPE implements IStringSerializable {
        LEFT(0,"left"),
        LEFT1(1,"left1");


        private static final BlockRoadStopLineLeftSlab.SLTYPE[] METADATA_LOOKUP = new BlockRoadStopLineLeftSlab.SLTYPE[values().length];
        private final int metadata;
        private final String name;
        private final String unlocalizedName;

        private SLTYPE(int metadataIn, String nameIn) {
            this(metadataIn, nameIn, nameIn);
        }

        private SLTYPE(int metadataIn, String nameIn, String unlocalizedNameIn) {
            this.metadata = metadataIn;
            this.name = nameIn;
            this.unlocalizedName = unlocalizedNameIn;
        }

        public int getMetadata() {
            return this.metadata;
        }

        public String getUnlocalizedName() {
            return this.unlocalizedName;
        }

        public String toString() {
            return this.name;
        }

        public static BlockRoadStopLineLeftSlab.SLTYPE byMetadata(int metadata) {
            if (metadata < 0 || metadata >= METADATA_LOOKUP.length) {
                metadata = 0;
            }

            return METADATA_LOOKUP[metadata];
        }

        public String getName() {
            return this.name;
        }

        static {
            for (BlockRoadStopLineLeftSlab.SLTYPE BlockRoadLine$SLTYPE : values()) {
                METADATA_LOOKUP[BlockRoadLine$SLTYPE.getMetadata()] = BlockRoadLine$SLTYPE;
            }
        }
    }
    public BlockRoadStopLineLeftSlab(String name) {
        super(Material.ROCK);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(ChihoCraftCustomized.ROADBLOCK_TAB);
        setHardness(3F);
        this.setLightOpacity(255);
        setSoundType(SoundType.STONE);
        this.setTickRandomly(true);
    }
    @Override
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.CUTOUT;
    }
    public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items)
    {
        items.add(new ItemStack(this,1, SLTYPE.LEFT.getMetadata()));
        items.add(new ItemStack(this,1, SLTYPE.LEFT1.getMetadata()));
    }
    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }
    @Override
    public AxisAlignedBB getBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
        return AABB_BOTTOM_HALF;
    }



    public IBlockState getStateFromMeta(int meta)
    {
        IBlockState iblockstate = this.getDefaultState();

        switch (meta)
        {
            case 0:
                iblockstate = iblockstate.withProperty(FACING, EnumFacing.SOUTH).withProperty(TYPE, SLTYPE.LEFT);
                break;
            case 1:
                iblockstate = iblockstate.withProperty(FACING, EnumFacing.SOUTH).withProperty(TYPE, SLTYPE.LEFT1);
                break;
            case 2:
                iblockstate = iblockstate.withProperty(FACING, EnumFacing.WEST).withProperty(TYPE, SLTYPE.LEFT);
                break;
            case 3:
                iblockstate = iblockstate.withProperty(FACING, EnumFacing.WEST).withProperty(TYPE, SLTYPE.LEFT1);
                break;
            case 4:
                iblockstate = iblockstate.withProperty(FACING, EnumFacing.NORTH).withProperty(TYPE, SLTYPE.LEFT);
                break;
            case 5:
                iblockstate = iblockstate.withProperty(FACING, EnumFacing.NORTH).withProperty(TYPE, SLTYPE.LEFT1);
                break;
            case 6:
                iblockstate = iblockstate.withProperty(FACING, EnumFacing.EAST).withProperty(TYPE, SLTYPE.LEFT);
                break;
            case 7:
                iblockstate = iblockstate.withProperty(FACING, EnumFacing.EAST).withProperty(TYPE, SLTYPE.LEFT1);
                break;
            default:
                iblockstate = iblockstate.withProperty(FACING, EnumFacing.WEST).withProperty(TYPE, SLTYPE.LEFT);
        }

        return iblockstate;

    }
    public int getMetaFromState(IBlockState state) {
        int i = 0;

        switch ((EnumFacing) state.getValue(FACING)) {
            case SOUTH:
                switch ((SLTYPE) state.getValue(TYPE)){
                    case LEFT:
                        return   i = i | 0;
                    case LEFT1:
                        return   i = i | 1;
                }
                break;
            case WEST:
                switch ((SLTYPE) state.getValue(TYPE)){
                    case LEFT:
                        return   i = i | 2;
                    case LEFT1:
                        return   i = i | 3;
                }
                break;
            case NORTH:
                switch ((SLTYPE) state.getValue(TYPE)){
                    case LEFT:
                        return   i = i | 4;
                    case LEFT1:
                        return   i = i | 5;
                }
                break;
            case EAST:
                switch ((SLTYPE) state.getValue(TYPE)) {
                    case LEFT:
                        return    i = i | 6;
                    case LEFT1:
                        return    i = i | 7;
                }
                break;
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
    public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face)
    {

        return face != EnumFacing.UP && face != EnumFacing.DOWN ? BlockFaceShape.CENTER : BlockFaceShape.MIDDLE_POLE;

    }
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {TYPE,FACING});
    }
}
