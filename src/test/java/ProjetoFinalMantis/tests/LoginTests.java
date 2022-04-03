package ProjetoFinalMantis.tests;

import static org.junit.Assert.assertTrue;

import ProjetoFinalMantis.bases.TestBase;
import ProjetoFinalMantis.pages.LoginPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Unit test for simple App.
 */
public class LoginTests extends TestBase
{
    LoginPage loginPage;


    @Test
    public void efetuarLoginComSucesso()
    {
        LoginPage loginPage = new LoginPage(driver);

        String usuario = "julio.rodrigues";
        String senha = "1408@1408";
        String validarLogin = "Minha Visão";

        loginPage.acessarTelaLogin();
        loginPage.preencherUsuario(usuario);
        loginPage.preencherPassword(senha);
        loginPage.cliclarEmLogar();
        loginPage.validarLoginComSucesso(usuario);

    }
}