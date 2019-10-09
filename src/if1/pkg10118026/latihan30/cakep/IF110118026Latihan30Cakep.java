/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118026.latihan30.cakep;
import java.util.Scanner;
/**
  * @author
 * NAMA			: Riski Dwi Sabariyanto
 * KELAS		: IF-1
 * NIM			: 10118026
 * Deskripsi Program	: Saya cakep
 */
public class IF110118026Latihan30Cakep {
	public static final String WARNA_RESET = "\u001B[0m";
    	public static final String WARNA_BLACK = "\u001B[30m";
    	public static final String WARNA_RED = "\u001B[31m";
    	public static final String WARNA_GREEN = "\u001B[32m";
    	public static final String WARNA_YELLOW = "\u001B[33m";
    	public static final String WARNA_BLUE = "\u001B[34m";
    	public static final String WARNA_PURPLE = "\u001B[35m";
    	public static final String WARNA_CYAN = "\u001B[36m";
    	public static final String WARNA_WHITE = "\u001B[37m";
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		System.out.println(WARNA_RED + "Kamu " + WARNA_GREEN + "ngerjain sendiri " + WARNA_YELLOW + "latihan 17 sampe " + WARNA_BLUE + "latihan 30 ini ?");
		System.out.print(WARNA_BLUE + "Jawab" + WARNA_RED + "(Yoi/Enggak) : " + WARNA_RESET);
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		a = a.toUpperCase();
		if ( a.equals("YOI"))
			System.out.println(WARNA_RED+"Cakep Bener."+WARNA_PURPLE+" Good Job");
		else 
			System.out.println(WARNA_RED+"Tetep cakep sih.\n"+WARNA_CYAN+"Sing penting paham konsepnya yee"+WARNA_RESET+"Keep the code works dude");
		
	}
	
}
