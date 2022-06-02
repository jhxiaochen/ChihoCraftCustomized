package com.chipocraftcustomized.init;

import com.chipocraftcustomized.common.*;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.*;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.LinkedList;
import java.util.List;

public class CCCBlocks {

    public static Block
            metro_fence,
            black_modern_lamp_on,
            light_grey_modern_lamp_on,
            brown_modern_lamp_on,
            blue_modern_lamp_on,
            grey_modern_lamp_on,
            green_modern_lamp_on,
            light_blue_modern_lamp_on,
            lime_modern_lamp_on,
            magenta_modern_lamp_on,
            pink_modern_lamp_on,
            purple_modern_lamp_on,
            red_modern_lamp_on,
            yellow_modern_lamp_on,
            white_modern_lamp_on,
            cyan_modern_lamp_on,
            orange_modern_lamp_on,
            black_flat_lamp,
            blue_flat_lamp,
            brown_flat_lamp,
            cyan_flat_lamp,
            gray_flat_lamp,
            green_flat_lamp,
            light_blue_flat_lamp,
            light_gray_flat_lamp,
            lime_flat_lamp,
            magenta_flat_lamp,
            orange_flat_lamp,
            pink_flat_lamp,
            purple_flat_lamp,
            red_flat_lamp,
            white_flat_lamp,
            white_new_banding_lamp,
            yellow_flat_lamp,
            black_modern_lamp_transparency,
            light_gray_modern_lamp_transparency,
            brown_modern_lamp_transparency,
            blue_modern_lamp_transparency,
            gray_modern_lamp_transparency,
            green_modern_lamp_transparency,
            light_blue_modern_lamp_transparency,
            lime_modern_lamp_transparency,
            magenta_modern_lamp_transparency,
            pink_modern_lamp_transparency,
            purple_modern_lamp_transparency,
            red_modern_lamp_transparency,
            yellow_modern_lamp_transparency,
            white_modern_lamp_transparency,
            cyan_modern_lamp_transparency,
            orange_modern_lamp_transparency,
            colored_block_loop_line,
            colored_block_line_1,
            colored_block_line_2,
            colored_block_line_3,
            colored_block_line_4,
            colored_block_line_5,
            colored_block_line_6,
            colored_block_line_7,
    colored_block_line_8,
            colored_block_line_9,
    colored_block_line_10,
    colored_block_line_11,
    colored_block_line_12,
    colored_block_line_13,
    colored_block_line_14,
    node_block,
            blue_concrete_windpanel,
            cyan_concrete_windpanel,
            brown_concrete_windpanel,
            grey_concrete_windpanel,
            light_blue_concrete_windpanel,
            light_grey_concrete_windpanel,
            lime_concrete_windpanel,
            magenta_concrete_windpanel,
            orange_concrete_windpanel,
            pink_concrete_windpanel,
            purple_concrete_windpanel,
            red_concrete_windpanel,
            white_concrete_windpanel,
            yellow_concrete_windpanel,
            black_concrete_windpanel,
            white_punctiform_lamp,
            white_banding_lamp,
    colored_block_apm_line,
    colored_block_airport_line,
    platform_fence,
            green_concrete_windpanel;

    public static void init() {
        platform_fence = new BlockPlatFormFence();
        black_modern_lamp_on = new BlockLight("black_modern_lamp_on");
        brown_modern_lamp_on = new BlockLight("brown_modern_lamp_on");
        blue_modern_lamp_on = new BlockLight("blue_modern_lamp_on");
        grey_modern_lamp_on = new BlockLight("grey_modern_lamp_on");
        green_modern_lamp_on = new BlockLight("green_modern_lamp_on");
        light_blue_modern_lamp_on = new BlockLight("light_blue_modern_lamp_on");
        lime_modern_lamp_on = new BlockLight("lime_modern_lamp_on");
        magenta_modern_lamp_on = new BlockLight("magenta_modern_lamp_on");
        pink_modern_lamp_on = new BlockLight("pink_modern_lamp_on");
        purple_modern_lamp_on = new BlockLight("purple_modern_lamp_on");
        red_modern_lamp_on = new BlockLight("red_modern_lamp_on");
        yellow_modern_lamp_on = new BlockLight("yellow_modern_lamp_on");
        white_modern_lamp_on = new BlockLight("white_modern_lamp_on");
        cyan_modern_lamp_on = new BlockLight("cyan_modern_lamp_on");
        light_grey_modern_lamp_on = new BlockLight("light_grey_modern_lamp_on");
        black_flat_lamp = new LightLamp("black_flat_lamp");
        blue_flat_lamp = new LightLamp("blue_flat_lamp");
        brown_flat_lamp = new LightLamp("brown_flat_lamp");
        cyan_flat_lamp = new LightLamp("cyan_flat_lamp");
        gray_flat_lamp = new LightLamp("gray_flat_lamp");
        green_flat_lamp = new LightLamp("green_flat_lamp");
        light_blue_flat_lamp = new LightLamp("light_blue_flat_lamp");
        light_gray_flat_lamp = new LightLamp("light_gray_flat_lamp");
        lime_flat_lamp = new LightLamp("lime_flat_lamp");
        magenta_flat_lamp = new LightLamp("magenta_flat_lamp");
        orange_flat_lamp = new LightLamp("orange_flat_lamp");
        pink_flat_lamp = new LightLamp("pink_flat_lamp");
        purple_flat_lamp = new LightLamp("purple_flat_lamp");
        red_flat_lamp = new LightLamp("red_flat_lamp");
        white_flat_lamp = new LightLamp("white_flat_lamp");
        yellow_flat_lamp = new LightLamp("yellow_flat_lamp");
        white_punctiform_lamp = new PunLamp("white_punctiform_lamp");
        white_banding_lamp = new BandLamp1("white_banding_lamp");
        white_new_banding_lamp = new BandLamp("white_new_banding_lamp");
        black_modern_lamp_transparency= new BlockTranLight("black_modern_lamp_transparency");
        light_gray_modern_lamp_transparency = new BlockTranLight("light_gray_modern_lamp_transparency");
        brown_modern_lamp_transparency = new BlockTranLight("brown_modern_lamp_transparency");
        blue_modern_lamp_transparency = new BlockTranLight("blue_modern_lamp_transparency");
        gray_modern_lamp_transparency = new BlockTranLight("gray_modern_lamp_transparency");
        green_modern_lamp_transparency = new BlockTranLight("green_modern_lamp_transparency");
        light_blue_modern_lamp_transparency = new BlockTranLight("light_blue_modern_lamp_transparency");
        lime_modern_lamp_transparency = new BlockTranLight("lime_modern_lamp_transparency");
        magenta_modern_lamp_transparency = new BlockTranLight("magenta_modern_lamp_transparency");
        pink_modern_lamp_transparency = new BlockTranLight("pink_modern_lamp_transparency");
        purple_modern_lamp_transparency = new BlockTranLight("purple_modern_lamp_transparency");
        red_modern_lamp_transparency = new BlockTranLight("red_modern_lamp_transparency");
        yellow_modern_lamp_transparency = new BlockTranLight("yellow_modern_lamp_transparency");
        white_modern_lamp_transparency = new BlockTranLight("white_modern_lamp_transparency");
        cyan_modern_lamp_transparency = new BlockTranLight("cyan_modern_lamp_transparency");
        orange_modern_lamp_transparency = new BlockTranLight("orange_modern_lamp_transparency");
        colored_block_loop_line = new BlockMetroBlock1("colored_block_loop_line");
        colored_block_line_1 = new BlockMetroBlock("colored_block_line_1");
        colored_block_line_2 = new BlockMetroBlock("colored_block_line_2");
        colored_block_line_3 = new BlockMetroBlock("colored_block_line_3");
        colored_block_line_4 = new BlockMetroBlock("colored_block_line_4");
        colored_block_line_5 = new BlockMetroBlock("colored_block_line_5");
        colored_block_line_6 = new BlockMetroBlock("colored_block_line_6");
        colored_block_line_7 = new BlockMetroBlock("colored_block_line_7");
        colored_block_line_8 = new BlockMetroBlock("colored_block_line_8");
        colored_block_line_9 = new BlockMetroBlock("colored_block_line_9");
        colored_block_line_10 = new BlockMetroBlock("colored_block_line_10");
        colored_block_line_11 = new BlockMetroBlock("colored_block_line_11");
        colored_block_line_12 = new BlockMetroBlock("colored_block_line_12");
        colored_block_line_13 = new BlockMetroBlock("colored_block_line_13");
        colored_block_line_14 = new BlockMetroBlock("colored_block_line_14");
        node_block = new BlockNodeBlock("node_block");
        orange_modern_lamp_on = new BlockLight("orange_modern_lamp_on");
        black_concrete_windpanel = new BlockWindPanel("black_concrete_windpanel");
        cyan_concrete_windpanel = new BlockWindPanel("cyan_concrete_windpanel");
        blue_concrete_windpanel = new BlockWindPanel("blue_concrete_windpanel");
        brown_concrete_windpanel = new BlockWindPanel("brown_concrete_windpanel");
        grey_concrete_windpanel = new BlockWindPanel("grey_concrete_windpanel");
        light_blue_concrete_windpanel = new BlockWindPanel("light_blue_concrete_windpanel");
        light_grey_concrete_windpanel = new BlockWindPanel("light_grey_concrete_windpanel");
        lime_concrete_windpanel = new BlockWindPanel("lime_concrete_windpanel");
        magenta_concrete_windpanel = new BlockWindPanel("magenta_concrete_windpanel");
        orange_concrete_windpanel = new BlockWindPanel("orange_concrete_windpanel");
        pink_concrete_windpanel = new BlockWindPanel("pink_concrete_windpanel");
        purple_concrete_windpanel = new BlockWindPanel("purple_concrete_windpanel");
        red_concrete_windpanel = new BlockWindPanel("red_concrete_windpanel");
        white_concrete_windpanel = new BlockWindPanel("white_concrete_windpanel");
        yellow_concrete_windpanel = new BlockWindPanel("yellow_concrete_windpanel");
        green_concrete_windpanel = new BlockWindPanel("green_concrete_windpanel");
        metro_fence = new BlockMetroFence();
        colored_block_airport_line = new BlockMetroBlock1("colored_block_airport_line");
        colored_block_apm_line = new BlockMetroBlock("colored_block_apm_line");

    }

    public static void register() {
        registerBlock(black_modern_lamp_on);
        registerBlock(light_grey_modern_lamp_on);
        registerBlock(brown_modern_lamp_on);
        registerBlock(blue_modern_lamp_on);
        registerBlock(grey_modern_lamp_on);
        registerBlock(green_modern_lamp_on);
        registerBlock(light_blue_modern_lamp_on);
        registerBlock(lime_modern_lamp_on);
        registerBlock(magenta_modern_lamp_on);
        registerBlock(pink_modern_lamp_on);
        registerBlock(purple_modern_lamp_on);
        registerBlock(red_modern_lamp_on);
        registerBlock(yellow_modern_lamp_on);
        registerBlock(white_modern_lamp_on);
        registerBlock(cyan_modern_lamp_on);
        registerBlock(orange_modern_lamp_on);
        registerBlock(black_flat_lamp);
        registerBlock(white_flat_lamp);
        registerBlock(blue_flat_lamp);
        registerBlock(cyan_flat_lamp);
        registerBlock(brown_flat_lamp);
        registerBlock(gray_flat_lamp);
        registerBlock(green_flat_lamp);
        registerBlock(light_blue_flat_lamp);
        registerBlock(light_gray_flat_lamp);
        registerBlock(lime_flat_lamp);
        registerBlock(magenta_flat_lamp);
        registerBlock(orange_flat_lamp);
        registerBlock(pink_flat_lamp);
        registerBlock(purple_flat_lamp);
        registerBlock(red_flat_lamp);
        registerBlock(yellow_flat_lamp);
        registerBlock(white_punctiform_lamp);
        registerBlock(white_new_banding_lamp);
        registerBlock(white_banding_lamp);
        registerBlock(colored_block_loop_line);
        registerBlock(colored_block_airport_line);
        registerBlock(colored_block_apm_line);
        registerBlock(colored_block_line_1);
        registerBlock(colored_block_line_2);
        registerBlock(colored_block_line_3);
        registerBlock(colored_block_line_4);
        registerBlock(colored_block_line_5);
        registerBlock(colored_block_line_6);
        registerBlock(colored_block_line_7);
        registerBlock(colored_block_line_8);
        registerBlock(colored_block_line_9);
        registerBlock(colored_block_line_10);
        registerBlock(node_block);
        registerBlock(black_concrete_windpanel);
        registerBlock(blue_concrete_windpanel);
        registerBlock(brown_concrete_windpanel);
        registerBlock(grey_concrete_windpanel);
        registerBlock(green_concrete_windpanel);
        registerBlock(light_blue_concrete_windpanel);
        registerBlock(light_grey_concrete_windpanel);
        registerBlock(lime_concrete_windpanel);
        registerBlock(magenta_concrete_windpanel);
        registerBlock(orange_concrete_windpanel);
        registerBlock(pink_concrete_windpanel);
        registerBlock(purple_concrete_windpanel);
        registerBlock(red_concrete_windpanel);
        registerBlock(white_concrete_windpanel);
        registerBlock(yellow_concrete_windpanel);
        registerBlock(cyan_concrete_windpanel);
        registerBlock(black_modern_lamp_transparency);
        registerBlock(white_modern_lamp_transparency);
        registerBlock(blue_modern_lamp_transparency);
        registerBlock(brown_modern_lamp_transparency);
        registerBlock(gray_modern_lamp_transparency);
        registerBlock(green_modern_lamp_transparency);
        registerBlock(cyan_modern_lamp_transparency);
        registerBlock(light_blue_modern_lamp_transparency);
        registerBlock(light_gray_modern_lamp_transparency);
        registerBlock(lime_modern_lamp_transparency);
        registerBlock(magenta_modern_lamp_transparency);
        registerBlock(orange_modern_lamp_transparency);
        registerBlock(pink_modern_lamp_transparency);
        registerBlock(purple_modern_lamp_transparency);
        registerBlock(red_modern_lamp_transparency);
        registerBlock(yellow_modern_lamp_transparency);
        registerBlock(metro_fence);
        registerBlock(platform_fence);
        registerBlock(colored_block_line_11);
        registerBlock(colored_block_line_12);
        registerBlock(colored_block_line_13);
        registerBlock(colored_block_line_14);
    }

    private static void registerBlock(Block block) {
        registerBlock(block, new ItemBlock(block));
    }

    private static void registerBlock(Block block, ItemBlock item) {
        RegistrationHandler.BLOCKS.add(block);
        item.setRegistryName(block.getRegistryName());
        CCCItems.RegistrationHandler.ITEMS.add(item);
    }

    public static void registerModels() {
        registerModel(platform_fence);
        registerModel(metro_fence);
        registerModel(colored_block_apm_line);
        registerModel(colored_block_airport_line);
        registerModel(black_modern_lamp_on);
        registerModel(light_grey_modern_lamp_on);
        registerModel(brown_modern_lamp_on);
        registerModel(blue_modern_lamp_on);
        registerModel(grey_modern_lamp_on);
        registerModel(green_modern_lamp_on);
        registerModel(light_blue_modern_lamp_on);
        registerModel(lime_modern_lamp_on);
        registerModel(magenta_modern_lamp_on);
        registerModel(pink_modern_lamp_on);
        registerModel(purple_modern_lamp_on);
        registerModel(red_modern_lamp_on);
        registerModel(yellow_modern_lamp_on);
        registerModel(white_modern_lamp_on);
        registerModel(orange_modern_lamp_on);
        registerModel(black_flat_lamp);
        registerModel(white_flat_lamp);
        registerModel(blue_flat_lamp);
        registerModel(cyan_flat_lamp);
        registerModel(brown_flat_lamp);
        registerModel(cyan_modern_lamp_on);
        registerModel(gray_flat_lamp);
        registerModel(green_flat_lamp);
        registerModel(light_blue_flat_lamp);
        registerModel(light_gray_flat_lamp);
        registerModel(lime_flat_lamp);
        registerModel(magenta_flat_lamp);
        registerModel(orange_flat_lamp);
        registerModel(pink_flat_lamp);
        registerModel(purple_flat_lamp);
        registerModel(red_flat_lamp);
        registerModel(yellow_flat_lamp);
        registerModel(white_punctiform_lamp);
        registerModel(white_new_banding_lamp);
        registerModel(white_banding_lamp);
        registerModel(colored_block_loop_line);
        registerModel(colored_block_line_1);
        registerModel(colored_block_line_2);
        registerModel(colored_block_line_3);
        registerModel(colored_block_line_4);
        registerModel(colored_block_line_5);
        registerModel(colored_block_line_6);
        registerModel(colored_block_line_7);
        registerModel(colored_block_line_8);
        registerModel(colored_block_line_9);
        registerModel(colored_block_line_10);
        registerModel(node_block);
        registerModel(black_concrete_windpanel);
        registerModel(white_concrete_windpanel);
        registerModel(blue_concrete_windpanel);
        registerModel(brown_concrete_windpanel);
        registerModel(grey_concrete_windpanel);
        registerModel(green_concrete_windpanel);
        registerModel(light_blue_concrete_windpanel);
        registerModel(light_grey_concrete_windpanel);
        registerModel(lime_concrete_windpanel);
        registerModel(magenta_concrete_windpanel);
        registerModel(orange_concrete_windpanel);
        registerModel(pink_concrete_windpanel);
        registerModel(cyan_concrete_windpanel);
        registerModel(purple_concrete_windpanel);
        registerModel(red_concrete_windpanel);
        registerModel(yellow_concrete_windpanel);
        registerModel(black_modern_lamp_transparency);
        registerModel(white_modern_lamp_transparency);
        registerModel(blue_modern_lamp_transparency);
        registerModel(brown_modern_lamp_transparency);
        registerModel(gray_modern_lamp_transparency);
        registerModel(green_modern_lamp_transparency);
        registerModel(light_blue_modern_lamp_transparency);
        registerModel(cyan_modern_lamp_transparency);
        registerModel(light_gray_modern_lamp_transparency);
        registerModel(lime_modern_lamp_transparency);
        registerModel(magenta_modern_lamp_transparency);
        registerModel(orange_modern_lamp_transparency);
        registerModel(pink_modern_lamp_transparency);
        registerModel(purple_modern_lamp_transparency);
        registerModel(red_modern_lamp_transparency);
        registerModel(yellow_modern_lamp_transparency);
        registerModel(colored_block_line_11);
        registerModel(colored_block_line_12);
        registerModel(colored_block_line_13);
        registerModel(colored_block_line_14);
    }

    @SideOnly(Side.CLIENT)
    private static void registerModel(Block block,int subtype, String name) {
        ModelResourceLocation model = new ModelResourceLocation(name, "inventory");
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), subtype, model);
    }

    @SideOnly(Side.CLIENT)
    private static void registerModel(Block block) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));

    }

    @Mod.EventBusSubscriber()
    public static class RegistrationHandler {
        public static final List<Block> BLOCKS = new LinkedList<>();

        @SubscribeEvent
        public static void registerItems(final RegistryEvent.Register<Block> event) {
            CCCBlocks.init();
            CCCBlocks.register();
            BLOCKS.stream().forEach(block -> event.getRegistry().register(block));
        }
    }
}
