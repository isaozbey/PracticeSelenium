Feature: Search
  User search soccer players

  Scenario Outline: User search Besiktas players on Google
    Given User is on the google page
    When User type soccer players "<Name>"
    Then User should be able to player "<Title>"
    Examples:
      | Name             | Title                            |
      | Burak Yilmaz     | Burak Yilmaz - Google Search     |
      | Sergen Yalcin    | Sergen Yalcin - Google Search    |
      | Atiba Hutchinson | Atiba Hutchinson - Google Search |
      | Cyle Larin       | Cyle Larin - Google Search       |
      | Gokhan Tore      | Gokhan Tore - Google Search      |


