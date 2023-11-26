package Proj.aut.saucedemo.pages;

import Proj.aut.saucedemo.elementos.WebElements;
import Proj.aut.saucedemo.metodos.Metodos;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import saucedemo.config.IniciarTeste;

import java.time.Duration;

import static Proj.aut.saucedemo.drivers.DriversConexao.driver;

public class CarrinhoPage extends WebElements {

    static WebElements element = new WebElements();

    public static void realizarLogin() {
        IniciarTeste.AbrirNavegador();
        driver.findElement(By.id(campoUsername)).sendKeys(element.getUserNameValido());
        driver.findElement(By.id(campoPassword)).sendKeys(element.getPasswordValido());
        driver.findElement(By.id(idBtnLogin)).click();
    }

    public static void preencherDadosParaRealizarCompra() {
        Metodos.escrever("first-name", "Carlos", "Escrever fist name");
        Metodos.escrever("last-name", "Cavalcante", "Escrever last name");
        Metodos.escrever("postal-code", "57060-100", "Escrever CEP");
        Metodos.click(WebElements.idbtnContinue, "Clicar em continue");

    }

    public static void preencherFirstnameParaRealizarCompra() {
        Metodos.escrever("first-name", "Carlos", "Escrever fist name");
        Metodos.click(WebElements.idbtnContinue, "Clicar em continue");

    }

    public static void preencherLastnameParaRealizarCompra() {
        Metodos.escrever("last-name", "Cavalcante", "Escrever fist name");
        Metodos.click(WebElements.idbtnContinue, "Clicar em continue");

    }

    public static void preencherCepParaRealizarCompra() {
        Metodos.escrever("postal-code", "57060-100", "Escrever CEP");
        Metodos.click(WebElements.idbtnContinue, "Clicar em continue");
    }

    public static void addItemCarrinho(String idItem) {
        driver.findElement(By.id(idItem)).click();
    }

    //################## Botões ################//

    public static void clicarCarrinho() {
        Metodos.clickXpath(WebElements.btnCarrinho);
    }

    public static void clicarCheckout() {
        Metodos.click(WebElements.idBtnCheckout, "Clicar no botão de checkout");
    }

    public static void clicarFinish() {
        Metodos.click(WebElements.idBtnFinish, "Clicar no botão finish");
    }

    public static void clicarCancel() {
        Metodos.click(WebElements.idBtnCancel, "Clicar em Cancel");

    }

    public static void clicarContinue() {
        Metodos.click("continue", "Clicar em continue");
    }

    public static void clicarEmRemover() {
        Metodos.clickXpath("//button[contains(.,'Remove')]");
    }

    //################# Validações #################//

    public static void validarPedidoRealizadoComSucesso() {
        Metodos.validarMensagem(By.xpath("//h2[contains(.,'Thank you for your order!')]"), "Thank you for your order!", "Validar pedido com sucesso");

    }

    public static void validarItemNoCarrinho() {
        Metodos.elementoVisivel(By.xpath("//button[contains(.,'Remove')]"));

    }

    public static void validarUrlPaginaInventory() {
        Metodos.validarUrl(WebElements.urlHomepage, "Validar URL da pagina principal");
    }

    public static void validaMensagemDeErro(String texto) {
        Metodos.validarMensagem(By.xpath("//h3[@data-test='error']"),texto,"Validar mensagem de erro");
    }

    public static void validarInexistenciaDeItemNoCarrinho() {
        By element = By.xpath("//h3[@data-test='error']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        try {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(element));
            System.out.println("O elemento não está visível na tela.");
        } catch (Exception e) {
            System.out.println("O elemento ainda está visível na tela ou não foi encontrado.");
        }
    }

}
