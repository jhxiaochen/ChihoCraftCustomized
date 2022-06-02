package com.chipocraftcustomized.proxy;

import com.chipocraftcustomized.Reference;
import com.chipocraftcustomized.init.CCCBlocks;
import com.chipocraftcustomized.init.CCCItems;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

public class ClientProxy implements CommonProxy {

    @Override
    public void preInit() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @Override
    public void init() {
        System.out.println("special renderer bound!");

    }

    @Override
    public void postInit() {

    }

    @Mod.EventBusSubscriber(modid = Reference.MOD_ID, value = Side.CLIENT)
    public static class RegistrationHandler
    {
        @SubscribeEvent
        public static void registerModels(ModelRegistryEvent event)
        {
            CCCItems.registerModels();
            CCCBlocks.registerModels();
        }
    }

}
