package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Champion other = new Champion();

		// first champion collection data
		System.out.println("Digite os dados do primeiro campeão:");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		System.out.print("Armadura: ");
		int armor = sc.nextInt();
		sc.nextLine();

		Champion firstChampion = new Champion(name, life, attack, armor);

		// second champion collection data
		System.out.println();
		System.out.println("Digite os dados do segundo campeão:");
		System.out.print("Nome: ");
		name = sc.nextLine();
		System.out.print("Vida inicial: ");
		life = sc.nextInt();
		System.out.print("Ataque: ");
		attack = sc.nextInt();
		System.out.print("Armadura: ");
		armor = sc.nextInt();

		Champion secondChampion = new Champion(name, life, attack, armor); 
				
		// number of combat turns
		System.out.println();
		System.out.print("Quantos turnos você deseja executar? ");
		int N = sc.nextInt();
		
		Champion other1 = new Champion(firstChampion.getName(), firstChampion.getLife(), secondChampion.getAttack(), firstChampion.getArmor());
		Champion other2 = new Champion(secondChampion.getName(), secondChampion.getLife(), firstChampion.getAttack(), secondChampion.getArmor());

		for (int i = 1; i <= N; i++) {		
			if (other1.getLife() > 0 && other2.getLife() > 0) {
				System.out.println();
				System.out.println("Resultado do turno " + i + ":");
				other.takeDamage(other1);
				System.out.println(other1.status());
				other.takeDamage(other2);
				System.out.println(other2.status());
			}
		}
		System.out.println();
		System.out.println("FIM DO COMBATE");
		sc.close();
	}
}
