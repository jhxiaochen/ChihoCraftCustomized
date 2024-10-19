package com.chihocraft.chihocraftcustomized;

import com.chihocraft.chihocraftcustomized.init.CCCBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabLight extends CreativeTabs {

    public TabLight() {
        super("tabLight");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(CCCBlocks.light);
    }

}
