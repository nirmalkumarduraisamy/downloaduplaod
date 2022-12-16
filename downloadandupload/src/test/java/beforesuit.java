import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class beforesuit {

	@BeforeSuite
	public static void  before() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nirmal\\cromedriver15-12-2022\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/file.xhtml;jsessionid=node0s7cj64vw5e7w1nq6zrbe70eqc475582.node0");
		
	}
}
