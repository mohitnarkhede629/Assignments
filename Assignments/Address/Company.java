package com.te.inheritance.assi;

import java.util.Scanner;

public class Company {
    public static void main(String[] args) {
		System.out.println("please select place /n1-home/n2-Office/n3-village");
    	Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		Emp emp=new Emp();
    	switch (a) {
		case 1:{
		     Home home=new Home("Sai baba pg","jpnagar");
			home.Address();	
			break;
		}
		case 2:{
			Office office=new Office("TEchno elevate","Jayanagar");
			office.Address();
		}
		case 3:{
			Village village=new Village("Patharad","patharad");
			village.Address();
		}

		default:
			break;
		}
	}
}
