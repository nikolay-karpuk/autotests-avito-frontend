@all @test2
Feature: Тест авито

  @success
  Scenario Outline: Сценарий 1
    Given Выполнить вход на сайт с помощью "<user>" и "<password>"
    Given добавить объявление в избранное

    Examples:
      | user        | password     |
      | 89166410211 | 2test0TE_ST1 |
