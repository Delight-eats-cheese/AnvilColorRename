package com.delight.anvilcolorrename;

import org.bukkit.ChatColor;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareAnvilEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class AnvilColorRenameListener implements Listener {
    
    //Constructor
    public AnvilColorRenameListener(Main plugin) {
        
    }

    //EventHandler
    @EventHandler
    public void onPlayerRenameItem(PrepareAnvilEvent event){
    		final HumanEntity p = event.getViewers().get(0);
    		if (p.hasPermission("anvilcolorrename.use")) {
            if(event.getResult() != null && event.getResult().hasItemMeta() && event.getInventory().getRenameText() != ""){
                ItemStack result = event.getResult();
                ItemMeta resultMeta = result.getItemMeta();
                String nameColored = ChatColor.translateAlternateColorCodes('&', event.getInventory().getRenameText());
                resultMeta.setDisplayName(nameColored);
                result.setItemMeta(resultMeta);
            } return;
            } else return;
    }
}