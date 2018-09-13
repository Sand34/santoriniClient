package util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import beans.Plateau;

public class WsUtils {

	private static final String URL_SERVER = "http://localhost:8080/santorini/rest/MonService/helloWorld";
	private static final String URL_SERVER_METHOD1 = "� faire";
	private static final String URL_SERVER_METHOD2 = "� faire";

	public static Plateau getPlateauFromServeur() throws Exception {
		// requete
		String jsonRecu = OkHttpUtils.sendGetOkHttpRequest(URL_SERVER_METHOD1);
		// parser le r�sultat
		// � partir du Json cr�ation des objets
		Gson gson = new Gson();
		// parse en arralist
		Plateau plateau = gson.fromJson(jsonRecu, new TypeToken<Plateau>() {
		}.getType());
		return plateau;

	}

}
