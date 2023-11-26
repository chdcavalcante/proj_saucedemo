package saucedemo.config;

import Proj.aut.saucedemo.elementos.WebElements;
import org.openqa.selenium.chrome.ChromeDriver;

import Proj.aut.saucedemo.drivers.DriversConexao;
import io.github.bonigarcia.wdm.WebDriverManager;

public class IniciarTeste extends DriversConexao {

    public static void AbrirNavegador() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(WebElements.urlLoginPage);

    }

    public static void FecharNavegador() {
        driver.quit();
    }
}
