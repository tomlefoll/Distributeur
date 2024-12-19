package distributeur;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		//liste des produits variable
		int cafe = 1;
		int cookie = 2;
		int soda = 3;
		int the = 4;
		int chocolat = 5;
		int eau = 6;
		int siropDefraise = 7;
		
	
		int prixCafe = 2;
		int prixCookie = 3;
		int prixSoda = 1;
		int prixThe = 2;
		int prixChocolat = 4;
		int prixEau = 1;
		int prixSiropDeFraise = 3;
		int argentDePoche = 100;
		
		Scanner input = new Scanner(System.in); // Initialisation du scanner
		System.out.println("choisisser votre article");
		System.out.println("1. café");
		System.out.println("4. cookie");
		System.out.println("3. Soda");
		System.out.println("5. Chocolat");
		System.out.println("6. Eau");
		System.out.println("7. Sirop de fraise");
		
		// lecture du choix de l'utilisateur 
		int userInput = input.nextInt();
		
		switch(userInput) {
		case 1: //café
			if(argentDePoche >= prixCafe) {
				argentDePoche -= prixCafe;
			System.out.println("votre café est prêt ! vous avez payé " + prixCafe + "€. Il vous reste " + argentDePoche + "€.");
			
			} else {
				System.out.println("Desoler, vous n'avez pas assez d'argent pour un café. il vous manque " + (prixCafe - argentDePoche) + "€. ");
				
			}
			break;
			
		case 2: // cookie
			if (argentDePoche >= prixCookie) {
				argentDePoche -= prixCookie;
				System.out.println("les cookie sont prêts ! vous avez payer " + prixCookie + "€. Il vous reste " + argentDePoche + "€. ");
				
			} else {
				System.out.println("desoler, vous n'avez pas assez d'argent pour des cookies; il vous manque " + (prixCookie - argentDePoche) + "€.");
				
			}
			break;
			
		case 3: //soda
			if(argentDePoche >= prixSoda) {
				argentDePoche -= prixSoda;
				System.out.println("Votre soda est très froid ! vous avez payé " + prixSoda + "€. il vous reste" + argentDePoche + "€. ");
				
			}else {
				System.out.println("désoler, vous n'avez pas assez d'argent pour un soda. ilvous manque " + (prixSoda - argentDePoche) + "€. ");
				
			}
			break;
			
			
		case 4: //Thé
			if(argentDePoche >= prixThe) {
				argentDePoche -= prixThe;
				System.out.println("Votre thé est prêt ! vous avez payé" + prixThe + "€. Il vous reste " + argentDePoche + "€. ");
				
			} else {
				System.out.println("Desoler, vous n'avez pas assez d'argent pour un the. Il vous manque " + (prixThe - argentDePoche) + "€. ");
				
			}
			break;
			
		case 5: // Chocolat
			 if (argentDePoche >= prixChocolat) {
		            argentDePoche -= prixChocolat;
		            System.out.println("Votre chocolat est prêt ! Vous avez payé " + prixChocolat + "€. Il vous reste " + argentDePoche + "€.");
		} else {
			System.out.println("Désolé, vous n'avez pas assez d'argent pour du chocolat. Il vous manque " + (prixChocolat - argentDePoche) + "€.");
					
		}
			 break;
			 
		case 6: //eau
			if(argentDePoche >= prixEau) {
				argentDePoche -= prixEau;
				System.out.println("Votre eau est prête ! vous avez payé " + prixEau + "€. Il vous reste " + argentDePoche + "€. " );
				
				
			} else {
				System.out.println("desoler, vous n'avez pas assez d'argent pour de l'eau. il vous manque" + (prixEau - argentDePoche) + "€. ");
				
			}
			break; 
			
		case 7: // Sirop de fraise 
		if(argentDePoche >= prixSiropDeFraise) {
			argentDePoche -= prixSiropDeFraise;
			System.out.println("votre sirop est de fraise est prêt ! vous âvez payer " + (prixSiropDeFraise - argentDePoche) + "€. " );
		} else {
			
		System.out.println("Désolé, vous n'avez pas assez d'argent pour du sirop de fraise. Il vous manque " + (prixSiropDeFraise - argentDePoche) + "€.");
		

	}
		break;
		
		default: // cas ou l'utilisateur entre un choix invalide 
			System.out.println("choix ivalide. veuillez choisir un numero entre 1 et 7.");
			break;
			}
		}
	}
			
			
				
			
	

	


