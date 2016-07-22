package com.mariofish.craftableelytra;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.mariofish.craftableelytra.init.CraftableElytraItems;
import com.mariofish.craftableelytra.proxy.CommonProxy;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class CraftableElytra {
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		CraftableElytraItems.init();
		CraftableElytraItems.register();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
        GameRegistry.addRecipe(new ItemStack(Items.field_185160_cR), new Object[] { "WW",('W'), CraftableElytraItems.elytra_wing});
        GameRegistry.addRecipe(new ItemStack(CraftableElytraItems.elytra_wing), new Object[] { " FP", "FPE",  "FPS", ('F'), Items.field_151008_G, ('P'), Items.field_151121_aF, ('E'), Items.field_151166_bC, Character.valueOf('S'), Items.field_151007_F });
        GameRegistry.addRecipe(new ItemStack(CraftableElytraItems.elytra_wing), new Object[] { "PF ", "EPF", "SPF", ('F'), Items.field_151008_G, ('P'), Items.field_151121_aF, ('E'), Items.field_151166_bC, Character.valueOf('S'), Items.field_151007_F });

		proxy.registerRenders();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
