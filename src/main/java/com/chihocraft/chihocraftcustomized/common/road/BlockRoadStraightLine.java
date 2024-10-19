package com.chihocraft.chihocraftcustomized.common.road;

import com.chihocraft.chihocraftcustomized.ChihoCraftCustomized;
import com.chihocraft.chihocraftcustomized.common.StationBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockRoadStraightLine extends Block {
    public static final PropertyEnum<BlockRoadStraightLine.LineType> COLOR = PropertyEnum.<BlockRoadStraightLine.LineType>create("color", BlockRoadStraightLine.LineType.class);
    public static final PropertyDirection FACING = BlockHorizontal.FACING;

    public static enum LineType implements IStringSerializable {
        WHITE(0,"white"),
        YELLOW(1,"yellow");


        private static final BlockRoadStraightLine.LineType[] METADATA_LOOKUP = new BlockRoadStraightLine.LineType[values().length];
        private final int metadata;
        private final String name;
        private final String unlocalizedName;

        private LineType(int metadataIn, String nameIn) {
            this(metadataIn, nameIn, nameIn);
        }

        private LineType(int metadataIn, String nameIn, String unlocalizedNameIn) {
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

        public static BlockRoadStraightLine.LineType byMetadata(int metadata) {
            if (metadata < 0 || metadata >= METADATA_LOOKUP.length) {
                metadata = 0;
            }

            return METADATA_LOOKUP[metadata];
        }

        public String getName() {
            return this.name;
        }

        static {
            for (BlockRoadStraightLine.LineType BlockRoadLine$Linetype : values()) {
                METADATA_LOOKUP[BlockRoadLine$Linetype.getMetadata()] = BlockRoadLine$Linetype;
            }
        }
    }
    public BlockRoadStraightLine(String name) {
        super(Material.ROCK);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(ChihoCraftCustomized.ROADBLOCK_TAB);
        setHardness(3F);
        setSoundType(SoundType.STONE);
        this.setTickRandomly(true);
    }

    public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items)
    {
        items.add(new ItemStack(this,1, LineType.WHITE.getMetadata()));
        items.add(new ItemStack(this,1, LineType.YELLOW.getMetadata()));
    }

    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
    {
        return new ItemStack(this, 1, ((BlockRoadStraightLine.LineType)state.getValue(COLOR)).getMetadata());
    }


    public IBlockState getStateFromMeta(int meta)
    {
        IBlockState iblockstate = this.getDefaultState();

        switch (meta)
        {
            case 0:
                iblockstate = iblockstate.withProperty(FACING, EnumFacing.SOUTH).withProperty(COLOR, LineType.WHITE);
                break;
            case 1:
                iblockstate = iblockstate.withProperty(FACING, EnumFacing.SOUTH).withProperty(COLOR, LineType.YELLOW);
                break;
            case 2:
                iblockstate = iblockstate.withProperty(FACING, EnumFacing.WEST).withProperty(COLOR, LineType.WHITE);
                break;
            case 3:
                iblockstate = iblockstate.withProperty(FACING, EnumFacing.WEST).withProperty(COLOR, LineType.YELLOW);
                break;
            default:
                iblockstate = iblockstate.withProperty(FACING, EnumFacing.WEST).withProperty(COLOR, LineType.WHITE);
        }

        return iblockstate;

    }
    public int getMetaFromState(IBlockState state) {
        int i = 0;

        switch ((EnumFacing) state.getValue(FACING)) {
            case SOUTH:
                switch ((LineType) state.getValue(COLOR)){
                    case WHITE:
                        return   i = i | 0;
                    case YELLOW:
                        return   i = i | 1;
                }
                break;
            case WEST:
                switch ((LineType) state.getValue(COLOR)){
                    case WHITE:
                        return   i = i | 2;
                    case YELLOW:
                        return   i = i | 3;
                }
                break;
            case NORTH:
                switch ((LineType) state.getValue(COLOR)){
                    case WHITE:
                        return   i = i | 0;
                    case YELLOW:
                        return   i = i | 1;
                }
                break;
            case EAST:
                switch ((LineType) state.getValue(COLOR)) {
                    case WHITE:
                        return    i = i | 2;
                    case YELLOW:
                        return    i = i | 3;
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

    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {COLOR,FACING});
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return true;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return true;
    }
}
