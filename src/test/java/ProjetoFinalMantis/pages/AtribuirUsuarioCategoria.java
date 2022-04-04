package ProjetoFinalMantis.pages;

import ProjetoFinalMantis.bases.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AtribuirUsuarioCategoria extends TestBase {

    By gerenciarButton = By.xpath("/html/body/table[2]/tbody/tr/td[1]/a[7]");
    By gerenciarProjetoButton = By.xpath("/html/body/div[2]/p/span[1]/a");
    By alterarButton = By.xpath("/html/body/a/div/table/tbody/tr[16]/td[3]/form[1]/input[2]");
    By selecionarUsuarioCambobox = By.xpath("/html/body/div[3]/form/table/tbody/tr[3]/td[2]/select/option[74]");
    By atualizarCategoriaButton = By.xpath("/html/body/div[3]/form/table/tbody/tr[4]/td[2]/input");

    public AtribuirUsuarioCategoria(WebDriver driver) {
        this.driver = driver;
    }

    public void clicarEmGerenciar(){
        driver.findElement(gerenciarButton).click();
    }

    public void clicarEmGerenciarProjetos(){
        driver.findElement(gerenciarProjetoButton).click();
    }

    public void clicarEmAlterar(){
        driver.findElement(alterarButton).click();
    }

    public void selecionarUsuario(){
        driver.findElement(selecionarUsuarioCambobox).click();
    }

    public void atualizarCategoria(){
        driver.findElement(atualizarCategoriaButton).click();
    }
}
