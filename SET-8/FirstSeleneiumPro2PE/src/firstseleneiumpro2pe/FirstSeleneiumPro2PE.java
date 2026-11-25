package firstseleneiumpro2pe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;

public class FirstSeleneiumPro2PE {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        try {
            driver.get(new File(
    "D:/Jishnu/Jishnu 5th SEM/LAB SUBJECTS/DEVOPS LAB/EXTERNAL-LAB PRACTICE/SET-8/CalculatorTesting_JavaScript_Java_Selenium/javascriptCalculator.html"
).toURI().toString());

            driver.findElement(By.id("num1")).sendKeys("10");
            driver.findElement(By.id("num2")).sendKeys("20");
            driver.findElement(By.tagName("button")).click();

            String result = driver.findElement(
                By.id("result")).getText();

            System.out.println(result);

            if (result.equals("Result: 30"))
                System.out.println("Test Passed");
            else
                System.out.println("Test Failed");

        } finally {
            driver.quit();
        }
    }
}