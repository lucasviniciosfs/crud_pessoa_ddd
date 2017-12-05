package ddd_project.controller.dto;


import ddd_project.model.domain.ExcecaoNegocio;

public class ExcecaoNegocioDTO extends DTO<ExcecaoNegocio> {

	public Integer codErro;
	
	public String tituloErro;
	
	public String descricaoErro;

	public Integer getCodErro() {
		return codErro;
	}

	public void setCodErro(Integer codErro) {
		this.codErro = codErro;
	}

	public String getTituloErro() {
		return tituloErro;
	}

	public void setTituloErro(String tituloErro) {
		this.tituloErro = tituloErro;
	}

	public String getDescricaoErro() {
		return descricaoErro;
	}

	public void setDescricaoErro(String descricaoErro) {
		this.descricaoErro = descricaoErro;
	}
	
	public static ExcecaoNegocioDTO converterDominio(ExcecaoNegocio dominio) {
		ExcecaoNegocioDTO excecaoNegocioDTO = new ExcecaoNegocioDTO();
			excecaoNegocioDTO.codErro = dominio.getCodErro();
			excecaoNegocioDTO.tituloErro = dominio.getTituloErro();
			excecaoNegocioDTO.descricaoErro = dominio.getDescricaoErro();
		return excecaoNegocioDTO;
	}
}
