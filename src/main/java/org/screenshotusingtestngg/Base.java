package org.screenshotusingtestngg;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class Base {
    public static WebDriver driver;
    public static void initilaization(){
        driver= new ChromeDriver();
        driver.get("https://awesomeqa.com/webtable.html");
    }

        public void failed(String testFailMethodName){

         File fileName = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         try {
             FileUtils.copyFile(fileName,new File("C:/Workspace/screenShot/src/main/java/ScreenShotFailed/"+testFailMethodName+"_"+".jpg"));
         }catch (Exception e){
             e.printStackTrace();
         }
        }
        public void passed(String testPassMethodName){
                File    fileName= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                try {
                   FileUtils.copyFile(fileName,new File("C:/Workspace/screenShot/src/main/java/ScreenShotPassed/"+testPassMethodName+"_"+".jpg"));
                }catch (Exception e){
                    e.printStackTrace();
                }
        }

        public void testStart(String testStartMethodName){
        File  fileName =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try{
            FileUtils.copyFile(fileName,new File("C:/Workspace/screenShot/src/main/java/ScreenShotTestStart/"+testStartMethodName+"_"+".jpg"));
        }catch (Exception e){
            e.printStackTrace();
        }}

        public void start(){
          File fileName= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
          try{
              FileUtils.copyFile(fileName,new File("C:/Workspace/screenShot/src/main/java/ScreenShotOnStart/"+"_"+".jpg"));
          }catch (Exception e){
              e.printStackTrace();
          }

        }




}
