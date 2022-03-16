package ProjetoFinalMantis.pages;

import ProjetoFinalMantis.bases.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MarcadorPage extends TestBase {


    By gerenciarButton = By.xpath("/html/body/table[2]/tbody/tr/td[1]/a[7]");
    By gerenciarMarcadorButton = By.cssSelector("body > div:nth-child(4) > p > span:nth-child(2)");
    By nomeMarcadorField = By.xpath("/html/body/table[1]/tbody/tr/td[3]/a");


    public MarcadorPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clicarEmGerenciar(){
        driver.findElement(gerenciarButton).click();
    }
    public void clicarEmGerenciarMarcadores(){
        driver.findElement(gerenciarMarcadorButton).click();
    }
    public void  preencherNomeMarcador(String nomeMarcador){
        driver.findElement(nomeMarcadorField).sendKeys(nomeMarcador);
    }

}
