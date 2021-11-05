package com.helper;

import java.io.IOException;

import com.config.Configuration_Reader;

import net.bytebuddy.utility.privilege.GetSystemPropertyAction;

public class File_Reader_Manager {
	
	private File_Reader_Manager() {
	}
	
	public static File_Reader_Manager getinstance_FRM() {
File_Reader_Manager frm = new File_Reader_Manager();
return frm;
	}
	
	public Configuration_Reader getinstance_CR() throws Throwable {
		Configuration_Reader cr = new Configuration_Reader();
		return cr;
	}

}
