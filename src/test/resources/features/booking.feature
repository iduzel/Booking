Feature: Check availability
  @booking
  Scenario: ucus arama

    Given kullanici ana sayfaya gider
    And Hotel linkine tiklar
    And Kutuya New York yazar

    And CheckIn-Out linkine tiklar
    And adult-children-room linkine tiklar ve bilgileri girer
    And kullanici search butonuna tiklar