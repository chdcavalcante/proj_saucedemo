package Proj.aut.saucedemo.steps;

import Proj.aut.saucedemo.pages.CarrinhoPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CarrinhoDeComprasTest extends CarrinhoPage {

    @Given("Realizei login com sucesso")
    public void realizei_login_com_sucesso() {
        CarrinhoPage.realizarLogin();
    }

    @When("adiciono item ao carrinho")
    public void adiciono_item_ao_carrinho() {
        CarrinhoPage.addItemCarrinho("add-to-cart-sauce-labs-bike-light");
    }

    @When("clico no icone carrinho")
    public void clico_no_icone_carrinho() {
        CarrinhoPage.clicarCarrinho();
    }

    @When("verifica item adicionado")
    public void verifica_item_adicionado() {
        CarrinhoPage.validarItemNoCarrinho();
    }

    @When("clica em checkout")
    public void clica_em_checkout() {
        CarrinhoPage.clicarCheckout();
    }

    @When("preenche dados validos")
    public void preenche_dados_validos() {
        CarrinhoPage.preencherDadosParaRealizarCompra();
    }

    @When("clica em finish")
    public void clica_em_finish() {
        CarrinhoPage.clicarFinish();
    }

    @Then("pedido realizado com sucesso")
    public void pedido_realizado_com_sucesso() {
        CarrinhoPage.validarPedidoRealizadoComSucesso();
    }

    @When("clica em cancel")
    public void clica_em_cancel() {
        CarrinhoPage.clicarCancel();
    }

    @Then("Retorna para pagina do inventory")
    public void retorna_para_pagina_do_inventory() {
        CarrinhoPage.validarUrlPaginaInventory();
    }

    @When("preenche firstname")
    public void preenche_firstname() {
        CarrinhoPage.preencherFirstnameParaRealizarCompra();
    }

    @When("preenche lastname")
    public void preenche_lastname() {
        CarrinhoPage.preencherLastnameParaRealizarCompra();
    }

    @When("preenche cep")
    public void preenche_cep() {
        CarrinhoPage.preencherCepParaRealizarCompra();
    }

    @When("clica em continue")
    public void clica_em_continue() {
        CarrinhoPage.clicarContinue();
    }

    @Then("mensagem informa {string}")
    public void mensagem_informa(String string) {
        CarrinhoPage.validaMensagemDeErro(string);
    }

    @When("clica em remover no item selecionado")
    public void clica_em_remover_no_item_selecionado() {
        CarrinhoPage.clicarEmRemover();
    }

    @Then("item removido")
    public void item_removido() {
        CarrinhoPage.validarInexistenciaDeItemNoCarrinho();

    }

}