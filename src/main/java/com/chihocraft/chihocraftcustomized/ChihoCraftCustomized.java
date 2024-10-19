package com.chihocraft.chihocraftcustomized;

import com.chihocraft.chihocraftcustomized.command.Command114514;
import com.chihocraft.chihocraftcustomized.proxy.CommonProxy;
import com.chihocraft.chihocraftcustomized.proxy.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import org.apache.logging.log4j.Logger;



@Mod(modid = ChihoCraftCustomized.MODID, name = ChihoCraftCustomized.NAME, version = ChihoCraftCustomized.VERSION)
public class ChihoCraftCustomized
{
    @Mod.Instance(Reference.MOD_ID)
    public static com.chihocraft.chihocraftcustomized.ChihoCraftCustomized instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
    public static final String MODID = "chihocraftcustomized";
    public static final String NAME = "ChihoCraft Customized";
    public static final String VERSION = "10.0.0";
    public static final CreativeTabs BLOCKS_TAB = new TabBuildingBlocks();
    public static final CreativeTabs LIGHT_TAB = new TabLight();
    public static final CreativeTabs METRO_TAB = new TabMetro();
    public static final CreativeTabs RAILWAY_TAB = new TabRailway();
    public static final CreativeTabs ROADBLOCK_TAB = new TabRoadBlock();
    public static final CreativeTabs ROADOTHERS_TAB = new TabRoadOthers();
    private static Logger logger;

    public static ChihoCraftCustomized getInstance() {
        return instance;
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        MinecraftForge.EVENT_BUS.register(proxy);
        proxy.preInit();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        System.out.println("Post Init, thank you fucking mother");
        proxy.postInit();
    }
    @Mod.EventHandler
    public void onServerStarting(FMLServerStartingEvent event) {
        event.registerServerCommand(new Command114514());
    }
}

