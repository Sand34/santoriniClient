package util;

import beans.Pion;
import beans.Plateau;

public class GameAction {

	public static void deplacer(Pion pion, String direction, Plateau plateau) {

		for (int i = 0; i < plateau.getGrille().length; i++) {
			for (int j = 0; j < plateau.getGrille()[i].length; j++) {

				if (plateau.getGrille()[i][j] == pion.getPseudoPion()) {
					// System.out.println(pion + " position : [" + i + "] ["
					// + j
					// + "]");

					switch (direction) {
					case "gauche":

						if (j > 0) {
							plateau.getGrille()[i][j] = "..";
							plateau.getGrille()[i][j = j - 1] = pion.getPseudoPion();
						}

						break;
					case "droite":
						if (j < 6) {
							plateau.getGrille()[i][j] = "..";
							plateau.getGrille()[i][j = j + 1] = pion.getPseudoPion();
						}
						break;

					case "haut":
						if (i > 0) {
							plateau.getGrille()[i][j] = "..";
							plateau.getGrille()[i = i - 1][j] = pion.getPseudoPion();
						}
						break;
					case "bas":
						if (i < 6) {
							plateau.getGrille()[i][j] = "..";
							plateau.getGrille()[i = i + 1][j] = pion.getPseudoPion();
						}
						break;

					}
				}

			}

		}

	}

	// public static boolean isPossible(String pion) {
	// for (int i = 0; i < plateau.getGrille().length; i++) {
	// for (int j = 0; j < plateau.getGrille()[i].length; j++) {
	// if (plateau.getGrille()[i][j] == pion) {
	// System.out.println("Impossible de se deplacer !");
	// return false;
	// } else {
	// System.out.println("Deplacement effectu� !");
	// return true;
	//
	// }
	// }
	// }
	// return false;
	// }

	public static void construire(Pion pion, String direction, Plateau plateau) {
		for (int i = 0; i < plateau.getGrille().length; i++) {

			for (int j = 0; j < plateau.getGrille()[i].length; j++) {
				if (plateau.getGrille()[i][j] == pion.getPseudoPion()) {
					switch (direction) {

					case "gauche":
						if (i > 0) {
							plateau.getGrille()[i][j = j - 1] = pion.afficherConstruction();
						}
						break;
					case "droite":
						if (j < 6) {
							plateau.getGrille()[i][j = j + 1] = pion.afficherConstruction();
						}
						break;
					case "haut":
						if (i > 0) {
							plateau.getGrille()[i = i - 1][j] = pion.afficherConstruction();
						}
						break;
					case "bas":
						if (i < 6) {
							plateau.getGrille()[i = i + 1][j] = pion.afficherConstruction();
						}
						break;
					}
				}
			}

		}
	}

	public static void refreshGrille(Plateau plateau) {

		for (int i = 0; i < plateau.getGrille().length; i++) {

			System.out.print("index:" + i + " - ");

			for (int j = 0; j < plateau.getGrille()[i].length; j++) {

				if (plateau.getGrille()[i][j] == null) {
					plateau.getGrille()[i][j] = "..";
				}
				System.out.print(plateau.getGrille()[i][j] + " ");

			}
			System.out.println();

		}

	}

}
