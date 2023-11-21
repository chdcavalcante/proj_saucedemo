package Proj.aut.saucedemo.pages;

import Proj.aut.saucedemo.drivers.DriversConexao;
import Proj.aut.saucedemo.elementos.WebElements;
import Proj.aut.saucedemo.metodos.MetodosLogin;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

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

    public void validarUrlLogin() {
        MetodosLogin.validarUrl(urlLoginPage, "validar url");
    }

    public void validarUrlHomepage() {
        MetodosLogin.validarUrl(urlHomepage, "validar url");

    }

    public void validarMensagem(String texto) {
        MetodosLogin.validarMensagem(texto, "Validar mensagem após tentiva de login");

    }

    public void realizarLogin() {
        usernameValido();
        passwordValido();
        clicarLogin();
    }

    public void btnLogout() throws InterruptedException {
        MetodosLogin.clickXpath("//*[contains(text(), 'Open Menu')]");

        Thread.sleep(2000);

        MetodosLogin.clickXpath("//*[contains(text(), 'Logout')]");


    }

    public void logoutRealizado() {
        MetodosLogin.validarUrl("https://www.saucedemo.com/v1/index.html", "validar url");
    }


}
