package tests.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Label;

public class OnlinerMainPage extends BaseForm {
    private Label catalog = new Label(By.linkText("Каталог"), "Catalog");
    public OnlinerMainPage() {
        super(By.xpath("//img['onliner_logo retina-off']"), "Onliner.by");
    }
    public void goToCatalog(){
        catalog.click();
    }

}
