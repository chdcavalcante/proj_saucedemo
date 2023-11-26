#Author: carloshdias.cavalcante@gmail.com

@Carrinho
Feature: Carrinho compras
  como usuario realizei login para adicionar itens ao carrinho

    Scenario: Realizar pedido
      Given Realizei login com sucesso
      When adiciono item ao carrinho
      And clico no icone carrinho
      And verifica item adicionado
      And clica em checkout
      And preenche dados validos
      And clica em finish
      Then pedido realizado com sucesso


    Scenario: Cancelar apos preencher dados validos
      Given Realizei login com sucesso
      When adiciono item ao carrinho
      And clico no icone carrinho
      And verifica item adicionado
      And clica em checkout
      And preenche dados validos
      And clica em cancel
      Then Retorna para pagina do inventory

    Scenario: remover item do carrinho
      Given Realizei login com sucesso
      When adiciono item ao carrinho
      And clico no icone carrinho
      And clica em remover no item selecionado
      Then  item removido

    Scenario: Não preencher first name para finalizar compras
      Given Realizei login com sucesso
      When adiciono item ao carrinho
      And clico no icone carrinho
      And verifica item adicionado
      And clica em checkout
      And preenche lastname
      And preenche cep
      And clica em continue
      Then mensagem informa "Error: First Name is required"

  Scenario: Não preencher lastname para finalizar compras
    Given Realizei login com sucesso
    When adiciono item ao carrinho
    And clico no icone carrinho
    And verifica item adicionado
    And clica em checkout
    And preenche firstname
    And preenche cep
    And clica em continue
    Then mensagem informa "Error: Last Name is required"

  Scenario: Não preencher cep para finalizar compras
    Given Realizei login com sucesso
    When adiciono item ao carrinho
    And clico no icone carrinho
    And verifica item adicionado
    And clica em checkout
    And preenche firstname
    And preenche lastname
    And clica em continue
    Then mensagem informa "Error: Postal Code is required"

  Scenario: Não preencher dados para finalizar compras
    Given Realizei login com sucesso
    When adiciono item ao carrinho
    And clico no icone carrinho
    And verifica item adicionado
    And clica em checkout
    And clica em continue
    Then mensagem informa "Error: First Name is required"





