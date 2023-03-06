public class login {
}
    @Test @BeforeClass
    public void loginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLoginButton();
        Assert.assertTrue(homePage.isDisplayed());
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }


