package CertificateErrors_Handel;
 
import java.io.File;
import java.io.IOException;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
 
public class CertifcatewithDesired {
 
      
       public static void main(String[] args) throws IOException {
      
       fun_ffaddextension();
       //fun_iebrowser();
       //fun_chromebrowser();
             
 
       }
 
      
       public static void fun_ffaddextension() throws IOException{
      
             
             
              ProfilesIni profile = new ProfilesIni();
             
             
              FirefoxProfile fx = profile.getProfile("default");
             
              fx.addExtension(new File("C:\\firebug_file\\firepath-0.9.7-fx.xpi"));
              fx.addExtension(new File("C:\\firebug_file\\firebug-2.0.1-fx.xpi"));
             
              DesiredCapabilities cap = new DesiredCapabilities();
             
              cap.setCapability("firefox_profile", fx);
             
              cap.setCapability("firefox_binary", "C:\\Users\\venkateswararao.n\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
             
              cap.setBrowserName("firefox");
             
              cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
      
              WebDriver driver = new FirefoxDriver(cap);
             
              driver.get("http://google.com");
             
       }
      
       public static void fun_iebrowser(){
             
             
             
              System.setProperty("webdriver.ie.driver", "C:\\jars\\IEDriverServer.exe");
             
              DesiredCapabilities cap = new DesiredCapabilities();
             
              cap.setBrowserName("iexplore");
             
              cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
             
              cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
             
              WebDriver driver = new InternetExplorerDriver(cap);
             
              driver.get("http://google.com");
      
             
       }
      
      
       public static void fun_chromebrowser(){
             
             
              System.setProperty("webdriver.chrome.driver", "C:\\jars\\chromedriver.exe");
             
              DesiredCapabilities cap = new DesiredCapabilities();
             
              cap.setBrowserName("chrome");
             
             
       //     ChromeOptions copt = new ChromeOptions();
             
       //       copt.setBinary("C:\\Users\\venkateswararao.n\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
             
              cap.setCapability("chrome_binary", "C:\\Users\\venkateswararao.n\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
             
              cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
                                        
              WebDriver driver = new ChromeDriver();
             
              driver.get("http://seleniumhq.org");
             
             
             
       }
      
 
}
 