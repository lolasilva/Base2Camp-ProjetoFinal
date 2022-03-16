package ProjetoFinalMantis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;
    String urlPaginaLogin = "https://mantis-prova.base2.com.br/";
    By usernameField = By.xpath("/html/body/div[3]/form/table/tbody/tr[2]/td[2]/input");
    By passwordField = By.xpath("/html/body/div[3]/form/table/tbody/tr[3]/td[2]/input");
    By loginButton = By.xpath("/html/body/div[3]/form/table/tbody/tr[6]/td/input");



    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage() {

    }

    public void acessarTelaLogin(){
        driver.get(urlPaginaLogin);
    }

    public void preencherUsuario(String usuario){
        driver.findElement(usernameField).sendKeys(usuario);
    }

    public void preencherPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public void cliclarEmLogar(){
        driver.findElement(loginButton).click();
    }

}