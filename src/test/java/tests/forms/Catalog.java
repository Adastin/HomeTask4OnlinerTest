package tests.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;

public class Catalog extends BaseForm {
    private Button tvSet = new Button(By.linkText("Телевизоры"), "TV sets");
    public Catalog() {
        super(By.xpath("//img['onliner_logo retina-off']"), "Catalog");
    }

    public void goToTv(){
        tvSet.click();
    }
}
