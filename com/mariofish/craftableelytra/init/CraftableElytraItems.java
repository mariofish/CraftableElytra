package com.mariofish.craftableelytra.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.mariofish.craftableelytra.Reference;
import com.mariofish.craftableelytra.CraftableElytra;
import com.mariofish.craftableelytra.items.ItemElytraWing;

public class CraftableElytraItems {
	
	public static Item elytra_wing;
	
	public static void init() {
		elytra_wing = new ItemElytraWing().func_77655_b("elytra_wing").func_77637_a(CreativeTabs.field_78035_l);
	}
	
	public static void register()
	{
		GameRegistry.registerItem(elytra_wing, elytra_wing.func_77658_a().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(elytra_wing);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.func_71410_x().func_175599_af().func_175037_a().func_178086_a(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.func_77658_a().substring(5), "inventory"));
		}
}
