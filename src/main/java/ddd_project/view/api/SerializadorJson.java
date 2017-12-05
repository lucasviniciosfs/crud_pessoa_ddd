package ddd_project.view.api;

import com.google.gson.Gson;

import spark.ResponseTransformer;

public class SerializadorJson implements ResponseTransformer {

	/*
	 * Framework para serialização e desserialização com JSON.
	 */
	protected Gson gson = new Gson();

	/**
	 * @param model
	 *            - Objeto retornado da camada de serviço.
	 * @return JSON correspondente a serialização de model.
	 */
	@Override
	public String render(Object model) throws Exception {
		return gson.toJson(model);
	}
	
	/**
	 * Retorna o objeto serializador/desserealizador da instancia
	 * @return {@link Gson}
	 */
	public Gson getGson() {
		return this.gson;
	}
}
