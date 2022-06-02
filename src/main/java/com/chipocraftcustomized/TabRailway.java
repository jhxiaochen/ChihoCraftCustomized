package com.chipocraftcustomized;

import com.chipocraftcustomized.init.CCCBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabRailway extends CreativeTabs {

    public TabRailway() {
        super("tabRailway");

    }

    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(CCCBlocks.colored_block_airport_line);
    }


}