Feature: Search
  User search soccer players




  @scenario2
  Scenario Outline: User search on Wiki
    Given User is  the wiki page
    When use search players "<Name>"
    Then user should be able see  "<Title>"

    Examples:
      | Name             | Title                                         |
      | Burak Yilmaz     | Burak Yilmaz - Search results - Wikipedia     |
      | Sergen Yalcin    | Sergen Yalcin - Search results - Wikipedia    |
      | Atiba Hutchinson | Atiba Hutchinson - Search results - Wikipedia |
      | Cyle Larin       | Cyle Larin - Search results - Wikipedia       |
      | Gokhan Tore      | Gokhan Tore - Search results - Wikipedia      |