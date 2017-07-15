package BrowserProxysettings_Handel;
 
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Proxy.ProxyType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
 
public class setProxy {
 
                public static void main(String[] args) {
 
                                //fun_firefoxBrowser();
                                fun_ieBrowser();            
                                //fun_chromeBrowser();
 
                }
               
               
                public static void fun_firefoxBrowser(){
                               
                                System.setProperty("webdriver.firefox.bin", "C:\\Users\\venkateswararao.n\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
                               
                                ProfilesIni profile = new ProfilesIni();
                               
                                FirefoxProfile fx = profile.getProfile("demo");
                               
                                Proxy proxy = new Proxy();
                               
                                //Autodetect proxy
                                fx.setPreference("network.proxy.type", ProxyType.AUTODETECT.ordinal());
                               
                                //manual proxy
                                //fx.setPreference("network.proxy.type", ProxyType.MANUAL.ordinal());
                               
                                //System Proxy
                                //fx.setPreference("network.proxy.type", ProxyType.SYSTEM.ordinal());
                               
                                //No Proxy
                                //fx.setPreference("network.proxy.type", ProxyType.DIRECT.ordinal());
                               
                                WebDriver driver = new FirefoxDriver(fx);
                               
                                driver.get("http://seleniumhq.org");
                               
                               
                               
                }
 
               
                public static void fun_ieBrowser(){
                               
                               
                                System.setProperty("webdriver.ie.driver", "C:\\jars\\IEDriverServer.exe");
                               
                                DesiredCapabilities cap = new DesiredCapabilities();
                               
                                cap.setBrowserName("iexplore");
                               
                                Proxy proxy = new Proxy();
                               
                                //proxy.setProxyAutoconfigUrl("test");
                               
                                proxy.setAutodetect(true);
                               
                                cap.setCapability(CapabilityType.PROXY, proxy);
                               
                                WebDriver driver = new InternetExplorerDriver(cap);
                               
                                driver.get("http://google.com");
                               
                               
                               
                               
                               
                }
               
                //All IE browser proxy settings appliable for Chrome Browser
                public static void fun_chromeBrowser(){
                               
                               
                               
                }
               
               
}