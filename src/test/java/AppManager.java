import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Alexey on 3/17/2017.
 */
public class AppManager {
    FirefoxDriver wd;

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    protected void init() {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    protected void Enter() {
        wd.get("http://www.are.com/");
    }

    protected void Request_Info(GroupData groupData) {
        wd.findElement(By.xpath("//div[@id='irwMenuTable']//a[.='Request Information']")).click();
        wd.findElement(By.name("8ffd9084-3a0f-448d-8136-9f1a4c06c170")).click();
        wd.findElement(By.name("8ffd9084-3a0f-448d-8136-9f1a4c06c170")).clear();
        wd.findElement(By.name("8ffd9084-3a0f-448d-8136-9f1a4c06c170")).sendKeys(groupData.getPar1());
        wd.findElement(By.name("ecd4bad4-f7fe-4ff9-a108-df2011bd0997")).click();
        wd.findElement(By.name("ecd4bad4-f7fe-4ff9-a108-df2011bd0997")).clear();
        wd.findElement(By.name("ecd4bad4-f7fe-4ff9-a108-df2011bd0997")).sendKeys(groupData.getPar2());
        wd.findElement(By.name("514ae8af-ac35-46a8-888e-6208f8d9d0a6")).click();
        wd.findElement(By.name("514ae8af-ac35-46a8-888e-6208f8d9d0a6")).clear();
        wd.findElement(By.name("514ae8af-ac35-46a8-888e-6208f8d9d0a6")).sendKeys(groupData.getPar3());
        wd.findElement(By.name("4ec29bd0-085d-49aa-a9e7-0884471c94da")).click();
        wd.findElement(By.name("4ec29bd0-085d-49aa-a9e7-0884471c94da")).clear();
        wd.findElement(By.name("4ec29bd0-085d-49aa-a9e7-0884471c94da")).sendKeys(groupData.getPar4());
        wd.findElement(By.name("bbb95acc-2a7c-44c1-97c7-09ee30cee0e0")).click();
        wd.findElement(By.name("bbb95acc-2a7c-44c1-97c7-09ee30cee0e0")).clear();
        wd.findElement(By.name("bbb95acc-2a7c-44c1-97c7-09ee30cee0e0")).sendKeys(groupData.getPar5());
        wd.findElement(By.name("14425e0c-84d6-4f2e-9387-d7e8cea2efd1")).click();
        wd.findElement(By.name("14425e0c-84d6-4f2e-9387-d7e8cea2efd1")).clear();
        wd.findElement(By.name("14425e0c-84d6-4f2e-9387-d7e8cea2efd1")).sendKeys(groupData.getPar6());
        wd.findElement(By.name("367eb2b2-484b-41c8-b46a-83dedf7f01df")).click();
        wd.findElement(By.name("367eb2b2-484b-41c8-b46a-83dedf7f01df")).clear();
        wd.findElement(By.name("367eb2b2-484b-41c8-b46a-83dedf7f01df")).sendKeys(groupData.getPar7());
        wd.findElement(By.name("captcha")).click();
        wd.findElement(By.name("captcha")).clear();
        wd.findElement(By.name("captcha")).sendKeys(groupData.getCaptcha());
        wd.findElement(By.id("InfoRequestSubmit")).click();
    }

    protected void Investors() {
        wd.findElement(By.linkText("FOR INVESTORS »")).click();
        wd.findElement(By.cssSelector("a.irwSubMenuLinks")).click();
        wd.findElement(By.xpath("//div[@id='irwMenuTable']//a[.='Company Overview']")).click();
    }

    protected void Edge() {
        wd.findElement(By.linkText("OUR EDGE »")).click();
        wd.findElement(By.xpath("//ul[@class='side_menu']//span[.='Collaborative Locations']")).click();
        wd.findElement(By.xpath("//ul[@class='side_menu']//span[.='High-Quality Real Estate']")).click();
        wd.findElement(By.xpath("//ul[@class='side_menu']//span[.='Creative Amenities']")).click();
        wd.findElement(By.xpath("//ul[@class='side_menu']//span[.='Unparalleled Team']")).click();
        wd.findElement(By.xpath("//ul[@class='side_menu']//span[.='Expansive Network']")).click();
        wd.findElement(By.xpath("//ul[@class='side_menu']//span[.='World-Class Tenants']")).click();
        wd.findElement(By.id("footer")).click();
    }

    protected void Locations() {
        wd.findElement(By.linkText("OUR LOCATIONS »")).click();
        wd.findElement(By.xpath("//ul[@class='side_menu']//span[.='Greater Boston']")).click();
        wd.findElement(By.xpath("//ul[@class='side_menu']//span[.='San Francisco']")).click();
        wd.findElement(By.xpath("//ul[@class='side_menu']//span[.='New York City']")).click();
        wd.findElement(By.xpath("//ul[@class='side_menu']//span[.='San Diego']")).click();
        wd.findElement(By.xpath("//ul[@class='side_menu']//span[.='Seattle']")).click();
        wd.findElement(By.xpath("//ul[@class='side_menu']//span[.='Maryland']")).click();
        wd.findElement(By.id("footer")).click();
    }

    protected void ClusterModel() {
        wd.findElement(By.linkText("OUR CLUSTER MODEL »")).click();
        wd.findElement(By.id("footer")).click();
        wd.findElement(By.xpath("//a[@class='next']/img")).click();
    }

    protected void About() {
        wd.findElement(By.linkText("ABOUT ALEXANDRIA »")).click();
        wd.findElement(By.xpath("//ul[@class='side_menu']//span[.='Life Science Expertise']")).click();
        wd.findElement(By.xpath("//ul[@class='side_menu']//span[.='Sustainability']")).click();
        wd.findElement(By.xpath("//ul[@class='side_menu']//span[.='Timeline']")).click();
        wd.findElement(By.xpath("//ul[@class='side_menu']//span[.='Meet Our Team']")).click();
        wd.findElement(By.xpath("//ul[@class='side_menu']//span[.='In The News']")).click();
        wd.findElement(By.xpath("//ul[@class='side_menu']//span[.='Careers']")).click();
        wd.findElement(By.xpath("//ul[@class='side_menu']//span[.='Video Testimonials']")).click();
        wd.findElement(By.xpath("//ul[@class='side_menu']//span[.='Contact Us']")).click();
        wd.findElement(By.id("footer")).click();
    }

    protected void stop() {
        wd.quit();
    }
}
