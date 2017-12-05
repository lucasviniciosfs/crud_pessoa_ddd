package ddd_project;

import org.apache.log4j.PropertyConfigurator;

import ddd_project.view.api.PessoaAPI;
import ddd_project.view.api.WebServiceConfiguracao;

public class Principal {

	public static void main(String[] args) {
		/**
		 * Configuração de log.
		 */
		PropertyConfigurator.configure(ClassLoader.getSystemResource("log4j.properties"));

		/**
		 * Configuração de funcionamento das APIs Spark.
		 */
		WebServiceConfiguracao.config(args);

		/**
		 * Controllers que estrão ativos.
		 */
        PessoaAPI.api(args);
    }
}
