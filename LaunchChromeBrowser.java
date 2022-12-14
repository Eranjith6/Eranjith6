import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {
	public static void main(String[] args) {
		//launch the browser
	
	ChromeDriver driver=new ChromeDriver();	
	//driver.get()
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.findElement(By.id("username")).sendKeys("democsr");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.partialLinkText("Create")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("wipro");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Eranjith");
	driver.findElement(By.id("createLeadForm_dataSourceId")).sendKeys("Employee");
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("eranjith");
	driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");
	driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("software tester");
	driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("3.2lakhs");
	driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("324568");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("tesing an application");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
	driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("50");
	driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("Rdr2");
	driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("6");
	driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("600626");
	driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("500");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("eranjithsankar@gmail.com");
	driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("company name");
	driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("tnagar");
	driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("chennai");
	driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600026");
	driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("600");
	driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9360642991");
	driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("9842756848");
	driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://leaftaps.com/opentaps/control/main");
	driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Sankar");
	driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Sankarankovil");
	driver.findElement(By.name("submitButton")).click();
	
	
	
}}
