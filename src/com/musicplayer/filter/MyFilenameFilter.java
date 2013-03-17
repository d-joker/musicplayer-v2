package com.musicplayer.filter;

import java.io.File;
import java.io.FilenameFilter;

public class MyFilenameFilter implements FilenameFilter {
	

	@Override
	public boolean accept(File dir, String filename) {
		// TODO Auto-generated method stub
		
		return (filename.endsWith(".mp3") || filename.endsWith(".wma"));
	}

}
