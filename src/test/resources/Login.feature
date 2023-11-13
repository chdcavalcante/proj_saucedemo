#Author: carloshdias.cavalcante@gmail.com

@Login
Feature: Login
como usuario quero realizar login, para acessar homepage

Background:
	Given Acessar pagina de login
	
 			Scenario: Login valido
 		 	When Preencher username valido
 		 	And Preencher password valido 
 		 	And Clicar em login
  	  Then Login realizado com sucesso
  	  
  	  Scenario: Login usuario bloqueado
 		 	When Preencher password valido
 		 	But Preencher username com usuario bloqueado 
 		 	And Clicar em login
  	  Then Mensagem informa "Epic sadface: Sorry, this user has been locked out."
  	  
  	  Scenario: Realizar login com senha invalida
 		 	When Preencher username valido
 		 	But Preencher password invalido 
 		 	And Clicar em login
  	  Then Mensagem informa "Epic sadface: Username and password do not match any user in this service"
  	  
  	  Scenario: Realizar login com username invalido
 		 	When Preencher username invalido 
 		 	But Preencher password valido 
 		 	And Clicar em login
  	  Then Mensagem informa "Epic sadface: Username and password do not match any user in this service"
  	  
  	  Scenario: Realizar login sem usuario
 		 	When Preencher password valido
 		 	And Clicar em login
  	  Then Mensagem informa "Epic sadface: Username is required"
  	  
  	  Scenario: Realizar login sem password
 		 	When Preencher username valido
 		 	And Clicar em login
  	  Then Mensagem informa "Epic sadface: Password is required"
  	  
  	  Scenario: Realizar login sem username e password
 		 	When Clicar em login
  	  Then Mensagem informa "Epic sadface: Username is required"
