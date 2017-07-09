package com.d2l.integrationtest;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class NavigationTest {
	
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
//        baseUrl = "https://www.google.com/";
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

//    @Test
//    public void testFirefox() throws Exception {
//    	
//    	    System.setProperty("webdriver.gecko.driver", "/Users/alexbcbr/opensource/geckodriver");
//    	        	    
//        driver = new FirefoxDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.get(baseUrl + "?gws_rd=cr,ssl&ei=ziAqVtGnIcWdugTG65X4Dw&fg=1");
//        driver.findElement(By.id("lst-ib")).clear();
//        driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
//        driver.findElement(By.name("btnG")).click();
//    }

//    @Test
//    public void tesChrome() throws Exception {
//        System.setProperty("webdriver.chrome.driver", "/Users/alexbcbr/opensource/geckodriver");
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//        driver.get(baseUrl + "?gws_rd=cr,ssl&ei=ziAqVtGnIcWdugTG65X4Dw&fg=1");
//        driver.findElement(By.id("lst-ib")).clear();
//        driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
//        driver.findElement(By.name("btnG")).click();
//    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }

}
