#Author: your.email@your.domain.com

@formulario
Feature: como usuario quero validar o site
  como usuario quero validar o formulario

  @formulario
  Scenario: formulario valido
    Given que eu esteja no site "https://demo.automationtesting.in/Register.html"
    When eu preencher todas as informacoes do formulario
    Then valido se o formulario foi enviado
    

  