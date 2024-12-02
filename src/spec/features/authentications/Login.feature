@login
Feature: je souhaite tester la page de connexion
  en tant que utilisateur je souhaite tester la page de connexion

  @login_valid_credential
  Scenario: je souhaite tester la page de connexion avec des donnes valide .
    Given je me connecte sur l application orange
    When je saisis un username valide  "Admin"
    And je saisis un mot de passe valide "admin123"
    And je clique sur le bouton login
    Then je me redirige vers la page Home "Dashboard"
