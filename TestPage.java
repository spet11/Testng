import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestPage {
WebDriver driver;
    @Test
    void browser() throws InterruptedException {
        System.out.println("Open the browser");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");


        //Search
            System.out.println("Search");
            driver.findElement(By.id("small-searchterms")).sendKeys("Lenovo IdeaCentre 600 All-in-One PC");
            By.xpath("//*[@id=\"small-search-box-form\"]/button").findElement(driver).click();
            driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/div[3]/div[2]/button[1]")).click();
            Thread.sleep(1500);
            driver.findElement(By.linkText("Shopping cart")).click();


        // product
            driver.findElement(By.className("qty-input")).clear();
            driver.findElement(By.className("qty-input")).sendKeys("3");

            Thread.sleep(1500);
            System.out.println("Update qty.");

            driver.findElement(By.id("updatecart")).click();
            driver.findElement(By.id("termsofservice")).click();
            System.out.println("Check out for payment");
            driver.findElement(By.id("checkout")).click();
            driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1]")).click();

        //Address

            driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys("Tester ");
            driver.findElement(By.id(("BillingNewAddress_LastName"))).sendKeys("XYZ");
            driver.findElement(By.id("BillingNewAddress_Email")).sendKeys("Check123@gmail.com");
            driver.findElement(By.id("BillingNewAddress_CountryId")).sendKeys("United Kingdom");
            driver.findElement(By.id("BillingNewAddress_City")).sendKeys("leicester");
            driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("12 Josh Road");
            driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("le19 6hh");
            driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("123456789");
            driver.findElement(By.xpath("//button[@class='button-1 new-address-next-step-button']")).click();


        // shipping()
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@id='shippingoption_1'  and@value='Next Day Air___Shipping.FixedByWeightByTotal']")).click();

            driver.findElement(By.xpath("//button[@class='button-1 shipping-method-next-step-button']")).click();
            Thread.sleep(1000);


        // payment
            driver.findElement(By.xpath("//*[@id=\"payment-method-block\"]/li[2]/div/div[2]/label")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/button")).click();
            System.out.println("paymnet Details by Mastercard");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//select[@id='CreditCardType' and @name='CreditCardType']")).sendKeys("MasterCard");
            driver.findElement(By.id("CardholderName")).sendKeys("Tester XYZ");
            driver.findElement(By.id("CardNumber")).sendKeys("6023963425419711");
            driver.findElement(By.id("ExpireMonth")).sendKeys("06");
            driver.findElement(By.id("ExpireYear")).sendKeys("2024");
            driver.findElement(By.id("CardCode")).sendKeys("078");
            driver.findElement(By.xpath("//button[@class='button-1 payment-info-next-step-button' and @onclick='PaymentInfo.save()']")).click();
        }
    }









