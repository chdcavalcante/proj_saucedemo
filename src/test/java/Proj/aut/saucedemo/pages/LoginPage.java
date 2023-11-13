package Proj.aut.saucedemo.pages;

import Proj.aut.saucedemo.elementos.WebElements;
import Proj.aut.saucedemo.metodos.MetodosLogin;

public class LoginPage extends WebElements {

	public void usernameValido() {
		MetodosLogin.escrever(WebElements.campoUsername, getUserNameValido(), "Preencher nome de usuário valido");
	}

	public void usuarioBloqueado() {
		MetodosLogin.escrever(campoUsername, getUsuarioBloqueado(), "Preencher nome de usuário bloqueado");
	}

	public void usernameInvalido() {
		MetodosLogin.escrever(campoUsername, getUserNameInvalido(), "Preencher nome de usuário ínvalido");
	}

	public void passwordValido() {
		MetodosLogin.escrever(campoPassword, getPasswordValido(), "Preencher password valido");
	}

	public void passwordInvalido() {
		MetodosLogin.escrever(campoPassword, getPasswordInvalido(), "Preencher password invalido");
	}

	public void clicarLogin() {
		MetodosLogin.click(btnLogin, "Clicar no botão login");
	}

	public void validarUrlHomepage() {
		MetodosLogin.validarUrl(urlHomepage, "Validar url após login");
	}

	public void validarMensagem(String string) {
		MetodosLogin.validarMensagem(string, "Validar mensagem após tentiva de login");
	}

}
