import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    WebDriver driver = new ChromeDriver();

    @Test
    public void testeQAacademy() throws InterruptedException {
        driver.get("https://www.qaacademy.com.br/");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[contains(text(),'Matricula')]")).click();//Clica em Matricula
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[contains(text(),'Agendar agora')]")).click();//Agendar Agora
        Thread.sleep(3000);
        Assert.assertTrue(driver.getCurrentUrl().contains("/service-page/presencial"));
        Thread.sleep(3000);
    }
//test
   @After
    public void after(){
        driver.quit();
    }
}
