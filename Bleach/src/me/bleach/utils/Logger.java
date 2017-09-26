package me.bleach.utils;

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
