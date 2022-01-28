package Vehiculov2;

import java.util.ArrayList;

public class CarreraMain {
	static ArrayList<CVehiculo> aloCarrera = new ArrayList<>();

	public static void main(String[] args) {
		CConductor woCConductor1 = new CConductor("Juan", 19, 0);
		CConductor woCConductor2 = new CConductor("Maria", 23, 12);
		CConductor woCConductor3 = new CConductor("Andres", 24, 12);
		
		CCoche woCCoche = new CCoche("6251BDX", 0, woCConductor2);
		CMoto woCMoto = new CMoto("8271AVX", 0, woCConductor1);
		CCamion woCCamion = new CCamion("7281BZV", 0, woCConductor3);
		
		aloCarrera.add(woCCoche);
		aloCarrera.add(woCMoto);
		aloCarrera.add(woCCamion);
		
		for (int i = 3; i < 9; i += 3) {
			aloCarrera.get(0).mAcelerar();
			aloCarrera.get(1).mAcelerar();
			aloCarrera.get(2).mAcelerar();
		}
		
		for (int i = 0; i < aloCarrera.size(); i++) {
			System.out.println(aloCarrera.get(i));
			System.out.println("\n");
		}
	}
}
