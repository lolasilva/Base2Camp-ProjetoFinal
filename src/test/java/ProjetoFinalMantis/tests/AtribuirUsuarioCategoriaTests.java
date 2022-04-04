package ProjetoFinalMantis.tests;

import ProjetoFinalMantis.bases.TestBase;
import ProjetoFinalMantis.flows.LoginFlows;
import ProjetoFinalMantis.pages.AtribuirUsuarioCategoria;
import ProjetoFinalMantis.pages.CriarCategoria;
import org.junit.Test;

public class AtribuirUsuarioCategoriaTests extends TestBase {

    AtribuirUsuarioCategoria atribuirUsuarioCategoria;
    LoginFlows loginFlows;

    @Test
    public void atribuirUsuarioCategoria() {
        LoginFlows loginFlows = new LoginFlows(driver);
        AtribuirUsuarioCategoria atribuirUsuarioCategoria = new AtribuirUsuarioCategoria(driver);

        loginFlows.efetuarLoginFlows();
        atribuirUsuarioCategoria.clicarEmGerenciar();
        atribuirUsuarioCategoria.clicarEmGerenciarProjetos();
        atribuirUsuarioCategoria.clicarEmAlterar();
        atribuirUsuarioCategoria.selecionarUsuario();
        atribuirUsuarioCategoria.atualizarCategoria();
    }
}
