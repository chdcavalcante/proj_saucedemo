package Proj.aut.saucedemo.metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Proj.aut.saucedemo.drivers.DriversConexao;

public class MetodosLogin extends DriversConexao {

	public static void click(String id, String passo) {
		try {
			driver.findElement(By.id(id)).click();
		} catch (Exception e) {
			System.out.println("###### ERRO AO TENTAR EXECUTAR O PASSO ######" + passo + e.getMessage());
		}

	}

	public static void escrever(String id, String texto, String passo) {
		try {
			driver.findElement(By.id(id)).sendKeys(texto);
		} catch (Exception e) {
			System.out.println("###### ERRO AO TENTAR EXECUTAR O PASSO ######" + passo + e.getMessage());
		}

	}

	public static void validarUrl(String urlEsperada, String passo) {

		try {
			String url = driver.getCurrentUrl();
			assertEquals(urlEsperada, url);
		} catch (Exception e) {
			System.out.println("###### ERRO AO TENTAR EXECUTAR O PASSO ######" + passo + e.getMessage());
		}

	}

	public static void validarMensagem(String textoEsperado, String passo) {
		try {
			WebElement mensagem = driver.findElement(By.xpath("//*[@id='login_button_container']/div/form/h3"));
			String msg = mensagem.getText();
			assertEquals(msg, textoEsperado);
			System.out.println(msg);
		} catch (Exception e) {
			System.out.println("###### ERRO AO TENTAR EXECUTAR O PASSO ######" + passo + e.getMessage());
		}

	}

}