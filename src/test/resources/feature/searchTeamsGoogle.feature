Feature: Search
  User search teams on Google
  //deneme_1 update


  @team
  Scenario Outline: User search important teams on Google

    Given User is on the landing page for search
    When  User type "<Teams>" name on the search bar
    Then  User able see team "<Title>"

    Examples:

      | Teams     | Title                     |
      | Besiktas  | Besiktas - Google Search  |
      | Liverpool | Liverpool - Google Search |
      | Barcelona | Barcelona - Google Search |
      | M.City    | M.City - Google Search    |
