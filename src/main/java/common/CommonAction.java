package common;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import reports.Loggers;
import util.LoggerClass;

public class CommonAction {
	public static void click(WebElement element) {
		try {
			element.click();
			LoggerClass.log("Element has been clicked ---> " + element);
		} catch (Exception e) {
			e.printStackTrace();
			LoggerClass.log("Element Not Found ---> " + element);
			Assert.fail();
		}
	}

	public static void input(WebElement element, String value) {
		try {
			element.sendKeys(value);
			LoggerClass.log(value + " : Value has been passed into ---> " + element);
		} catch (Exception e) {
			e.printStackTrace();
			LoggerClass.log("Element Not Found ---> " + element);
			Assert.fail();
		}
	}

	public static void scrollIntoView(JavascriptExecutor jsExecutor, WebElement element) {
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	public static boolean elementDisplayed(WebElement element) {
		try {
			boolean flag = element.isDisplayed();
			LoggerClass.log(element + "<---------> is Displayed, " + flag);
			Assert.assertTrue("Element is not displayed .....", true);
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			LoggerClass.log(element + "<----------> is not Displayed\n" + e.getMessage());
		}
		return true;
	}
		public static void pause(long sec) {
			try {
				Thread.sleep(sec * 1000);
				LoggerClass.log("Sleeping ... zZz " + sec);
			} catch (InterruptedException e) {
				e.printStackTrace();
				LoggerClass.log("Sleep interrupted");

			}
		}
			public static void selectByValue(WebElement element, String value) {
				Select select = new Select(element); 
				select.selectByValue(value);
			}
			
			public static void keyPress(String key, WebElement element) {
				
				if(key.equals("tab")) element.sendKeys(Keys.TAB);
				if(key.equals("left")) element.sendKeys(Keys.ARROW_LEFT);
				if(key.equals("right")) element.sendKeys(Keys.ARROW_RIGHT);
				if(key.equals("up")) element.sendKeys(Keys.ARROW_UP);
				if(key.equals("down")) element.sendKeys(Keys.ARROW_DOWN);
				if(key.equals("enter")) element.sendKeys(Keys.RETURN);
			}

	
}
