package me.bleach.main;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

import me.bleach.commands.Commands;
import me.bleach.utils.Logger;

public class Bleach extends JavaPlugin {

		private Logger logger = new Logger();
		
		
		public void onEnable(){
			logger.write("Starting the plugin.");
			
			this.getCommand("test").setExecutor((CommandExecutor)new Commands());
		}
		
		public void onDisable(){
			logger.write("Shutting down the plugin.");
		}
}
