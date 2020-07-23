package com.delight.anvilcolorrename;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
    @Override
    public void onEnable() {
    	
    	PluginManager pm = getServer().getPluginManager();
    	AnvilColorRenameListener listener = new AnvilColorRenameListener(this);
    	pm.registerEvents(listener, this);
    	
    }
	
	@Override
	public void onDisable() {
		
	}

}
