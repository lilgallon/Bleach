package me.bleach.events;

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

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

import me.bleach.main.Bleach;

public class PlayerListener implements Listener{
	
	public PlayerListener(Bleach plugin){
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	
	@EventHandler
	public void onPlayerLoginEvent(PlayerLoginEvent event){
		// TODO
		// Register the user if he isn't in the database (the file)
		// Then, load it into the current playing database (the one that is used in the code)
	}
	
}
