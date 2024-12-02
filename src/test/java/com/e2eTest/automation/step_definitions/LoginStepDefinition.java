package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.LoginPage;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	
	ConfigFileReader configFileReader = new ConfigFileReader();
	LoginPage loginPage = new LoginPage();

	@Given("je me connecte sur l application orange")
	public void jeMeConnecteSurLApplicationOrange() throws InterruptedException {
		Setup.getDriver().get(configFileReader.getProperty("home.url"));
		Thread.sleep(5000);
	    
	}
	@When("je saisis un username valide  {string}")
	public void jeSaisisUnUsernameValide(String username) throws InterruptedException {
		loginPage.getUsername(username);
		Thread.sleep(5000);
	}
	@When("je saisis un mot de passe valide {string}")
	public void jeSaisisUnMotDePasseValide(String string) {
	   
	}
	@When("je clique sur le bouton login")
	public void jeCliqueSurLeBoutonLogin() {
	    
	}
	@Then("je me redirige vers la page Home {string}")
	public void jeMeRedirigeVersLaPageHome(String string) {
	    
	}



}
