public class browser {
}
    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "11.0");
        caps.setCapability("deviceName", "Pixel 4");
        caps.setCapability("appPackage", "com.saucedemo.app");
        caps.setCapability("appActivity", "com.saucedemo.app.LoginActivity");
        caps.setCapability("noReset", "true");
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
    }

