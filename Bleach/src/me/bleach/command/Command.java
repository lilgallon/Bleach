package me.bleach.command;

import org.bukkit.command.CommandSender;

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

public abstract class Command{
	public abstract String getAlias(); // Name of the command
	public abstract String getDescription(); // Description of the command (what it does)
	public abstract String getSyntax(); // Usage of the command (how to use)
	public abstract boolean onCommand(String command, String[] args, CommandSender sender); // called when the op writes a command
}
