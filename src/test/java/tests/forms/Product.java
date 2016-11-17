package tests.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Label;

public class Product extends BaseForm {
    private static int count = 1;
    private Label model = new Label(By.xpath("//h1"), "Модель");
    private Label year = new Label(By.xpath("//td[contains(text(),'Дата выхода на рынок')]/following-sibling::td/span"), "year");
    private Label price = new Label(By.xpath("//div[@class='b-offers-desc__info-sub']/a[1]"), "price");
    private Label size = new Label(By.xpath("//td[contains(text(),'Диагональ экрана')]//following-sibling::td/span"), "Size");
    protected Product() {
        super(By.xpath("//h1"), "Product #" + count);
        count++;
    }
    public void checkParameters(){
        String s = year.getText();
        int intYear = Integer.parseInt(s.substring(0, s.indexOf(' ')));
        s = price.getText();
        double minPrice = Double.parseDouble(s.replace(',', '.').substring(0, s.indexOf(' ')));
        s = size.getText();
        double doubleSize = Double.parseDouble(s.substring(0, s.indexOf('"')));
        assert(model.getText().contains("Samsung") && intYear >= 2013 && minPrice <= 1000 && doubleSize >= 39 && doubleSize <= 42);

    }
}
