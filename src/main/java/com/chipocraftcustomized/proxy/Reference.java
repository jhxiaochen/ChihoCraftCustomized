package com.chipocraftcustomized.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.text.TextComponentString;

public class Reference {

    public static void sayDebugChat(EntityPlayer player, String string) {
        player.sendStatusMessage(new TextComponentString("[DEBUG]: " + string), true);
    }

    public static final String MOD_ID = "df-roads";

    public static final String CLIENT_PROXY_CLASS = "com.jhxiaochen.chipocraftcustomized.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "com.jhxiaochen.chipocraftcustomized.proxy.ServerProxy";

    public static final AxisAlignedBB ROAD_BLOCK_AABB =         new AxisAlignedBB(0.0D,  0.0D, 0.0D,  1.0D,  0.74999D,   1.0D);
}