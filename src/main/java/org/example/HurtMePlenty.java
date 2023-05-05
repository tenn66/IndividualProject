package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HurtMePlenty {
    WebDriver driver;
    @FindBy( id= "input_96")
    WebElement instance ;
    @FindBy( xpath= "//*[@id=\"select_value_label_88\"]/span[2]")
    WebElement os1 ;
    @FindBy( id= "select_option_98")
    WebElement os2 ;
    @FindBy( xpath= "//*[@id=\"select_value_label_89\"]/span[2]")
    WebElement vm1 ;
    @FindBy( id= "select_option_111")
    WebElement vm2 ;
    @FindBy( xpath= "//*[@id=\"select_value_label_91\"]/span[2]")
    WebElement series1 ;
    @FindBy( id= "select_option_212")
    WebElement series2 ;
    @FindBy( xpath= "//*[@id=\"select_value_label_92\"]/span[2]")
    WebElement inst_type1 ;
    @FindBy( xpath= "//*[@id=\"select_option_451\"]/div")
    WebElement inst_type2 ;
    @FindBy( css= "#mainForm > div:nth-child(3) > div > md-card > md-card-content > div > div:nth-child(1) > form > div:nth-child(14) > div.layout-column.flex-gt-sm-90.flex-80 > md-input-container > md-checkbox > div.md-label")
    WebElement unadd ;

    @FindBy( css= "#mainForm > div:nth-child(3) > div > md-card > md-card-content > div > div:nth-child(1) > form > div:nth-child(15) > div.layout-column.flex-gt-sm-90.flex-80 > md-input-container > md-checkbox")
    WebElement addGpu ;
    @FindBy( id= "select_487")
    WebElement GPUType1 ;
    @FindBy( xpath= "//*[@id=\"select_option_494\"]/div")
    WebElement GPUType2 ;
    @FindBy( id= "select_489")
    WebElement NumType1 ;
    @FindBy( xpath= "//*[@id=\"select_option_497\"]/div")
    WebElement NumType2 ;

    @FindBy( id= "select_value_label_445")
    WebElement ssd1 ;
    @FindBy( xpath= "//*[@id=\"select_option_472\"]/div")
    WebElement ssd2 ;
    @FindBy( id= "select_value_label_94")
    WebElement location1 ;
    @FindBy( xpath= "//*[@id=\"select_option_253\"]/div")
    WebElement location2 ;
    @FindBy( xpath= "//*[@id=\"select_value_label_95\"]/span[2]")
    WebElement usage1 ;
    @FindBy( id= "select_option_134")
    WebElement usage2 ;
    @FindBy( xpath= "//*[@id=\"mainForm\"]/div[2]/div/md-card/md-card-content/div/div[1]/form/div[20]/button")
    WebElement estimate ;


    public HurtMePlenty(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    public void NoOfInstance() throws InterruptedException {
        JavascriptExecutor jsexecutor = (JavascriptExecutor) driver;
        jsexecutor.executeScript("window.scrollBy(0,300)", "");
        Thread.sleep(2000);

        driver.switchTo().frame(0);
        driver.switchTo().frame(0);
        instance.click();
        Thread.sleep(2000);
        instance.sendKeys("4");
        Thread.sleep(2000);
    }
    public void setOS() throws InterruptedException {
        os1.click();
        Thread.sleep(2000);
        os2.click();
        Thread.sleep(2000);
    }
    public void VM_Class() throws InterruptedException{
        vm1.click();
        Thread.sleep(2000);
        vm2.click();
        Thread.sleep(2000);
    }
    public void Series() throws InterruptedException{
        series1.click();
        Thread.sleep(2000);
        series2.click();
        Thread.sleep(2000);
    }
    public void Instance_Type() throws InterruptedException{
        inst_type1.click();
        Thread.sleep(2000);
        inst_type2.click();
        Thread.sleep(2000);
    }
    public void GPU() throws InterruptedException{

        unadd.click();
        Thread.sleep(2000);
        addGpu.click();
        Thread.sleep(2000);

        GPUType1.click();
        Thread.sleep(2000);
        GPUType2.click();
        Thread.sleep(2000);


        NumType1.click();
        Thread.sleep(2000);
        NumType2.click();
        Thread.sleep(2000);
    }
    public void Local_SSD() throws InterruptedException {
        ssd1.click();
        Thread.sleep(2000);
        ssd2.click();
        Thread.sleep(2000);
    }
    public void Location() throws InterruptedException {
        location1.click();
        Thread.sleep(2000);
        location2.click();
        Thread.sleep(2000);
    }
    public void usage() throws InterruptedException {
        usage1.click();
        Thread.sleep(2000);
        usage2.click();
        Thread.sleep(2000);
    }
    public void Estimate() throws InterruptedException {
        estimate.click();
        Thread.sleep(2000);
    }

    public void takeScreenshot(WebDriver driver) throws IOException
    {
        // Create the screenshot object
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        // Take the screenshot as a file
        File source = screenshot.getScreenshotAs(OutputType.FILE);
        // Create a destination file with the current date and time as the filename
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
        String fileName = "screenshot" + dateFormat.format(new Date()) + ".png";
        File destination = new File("/Users/tenzinwangmo/Desktop/JLPT" + fileName);
        // Copy the source file to the destination file
        FileUtils.copyFile(source, destination);
        System.out.println("Screenshot taken and saved to: " + source + "  --->  "+ destination);
    }


}
