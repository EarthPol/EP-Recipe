package com.earthpol.recipes;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.BrewEvent;

public class CraftingNerfs implements Listener {
	
	@EventHandler
	public static void getBrewingEvent(BrewEvent e) {
		if(e.getContents().contains(Material.GLISTERING_MELON_SLICE)) {
			e.setCancelled(true);
		} else if(e.getContents().contains(Material.BLAZE_POWDER)) {
			e.setCancelled(true);
		}
	}

}
