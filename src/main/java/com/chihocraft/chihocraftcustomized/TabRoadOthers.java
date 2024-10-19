package com.chihocraft.chihocraftcustomized;

import com.chihocraft.chihocraftcustomized.init.CCCBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabRoadOthers extends CreativeTabs {

    public TabRoadOthers() {
        super("tabRoadOthers");

    }

    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(CCCBlocks.road_sign_speed_10);
    }


}