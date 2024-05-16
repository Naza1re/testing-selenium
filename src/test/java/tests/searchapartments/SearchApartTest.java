package tests.searchapartments;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class SearchApartTest extends BaseTest {

    /*@Test
    public void checkIsRedirectToListing() {
        basePage.open("https://realt.by");

        realtHomePage
                .enterCountRooms()
                .clickToFind();
        realtListingPage
                .checkCountCards();
    }*/

    @Test
    public void openMorningLesson(){
        basePage.open("https://newsdo.vsu.by");
        newSdoHomePage.enterCredentials()
                .clickEnterButton();
        newSdoListingPage.openTуорияИнформации();

    }

}
