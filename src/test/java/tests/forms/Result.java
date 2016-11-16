package tests.forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webdriver.BaseForm;
import webdriver.elements.Label;

import java.util.ArrayList;
import java.util.List;

public class Result extends BaseForm {
    private By locator = By.xpath("//span[@data-bind='html: product.full_name']");
    List<WebElement> list;
    ArrayList<String> stringList = new ArrayList<String>();
    public Result() {
        super(By.xpath("//h1"), "Result");
        list = findList(locator);
        for (WebElement element : list){
            stringList.add(element.getText());
        }
    }
    public int getSizeOfList(){
        return stringList.size();
    }

    public void checkList(){
        int i = 1;
        for (String element : stringList){
            Label label = new Label(By.linkText(element),"Product #" + i);
            i++;
            label.click();
            Product product = new Product();
            product.checkParameters();
            browser.back();
        }

    }
}
