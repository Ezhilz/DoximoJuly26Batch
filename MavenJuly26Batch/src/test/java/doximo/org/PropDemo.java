package doximo.org;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropDemo {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Ezhil\\eclipse-workspace\\MavenJuly26Batch\\Data.properties");
		
		
		Properties t=new Properties();
		t.load(fis);
		String name = t.getProperty("browser");
		System.out.println(name);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(t.getProperty("url"));
		driver.findElement(By.id("login2")).click();

		driver.findElement(By.id("loginusername")).sendKeys(t.getProperty("username"));
		driver.findElement(By.id("loginpassword")).sendKeys(t.getProperty("password"));
		driver.findElement(By.xpath("//button[@onclick='logIn()']")).click();
		
	}

}
