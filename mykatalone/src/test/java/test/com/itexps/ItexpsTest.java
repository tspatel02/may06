/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com.itexps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author itexps
 */
public class ItexpsTest {
    private WebDriver driver;
    public ItexpsTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
         
       driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
     @Test
  public void testItexps() throws Exception {
    driver.get("http://itexps.com/");
    driver.get("https://www.itexps.net/");
    //Maximize browser window 
    driver.manage().window().maximize();
    driver.findElement(By.id("DrpDwnMn01label")).click();
    driver.findElement(By.id("DrpDwnMn02label")).click();
    driver.findElement(By.id("DrpDwnMn03label")).click();
    driver.findElement(By.id("DrpDwnMn04label")).click();
    driver.findElement(By.id("DrpDwnMn05label")).click();
    driver.findElement(By.id("DrpDwnMn06label")).click();
    driver.close();
  }
 
    
}
