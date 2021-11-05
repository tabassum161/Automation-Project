/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bongobdassignment;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


/**
 *
 * @author User
 */
public class BongoBDAssignment {
    private static Object Assert;
     WebDriver driver;
     
//    public static WebDriver driver ;
//    
//    public static void BongoBDAssignment() throws InterruptedException
//    {
//      
//        System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
//        driver = new ChromeDriver();
//    }
//
//    public static void close()
//    {
//        driver.close();
//    }
//
//    
//    public class Demo extends BongoBDAssignment{
//
//        /**
//         *
//         */
//        public  String baseUrl = "https://bongobd.com/";
//        
//        public  void EnterTheMainPage() throws InterruptedException{
//            
//            driver.get("baseUrl");
//            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//            driver.manage().window().maximize();
//            
//            Thread.sleep(2000);
//            
//            driver.findElement(By.xpath("//span[contains(text(),'Sports')]")).click();
//            Thread.sleep(20000);
//        }
//    }
    
    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDemo\\src\\drivers\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setHeadless(true);
        //WebDriver driver = new ChromeDriver(chromeOptions);
        WebDriver driver = new ChromeDriver();
        driver.get("https://bongobd.com/");
        
        //maximize browser
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       driver.manage().window().maximize();
        //title
       String actualTitle = "BONGO | Watch Live Tv, Bangla Movies, Natoks Anytime Anywhere";
        String siteTitle = driver.getTitle();
        //Assert.assertEquals(actualTitle,siteTitle);
        if (actualTitle.contentEquals(siteTitle))
        {
            System.out.println("Test Passed");
            //continue;
        }
        else {
            System.out.println("Test Failed");
            //break;
        }
       
        driver.findElement(By.xpath("//span[normalize-space()='Music']")).click();
        Thread.sleep(5000);
        
        String actualTitle2 = "BONGO | Music";
        String siteTitle2 = driver.getTitle();
        //Assert.assertEquals(actualTitle,siteTitle);
        if (actualTitle2.contentEquals(siteTitle2))
        {
            System.out.println("Test Passed");
            //continue;
        }
        else {
            System.out.println("Test Failed");
            //break;
        }
        
        driver.findElement(By.xpath("//div[@class='MuiCardMedia-root jss782 jss785']")).click();
        Thread.sleep(5000);
        String actualTitle3 = "BONGO | Klanto Mon";
        String siteTitle3 = driver.getTitle();
        //Assert.assertEquals(actualTitle,siteTitle);
        if (actualTitle3.contentEquals(siteTitle3))
        {
            System.out.println("Test Passed");
            //continue;
        }
        else {
            System.out.println("Test Failed");
            //break;
        }
        driver.findElement(By.xpath("//div[@class='videoAdUiSkipIcon']//*[name()='svg']")).click();
        //Thread.sleep(5000);
        
        System.out.println("The title of the page is "+driver.getTitle());
//        BongoBDAssignment bd =new BongoBDAssignment();
//                bd.goToAdminTab();
//        
        
        
    }
//      public void goToAdminTab ()
//    {
//      
//        driver.findElement(By.xpath("//span[normalize-space()='Music']")).click();
//        
//    }
}
    
      
    /**
     * @param args the command line arguments
     */
    
    

