package me.bleach.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.bleach.command.Command;

public class Help extends Command{

	private final String alias = "help";
	
	@Override
	public String getAlias() {
		return this.alias;
	}

	@Override
	public String getDescription() {
		return "Gives the commands of the Bleach AC";
	}

	@Override
	public String getSyntax() {
		return "/"+getAlias();
	}

	@Override
	public boolean onCommand(String command, String[] args, CommandSender sender){
		boolean is_valid = true;
		
		// Check who is the sender, in this case, help works whenever the sender is the console or the player.
		if(sender instanceof Player)
		{
			Player player = (Player) sender;
			player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&6Help command working"));
		}
		else
		{
			sender.sendMessage("Help command working");
		}
		
		sender.sendMessage("");
		
		return is_valid;
	}

}
