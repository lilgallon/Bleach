package me.bleach.utils;

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

public class Logger {
	private boolean should_output;
    private static final String prefix = "[Bleach]";
    
	public Logger(){
		this.should_output = true;
	}
	
	public void write(String line){
		if(should_output)
			System.out.println(prefix + " " + line);
	}
	
	public void shouldOutput(boolean should_output){
		this.should_output = should_output;
	}
}
