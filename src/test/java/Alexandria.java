import org.testng.annotations.Test;

public class Alexandria extends TestBase {

    @Test
    public void Alexandria() {
        app.Enter();
        app.About();
        app.ClusterModel();
        app.Locations();
        app.Edge();
        app.Investors();
        app.Request_Info(new GroupData("*^%^", "^&$*", "mail@mail.com", "gsadfgass", "gfdgfdg", "dfgdfg", "dfgdfg", "507914"));
    }

}
