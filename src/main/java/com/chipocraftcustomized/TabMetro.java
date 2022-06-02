package com.chipocraftcustomized;

import com.chipocraftcustomized.init.CCCBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabMetro extends CreativeTabs {

    public TabMetro() {
        super("tabMetro");

    }

    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(CCCBlocks.colored_block_line_1);
    }


}