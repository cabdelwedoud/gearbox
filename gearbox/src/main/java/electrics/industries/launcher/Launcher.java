package electrics.industries.launcher;

import java.util.Scanner;

import electrics.industries.Gearbox;

public class Launcher {

	public static void main(String[] args) {
		Gearbox gearbox = new Gearbox();
		Scanner scan = new Scanner(System.in);
		while (true) {

			System.out.println("Please enter the engine speed or X if you want to stop:");
			if (scan.hasNextInt()) {
				int engineSpeed = scan.nextInt();
				gearbox.calculateSpeed(engineSpeed);
				System.out.println("Speed: " + gearbox.getSpeed());
				System.out.println("Engine speed: " + gearbox.getCurrentEngineSpeed() + "\n");
			} else if ("X".equalsIgnoreCase(scan.nextLine())) {
				scan.close();
				System.out.println("Gearbox calculator stopped!");
				System.exit(0);
			}
		}
	}
}
