package com.chihocraft.chihocraftcustomized;


import com.chihocraft.chihocraftcustomized.init.CCCBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabBuildingBlocks extends CreativeTabs {

    public TabBuildingBlocks() {
        super("tabBlock");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(CCCBlocks.white_concrete_windpanel);
    }

}
