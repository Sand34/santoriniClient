package Main;

import beans.Joueur;
import beans.Pion;
import beans.Plateau;
import util.GameAction;

public class GameManager {

	public static void main(String[] args) {

		Plateau plateau = new Plateau();
		Joueur joueur1 = new Joueur();
		Pion pion1 = new Pion();
		Pion pion2 = new Pion();

		plateau.getPartie().setJoueur1(joueur1);
		plateau.getPartie().getJoueur1().setPion1(pion1);
		plateau.getPartie().getJoueur1().setPion2(pion2);

		plateau.getPartie().getJoueur1().getPion1().setPseudoPion("s1");
		plateau.getPartie().getJoueur1().getPion2().setPseudoPion("s2");
		plateau.getGrille()[0][0] = plateau.getPartie().getJoueur1().getPion1().getPseudoPion();

		plateau.getGrille()[0][1] = plateau.getPartie().getJoueur1().getPion2().getPseudoPion();
		plateau.getPartie().getJoueur1().getPion1().construire("xx");
		plateau.getPartie().getJoueur1().getPion2().construire("xx");

		Joueur joueur2 = new Joueur();
		Pion pion3 = new Pion();
		Pion pion4 = new Pion();

		plateau.getPartie().setJoueur2(joueur2);
		plateau.getPartie().getJoueur2().setPion1(pion3);
		plateau.getPartie().getJoueur2().setPion2(pion4);
		plateau.getPartie().getJoueur2().getPion1().setPseudoPion("p1");
		plateau.getPartie().getJoueur2().getPion2().setPseudoPion("p2");
		plateau.getGrille()[5][5] = plateau.getPartie().getJoueur2().getPion1().getPseudoPion();

		plateau.getGrille()[3][2] = plateau.getPartie().getJoueur2().getPion2().getPseudoPion();
		plateau.getPartie().getJoueur2().getPion1().construire("xx");
		plateau.getPartie().getJoueur2().getPion2().construire("xx");

		System.out.println();

		GameAction.deplacer(pion2, "haut", plateau);
		GameAction.deplacer(pion3, "haut", plateau);
		GameAction.construire(pion4, "bas", plateau);
		GameAction.construire(pion3, "droite", plateau);

		GameAction.refreshGrille(plateau);
	}
}
