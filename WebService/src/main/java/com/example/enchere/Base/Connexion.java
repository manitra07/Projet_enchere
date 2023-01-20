package com.example.enchere.Base;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connexion {
	private static String url = "jdbc:postgresql://containers-us-west-73.railway.app:7117/railway";
    private static String user="postgres";
    private static String passwd = "VD0XBBer54mRfm5WwIrw";
	private  Connection connect;
	public  Connection setConnect()
	{
		if (connect == null) {
            try {
                connect = DriverManager.getConnection(url, user, passwd);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return connect;
	}
}
