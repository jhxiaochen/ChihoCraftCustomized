package com.chihocraft.chihocraftcustomized.init;

import com.chihocraft.chihocraftcustomized.common.ItemZhongNan;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.LinkedList;
import java.util.List;

public class CCCItems {
    public static Item zhongnan_aa2;

    public static void init() {
        zhongnan_aa2 = new ItemZhongNan().setUnlocalizedName("zhongnan_aa2").setRegistryName("zhongnan_aa2");
    }

    public static void register()
    {
        registerItem(zhongnan_aa2);
    }

    public static void registerItem(Item item)
    {
        RegistrationHandler.ITEMS.add(item);
    }

    public static void registerModels() {
        registerModel(zhongnan_aa2);
    }

    public static void registerModel(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

    private static void registerModel(Item item, int metadata, String name) {
        ModelResourceLocation model = new ModelResourceLocation(name, "inventory");
        ModelLoader.setCustomModelResourceLocation(item, metadata, model);
    }

    @Mod.EventBusSubscriber()
    public static class RegistrationHandler {
        public static final List<Item> ITEMS = new LinkedList<>();

        @SubscribeEvent
        public static void registerItems(final RegistryEvent.Register<Item> event) {
            CCCItems.init();
            CCCItems.register();
            ITEMS.stream().forEach(item -> event.getRegistry().register(item));
        }
    }
}