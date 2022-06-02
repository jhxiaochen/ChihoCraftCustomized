package com.chipocraftcustomized;

import com.chipocraftcustomized.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.ModContainer;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import com.chipocraftcustomized.command.Command114514;

import java.io.IOException;
import java.net.URI;
import java.nio.file.FileSystems;

@Mod(modid = "chipocraftcustomized", useMetadata = true, updateJSON = "", version = "8.5")
public class ChipoCraftCustomized {

    @Instance(Reference.MOD_ID)
    public static ChipoCraftCustomized instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
    public static final String MODID = "chipocraftcustomized";
    public static final String VERSION = "8.5";
    public static final String Accept_Minecraft_version = "1.12.2";
    public static ChipoCraftCustomized getInstance() {
        return instance;
    }

    public static final CreativeTabs BLOCKS_TAB = new TabBuildingBlocks();
    public static final CreativeTabs LIGHT_TAB = new TabLight();
    public static final CreativeTabs METRO_TAB = new TabMetro();
    public static final CreativeTabs RAILWAY_TAB = new TabRailway();

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println("Pre Init");
        MinecraftForge.EVENT_BUS.register(proxy);
        proxy.preInit();

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

        System.out.println("Init");
        proxy.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        System.out.println("Post Init");
        proxy.postInit();
    }

    @Mod.EventHandler
    public void onServerStarting(FMLServerStartingEvent event) {
        event.registerServerCommand(new Command114514());
    }
}