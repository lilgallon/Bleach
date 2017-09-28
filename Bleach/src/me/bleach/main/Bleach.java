package me.bleach.main;

//This file is part of the Bleach MC AntiCheat.
//
//Bleach MC AntiCheat is free software: you can redistribute it and/or modify
//it under the terms of the GNU General Public License as published by
//the Free Software Foundation, either version 3 of the License, or
//(at your option) any later version.
//
//Bleach MC AntiCheat is distributed in the hope that it will be useful,
//but WITHOUT ANY WARRANTY; without even the implied warranty of
//MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//GNU General Public License for more details.
//
//You should have received a copy of the GNU General Public License
//along with Bleach MC AntiCheat.  If not, see <http://www.gnu.org/licenses/>.
//Author(s) : Lilian Gallon (N3RO)

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

import me.bleach.command.CommandManager;
import me.bleach.events.PlayerListener;
import me.bleach.utils.Logger;

public class Bleach extends JavaPlugin {

		private Logger logger = new Logger();
		
		
		public void onEnable(){
			logger.write("Starting the plugin.");
			
			this.getCommand("test").setExecutor((CommandExecutor)new CommandManager());
			
			new PlayerListener(this);
		}
		
		public void onDisable(){
			logger.write("Shutting down the plugin.");
		}
}
