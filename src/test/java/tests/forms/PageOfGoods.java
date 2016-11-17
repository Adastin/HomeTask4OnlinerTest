package tests.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Label;
import webdriver.elements.TextBox;

public class PageOfGoods extends BaseForm {
    private Label company = new Label(By.xpath("//span[text()=\"Samsung\"]"), "Samsung");
    private TextBox price = new TextBox(By.xpath("//input[@placeholder=\"до\"]"), "price");
    private TextBox sizeMin = new TextBox(By.xpath("//div/div[1]/select"), "min size");
    private TextBox sizeMax = new TextBox(By.xpath("//div/div[2]/select"), "max size");
    private TextBox date = new TextBox(By.xpath("//input[@placeholder='2010']"), "min date");
    public PageOfGoods() {
        super(By.xpath("//h1"), "TV sets");
    }
    public void setParameters(double maxPrice, int minDate, double minSize, double maxSize){
        company.click();
        price.type(String.valueOf(maxPrice));
        sizeMin.click();
        sizeMin.type(String.valueOf(minSize));
        sizeMax.click();
        sizeMax.type(String.valueOf(maxSize));
        date.type(String.valueOf(minDate));
    }

}
