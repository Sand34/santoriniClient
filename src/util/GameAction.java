package util;

import beans.Joueur;
import beans.Pion;
import beans.Plateau;

public class GameAction {
	private static Plateau plateau = new Plateau();

	public static void initJoueur1(String nomPion1, String nomPion2, int i, int j, int x, int y) {

		Joueur joueur1 = new Joueur();
		Pion pion1 = new Pion();
		Pion pion2 = new Pion();

		plateau.getPartie().setJoueur1(joueur1);
		plateau.getPartie().getJoueur1().setPion1(pion1);
		plateau.getPartie().getJoueur1().setPion2(pion2);

		plateau.getPartie().getJoueur1().getPion1().setPseudoPion(nomPion1);
		plateau.getPartie().getJoueur1().getPion2().setPseudoPion(nomPion2);
		plateau.getGrille()[i][j] = plateau.getPartie().getJoueur1().getPion1().getPseudoPion();

		plateau.getGrille()[x][y] = plateau.getPartie().getJoueur1().getPion2().getPseudoPion();

	}

	public static void initJoueur2(String nomPion1, String nomPion2, int i, int j, int x, int y) {

		Joueur joueur2 = new Joueur();
		Pion pion1 = new Pion();
		Pion pion2 = new Pion();

		plateau.getPartie().setJoueur2(joueur2);
		plateau.getPartie().getJoueur2().setPion1(pion1);
		plateau.getPartie().getJoueur2().setPion2(pion2);
		plateau.getPartie().getJoueur2().getPion1().setPseudoPion(nomPion1);
		plateau.getPartie().getJoueur2().getPion2().setPseudoPion(nomPion2);
		plateau.getGrille()[i][j] = plateau.getPartie().getJoueur2().getPion1().getPseudoPion();

		plateau.getGrille()[x][y] = plateau.getPartie().getJoueur2().getPion2().getPseudoPion();

	}

	public static void deplacer(String pion, String direction) {

		for (int i = 0; i < plateau.getGrille().length; i++) {
			for (int j = 0; j < plateau.getGrille()[i].length; j++) {

				if (plateau.getGrille()[i][j] == pion) {
					// System.out.println(pion + " position : [" + i + "] ["
					// + j
					// + "]");
					switch (direction) {
					case "gauche":
						if (j > 0) {

							plateau.getGrille()[i][j] = "..";
							plateau.getGrille()[i][j = j - 1] = pion;

						}
						break;
					case "droite":
						if (j < 6 && plateau.getGrille()[i][j = j + 1] == "..") {
							plateau.getGrille()[i][j] = "..";
							plateau.getGrille()[i][j = j + 1] = pion;
						}
						break;

					case "haut":
						if (i > 0) {
							plateau.getGrille()[i][j] = "..";
							plateau.getGrille()[i = i - 1][j] = pion;
						}
						break;
					case "bas":
						if (i < 6) {
							plateau.getGrille()[i][j] = "..";
							plateau.getGrille()[i = i + 1][j] = pion;
						}
						break;

					default:
						break;
					}
				}

			}

		}

	}

	public static boolean isPossible(String pion) {
		for (int i = 0; i < plateau.getGrille().length; i++) {
			for (int j = 0; j < plateau.getGrille()[i].length; j++) {
				if (plateau.getGrille()[i][j] == pion) {
					System.out.println("Impossible de se deplacer !");
					return false;
				} else {
					System.out.println("Deplacement effectu� !");
					return true;

				}
			}
		}
		return false;
	}

	public static void refreshGrille() {

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
