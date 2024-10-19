package com.chihocraft.chihocraftcustomized;

import com.chihocraft.chihocraftcustomized.init.CCCBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabRailway extends CreativeTabs {

    public TabRailway() {
        super("tabRailway");

    }

    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(CCCBlocks.chiho_tran_line);
    }


}