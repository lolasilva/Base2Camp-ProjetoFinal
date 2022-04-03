package ProjetoFinalMantis.tests;

import ProjetoFinalMantis.bases.TestBase;
import ProjetoFinalMantis.flows.LoginFlows;
import ProjetoFinalMantis.pages.CriarCategoria;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class AdicionarCategoria extends TestBase {

    CriarCategoria criarCategoria;
    LoginFlows loginFlows;


    @Test
    public void adicionarCategoria(){
        LoginFlows loginFlows = new LoginFlows(driver);
        CriarCategoria criarCategoria = new CriarCategoria(driver);

        String categoria = "Julio.Rodrigues Teste";

        loginFlows.efetuarLoginFlows();
        criarCategoria.clicarEmGerenciar();
        criarCategoria.clicarEmGerenciarProjetos();
        criarCategoria.adicionarCategoria(categoria);
        criarCategoria.clicarEmAdicionarCategoria();

    }
}
