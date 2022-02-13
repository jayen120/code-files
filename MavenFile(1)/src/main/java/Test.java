import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String [] args){

        WebDriver driver = null;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/radio.html");

        WebElement radio2ndButton = driver.findElement(By.xpath("//input[@id='vfb-7-2']"));;
        radio2ndButton.click();
        WebElement checkbox2ndButton = driver.findElement(By.xpath("//input[@id='vfb-6-1']"));;
        checkbox2ndButton.click();
//        WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
//        WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
//
//        radio1.click();
//        System.out.println("Radio Button Option 1 Selected");
//
//
//        radio2.click();
//        System.out.println("Radio Button Option 2 Selected");
//
//        WebElement option1 = driver.findElement(By.id("vfb-6-0"));
//
//        option1.click();
//
//        if (option1.isSelected()){
//            System.out.println("Checkbox is Toggled on");
//        }
//        else{
//            System.out.println("Checkbox is Toggled off");
//        }
    }
}
