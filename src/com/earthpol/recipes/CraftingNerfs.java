package com.earthpol.recipes;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.BrewEvent;

public class CraftingNerfs implements Listener {
	
	@EventHandler
	public static void onBrewEvent(BrewEvent e) {
		Material potion = e.getContents().getIngredient().getType();
		if(potion == Material.BLAZE_POWDER || potion == Material.GLISTERING_MELON_SLICE) {
			e.setCancelled(true);
		}
	}

}
