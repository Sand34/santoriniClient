package Main;

import beans.Joueur;
import beans.Pion;
import beans.Plateau;
import util.GameAction;

public class GameManager {

	public static void main(String[] args) {

		Plateau plateau = new Plateau();

		Joueur joueur1 = new Joueur();
		Pion J1P1 = new Pion();
		Pion J1P2 = new Pion();

		plateau.getPartie().setJoueur1(joueur1);
		plateau.getPartie().getJoueur1().setPion1(J1P1);
		plateau.getPartie().getJoueur1().setPion2(J1P2);

		plateau.getPartie().getJoueur1().getPion1().setPseudoPion("J1P1");
		plateau.getPartie().getJoueur1().getPion2().setPseudoPion("J1P2");

		plateau.getGrille()[0][0] = plateau.getPartie().getJoueur1().getPion1().getPseudoPion();
		plateau.getGrille()[0][1] = plateau.getPartie().getJoueur1().getPion2().getPseudoPion();

		Joueur joueur2 = new Joueur();
		Pion J2P1 = new Pion();
		Pion J2P2 = new Pion();

		plateau.getPartie().setJoueur2(joueur2);
		plateau.getPartie().getJoueur2().setPion1(J2P1);
		plateau.getPartie().getJoueur2().setPion2(J2P2);

		plateau.getPartie().getJoueur2().getPion1().setPseudoPion("J2P1");
		plateau.getPartie().getJoueur2().getPion2().setPseudoPion("J2P2");

		plateau.getGrille()[5][5] = plateau.getPartie().getJoueur2().getPion1().getPseudoPion();
		plateau.getGrille()[3][2] = plateau.getPartie().getJoueur2().getPion2().getPseudoPion();

		GameAction.refreshGrille(plateau);
		System.out.println();

		plateau.getPartie().getJoueur2().getPion1().construire("xxxx");
		plateau.getPartie().getJoueur2().getPion2().construire("xxxx");
		plateau.getPartie().getJoueur1().getPion1().construire("xxxx");
		plateau.getPartie().getJoueur1().getPion2().construire("xxxx");

		System.out.println();

		GameAction.deplacer(J1P1, "bas", plateau);
		GameAction.construire(J1P1, "bas", plateau);

		GameAction.deplacer(J1P2, "droite", plateau);
		GameAction.construire(J1P2, "droite", plateau);

		GameAction.refreshGrille(plateau);
	}
}
