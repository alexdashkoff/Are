import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Alexey on 3/17/2017.
 */
public class TestBase {

    protected final AppManager app = new AppManager();

    @BeforeMethod
    public void setUp() throws Exception {
        app.init();
    }

    @AfterMethod
    public void tearDown() {
        app.stop();
    }


    public AppManager getApp() {
        return app;
    }
}
