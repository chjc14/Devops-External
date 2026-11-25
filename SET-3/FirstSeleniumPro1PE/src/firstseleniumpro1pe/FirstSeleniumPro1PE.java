package firstseleniumpro1pe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstSeleniumPro1PE{
    public static void main(String[] args) throws Exception{
        
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.google.com");
        System.out.println("Title: "+driver.getTitle());
        Thread.sleep(6000);
        driver.quit();
        
    }
}

