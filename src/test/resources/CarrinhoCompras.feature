#Author: carloshdias.cavalcante@gmail.com

@Carrinho
Feature: Carrinho compras
  como usuario realizei login para adicionar itens ao carrinho

  Background:
    Given Realizei login

  Scenario: Realizar pedido
    When selecionei itens desejado
    And Clicar no item carrinho
    And Confere itens adicionados
    And Clicar em checkout
    And Preenche informacoes validas e continua
    And Clica em finish
    Then Pedido Realizado com sucesso

  Scenario: Remover itens do carrinho
    When Tenha adicinado algum item algo carrinho
    And Clico no item Carrinho
    And Seleciona o produto a ser removido e clica em remove
    Then Produto Removido com sucesso

  Scenario: Adicionar mais itens ao carrinho
    When Tenha adicinado algum item algo carrinho
    And Clico no item Carrinho
    And Clico em continue shopping
    Then Retorna a pagina principal

  Scenario: Retornar a pagina de itens do carrinho
    When Tenha adicinado algum item algo carrinho
    And Clico no item Carrinho
    And Clicar em checkout
    And Clicar em cancel
    Then Retorna a pagina de itens do carrinho

  Scenario: Cancelar pedido
    When Tenha adicinado algum item algo carrinho
    And Clico no item Carrinho
    And Clicar em checkout
    And Preenche first name
    And Preenche CEP
    And Preenche last name
    And Clicar em cancel
    Then Retorna a pagina de itens do carrinho

  Scenario: Realizar pedido sem preencher first name
    When Tenha adicinado algum item algo carrinho
    And Clico no item Carrinho
    And Clicar em checkout
    And Preenche last name
    And Preenche CEP
    Then Mensagem informa {Error: First Name is required}

  Scenario: Realizar pedido sem preencher last name
    When Tenha adicinado algum item algo carrinho
    And Clico no item Carrinho
    And Clicar em checkout
    And Preenche first name
    And Preenche CEP
    Then Mensagem informa {Error: Last Name is required}

  Scenario: Realizar pedido sem preencher CEP
    When Tenha adicinado algum item algo carrinho
    And Clico no item Carrinho
    And Clicar em checkout
    And Preenche first name
    And Preenche last name
    Then Mensagem informa {Error: Postal Code is required}











