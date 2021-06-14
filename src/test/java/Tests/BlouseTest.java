package Tests;

import Core.BasePage;
import Page.FadedShortSleevePage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import static Core.DriverFactory.getDriver;

public class BlouseTest {

    private FadedShortSleevePage renner = new FadedShortSleevePage();
    BasePage base = new BasePage();

    @Test
    public void cadastro() throws InterruptedException {

        base.inicializa("http://automationpractice.com/index.php");
        renner.signIn();
        renner.userName("car-los26@hotmail.com");
        renner.pass("carlos26");
        renner.login();
        renner.pesquisa("Blouse");
        renner.enter();
        renner.addCarrinho();
        renner.seleciona2Unidades();
        renner.submit();
        renner.checkout();
        renner.checkoutSumario();
        renner.checkoutEndereco();
        renner.aceitaTermoEntrega();
        renner.checkoutEtrega();
        renner.pagamento();
        renner.confirmaPagamento();
        String compraFInalizada = getDriver().findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/p/strong")).getText();
        Assert.assertEquals("Your order on My Store is complete.",compraFInalizada);
        getDriver().quit();

    }
}
