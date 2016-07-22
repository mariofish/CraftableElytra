package com.mariofish.craftableelytra.proxy;

import com.mariofish.craftableelytra.init.CraftableElytraItems;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenders() {
			CraftableElytraItems.registerRenders();
	}
}
