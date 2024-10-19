package com.chihocraft.chihocraftcustomized.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemZhongNan extends ItemFood {

    public ItemZhongNan() {
        super(10, 1.2F, false);
        setCreativeTab(CreativeTabs.FOOD);
        this.setAlwaysEdible();
    }

    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack stack)
    {
        return super.hasEffect(stack) || stack.getMetadata() > 0;
    }

    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        if (!worldIn.isRemote) {
                player.addPotionEffect(new PotionEffect(MobEffects.LUCK, 114514, 3));
                player.addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, 45, 10));
        }
    }
    }


