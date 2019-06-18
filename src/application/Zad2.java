package application;
import java.util.ArrayList;
import java.util.Scanner;
public class Zad2 
{
	ArrayList<Integer> tablica = new ArrayList<Integer>();
	String znak = null;
	public Zad2() {
	}

	public void start() 
	{
		System.out.println("Wprowadz ciag znakow");
		Scanner input = new Scanner(System.in);
		this.znak = input.nextLine();
		Character[] tabZnak = toChar(znak);
		int licznik = 0;
		int flaga = 0;
		for (int i = 0; i < tabZnak.length; i++) {
			if (tabZnak[i] != '1' && tabZnak[i] != '0') {
				flaga = 1;
			}
		}
		if (flaga == 1) 
		{
			System.out.println("Bledny ciag binarny!");
		} 
		else 
		{
			for (int i = 0; i < tabZnak.length; i++) {
				if (i > 0) {
					if (tabZnak[i] == '0') {
						if (tabZnak[i - 1] == '1') {
							licznik++;
						}
					}
				}
			}
			System.out.println("Liczba dziur: " + licznik);
		}
	}

	public static Character[] toChar(String str)
	{
		if (str == null)
			return null;

		Character[] chars = new Character[str.length()];

		for (int i = 0; i < str.length(); i++)
			chars[i] = str.charAt(i);

		return chars;
	}

}
