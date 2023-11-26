package Proj.aut.saucedemo.pages;

import Proj.aut.saucedemo.elementos.WebElements;
import Proj.aut.saucedemo.metodos.Metodos;
import org.openqa.selenium.By;

public class LoginPage extends WebElements {

    public void usernameValido() {
        Metodos.escrever(WebElements.campoUsername, getUserNameValido(), "Preencher nome de usuário valido");
    }

    public void usuarioBloqueado() {
        Metodos.escrever(campoUsername, getUsuarioBloqueado(), "Preencher nome de usuário bloqueado");
    }

    public void usernameInvalido() {
        Metodos.escrever(campoUsername, getUserNameInvalido(), "Preencher nome de usuário ínvalido");
    }

    public void passwordValido() {
        Metodos.escrever(campoPassword, getPasswordValido(), "Preencher password valido");
    }

    public void passwordInvalido() {
        Metodos.escrever(campoPassword, getPasswordInvalido(), "Preencher password invalido");
    }

    public void clicarLogin() {
        Metodos.click(idBtnLogin, "Clicar no botão login");
    }


    public void validarUrlHomepage() {
        Metodos.validarUrl(urlHomepage, "validar url");

    }

    public void validarMensagem(String texto) {
        Metodos.validarMensagem(By.xpath("//div[@class='error-message-container error']"),texto, "Validar mensagem após tentiva de login");

    }

    public void realizarLogin() {
        usernameValido();
        passwordValido();
        clicarLogin();
    }

    public void btnLogout() throws InterruptedException {
        Metodos.clickXpath("//*[contains(text(), 'Open Menu')]");

        Thread.sleep(2000);

        Metodos.clickXpath("//*[contains(text(), 'Logout')]");


    }

    public void logoutRealizado() {
        Metodos.validarUrl(WebElements.urlLoginPage, "validar url");
    }


}
