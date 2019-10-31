package electrics.industries.launcher;

import java.util.Scanner;

import electrics.industries.Gearbox;

public class Launcher {

	public static void main(String[] args) {
		Gearbox gearbox = new Gearbox();
		Scanner scan = new Scanner(System.in);
		while (true) {

			System.out.println("Please enter the engine speed : ");
			int engineSpeed = scan.nextInt();
			gearbox.calculateSpeed(engineSpeed);
			System.out.println("Speed: " + gearbox.getSpeed());
			System.out.println("Engine speed: " + gearbox.getCurrentEngineSpeed() + "\n");
		}
	}
}
