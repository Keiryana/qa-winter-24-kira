package pages;

import org.junit.jupiter.api.Test;

public class InternetShopPagesTest {
    @Test
    public void testOnPages() {
        BaseFunc baseFunc = new BaseFunc();
        baseFunc.openURL("1a.lv");


        HomePage homePage = new HomePage(baseFunc);
        homePage.acceptCookies();
        homePage.selectMenuItem("Mēbeles");

     SubcategoriesPage subcategoriesPage = new SubcategoriesPage(baseFunc);
     subcategoriesPage.selectSubcategory("Guļamistaba");
     subcategoriesPage.selectSubcategory("Plaukti");

     CatalogPage catalogPage = new CatalogPage(baseFunc);
     catalogPage.setPriceFilter(25, 100);
    }

}

