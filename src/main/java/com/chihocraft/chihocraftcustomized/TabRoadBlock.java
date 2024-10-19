package com.chihocraft.chihocraftcustomized;

import com.chihocraft.chihocraftcustomized.init.CCCBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabRoadBlock extends CreativeTabs {

    public TabRoadBlock() {
        super("tabRoadBlock");

    }

    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(CCCBlocks.asphalt);
    }


}