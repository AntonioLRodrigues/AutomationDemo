package steps;

import java.io.IOException;

import elementos.ElementosWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class Test {

	Metodos metodos = new Metodos();
	ElementosWeb el = new ElementosWeb();
	
	@Given("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String site) {
	metodos.abrirNavegador(site);
	
	}

	@When("eu preencher todas as informacoes do formulario")
	public void eu_preencher_todas_as_informacoes_do_formulario() throws IOException {
		metodos.escrever("Antonio", el.getFistName());
		metodos.escrever("Rodrigues", el.getLastName());
		metodos.escrever("João de Oliveira Rosa Junior, 200", el.getAdress());
		metodos.escrever("antonioleonel.rodrigues@e2etreinamentos.com.br", el.getEmailAdress());
		metodos.escrever("402-721-1923", el.getPhone());
		metodos.clicar(el.getGender());
		metodos.clicar(el.getHobbies());
		metodos.clicar(el.getLanguage());
		metodos.clicar(el.getBtnLanguage());
		metodos.clicar(el.getSkills());
	    metodos.clicar(el.getSelectCountry());
	    metodos.clicar(el.getBtnSelectorCountry());
	    metodos.clicar(el.getDateOfBirthYear());
	    metodos.clicar(el.getDateOfBirthMonth());
	    metodos.clicar(el.getDateOfBirthDDay());
	    metodos.escrever("AntonioLeonel123",el.getPassword());
	    metodos.escrever("AntonioLeonel123", el.getConPassword());
	    metodos.clicar(el.getBtnSubmit());
	    metodos.screenShot("Evidencia site demo");
		
	}

	@Then("valido se o formulario foi enviado")
		public void valido_se_o_formulario_foi_enviado() {
		    



	}
}
