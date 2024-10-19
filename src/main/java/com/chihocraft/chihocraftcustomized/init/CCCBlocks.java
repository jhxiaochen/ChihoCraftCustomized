package com.chihocraft.chihocraftcustomized.init;

import com.chihocraft.chihocraftcustomized.common.*;
import com.chihocraft.chihocraftcustomized.common.road.*;
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
            black_flat_lamp,
            blue_flat_lamp,
            brown_flat_lamp,
            cyan_flat_lamp,
            gray_flat_lamp,
            green_flat_lamp,
            light_blue_flat_lamp,
            light_gray_flat_lamp,
    light,
    lamp_tran,
            lime_flat_lamp,
            magenta_flat_lamp,
            orange_flat_lamp,
            pink_flat_lamp,
            purple_flat_lamp,
            red_flat_lamp,
            white_flat_lamp,
            white_banding_lamp,
            yellow_flat_lamp,
            chiho_loop_line,
            chiho_line_1,
            chiho_line_2,
            chiho_line_3,
            chiho_line_4,
            chiho_line_5,
            chiho_line_6,
            chiho_line_7,
    chiho_line_8,
            chiho_line_9,
    chiho_line_10,
    chiho_line_11,
    chiho_line_12,
    chiho_line_13,
    chiho_line_14,
    chiho_line_15,
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
            metro_pavement_stairs,
    platform_fence,
            chiho_tran_line,
            green_concrete_windpanel,
            road_arrow_stopping_approaching,
station_empty,
    station_edge,
            road_parking_halfcross,
            road_parking_halfcross_slab,
            road_single_movelane,
            road_single_movelane_slab,
                   asphalt,
                   asphalt_slab,
        road_straight_line,
            road_slash_double_yellow_line,
            road_slash_double_yellow_line_slab,
        road_straight_double_line,
        road_straight_double_line_slab,
            road_straight_bus_lane,
        road_straight_bus_lane_slab,
            road_crosswalk,
            road_slash_crosswalk,
            road_slash_crosswalk_slab,
        road_crosswalk_slab,
        road_straight_line_slab,
        road_slash_line_slab,
        road_slash_line,
        road_stop_line,
        road_stop_line_slab,
        road_stop_line_slash_out,
        road_stop_line_slash_out_slab,
        road_arrow_t,
        road_arrow_l,
        road_arrow_lt,
        road_arrow_s,
        road_arrow_sl,
        road_arrow_slr,
        road_arrow_sr,
        road_arrow_st,
            station_tactile_paving,
        road_arrow_r,
        road_arrow_rl,
        road_arrow_pedestrain_approaching,
            road_arrow_confluence_r,
            road_arrow_confluence_l,
            road_pedestrian_traffic_light,
    road_stop_line_left,
    road_stop_line_left_slab,
            road_stop_line_right,
    road_stop_line_right_slab,
    road_merge_yellow_line,
            road_merge_yellow_line_slab,
    road_parking_cross,
    road_parking_cross_slab,
                    road_sign_post,
    road_slash_crosswalk_central,
    road_slash_crosswalk_central_slab,
            road_excl_zone_diagonal_in,
            road_excl_zone_diagonal_in_slab,

    road_sign_crossing,
    road_sign_crossing_2,
    road_sign_crossing_3,
    road_sign_crossing_4,
    road_sign_crossing_t1,
    road_sign_crossing_t2,
    road_sign_crossing_t3,
    road_sign_crossing_y,

    road_sign_speed_10,
    road_sign_speed_20,
    road_sign_speed_30,
    road_sign_speed_40,
    road_sign_speed_50,
    road_sign_speed_60,
    road_sign_speed_70,
    road_sign_speed_80,
    road_sign_speed_90,
    road_sign_speed_100,
    road_sign_speed_110,
    road_sign_speed_120,
    road_white_line_25angle,
    road_white_line_25angle_slab,
            road_stop_line_slash_in_1,
            road_stop_line_slash_in_1_slab,
            road_stop_line_slash_in,
            road_stop_line_slash_in_slab,
    road_stop_line_slash_with_yellow,
            road_stop_line_slash_with_yellow_slab,
    white_tunnel_lamp,
    road_excl_zone_split_out_left,
    road_excl_zone_split_out_left_slab,
    road_excl_zone_split_out_right,
    road_excl_zone_split_out_right_slab,
    road_excl_zone,
    road_excl_zone_slab,
    road_excl_zone_line,
    road_excl_zone_line_slab,
            road_excl_zone_diagonal_out,
            road_traffic_light,
            road_traffic_light_green,
            road_traffic_light_red,
            road_traffic_light_yellow,
            road_sign_no_straight,
            road_sign_no_turn_left,
            road_sign_no_turn_right,
            road_sign_straight,
            road_sign_turn_left,
            road_sign_turn_right,
            road_sign_prohibitting_turning_back,
            road_sign_prohibitting,
            road_sign_prohibitting_1,
            road_sign_prohibitting_long_time_stopping,
            road_sign_prohibitting_stopping,
            road_sign_turn_back,
            road_sign_one_way_straight,
            road_block_stop_line_with_white_line,
            road_slash_buslane,
            road_slash_buslane_slab,
            road_block_stop_line_with_white_line_slab,
            road_excl_zone_diagonal_out_slab;

    public static void init() {
        //5th
        road_slash_buslane = new BlockRoadHorizontal("road_slash_buslane");
        road_slash_buslane_slab = new BlockRoadHorizontalSlab("road_slash_buslane_slab");
        road_excl_zone = new BlockRoadExclLine("road_excl_zone");
        road_excl_zone_slab = new BlockRoadExclLineSlab("road_excl_zone_slab");
        road_excl_zone_line = new BlockRoadExclLine("road_excl_zone_line");
        road_excl_zone_line_slab = new BlockRoadExclLineSlab("road_excl_zone_line_slab");
        road_stop_line_slash_in_1 = new BlockRoadHorizontal("road_stop_line_slash_in_1");
        road_stop_line_slash_in_1_slab = new BlockRoadHorizontalSlab("road_stop_line_slash_in_1_slab");
        road_stop_line_slash_in = new BlockRoadHorizontal("road_stop_line_slash_in");
        road_stop_line_slash_in_slab = new BlockRoadHorizontalSlab("road_stop_line_slash_in_slab");
        road_excl_zone_diagonal_in = new BlockRoadExclLine("road_excl_zone_diagonal_in");
        road_excl_zone_diagonal_in_slab = new BlockRoadExclLineSlab("road_excl_zone_diagonal_in_slab");
        road_excl_zone_diagonal_out = new BlockRoadExclLine("road_excl_zone_diagonal_out");
        road_excl_zone_diagonal_out_slab = new BlockRoadExclLineSlab("road_excl_zone_diagonal_out_slab");
        road_stop_line_slash_with_yellow = new BlockRoadHorizontal("road_stop_line_slash_with_yellow");
        road_stop_line_slash_with_yellow_slab = new BlockRoadHorizontalSlab("road_stop_line_slash_with_yellow_slab");
        road_excl_zone_split_out_left = new BlockRoadHorizontal("road_excl_zone_split_out_left");
        road_excl_zone_split_out_left_slab = new BlockRoadHorizontalSlab("road_excl_zone_split_out_left_slab");
        road_excl_zone_split_out_right = new BlockRoadHorizontal("road_excl_zone_split_out_right");
        road_excl_zone_split_out_right_slab = new BlockRoadHorizontalSlab("road_excl_zone_split_out_right_slab");
        //sign
        road_sign_crossing = new BlockRoadSign("road_sign_crossing");
        road_sign_crossing_2 = new BlockRoadSign("road_sign_crossing_2");
        road_sign_crossing_3 = new BlockRoadSign("road_sign_crossing_3");
        road_sign_crossing_4 = new BlockRoadSign("road_sign_crossing_4");
        road_sign_crossing_t1 = new BlockRoadSign("road_sign_crossing_t1");
        road_sign_crossing_t2 = new BlockRoadSign("road_sign_crossing_t2");
        road_sign_crossing_t3 = new BlockRoadSign("road_sign_crossing_t3");
        road_sign_crossing_y = new BlockRoadSign("road_sign_crossing_y");
        road_sign_speed_10 = new BlockRoadSign("road_sign_speed_10");
        road_sign_speed_20 = new BlockRoadSign("road_sign_speed_20");
        road_sign_speed_30 = new BlockRoadSign("road_sign_speed_30");
        road_sign_speed_40 = new BlockRoadSign("road_sign_speed_40");
        road_sign_speed_50 = new BlockRoadSign("road_sign_speed_50");
        road_sign_speed_60 = new BlockRoadSign("road_sign_speed_60");
        road_sign_speed_70 = new BlockRoadSign("road_sign_speed_70");
        road_sign_speed_80 = new BlockRoadSign("road_sign_speed_80");
        road_sign_speed_90 = new BlockRoadSign("road_sign_speed_90");
        road_sign_speed_100 = new BlockRoadSign("road_sign_speed_100");
        road_sign_speed_110 = new BlockRoadSign("road_sign_speed_110");
        road_sign_speed_120 = new BlockRoadSign("road_sign_speed_120");
        road_sign_one_way_straight = new BlockRoadSign("road_sign_one_way_straight");
        road_pedestrian_traffic_light = new BlockRoadSign("road_pedestrian_traffic_light");
        road_sign_no_straight = new BlockRoadSign("road_sign_no_straight");
        road_sign_no_turn_left = new BlockRoadSign("road_sign_no_turn_left");
        road_sign_no_turn_right = new BlockRoadSign("road_sign_no_turn_right");
        road_sign_straight = new BlockRoadSign("road_sign_straight");
        road_sign_turn_left  = new BlockRoadSign("road_sign_turn_left");
        road_sign_turn_right = new BlockRoadSign("road_sign_turn_right");
        road_sign_prohibitting_turning_back = new BlockRoadSign("road_sign_prohibitting_turning_back");
        road_sign_prohibitting= new BlockRoadSign("road_sign_prohibitting");
        road_sign_prohibitting_1 = new BlockRoadSign("road_sign_prohibitting_1");
        road_sign_prohibitting_long_time_stopping = new BlockRoadSign("road_sign_prohibitting_long_time_stopping");
        road_sign_prohibitting_stopping = new BlockRoadSign("road_sign_prohibitting_stopping");
        road_sign_turn_back = new BlockRoadSign("road_sign_turn_back");
        road_traffic_light = new BlockRoadSign("road_traffic_light");
        road_traffic_light_green = new BlockRoadSign("road_traffic_light_green");
        road_traffic_light_red = new BlockRoadSign("road_traffic_light_red");
        road_traffic_light_yellow = new BlockRoadSign("road_traffic_light_yellow");
        road_block_stop_line_with_white_line = new BlockRoadHorizontal("road_block_stop_line_with_white_line");
        road_block_stop_line_with_white_line_slab = new BlockRoadHorizontalSlab("road_block_stop_line_with_white_line_slab");
        //
        station_tactile_paving = new BlockStationPaving("station_tactile_paving");
        asphalt = new BlockRoadAsphalt();
        asphalt_slab = new BlockRoadAsphaltSlab();
        road_arrow_pedestrain_approaching = new ArrowHorizontal("road_arrow_pedestrain_approaching");
        road_arrow_stopping_approaching = new ArrowHorizontal("road_arrow_stopping_approaching");
        road_arrow_l = new ArrowHorizontal("road_arrow_l");
        road_arrow_confluence_r = new ArrowHorizontal("road_arrow_confluence_r");
        road_arrow_confluence_l = new ArrowHorizontal("road_arrow_confluence_l");
        road_parking_halfcross = new BlockRoadHorizontal("road_parking_halfcross");
        road_parking_halfcross_slab = new BlockRoadHorizontalSlab("road_parking_halfcross_slab");
        road_parking_cross = new BlockRoad("road_parking_cross");
        road_parking_cross_slab = new BlockRoadSlab("road_parking_cross_slab");
        road_single_movelane = new BlockRoadHorizontal("road_single_movelane");
        road_single_movelane_slab = new BlockRoadHorizontalSlab("road_single_movelane_slab");
        road_arrow_lt = new ArrowHorizontal("road_arrow_lt");
        road_arrow_t = new ArrowHorizontal("road_arrow_t");
        road_arrow_st = new ArrowHorizontal("road_arrow_st");
        road_arrow_sl = new ArrowHorizontal("road_arrow_sl");
        road_arrow_slr = new ArrowHorizontal("road_arrow_slr");
        road_arrow_sr = new ArrowHorizontal("road_arrow_sr");
        road_arrow_s = new ArrowHorizontal("road_arrow_s");
        road_arrow_r = new ArrowHorizontal("road_arrow_r");
        road_arrow_rl = new ArrowHorizontal("road_arrow_rl");
        road_straight_line = new BlockRoadStraightLine("road_straight_line");
        road_slash_double_yellow_line = new BlockRoadHorizontal("road_slash_double_yellow_line");
        road_slash_double_yellow_line_slab = new BlockRoadHorizontalSlab("road_slash_double_yellow_line_slab");
        road_slash_line = new BlockRoadSlashLine("road_slash_line");
        road_stop_line = new BlockRoadHorizontal("road_stop_line");
        road_stop_line_slab = new BlockRoadHorizontalSlab("road_stop_line_slab");
        road_stop_line_left = new BlockRoadStopLineLeft("road_stop_line_left");
        road_stop_line_left_slab = new BlockRoadStopLineLeftSlab("road_stop_line_left_slab"); 
        road_stop_line_right = new BlockRoadStopLineRight("road_stop_line_right");
        road_stop_line_right_slab = new BlockRoadStopLineRightSlab("road_stop_line_right_slab");
        road_stop_line_slash_out = new BlockRoadHorizontal("road_stop_line_slash_out");
        road_stop_line_slash_out_slab = new BlockRoadHorizontal("road_stop_line_slash_out_slab");
        road_slash_line_slab = new BlockRoadSlashLineSlab("road_slash_line_slab");
        road_crosswalk_slab= new BlockRoadCrosswalkSlab("road_crosswalk_slab");
        road_crosswalk = new BlockRoadCrosswalk("road_crosswalk");
        road_slash_crosswalk = new BlockRoadHorizontal("road_slash_crosswalk");
        road_slash_crosswalk_slab = new BlockRoadHorizontalSlab("road_slash_crosswalk_slab");
        road_slash_crosswalk_central = new BlockRoadHorizontal("road_slash_crosswalk_central");
        road_slash_crosswalk_central_slab = new BlockRoadHorizontalSlab("road_slash_crosswalk_central_slab");
        road_white_line_25angle = new BlockRoadHorizontal("road_white_line_25angle");
        road_white_line_25angle_slab = new BlockRoadHorizontalSlab("road_white_line_25angle_slab");
        road_merge_yellow_line = new BlockRoadHorizontal("road_merge_yellow_line");
        road_merge_yellow_line_slab = new BlockRoadHorizontalSlab("road_merge_yellow_line_slab");
        road_straight_bus_lane_slab= new BlockRoadCrosswalkSlab("road_straight_bus_lane_slab");
        road_straight_bus_lane = new BlockRoadCrosswalk("road_straight_bus_lane");
        road_straight_double_line = new BlockRoadDoubleLine("road_straight_double_line");
        road_straight_line_slab = new BlockRoadStraightLineSlab("road_straight_line_slab");
        road_straight_double_line_slab = new BlockRoadDoubleLineSlab("road_straight_double_line_slab");
        road_sign_post = new BlockRoadPost();
        metro_pavement_stairs = new BlockMPS("metro_pavement_stairs");
        station_empty = new StationBlockEmpty("station_empty");
        station_edge = new StationBlock("station_edge");
        white_tunnel_lamp = new TunnelLamp("white_tunnel_lamp");

        platform_fence = new BlockPlatFormFence();
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
        white_banding_lamp = new BandLamp("white_banding_lamp");
      //  chiho_loop_line = new BlockMetroBlock1("chiho_loop_line");
        chiho_line_1 = new BlockMetroBlock("chiho_line_1");
        chiho_line_2 = new BlockMetroBlock("chiho_line_2");
        chiho_line_3 = new BlockMetroBlock("chiho_line_3");
        chiho_line_4 = new BlockMetroBlock("chiho_line_4");
        chiho_line_5 = new BlockMetroBlock("chiho_line_5");
        chiho_line_6 = new BlockMetroBlock("chiho_line_6");
        chiho_line_7 = new BlockMetroBlock("chiho_line_7");
        chiho_line_8 = new BlockMetroBlock("chiho_line_8");
        chiho_line_9 = new BlockMetroBlock("chiho_line_9");
        chiho_line_10 = new BlockMetroBlock("chiho_line_10");
        chiho_line_11 = new BlockMetroBlock("chiho_line_11");
        chiho_line_12 = new BlockMetroBlock("chiho_line_12");
        chiho_line_13 = new BlockMetroBlock("chiho_line_13");
        chiho_line_14 = new BlockMetroBlock("chiho_line_14");
        chiho_line_15 = new BlockMetroBlock("chiho_line_15");
        node_block = new BlockNodeBlock("node_block");
        light = new BlockLight("light");
        lamp_tran = new BlockTranLight("lamp_tran");
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
        chiho_tran_line = new BlockMetroBlock1("chiho_tran_line");
      //  chiho_airport_line = new BlockMetroBlock1("chiho_airport_line");
      //  chiho_apm_line = new BlockMetroBlock("chiho_apm_line");

    }

    public static void register() {
        registerBlock(lamp_tran, new ItemMultiTexture(CCCBlocks.lamp_tran, CCCBlocks.lamp_tran, new ItemMultiTexture.Mapper() {
                    public String apply(ItemStack p_apply_1_) {
                        return EnumDyeColor.byMetadata(p_apply_1_.getMetadata()).getUnlocalizedName();
                    }
                })
        );
        registerBlock(light, new ItemMultiTexture(CCCBlocks.light, CCCBlocks.light, new ItemMultiTexture.Mapper() {
                    public String apply(ItemStack p_apply_1_) {
                        return EnumDyeColor.byMetadata(p_apply_1_.getMetadata()).getUnlocalizedName();
                    }
                })
        );
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
        registerBlock(white_tunnel_lamp);
        registerBlock(white_punctiform_lamp);
        registerBlock(white_banding_lamp);
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
        registerBlock(metro_fence);
        registerBlock(platform_fence);
        registerBlock(node_block);
        registerBlock(metro_pavement_stairs);
        registerBlock(station_empty);
        registerBlock(station_edge, new ItemMultiTexture(CCCBlocks.station_edge, CCCBlocks.station_edge, new ItemMultiTexture.Mapper() {
                    public String apply(ItemStack p_apply_1_) {
                        return StationBlock.EnumVariant.byMetadata(p_apply_1_.getMetadata()).getUnlocalizedName();
                    }
                })
        );
        registerBlock(station_tactile_paving);
        //road
        registerBlock(asphalt, new ItemMultiTexture(CCCBlocks.asphalt, CCCBlocks.asphalt, new ItemMultiTexture.Mapper() {
                    public String apply(ItemStack p_apply_1_) {
                        return BlockRoadAsphalt.AsphaltType.byMetadata(p_apply_1_.getMetadata()).getUnlocalizedName();
                    }
                })
        );
        registerBlock(asphalt_slab);
        registerBlock(road_straight_line, new ItemMultiTexture(CCCBlocks.road_straight_line, CCCBlocks.road_straight_line, new ItemMultiTexture.Mapper() {
                    public String apply(ItemStack p_apply_1_) {
                        return BlockRoadStraightLine.LineType.byMetadata(p_apply_1_.getMetadata()).getUnlocalizedName();
                    }
                })
        );
        registerBlock(road_straight_line_slab, new ItemMultiTexture(CCCBlocks.road_straight_line_slab, CCCBlocks.road_straight_line_slab, new ItemMultiTexture.Mapper() {
                    public String apply(ItemStack p_apply_1_) {
                        return BlockRoadStraightLineSlab.LineType.byMetadata(p_apply_1_.getMetadata()).getUnlocalizedName();
                    }
                })
        );
        registerBlock(road_slash_line, new ItemMultiTexture(CCCBlocks.road_slash_line, CCCBlocks.road_slash_line, new ItemMultiTexture.Mapper() {
                    public String apply(ItemStack p_apply_1_) {
                        return BlockRoadSlashLine.LineType.byMetadata(p_apply_1_.getMetadata()).getUnlocalizedName();
                    }
                })
        );
        registerBlock(road_slash_line_slab, new ItemMultiTexture(CCCBlocks.road_slash_line_slab, CCCBlocks.road_slash_line_slab, new ItemMultiTexture.Mapper() {
                    public String apply(ItemStack p_apply_1_) {
                        return BlockRoadSlashLineSlab.LineType.byMetadata(p_apply_1_.getMetadata()).getUnlocalizedName();
                    }
                })
        );
        registerBlock(road_straight_double_line);
        registerBlock(road_straight_double_line_slab);
        registerBlock(road_slash_double_yellow_line);
        registerBlock(road_slash_double_yellow_line_slab);
        registerBlock(road_straight_bus_lane);
        registerBlock(road_straight_bus_lane_slab);
        registerBlock(road_slash_buslane);
        registerBlock(road_slash_buslane_slab);        
        registerBlock(road_crosswalk);
        registerBlock(road_crosswalk_slab);
        registerBlock(road_slash_crosswalk_central);
        registerBlock(road_slash_crosswalk_central_slab);
        registerBlock(road_slash_crosswalk);
        registerBlock(road_slash_crosswalk_slab);
        registerBlock(road_single_movelane);
        registerBlock(road_single_movelane_slab);
        registerBlock(road_stop_line);
        registerBlock(road_stop_line_slab);
        registerBlock(road_stop_line_slash_out);
        registerBlock(road_stop_line_slash_out_slab);
        registerBlock(road_stop_line_left, new ItemMultiTexture(CCCBlocks.road_stop_line_left, CCCBlocks.road_stop_line_left, new ItemMultiTexture.Mapper() {
                    public String apply(ItemStack p_apply_1_) {
                        return BlockRoadStopLineLeft.SLTYPE.byMetadata(p_apply_1_.getMetadata()).getUnlocalizedName();
                    }
                })
        );
        registerBlock(road_stop_line_left_slab, new ItemMultiTexture(CCCBlocks.road_stop_line_left_slab, CCCBlocks.road_stop_line_left_slab, new ItemMultiTexture.Mapper() {
                    public String apply(ItemStack p_apply_1_) {
                        return BlockRoadStopLineLeftSlab.SLTYPE.byMetadata(p_apply_1_.getMetadata()).getUnlocalizedName();
                    }
                })
        );
        registerBlock(road_block_stop_line_with_white_line);
        registerBlock(road_block_stop_line_with_white_line_slab);
        registerBlock(road_stop_line_right);
        registerBlock(road_stop_line_right_slab);
        registerBlock(road_stop_line_slash_in);
        registerBlock(road_stop_line_slash_in_slab);
        registerBlock(road_stop_line_slash_in_1);
        registerBlock(road_stop_line_slash_in_1_slab);
        registerBlock(road_stop_line_slash_with_yellow);
        registerBlock(road_stop_line_slash_with_yellow_slab);
        registerBlock(road_merge_yellow_line);
        registerBlock(road_merge_yellow_line_slab);
        registerBlock(road_white_line_25angle);
        registerBlock(road_white_line_25angle_slab);
        registerBlock(road_parking_halfcross);
        registerBlock(road_parking_halfcross_slab);
        registerBlock(road_parking_cross);
        registerBlock(road_parking_cross_slab);
        registerBlock(road_excl_zone, new ItemMultiTexture(CCCBlocks.road_excl_zone, CCCBlocks.road_excl_zone, new ItemMultiTexture.Mapper() {
                    public String apply(ItemStack p_apply_1_) {
                        return BlockRoadExclLine.FlipType.byMetadata(p_apply_1_.getMetadata()).getUnlocalizedName();
                    }
                })
        );
        registerBlock(road_excl_zone_slab, new ItemMultiTexture(CCCBlocks.road_excl_zone_slab, CCCBlocks.road_excl_zone_slab, new ItemMultiTexture.Mapper() {
                    public String apply(ItemStack p_apply_1_) {
                        return BlockRoadExclLineSlab.FlipType.byMetadata(p_apply_1_.getMetadata()).getUnlocalizedName();
                    }
                })
        );       
        registerBlock(road_excl_zone_line, new ItemMultiTexture(CCCBlocks.road_excl_zone_line, CCCBlocks.road_excl_zone_line, new ItemMultiTexture.Mapper() {
                    public String apply(ItemStack p_apply_1_) {
                        return BlockRoadExclLine.FlipType.byMetadata(p_apply_1_.getMetadata()).getUnlocalizedName();
                    }
                })
        );
        registerBlock(road_excl_zone_line_slab, new ItemMultiTexture(CCCBlocks.road_excl_zone_line_slab, CCCBlocks.road_excl_zone_line_slab, new ItemMultiTexture.Mapper() {
                    public String apply(ItemStack p_apply_1_) {
                        return BlockRoadExclLineSlab.FlipType.byMetadata(p_apply_1_.getMetadata()).getUnlocalizedName();
                    }
                })
        );
        registerBlock(road_excl_zone_diagonal_in, new ItemMultiTexture(CCCBlocks.road_excl_zone_diagonal_in, CCCBlocks.road_excl_zone_diagonal_in, new ItemMultiTexture.Mapper() {
                    public String apply(ItemStack p_apply_1_) {
                        return BlockRoadExclLine.FlipType.byMetadata(p_apply_1_.getMetadata()).getUnlocalizedName();
                    }
                })
        );
        registerBlock(road_excl_zone_diagonal_in_slab, new ItemMultiTexture(CCCBlocks.road_excl_zone_diagonal_in_slab, CCCBlocks.road_excl_zone_diagonal_in_slab, new ItemMultiTexture.Mapper() {
                    public String apply(ItemStack p_apply_1_) {
                        return BlockRoadExclLineSlab.FlipType.byMetadata(p_apply_1_.getMetadata()).getUnlocalizedName();
                    }
                })
        );
        registerBlock(road_excl_zone_diagonal_out, new ItemMultiTexture(CCCBlocks.road_excl_zone_diagonal_out, CCCBlocks.road_excl_zone_diagonal_out, new ItemMultiTexture.Mapper() {
                    public String apply(ItemStack p_apply_1_) {
                        return BlockRoadExclLine.FlipType.byMetadata(p_apply_1_.getMetadata()).getUnlocalizedName();
                    }
                })
        );
        registerBlock(road_excl_zone_diagonal_out_slab, new ItemMultiTexture(CCCBlocks.road_excl_zone_diagonal_out_slab, CCCBlocks.road_excl_zone_diagonal_out_slab, new ItemMultiTexture.Mapper() {
                    public String apply(ItemStack p_apply_1_) {
                        return BlockRoadExclLineSlab.FlipType.byMetadata(p_apply_1_.getMetadata()).getUnlocalizedName();
                    }
                })
        );
        registerBlock(road_excl_zone_split_out_left);
        registerBlock(road_excl_zone_split_out_left_slab);
        registerBlock(road_excl_zone_split_out_right);
        registerBlock(road_excl_zone_split_out_right_slab);
        //arrow
        registerBlock(road_arrow_pedestrain_approaching);
        registerBlock(road_arrow_stopping_approaching);
        registerBlock(road_arrow_confluence_l);
        registerBlock(road_arrow_confluence_r);
        registerBlock(road_arrow_l);
        registerBlock(road_arrow_sl);
        registerBlock(road_arrow_r);
        registerBlock(road_arrow_rl);
        registerBlock(road_arrow_s);
        registerBlock(road_arrow_st);
        registerBlock(road_arrow_sr);
        registerBlock(road_arrow_slr);
        registerBlock(road_arrow_t);
        registerBlock(road_arrow_lt);

        //sign
        registerBlock(road_sign_post);
        registerBlock(road_pedestrian_traffic_light);
        registerBlock(road_traffic_light);
        registerBlock(road_traffic_light_green);
        registerBlock(road_traffic_light_red);
        registerBlock(road_traffic_light_yellow);
        registerBlock(road_sign_crossing);
                registerBlock(road_sign_crossing_2);
                registerBlock(road_sign_crossing_3);
                registerBlock(road_sign_crossing_4);
                registerBlock(road_sign_crossing_t1);
                registerBlock(road_sign_crossing_t2);
                registerBlock(road_sign_crossing_t3);
                registerBlock(road_sign_crossing_y);
        registerBlock(road_sign_speed_10);
        registerBlock(road_sign_speed_20);
        registerBlock(road_sign_speed_30);
        registerBlock(road_sign_speed_40);
        registerBlock(road_sign_speed_50);
        registerBlock(road_sign_speed_60);
        registerBlock(road_sign_speed_70);
        registerBlock(road_sign_speed_80);
        registerBlock(road_sign_speed_90);
        registerBlock(road_sign_speed_100);
        registerBlock(road_sign_speed_110);
        registerBlock(road_sign_speed_120);
        registerBlock(road_sign_one_way_straight);
        registerBlock(road_sign_no_straight);
        registerBlock(road_sign_no_turn_left);
        registerBlock(road_sign_no_turn_right);
        registerBlock(road_sign_prohibitting_turning_back);
        registerBlock(road_sign_straight);
        registerBlock(road_sign_turn_left);
        registerBlock(road_sign_turn_right);
        registerBlock(road_sign_turn_back);
        registerBlock(road_sign_prohibitting);
        registerBlock(road_sign_prohibitting_1);
        registerBlock(road_sign_prohibitting_long_time_stopping);
        registerBlock(road_sign_prohibitting_stopping);

        registerBlock(chiho_tran_line, new ItemMultiTexture(CCCBlocks.chiho_tran_line, CCCBlocks.chiho_tran_line, new ItemMultiTexture.Mapper() {
                    public String apply(ItemStack p_apply_1_) {
                        return BlockMetroBlock1.MetroBlock1Type.byMetadata(p_apply_1_.getMetadata()).getUnlocalizedName();
                    }
                })
        );
        registerBlock(chiho_line_1);
        registerBlock(chiho_line_2);
        registerBlock(chiho_line_3);
        registerBlock(chiho_line_4);
        registerBlock(chiho_line_5);
        registerBlock(chiho_line_6);
        registerBlock(chiho_line_7);
        registerBlock(chiho_line_8);
        registerBlock(chiho_line_9);
        registerBlock(chiho_line_10);
        registerBlock(chiho_line_11);
        registerBlock(chiho_line_12);
        registerBlock(chiho_line_13);
        registerBlock(chiho_line_14);
        registerBlock(chiho_line_15);
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
        registerModel(white_tunnel_lamp);
        registerModel(road_slash_buslane);
        registerModel(road_slash_buslane_slab);
        registerModel(road_sign_crossing);
        registerModel(road_sign_crossing_2);
        registerModel(road_sign_crossing_3);
        registerModel(road_sign_crossing_4);
        registerModel(road_sign_crossing_t1);
        registerModel(road_sign_crossing_t2);
        registerModel(road_sign_crossing_t3);
        registerModel(road_sign_crossing_y);
        registerModel(road_sign_one_way_straight);
        registerModel(road_block_stop_line_with_white_line);
        registerModel(road_block_stop_line_with_white_line_slab);
        registerModel(road_stop_line_slash_in_1);
        registerModel(road_stop_line_slash_in_1_slab);
        registerModel(road_stop_line_slash_in);
        registerModel(road_stop_line_slash_in_slab);
        registerModel(road_white_line_25angle);
        registerModel(road_white_line_25angle_slab);
        registerModel(platform_fence);
        registerModel(metro_fence);
        registerModel(metro_pavement_stairs);
        registerModel(station_empty);
        registerModel(station_edge,StationBlock.EnumVariant.LEFT45.getMetadata(), "chihocraftcustomized:station_2");
        registerModel(station_edge,StationBlock.EnumVariant.RIGHT45.getMetadata(), "chihocraftcustomized:station_5");
        registerModel(station_edge,StationBlock.EnumVariant.LEFT.getMetadata(), "chihocraftcustomized:station_3");
        registerModel(station_edge,StationBlock.EnumVariant.RIGHT.getMetadata(), "chihocraftcustomized:station_4");
        registerModel(station_tactile_paving);
        registerModel(road_parking_cross);
        registerModel(road_parking_cross_slab);
        registerModel(road_slash_crosswalk_central);
        registerModel(road_slash_crosswalk_central_slab);
        registerModel(road_stop_line_slash_with_yellow);
        registerModel(road_stop_line_slash_with_yellow_slab);
        registerModel(road_excl_zone,0,"chihocraftcustomized:road_excl_zone");
        registerModel(road_excl_zone,1,"chihocraftcustomized:road_excl_zone_flip");
     //   registerModel(road_excl_zone,0);
     //   registerModel(road_excl_zone,1);
        registerModel(road_excl_zone_slab,0,"chihocraftcustomized:road_excl_zone_slab");
        registerModel(road_excl_zone_slab,1,"chihocraftcustomized:road_excl_zone_flip_slab");
        registerModel(road_excl_zone_line,0,"chihocraftcustomized:road_excl_zone_line");
        registerModel(road_excl_zone_line,1,"chihocraftcustomized:road_excl_zone_line_flip");
        registerModel(road_excl_zone_line_slab,0,"chihocraftcustomized:road_excl_zone_line_slab");
        registerModel(road_excl_zone_line_slab,1,"chihocraftcustomized:road_excl_zone_line_flip_slab");
        registerModel(road_excl_zone_diagonal_in,0,"chihocraftcustomized:road_excl_zone_diagonal_in");
        registerModel(road_excl_zone_diagonal_in,1,"chihocraftcustomized:road_excl_zone_diagonal_in_flip");
        registerModel(road_excl_zone_diagonal_in_slab,0,"chihocraftcustomized:road_excl_zone_diagonal_in_slab");
        registerModel(road_excl_zone_diagonal_in_slab,1,"chihocraftcustomized:road_excl_zone_diagonal_in_flip_slab");   
        registerModel(road_excl_zone_diagonal_out,0,"chihocraftcustomized:road_excl_zone_diagonal_out");
        registerModel(road_excl_zone_diagonal_out,1,"chihocraftcustomized:road_excl_zone_diagonal_out_flip");
        registerModel(road_excl_zone_diagonal_out_slab,0,"chihocraftcustomized:road_excl_zone_diagonal_out_slab");
        registerModel(road_excl_zone_diagonal_out_slab,1,"chihocraftcustomized:road_excl_zone_diagonal_out_flip_slab");
        registerModel(road_excl_zone_split_out_left);
        registerModel(road_excl_zone_split_out_left_slab);
        registerModel(road_excl_zone_split_out_right);
        registerModel(road_excl_zone_split_out_right_slab);
        registerModel(road_sign_speed_10);
        registerModel(road_sign_speed_20);
        registerModel(road_sign_speed_30);
        registerModel(road_sign_speed_40);
        registerModel(road_sign_speed_50);
        registerModel(road_sign_speed_60);
        registerModel(road_sign_speed_70);
        registerModel(road_sign_speed_80);
        registerModel(road_sign_speed_90);
        registerModel(road_sign_speed_100);
        registerModel(road_sign_speed_110);
        registerModel(road_sign_speed_120);
        registerModel(road_pedestrian_traffic_light);
        registerModel(road_single_movelane);
        registerModel(road_single_movelane_slab);
        registerModel(road_parking_halfcross);
        registerModel(road_parking_halfcross_slab);
        registerModel(road_stop_line);
        registerModel(road_stop_line_slab);
        registerModel(road_stop_line_slash_out);
        registerModel(road_stop_line_slash_out_slab);
        registerModel(black_flat_lamp);
        registerModel(white_flat_lamp);
        registerModel(blue_flat_lamp);
        registerModel(cyan_flat_lamp);
        registerModel(brown_flat_lamp);
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
        registerModel(white_banding_lamp);
        registerModel(chiho_line_1);
        registerModel(chiho_line_2);
        registerModel(chiho_line_3);
        registerModel(chiho_line_4);
        registerModel(chiho_line_5);
        registerModel(chiho_line_6);
        registerModel(chiho_line_7);
        registerModel(chiho_line_8);
        registerModel(chiho_line_9);
        registerModel(chiho_line_10);
        registerModel(chiho_line_15);
        registerModel(node_block);
        registerModel(road_sign_no_straight);
        registerModel(road_sign_no_turn_left);
        registerModel(road_sign_no_turn_right);
        registerModel(road_sign_prohibitting_turning_back);
        registerModel(road_sign_straight);
        registerModel(road_sign_turn_left);
        registerModel(road_sign_turn_right);
        registerModel(road_sign_turn_back);
        registerModel(road_sign_prohibitting);
        registerModel(road_sign_prohibitting_1);
        registerModel(road_sign_prohibitting_long_time_stopping);
        registerModel(road_sign_prohibitting_stopping);
        registerModel(road_arrow_l);
        registerModel(road_arrow_sl);
        registerModel(road_arrow_r);
        registerModel(road_arrow_rl);
        registerModel(road_arrow_s);
        registerModel(road_arrow_st);
        registerModel(road_arrow_sr);
        registerModel(road_arrow_slr);
        registerModel(road_arrow_t);
        registerModel(road_arrow_lt);
        registerModel(road_arrow_stopping_approaching);
        registerModel(road_arrow_pedestrain_approaching);
        registerModel(road_arrow_confluence_l);
        registerModel(road_arrow_confluence_r);
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
        registerModel(chiho_line_11);
        registerModel(chiho_line_12);
        registerModel(chiho_line_13);
        registerModel(chiho_line_14);

        registerModel(road_sign_post);
        registerModel(road_traffic_light);
        registerModel(road_traffic_light_green);
        registerModel(road_traffic_light_red);
        registerModel(road_traffic_light_yellow);

        registerModel(lamp_tran, EnumDyeColor.WHITE.getMetadata(),"chihocraftcustomized:lamp_tran_0");
        registerModel(lamp_tran, EnumDyeColor.BLACK.getMetadata(),"chihocraftcustomized:lamp_tran_1");
        registerModel(lamp_tran, EnumDyeColor.YELLOW.getMetadata(),"chihocraftcustomized:lamp_tran_2");
        registerModel(lamp_tran, EnumDyeColor.RED.getMetadata(),"chihocraftcustomized:lamp_tran_3");
        registerModel(lamp_tran, EnumDyeColor.GREEN.getMetadata(),"chihocraftcustomized:lamp_tran_4");
        registerModel(lamp_tran, EnumDyeColor.BLUE.getMetadata(),"chihocraftcustomized:lamp_tran_blue");
        registerModel(lamp_tran, EnumDyeColor.BROWN.getMetadata(),"chihocraftcustomized:lamp_tran_brown");
        registerModel(lamp_tran, EnumDyeColor.GRAY.getMetadata(),"chihocraftcustomized:lamp_tran_gray");
        registerModel(lamp_tran, EnumDyeColor.LIGHT_BLUE.getMetadata(),"chihocraftcustomized:lamp_tran_light_blue");
        registerModel(lamp_tran, EnumDyeColor.LIME.getMetadata(),"chihocraftcustomized:lamp_tran_lime");
        registerModel(lamp_tran, EnumDyeColor.SILVER.getMetadata(),"chihocraftcustomized:lamp_tran_silver");
        registerModel(lamp_tran, EnumDyeColor.MAGENTA.getMetadata(),"chihocraftcustomized:lamp_tran_magenta");
        registerModel(lamp_tran, EnumDyeColor.PURPLE.getMetadata(),"chihocraftcustomized:lamp_tran_purple");
        registerModel(lamp_tran, EnumDyeColor.ORANGE.getMetadata(),"chihocraftcustomized:lamp_tran_orange");
        registerModel(lamp_tran, EnumDyeColor.PINK.getMetadata(),"chihocraftcustomized:lamp_tran_pink");
        registerModel(lamp_tran, EnumDyeColor.CYAN.getMetadata(),"chihocraftcustomized:lamp_tran_cyan");
        registerModel(light, EnumDyeColor.WHITE.getMetadata(),"chihocraftcustomized:lamp_white");
        registerModel(light, EnumDyeColor.BLACK.getMetadata(),"chihocraftcustomized:lamp_black");
        registerModel(light, EnumDyeColor.YELLOW.getMetadata(),"chihocraftcustomized:lamp_yellow");
        registerModel(light, EnumDyeColor.RED.getMetadata(),"chihocraftcustomized:lamp_red");
        registerModel(light, EnumDyeColor.GREEN.getMetadata(),"chihocraftcustomized:lamp_green");
        registerModel(light, EnumDyeColor.BLUE.getMetadata(),"chihocraftcustomized:lamp_blue");
        registerModel(light, EnumDyeColor.BROWN.getMetadata(),"chihocraftcustomized:lamp_brown");
        registerModel(light, EnumDyeColor.GRAY.getMetadata(),"chihocraftcustomized:lamp_gray");
        registerModel(light, EnumDyeColor.LIGHT_BLUE.getMetadata(),"chihocraftcustomized:lamp_light_blue");
        registerModel(light, EnumDyeColor.LIME.getMetadata(),"chihocraftcustomized:lamp_lime");
        registerModel(light, EnumDyeColor.SILVER.getMetadata(),"chihocraftcustomized:lamp_silver");
        registerModel(light, EnumDyeColor.MAGENTA.getMetadata(),"chihocraftcustomized:lamp_magenta");
        registerModel(light, EnumDyeColor.PURPLE.getMetadata(),"chihocraftcustomized:lamp_purple");
        registerModel(light, EnumDyeColor.ORANGE.getMetadata(),"chihocraftcustomized:lamp_orange");
        registerModel(light, EnumDyeColor.PINK.getMetadata(),"chihocraftcustomized:lamp_pink");
        registerModel(light, EnumDyeColor.CYAN.getMetadata(),"chihocraftcustomized:lamp_cyan");

        registerModel(chiho_tran_line, BlockMetroBlock1.MetroBlock1Type.LOOP.getMetadata(), "chihocraftcustomized:chiho_loop_line");
        registerModel(chiho_tran_line, BlockMetroBlock1.MetroBlock1Type.AIRPORT.getMetadata(), "chihocraftcustomized:chiho_airport_line");
        registerModel(chiho_tran_line, BlockMetroBlock1.MetroBlock1Type.APM.getMetadata(), "chihocraftcustomized:chiho_apm_line");

        registerModel(asphalt, BlockRoadAsphalt.AsphaltType.BLACK.getMetadata(), "chihocraftcustomized:black_asphalt");
        registerModel(asphalt, BlockRoadAsphalt.AsphaltType.YELLOW.getMetadata(), "chihocraftcustomized:yellow_asphalt");
        registerModel(asphalt, BlockRoadAsphalt.AsphaltType.WHITE.getMetadata(), "chihocraftcustomized:white_asphalt");

        registerModel(asphalt_slab);

        registerModel(road_straight_double_line);
        registerModel(road_straight_double_line_slab);
        registerModel(road_slash_double_yellow_line);
        registerModel(road_slash_double_yellow_line_slab);

        registerModel(road_straight_line, BlockRoadStraightLine.LineType.YELLOW.getMetadata(), "chihocraftcustomized:road_straight_line_yellow");
        registerModel(road_straight_line, BlockRoadStraightLine.LineType.WHITE.getMetadata(), "chihocraftcustomized:road_straight_line_white");

        registerModel(road_straight_line_slab, BlockRoadStraightLineSlab.LineType.YELLOW.getMetadata(), "chihocraftcustomized:road_straight_line_slab_yellow");
        registerModel(road_straight_line_slab, BlockRoadStraightLineSlab.LineType.WHITE.getMetadata(), "chihocraftcustomized:road_straight_line_slab_white");


        registerModel(road_slash_line, BlockRoadSlashLine.LineType.YELLOW.getMetadata(), "chihocraftcustomized:road_slash_line_yellow");
        registerModel(road_slash_line, BlockRoadSlashLine.LineType.WHITE.getMetadata(), "chihocraftcustomized:road_slash_line_white");

        registerModel(road_slash_line_slab, BlockRoadSlashLineSlab.LineType.YELLOW.getMetadata(), "chihocraftcustomized:road_slash_line_slab_yellow");
        registerModel(road_slash_line_slab, BlockRoadSlashLineSlab.LineType.WHITE.getMetadata(), "chihocraftcustomized:road_slash_line_slab_white");        
        
         registerModel(road_stop_line_left, 0, "chihocraftcustomized:road_stop_line_left");
          registerModel(road_stop_line_left, BlockRoadStopLineLeft.SLTYPE.LEFT1.getMetadata(), "chihocraftcustomized:road_stop_line_left1");

          registerModel(road_stop_line_left);
          registerModel(road_stop_line_left_slab);

           registerModel(road_stop_line_left_slab, 0, "chihocraftcustomized:road_stop_line_left_slab");
          registerModel(road_stop_line_left_slab, BlockRoadStopLineLeftSlab.SLTYPE.LEFT1.getMetadata(), "chihocraftcustomized:road_stop_line_left1_slab");

        registerModel(road_straight_bus_lane);
        registerModel(road_straight_bus_lane_slab);
        registerModel(road_crosswalk);
        registerModel(road_crosswalk_slab);
        registerModel(road_slash_crosswalk);
        registerModel(road_slash_crosswalk_slab);
        registerModel(road_stop_line_right);
        registerModel(road_stop_line_right_slab);
        registerModel(road_merge_yellow_line);
        registerModel(road_merge_yellow_line_slab);
    }

    @SideOnly(Side.CLIENT)
    private static void registerModel(Block block,int subtype, String name) {
        ModelResourceLocation model = new ModelResourceLocation(name, "inventory");
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), subtype, model);
    }

    @SideOnly(Side.CLIENT)
    private static void registerModel(Block block,int subtype) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), subtype, new ModelResourceLocation(block.getRegistryName(), "inventory"));
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
