package ProjetoFinalMantis.flows;

import ProjetoFinalMantis.pages.LoginPage;
import org.openqa.selenium.WebDriver;

import static ProjetoFinalMantis.bases.TestBase.driver;

public class LoginFlows  {


    LoginPage loginPage;


    public LoginFlows(WebDriver driver){
        loginPage = new LoginPage();
    }

    public void efetuarLoginFlows(){
        LoginPage loginPage = new LoginPage(driver);

        String usuario = "julio.rodrigues";
        String senha = "1408@1408";

        loginPage.acessarTelaLogin();
        loginPage.preencherUsuario(usuario);
        loginPage.preencherPassword(senha);
        loginPage.cliclarEmLogar();
    }
}
