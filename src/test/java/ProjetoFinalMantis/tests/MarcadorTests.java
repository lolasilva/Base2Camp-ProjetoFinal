package ProjetoFinalMantis.tests;

import ProjetoFinalMantis.bases.TestBase;
import ProjetoFinalMantis.flows.LoginFlows;
import ProjetoFinalMantis.pages.LoginPage;
import ProjetoFinalMantis.pages.MarcadorPage;
import org.junit.Test;

public class MarcadorTests  extends TestBase {

    MarcadorPage marcadorPage;
    LoginFlows loginFlows;


    @Test
    public void criarMarcadorComSucesso(){


        LoginFlows loginFlows = new LoginFlows(driver);
        MarcadorPage marcadorPage = new MarcadorPage(driver);

        //String nomeMarcador = "Teste Julio Rodrigues";

        loginFlows.efetuarLoginFlows();

        marcadorPage.clicarEmGerenciar();
        marcadorPage.clicarEmGerenciarMarcadores();
        //marcadorPage.preencherNomeMarcador(nomeMarcador);


    }
}
