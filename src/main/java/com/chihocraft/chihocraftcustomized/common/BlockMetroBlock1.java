package com.chihocraft.chihocraftcustomized.common;

import com.chihocraft.chihocraftcustomized.ChihoCraftCustomized;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockMetroBlock1 extends Block {
    public static final PropertyEnum<BlockMetroBlock1.MetroBlock1Type> TYPE = PropertyEnum.<BlockMetroBlock1.MetroBlock1Type>create("type", BlockMetroBlock1.MetroBlock1Type.class);
    public static enum MetroBlock1Type implements IStringSerializable {
        LOOP(0, "loop"),
        AIRPORT(1, "airport"),
        APM(2, "apm");

        private static final BlockMetroBlock1.MetroBlock1Type[] METADATA_LOOKUP = new BlockMetroBlock1.MetroBlock1Type[values().length];
        private final int metadata;
        private final String name;
        private final String unlocalizedName;

        private MetroBlock1Type(int metadataIn, String nameIn) {
            this(metadataIn, nameIn, nameIn);
        }

        private MetroBlock1Type(int metadataIn, String nameIn, String unlocalizedNameIn) {
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

        public static BlockMetroBlock1.MetroBlock1Type byMetadata(int metadata) {
            if (metadata < 0 || metadata >= METADATA_LOOKUP.length) {
                metadata = 0;
            }

            return METADATA_LOOKUP[metadata];
        }

        public String getName() {
            return this.name;
        }

        static {
            for (BlockMetroBlock1.MetroBlock1Type blockMetroBlock1$MetroBlock1type : values()) {
                METADATA_LOOKUP[blockMetroBlock1$MetroBlock1type.getMetadata()] = blockMetroBlock1$MetroBlock1type;
            }
        }
    }
    public BlockMetroBlock1(String name) {
        super(Material.ROCK);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(ChihoCraftCustomized.RAILWAY_TAB);
        this.setHardness(1.8F);
        this.setSoundType(SoundType.STONE);
    }

    public EnumRarity getRarity()
    {
        return EnumRarity.UNCOMMON;
    }

    public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items)
    {
        items.add(new ItemStack(this, 1, MetroBlock1Type.LOOP.getMetadata()));
        items.add(new ItemStack(this, 1, MetroBlock1Type.AIRPORT.getMetadata()));
        items.add(new ItemStack(this, 1, MetroBlock1Type.APM.getMetadata()));
    }

    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
    {
        return new ItemStack(this, 1, ((BlockMetroBlock1.MetroBlock1Type)state.getValue(TYPE)).getMetadata());
    }

    public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(TYPE, BlockMetroBlock1.MetroBlock1Type.byMetadata(meta));
    }

    public int getMetaFromState(IBlockState state)
    {
        return ((BlockMetroBlock1.MetroBlock1Type)state.getValue(TYPE)).getMetadata();
    }

    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {TYPE});
    }
}
