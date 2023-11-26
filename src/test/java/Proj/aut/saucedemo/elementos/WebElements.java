package Proj.aut.saucedemo.elementos;

public class WebElements {

	public static String urlHomepage = "https://www.saucedemo.com/inventory.html";
	public static String urlLoginPage = "https://www.saucedemo.com/";

	public static String campoUsername = "user-name";
	public static String campoPassword = "password";
	public static String idBtnLogin = "login-button";

	public static String idbtnContinue = "continue";
	public static String idBtnCheckout = "checkout";

	public static String idBtnFinish = "finish";

	public static String idBtnCancel = "cancel";


	public static String btnCarrinho = "//a[contains(@class,'shopping_cart_link')]";

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
