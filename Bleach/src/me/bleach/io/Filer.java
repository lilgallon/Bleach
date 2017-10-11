package me.bleach.io;

import java.io.*;
import java.util.ArrayList;

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


// TODO:
// For the moment it is a basic .txt reader / writer
// Should change to better solution (csv / json ?)

public class Filer
{
	private String file_name;
	private File path;
	
	public Filer(String fileName, String clientName)
	{
		fileName = fileName + ".txt";
		this.file_name = fileName;
		// TODO: Define the data directory
		//this.path = new File(<DATA DIRECTORY>);
		if (!path.exists())
		{
			try {
				path.mkdir();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public final ArrayList<String> read() throws Exception
	{
		ArrayList<String> list = new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new DataInputStream(new FileInputStream(new File(path, file_name).getAbsolutePath()))));
			while(true)
			{
				String text = br.readLine();
				if (text != null)
					list.add(text.trim());
				else
					break;
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public void write(String text)
	{
		write(new String[]{text});
	}
	
	public void write(String[] text)
	{
		if (text == null || text.length == 0 || text[0].trim() == "")
			return;
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(path, file_name), true));
			for (String line: text)
			{
				bw.write(line);
				bw.write("\r\n");
			}
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void remove(int line)
	{
		ArrayList<String> file = new ArrayList<>();
		try{
			file = read();
		}catch (Exception e){

		}
		if (file.size() < line)
			return;
		clear();
		int loop = 1;
		for (String text: file)
		{
			if (loop != line)
				write(text);
			loop++;
		}
	}
	
	public void clear()
	{
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(path, file_name)));
			bw.write("");
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}