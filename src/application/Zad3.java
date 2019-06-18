package application;

import java.util.ArrayList;
import java.util.Scanner;

public class Zad3 {
	private ArrayList<Integer> z1 = new ArrayList<Integer>();
	private ArrayList<Integer> z2 = new ArrayList<Integer>();
	String noon=null;
	
	public void start()
	{
		try{
		System.out.println("Zad 3: ");
		System.out.println("Zbiór 1(wpisz next, by przejœæ do nastêpnego zbioru): ");
		Scanner x = new Scanner(System.in);
		this.noon = x.nextLine();
		while(!this.noon.equals("next"))
		{
			this.z1.add(Integer.valueOf(this.noon));
			x = new Scanner(System.in);
			this.noon = x.nextLine();
		}
		x = new Scanner(System.in);
		this.noon = x.nextLine();
		while(!this.noon.equals("next"))
		{			
			this.z2.add(Integer.valueOf(this.noon));
			x = new Scanner(System.in);
			this.noon = x.nextLine();
		}		
		
		
		System.out.println("Suma zbiorow 1 i 2: ");
		ArrayList<Integer> suma = new ArrayList<Integer>();
		for(int i =0; i<this.z1.size(); i++)
		{
			suma.add(this.z1.get(i));
		}
		boolean czy = false;
		for(int i = 0; i<this.z2.size(); i++)
		{
			for(int j =0; j<suma.size(); j++)
			{
				if(this.z2.get(i)==suma.get(j))
				{
					czy = true;
				}
			}
			if(czy == false)
			{
				suma.add(this.z2.get(i));				
			}
			czy = false;
		}
		for(int i =0; i<suma.size(); i++)
		{
			System.out.print(suma.get(i)+", ");
		}
				
		System.out.println("\nkl zbiorow 1 - 2: ");
		ArrayList<Integer> kl = new ArrayList<Integer>();
		for(int i=0; i<z1.size(); i++)
		{
			kl.add(this.z1.get(i));
		}
		for(int i=0; i<kl.size(); i++)
		{
			for(int j=0; j<this.z2.size(); j++)
			{
				if(kl.get(i)==this.z2.get(j))
				{
					czy = true;
				}
			}
			if(czy == true)
			{
				kl.remove(i);
				czy = false;
				i--;
			}
			
		}
		czy = false;
		for(int i =0; i<kl.size(); i++)
		{
			System.out.print(kl.get(i)+", ");
		}
		
		
		System.out.println("\nCzesc wspolna zbiorow 1 i 2: ");
		ArrayList<Integer> y = new ArrayList<Integer>();
		for(int i=0; i<z1.size(); i++)
		{
			y.add(this.z1.get(i));
		}
		for(int i=0; i<y.size(); i++)
		{
			for(int j=0; j<z2.size(); j++)
			{
				if(y.get(i)==this.z2.get(j))
				{
					czy = true;
				}
			}
			if(czy == false)
			{
				y.remove(i);
				i--;
			}
			czy = false;
		}
		for(int i = 0; i<y.size(); i++)
		{
			System.out.print(y.get(i)+", ");
		}
		
		System.out.println("\nroznica symetrii zbiorow 1 i 2: ");
		ArrayList<Integer> z = new ArrayList<Integer>();
		for(int i=0; i<z1.size(); i++)
		{
			z.add(this.z1.get(i));
		}
		for(int i=0; i<z2.size(); i++)
		{
			z.add(this.z2.get(i));
		}
		for(int i=0; i<z.size(); i++)
		{
			for(int j=0; j<y.size(); j++)
			{
				if(z.get(i)==y.get(j))
				{
					czy = true;
				}
			}
			if(czy == true)
			{
				z.remove(i);
				czy = false;
				i--;
			}
			
		}
		for(int i =0; i<z.size(); i++)
		{
			System.out.print(z.get(i)+", ");
		}
		}
		catch(NumberFormatException e)
		{
			System.out.println("bledne wartosci!");
		}
		
	}

}