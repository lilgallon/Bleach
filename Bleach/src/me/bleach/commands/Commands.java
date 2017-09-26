package me.bleach.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor{

	// sender: entity that sent the command (player in game or console)
	// cmd: 
	// label:
	// args:
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		if(sender instanceof Player)
		{
			Player player = (Player) sender;
			player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&6It works"));
		}
		else
		{
			sender.sendMessage("you are in the console");
		}
		
		return true;
	}
	
}
