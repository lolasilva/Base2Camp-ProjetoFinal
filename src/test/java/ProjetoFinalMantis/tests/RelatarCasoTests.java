package ProjetoFinalMantis.tests;

import ProjetoFinalMantis.bases.TestBase;
import ProjetoFinalMantis.flows.LoginFlows;
import ProjetoFinalMantis.pages.RelatarCaso;
import org.junit.Test;

public class RelatarCasoTests extends TestBase {

    RelatarCaso relatarCaso;
    LoginFlows loginFlows;

    @Test
    public void relatarCaso(){
        LoginFlows loginFlows = new LoginFlows(driver);
        RelatarCaso relatarCaso = new RelatarCaso(driver);

        String resumo = "Resumo teste Júlio";
        String descricao = "Projeto Mantis Julio Teste";
        String passos = "Criado projeto final Base2 Júlio";
        String informacoes = "Projeto realizado durante o BootCamp Base2";

        loginFlows.efetuarLoginFlows();
        relatarCaso.cliclarEmRelatarCaso();
        relatarCaso.escolherProjeto();
        relatarCaso.clicarEmSelecionarProjeto();
        relatarCaso.selecionarCategoria();
        relatarCaso.selecionarFrequencia();
        relatarCaso.selecionarGravidade();
        relatarCaso.selecionarPrioridade();
        relatarCaso.selecionarPerfil();
        relatarCaso.preencherResumo(resumo);
        relatarCaso.preencherDescricao(descricao);
        relatarCaso.preenchePassosAReproduzir(passos);
        relatarCaso.preencherInformacoes(informacoes);
        relatarCaso.ClicarEmEnviarRelatorio();


    }
}
