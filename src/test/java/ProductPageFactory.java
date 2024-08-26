import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPageFactory {

    //Todo
    //a //h3[text()='Michaels's Cap']/following-sibling::div/child::button[2] xpath nem mukodik
    @FindBy(xpath = "//*[@id='post-973']/div/div[2]/div[2]/div[3]/div/button[2]")
    private WebElement capPlusButton;
    @FindBy(xpath = "")
    private WebElement capMinusButton;
    @FindBy(xpath = "")
    private WebElement capQuantityField;
    @FindBy(xpath = "")
    private WebElement mugPlusButton;
    @FindBy(xpath = "")
    private WebElement mugMinusButton;
    @FindBy(xpath = "")
    private WebElement mugQuantityField;
    @FindBy(xpath = "")
    private WebElement notebookPlusButton;
    @FindBy(xpath = "")
    private WebElement notebookMinusButton;
    @FindBy(xpath = "")
    private WebElement notebookQuantityField;
    @FindBy(xpath = "")
    private WebElement tShirtPlusButton;
    @FindBy(xpath = "")
    private WebElement tShirtMinusButton;
    @FindBy(xpath = "")
    private WebElement tShirtQuantityField;
    public ProductPageFactory(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void clickCapPlusButton(){
        capPlusButton.click();
    }

    public void clickCapMinusButton(){
            capMinusButton.click();
    }

    public void fillCapQuantityField(Integer quantity){
        capQuantityField.sendKeys(String.valueOf(quantity));
    }

    public void clickMugPlusButton(){
            capMinusButton.click();
    }

    public void clickMugMinusButton(){
            capMinusButton.click();
    }
    public void fillMugQuantityField(String quantity){
        capQuantityField.sendKeys(quantity);
    }
    public void clickNotebookPlusButton(){
            capMinusButton.click();
    }

    public void clickNotebookMinusButton(){
            capMinusButton.click();
    }
    public void fillNotebookQuantityField(String quantity){
        notebookQuantityField.sendKeys(quantity);
    }
    public void clickTShirtPlusButton(){
            capMinusButton.click();
    }

    public void clickTShirtMinusButton(){
            capMinusButton.click();
    }
    public void fillTShirtQuantityField(String quantity){
        tShirtQuantityField.sendKeys(quantity);
    }
}
