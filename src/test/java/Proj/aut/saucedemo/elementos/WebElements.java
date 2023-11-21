package Proj.aut.saucedemo.elementos;

public class WebElements {

	public static String urlHomepage = "https://www.saucedemo.com/v1/inventory.html";
	public static String urlLoginPage = "https://www.saucedemo.com/v1/index.html";

	public static String campoUsername = "user-name";
	public static String campoPassword = "password";
	public static String btnLogin = "login-button";

	private String userNameValido = "standard_user";
	private String userNameInvalido = "userinvalido";
	private String passwordValido = "secret_sauce";
	private String passwordInvalido = "senhainvalida";
	private String usuarioBloqueado = "locked_out_user";

	public String getUserNameValido() {
		return userNameValido;
	}

	public String getUserNameInvalido() {
		return userNameInvalido;
	}

	public String getPasswordValido() {
		return passwordValido;
	}

	public String getPasswordInvalido() {
		return passwordInvalido;
	}

	public String getUsuarioBloqueado() {
		return usuarioBloqueado;
	}
}
