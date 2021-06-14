package Page;

import Core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static Core.DriverFactory.getDriver;

public class FadedShortSleevePage extends BasePage {


    private BasePage dsl = new BasePage();


    public void signIn(){
        dsl.clicar(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a"));
    }

    public void userName(String usuario){
        dsl.escrever(By.id("email"),usuario);
    }

    public void pass(String senha){
        dsl.escrever(By.id("passwd"), senha);
    }

    public void login(){
        dsl.clicar(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span"));
    }

    public void pesquisa(String item){
        dsl.escrever(By.id("search_query_top"),item);
    }

    public void enter(){
        dsl.clicar(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/button"));
    }

    public void addCarrinho(){
        clicar(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[2]/div[2]/a[2]"));
    }

    public void seleciona2Unidades(){
        dsl.clicar(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[2]/p[1]/a[2]/span"));
    }

    public void tamanho(){
//        WebElement produto = getDriver().findElement(By.id("product"));
//        WebElement blocoBuy = getDriver().findElement(By.id("buy_block"));
//        WebElement atributos = blocoBuy.findElement(By.id("attributes"));
//        WebElement atributo = atributos.findElement(By.id("uniform-group_1"));
        WebElement popup = getDriver().findElement(By.id("uniform-group_1"));
        WebElement selectAtributo = popup.findElement(By.id("group_1"));
        new Select(selectAtributo).selectByVisibleText("M");
    }

    public void cor(){
        dsl.clicar(By.name("Blue"));
    }

    public void submit(){
        dsl.clicar(By.name("Submit"));
    }

    public void checkout(){
        dsl.clicar(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span"));
    }

    public void checkoutSumario(){
        dsl.clicar(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]/span"));
    }

    public void checkoutEndereco(){
        dsl.clicar(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button/span"));
    }

    public void aceitaTermoEntrega(){
        dsl.clicar(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div/p[2]/div/span/input"));
    }

    public void checkoutEtrega(){
        dsl.clicar(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/p/button/span"));
    }

    public void pagamento(){
        dsl.clicar(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[3]/div[1]/div/p/a"));
    }

    public void confirmaPagamento(){
        dsl.clicar(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button/span"));
    }

}
