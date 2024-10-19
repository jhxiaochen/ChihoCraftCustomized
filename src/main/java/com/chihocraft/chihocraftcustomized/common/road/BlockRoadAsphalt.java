package com.chihocraft.chihocraftcustomized.common.road;

import com.chihocraft.chihocraftcustomized.ChihoCraftCustomized;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockRoadAsphalt extends Block {
    public static final PropertyEnum<BlockRoadAsphalt.AsphaltType> COLOR = PropertyEnum.<BlockRoadAsphalt.AsphaltType>create("color", BlockRoadAsphalt.AsphaltType.class);
    public static enum AsphaltType implements IStringSerializable {
        BLACK(0, "black"),
        YELLOW(1,"yellow"),
        WHITE(2,"white");

        private static final BlockRoadAsphalt.AsphaltType[] METADATA_LOOKUP = new BlockRoadAsphalt.AsphaltType[values().length];
        private final int metadata;
        private final String name;
        private final String unlocalizedName;

        private AsphaltType(int metadataIn, String nameIn) {
            this(metadataIn, nameIn, nameIn);
        }

        private AsphaltType(int metadataIn, String nameIn, String unlocalizedNameIn) {
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

        public static BlockRoadAsphalt.AsphaltType byMetadata(int metadata) {
            if (metadata < 0 || metadata >= METADATA_LOOKUP.length) {
                metadata = 0;
            }

            return METADATA_LOOKUP[metadata];
        }

        public String getName() {
            return this.name;
        }

        static {
            for (BlockRoadAsphalt.AsphaltType BlockRoadAsphalt$asphalttype : values()) {
                METADATA_LOOKUP[BlockRoadAsphalt$asphalttype.getMetadata()] = BlockRoadAsphalt$asphalttype;
            }
        }
    }
    public BlockRoadAsphalt() {
        super(Material.ROCK);
        setRegistryName("asphalt");
        setUnlocalizedName("asphalt");
        setCreativeTab(ChihoCraftCustomized.ROADBLOCK_TAB);
        setHardness(3F);
        setSoundType(SoundType.STONE);
    }

    public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items)
    {
        items.add(new ItemStack(this, 1, AsphaltType.BLACK.getMetadata()));
        items.add(new ItemStack(this,1,AsphaltType.WHITE.getMetadata()));
        items.add(new ItemStack(this,1,AsphaltType.YELLOW.getMetadata()));
    }

    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
    {
        return new ItemStack(this, 1, ((BlockRoadAsphalt.AsphaltType)state.getValue(COLOR)).getMetadata());
    }

    public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(COLOR, BlockRoadAsphalt.AsphaltType.byMetadata(meta));
    }

    public int getMetaFromState(IBlockState state)
    {
        return ((BlockRoadAsphalt.AsphaltType)state.getValue(COLOR)).getMetadata();
    }
    @Override
    public boolean isFullCube(IBlockState state) {
        return true;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return true;
    }
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {COLOR});
    }
}
