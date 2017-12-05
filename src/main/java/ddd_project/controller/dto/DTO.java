package ddd_project.controller.dto;

public abstract class DTO<T> {

	/**
	 * 
	 * @param dominio
	 *            - Instancia do modelo de domínio.
	 * @return Instancia do DTO correspondete ao modelo de domínio.
	 */
	public static <T> DTO<T> converterDominio(T dominio) {
		return null;
	}
}
