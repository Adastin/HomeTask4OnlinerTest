package tests;

import tests.forms.Catalog;
import tests.forms.OnlinerMainPage;
import tests.forms.PageOfGoods;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import tests.forms.Result;
import webdriver.BaseTest;

public class OnlinerTest extends BaseTest {
    private String company;
    private double maxPrice;
    private int minDate;
    private double minSize;
    private double maxSize;

    @Parameters ({"company", "maxPrice", "minDate", "minSize", "maxSize"})
    @BeforeTest
    public void setup(String company, double maxPrice, int minDate, double minSize, double maxSize){
        this.company = company;
        this.maxPrice = maxPrice;
        this.minDate = minDate;
        this.minSize = minSize;
        this.maxSize = maxSize;
    }
    @Override
    public void runTest() {
        logger.step(1);
        OnlinerMainPage onlinerMainPage = new OnlinerMainPage();
        onlinerMainPage.goToCatalog();

        logger.step(2);
        Catalog catalog = new Catalog();
        catalog.goToTv();

        logger.step(3);
        PageOfGoods pageOfGoods = new PageOfGoods();

        logger.step(4);
        pageOfGoods.setParameters(maxPrice, minDate, minSize, maxSize);

        logger.step(5);
        Result result = new Result();

        logger.step(6);
        result.checkList(company, maxPrice, minDate, minSize, maxSize);

    }
}
