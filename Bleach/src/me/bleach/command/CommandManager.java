package me.bleach.command;

import java.util.ArrayList;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import me.bleach.commands.Help;

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



public class CommandManager implements CommandExecutor{

	private ArrayList<Command> commands = new ArrayList<Command>();
	
	public CommandManager(){
		commands.add(new Help());
	}
	
	// sender: entity that sent the command (player in game or console)
	// cmd: Command class (bukkit) -> I use mine
	// label: command name
	// args: arguments of the command
	@Override
	public boolean onCommand(CommandSender sender, org.bukkit.command.Command cmd, String label, String[] args) {
		
		boolean is_valid = false;
		
		for(Command c: this.commands){
			if(c.getAlias().equalsIgnoreCase(label)){
					is_valid = c.onCommand(label, args, sender);
			}
		}
		
		return is_valid;
	}
}
