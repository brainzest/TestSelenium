package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.spackage mypackage;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class Test {
	
	    public static void main(String[] args) {
	        // Create a new instance of the Firefox driver
	        // Notice that the remainder of the code relies on the interface, 
	        // not the implementation.
	    	WebDriver driver = new HtmlUnitDriver();
	//    	WebDriver driver = new ChromeDriver();
	  //      WebDriver driver = new FirefoxDriver();
	    /*	Selenium s = new DefaultSelenium(null...);
	    	s.start("captureNetworkTraffic=true");
	    	s.open("http://www.google.com");
	    	String xml = s.captureNetworkTraffic("xml"); // html, plain
	    	s.stop();
	        // And now use this to visit Google
	      */
	    	driver.get("http://html5demos.com/web-socket");
	        // Alternatively the same thing can be done like this
	        // driver.navigate().to("http://www.google.com");

	        
	        boolean a =driver.getPageSource().contains("ws://");
	        boolean b =driver.getPageSource().contains("onscroll||oninput||autofocus||onchange||oninvalid|onblur|onfocus");
	        System.out.println(a);
	        System.out.println(b);
	        if (a){
	        	  System.out.println("Websocket is  Present on page "+driver.getCurrentUrl());
	        	  JOptionPane.showMessageDialog(null, "Are you safe? This ain't looks good.");
	        	}
	        	else{
	        	  System.out.println("websocket unsecure  is NOT Present on page "+driver.getCurrentUrl());
	        	  JOptionPane.showMessageDialog(null, "Phew you are safe");
	        	  //  fail =true;
	        	 // driver.close();
	        	} 
	        WebElement element = driver.findElement(By.xpath("//input[contains(autofocus|onscroll|oninput|onchange|oninvalid|onblur|onfocus)]"));

	        // Enter something to search for
	        element.sendKeys("Cheese!");

	        // Now submit the form. WebDriver will find the form for us from the element
	        element.submit();

	        // Check the title of the page
	        System.out.println("Page title is: " + driver.getTitle());
	        
	        // Google's search is rendered dynamically with JavaScript.
	        // Wait for the page to load, timeout after 10 seconds
	       
	        // Should see: "cheese! - Google Search"
	        System.out.println("Page title is: " + driver.getTitle());
	        
	        //Close the browser
	        driver.quit();
	    }
	
}
elenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class Test {
	
	    public static void main(String[] args) {
	        // Create a new instance of the Firefox driver
	        // Notice that the remainder of the code relies on the interface, 
	        // not the implementation.
	    	WebDriver driver = new HtmlUnitDriver();
	//    	WebDriver driver = new ChromeDriver();
	  //      WebDriver driver = new FirefoxDriver();
	    /*	Selenium s = new DefaultSelenium(null...);
	    	s.start("captureNetworkTraffic=true");
	    	s.open("http://www.google.com");
	    	String xml = s.captureNetworkTraffic("xml"); // html, plain
	    	s.stop();
	        // And now use this to visit Google
	      */
	    	driver.get("file:///home/skywalker/Desktop/shark/var/www/html5/repellant/shark-repellant.html");
	        // Alternatively the same thing can be done like this
	        // driver.navigate().to("http://www.google.com");

	        
	        boolean a =driver.getPageSource().contains("ws://");
	        boolean b =driver.getPageSource().contains("onscroll||oninput||autofocus||onchange||oninvalid|onblur|onfocus");
	        System.out.println(a);
	        System.out.println(b);
	        if (a){
	        	  System.out.println("Websocket is  Present on page "+driver.getCurrentUrl());
	        	}
	        	else{
	        	  System.out.println("websocket unsecure  is NOT Present on page "+driver.getCurrentUrl());
	        	//  fail =true;
	        	 // driver.close();
	        	} 
	        WebElement element = driver.findElement(By.xpath("//input[contains(autofocus|onscroll|oninput|onchange|oninvalid|onblur|onfocus)]"));

	        // Enter something to search for
	        element.sendKeys("Cheese!");

	        // Now submit the form. WebDriver will find the form for us from the element
	        element.submit();

	        // Check the title of the page
	        System.out.println("Page title is: " + driver.getTitle());
	        
	        // Google's search is rendered dynamically with JavaScript.
	        // Wait for the page to load, timeout after 10 seconds
	       
	        // Should see: "cheese! - Google Search"
	        System.out.println("Page title is: " + driver.getTitle());
	        
	        //Close the browser
	        driver.quit();
	    }
	
}
