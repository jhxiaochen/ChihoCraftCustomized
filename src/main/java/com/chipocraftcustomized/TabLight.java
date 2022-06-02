package com.chipocraftcustomized;

import com.chipocraftcustomized.init.CCCBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabLight extends CreativeTabs {

    public TabLight() {
        super("tabLight");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(CCCBlocks.white_modern_lamp_on);
    }

}
