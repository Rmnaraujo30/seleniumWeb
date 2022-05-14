import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertTrue;

public class testeSelenium_automation {

    WebDriver driver = new ChromeDriver();


    @Test
    public void testeExercicosSelenium() throws InterruptedException {
        driver.get("C:/Users/casa/Desktop/Registro.html");
        driver.findElement(By.xpath("//body[@class='ng-scope']/section[@id='section']/div[@class='container center']/div[contains(@class,'row')]/div[@class='col-sm-6 col-md-6 col-xs-12']/form[@id='basicBootstrapForm']/div[1]/div[1]/input[1]"))
                .sendKeys("Flavio");
        driver.findElement(By.xpath("//body[@class='ng-scope']/section[@id='section']/div[@class='container center']/div[contains(@class,'row')]/div[@class='col-sm-6 col-md-6 col-xs-12']/form[@id='basicBootstrapForm']/div[@class='form-group']/div[2]/input[1]"))
                .sendKeys("Dias");
        driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("AV Paulista, 509");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("teste@teste.com.br");
        driver.findElement(By.xpath(" //input[@type='tel']")).sendKeys("119773512");
        //Exercicio02
        driver.findElement(By.xpath("//*[@value='Male']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@value='Male']")).isSelected());
        driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
        Assert.assertTrue("Checkbox não selecionado", driver.findElement(By.xpath("//input[@id='checkbox1']")).isSelected());

        //Exercicio 04

        driver.findElement(By.xpath("//div[@id='msdd']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Portuguese')]")).click();


        //Listas Option

        //com Click, tem que navegar até o elemento option e extrair o xpath
        driver.findElement(By.xpath("//option[@value='Java']")).click();
        Thread.sleep(2000);

        //Selecionar Lista Option/Select com Select Selenium
        WebElement selectElement = driver.findElement(By.xpath("//select[@id='Skills']"));
        Select select = new Select(selectElement);
        select.selectByVisibleText("Linux");



    }
    @After
    public void after () throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}


