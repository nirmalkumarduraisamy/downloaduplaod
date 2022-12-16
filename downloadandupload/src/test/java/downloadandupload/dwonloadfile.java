package downloadandupload;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.internal.annotations.BaseBeforeAfter;

public class dwonloadfile extends BaseBeforeAfter {



	@Test(priority = 1)
	public static void download() {


		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nirmal\\cromedriver15-12-2022\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://www.leafground.com/file.xhtml;jsessionid=node0s7cj64vw5e7w1nq6zrbe70eqc475582.node0");

		driver.findElement(By.xpath("//button[@id='j_idt93:j_idt95']")).click();

		File fileloaction = new File("C:\\Users\\Nirmal\\Downloads");
		File[] files =	fileloaction.listFiles();
		for (File file : files) {
			if(file.getName().equals("TestLeaf Logo.png")) {
				System.out.println("file was downloaded");
				break;
			}
			driver.quit();

		}




	}
}


