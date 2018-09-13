package util;

import java.util.ArrayList;

import beans.Plateau;

public class WsUtils {

	private static final String URL_SERVER = "http://localhost:8080/santorini/rest/MonService/helloWorld";
	private static final String URL_SERVER_METHOD1 = "� faire";
	private static final String URL_SERVER_METHOD2 = "� faire";

	public static Plateau getPlateauFromServeur() throws Exception {
		// requete
		String jsonRecu = OkHttpUtils.sendGetOkHttpRequest(URL_METHOD_JSON);
		// parser le r�sultat
		// � partir du Json cr�ation des objets
		Gson gson = new Gson();
		// parse en arralist
		ArrayList<MessageBean> liste = gson.fromJson(jsonRecu, new TypeToken<ArrayList<MessageBean>>() {
		}.getType());
		return liste;

	}

}
