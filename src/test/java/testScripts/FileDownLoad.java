package testScripts;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileDownLoad {

	public static void main(String[] args) throws InterruptedException {
		
//		chromeoption is used for download when some browser have restricted the download
//		but in this case not need to use the chromeoptions, without it download will work but for
//		understanding purpose we have used the chromoptions here
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.prompt_for_download", false);
		options.setExperimentalOption("prefs", prefs);
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
        driver.get("https://chromedriver.storage.googleapis.com/index.html?path=79.0.3945.36/");
        Thread.sleep(2000);
        WebElement btnDownload = driver.findElement(
        		By.xpath(".//a[text()='chromedriver_win32.zip']"));
        		
        btnDownload.click();
        Thread.sleep(7000);
		
	}

}
