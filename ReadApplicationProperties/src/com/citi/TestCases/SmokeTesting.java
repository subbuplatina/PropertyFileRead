package com.citi.TestCases;

import com.citi.utilities.ConfigFileReader;

public class SmokeTesting {

	public static void main(String[] args) {
		ConfigFileReader configFile = new ConfigFileReader();
		System.out.println(configFile.getApplicationUrl());
		System.out.println(configFile.getUserName());

	}

}
