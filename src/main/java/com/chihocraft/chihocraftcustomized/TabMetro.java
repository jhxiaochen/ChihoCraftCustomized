package com.chihocraft.chihocraftcustomized;

import com.chihocraft.chihocraftcustomized.init.CCCBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabMetro extends CreativeTabs {

    public TabMetro() {
        super("tabMetro");

    }

    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(CCCBlocks.chiho_line_1);
    }


}