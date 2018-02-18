package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

import dao.IDataFromBase;
import service.ICalculateur;

public class Main {

	public static void main(String[] args) {
		
		ICalculateur calculateur ;
		IDataFromBase data;
		
		//lecture d'un fichier texte, où on trouve les classe à instancier
		Scanner sc;
		try {
			sc = new Scanner(new File("properties.txt"));
			String daoClassName = sc.next();
			String serviceClassName = sc.next();
			
			//instanciation dynamique
			Class cDao = Class.forName(daoClassName);
			data = (IDataFromBase) cDao.newInstance();
			
			
			Class cService = Class.forName(serviceClassName);
			calculateur = (ICalculateur) cService.newInstance();
			
			//couplage de calculateur et data
			Method mService = cService.getMethod("setData", new Class[]{IDataFromBase.class});
			mService.invoke(calculateur, new Object[]{data});
			
			System.out.println(calculateur.convertTemperature());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
