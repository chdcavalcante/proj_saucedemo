package Proj.aut.saucedemo.steps;

import Proj.aut.saucedemo.pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import saucedemo.config.IniciarTeste;

public class LoginTest {

	LoginPage page = new LoginPage();

	@After
	public void fecharNavegador() {
		IniciarTeste.FecharNavegador();
	}

	@Given("Acessar pagina de login")
	public void acessar_pagina_de_login() {
		IniciarTeste.AbrirNavegador();
	}

	@When("Preencher username valido")
	public void preencher_username_valido() {
		page.usernameValido();
	}

	@When("Preencher password valido")
	public void preencher_password_valido() {
		page.passwordValido();
	}

	@When("Clicar em login")
	public void clicar_em_login() {
		page.clicarLogin();
	}

	@Then("Login realizado com sucesso")
	public void login_realizado_com_sucesso() {
		page.validarUrlHomepage();
	}

	@When("Preencher username com usuario bloqueado")
	public void preencher_username_com_usuario_bloqueado() {
		page.usuarioBloqueado();
	}

	@Then("Mensagem informa {string}")
	public void mensagem_informa(String string) {
		page.validarMensagem(string);
	}

	@When("Preencher password invalido")
	public void preencher_password_invalido() {
		page.passwordInvalido();
	}

	@When("Preencher username invalido")
	public void preencher_username_invalido() {
		page.usernameInvalido();
	}

}