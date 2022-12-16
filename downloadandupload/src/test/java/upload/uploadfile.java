package upload;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import downloadandupload.dwonloadfile;

public class uploadfile extends dwonloadfile {
	WebDriver driver;
	@Test(priority = 2)
	public void uploadfiles()  throws AWTException  {


		
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Nirmal\\cromedriver15-12-2022\\chromedriver_win32\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		 * driver.manage().window().maximize(); driver.get(
		 * "https://www.leafground.com/file.xhtml;jsessionid=node0s7cj64vw5e7w1nq6zrbe70eqc475582.node0"
		 * );
		 */
		this.driver.findElement((By) By.xpath("//*[@id=\"j_idt88:j_idt89\"]/span[1]")).click();
		StringSelection selection = new StringSelection("C:\\Users\\Nirmal\\Downloads\\TestLeaf Logo.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

		Robot robot =new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);














		/*
		 * StringSelection selection = new
		 * StringSelection("C:\\Users\\Nirmal\\Downloads\\TestLeaf Logo.png");
		 * Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,
		 * null);
		 * 
		 * Robot robot= new Robot();
		 * 
		 * robot.keyPress(KeyEvent.VK_CONTROL); robot.keyPress(KeyEvent.VK_V);
		 * robot.keyRelease(KeyEvent.VK_V); robot.keyRelease(KeyEvent.VK_CONTROL);
		 * robot.keyPress(KeyEvent.VK_ENTER); robot.keyRelease(KeyEvent.VK_ENTER);
		 */

	}
}
