package application;
import java.util.ArrayList;
import java.util.Scanner;
public class Zad1 {
	ArrayList<Integer> tab1= new ArrayList<Integer>();
	String znak = null;
	public Zad1() {
	}
	public void start()
	{
		try
		{
			System.out.println("Wprowadz pierwsza liczbe (next aby przejsc do kolejnego zadania)");
			Scanner liczba = new Scanner(System.in);
			this.znak = liczba.nextLine();
			this.tab1.add(Integer.valueOf(this.znak));
			while(!this.znak.equals("next"))
			{
				System.out.println("Wprowadz kolejna liczbe");
				liczba = new Scanner(System.in);
				this.znak = liczba.nextLine();
				boolean flaga = true;
				for(int i = 0; i<this.tab1.size() ; i++)
				{
					if (Integer.valueOf(this.znak)==this.tab1.get(i))
					{
						flaga = false;
						break;
					}
				}
				if(flaga == true)
				{
					this.tab1.add(Integer.valueOf(this.znak));
				}
				System.out.println(flaga);
			
			System.out.println("Liczba unikatowych wartosci to: "+this.tab1.size());
			for(int i = 0; i<this.tab1.size() ; i++)
			{
				System.out.println(this.tab1.get(i));
			}
			}
		}
		catch(NumberFormatException e)
		{
			System.out.println("zla zmienna");
		}
		
	}
}
