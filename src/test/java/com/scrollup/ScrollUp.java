package com.scrollup;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollUp {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		driver.get("file:///C:/Users/toshi/OneDrive/Desktop/scriptexe.html");
		driver.findElement(By.xpath("//input[@id=\"t1\"]"));
		JavascriptExecutor js = (JavaScriptExecutor)driver;
		js.executeScript("hi", args);
	}

}
