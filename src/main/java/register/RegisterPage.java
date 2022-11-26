package register;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
    WebDriver driver;

    public RegisterPage(WebDriver driverParametro){
        driver = driverParametro;
    }
    private String firstName = "//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input";
    private String lastName = "//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input";
    private String adress = "//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea";
    private String emailAdress = "//*[@id=\"eid\"]/input";
    private String phoneXpath = "//*[@id=\"basicBootstrapForm\"]/div[4]/div/input";
    private String gender = "//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input" ;
    private String hobbies = "//*[@id=\"checkbox2\"]";
    private String skills = "Skills";
    private String country = "//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span";
    private String country2 = "//*[@id=\"select2-country-results\"]/li[2]";
    private String year = "yearbox";
    private String month = "//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select";
    private String day = "daybox";

    public void preencherNome(String nome) {
        driver.findElement(By.xpath(firstName)).sendKeys(nome);
    }

    public void preencherSobrenome (String sobrenome){
        driver.findElement(By.xpath(lastName)).sendKeys(sobrenome);
    }

    public void preencherEndereco (String endereco){
        driver.findElement(By.xpath(adress)).sendKeys(endereco);
    }
    public void preencherEmail (String email){
        driver.findElement(By.xpath(emailAdress)).sendKeys(email);
    }
    public void preencherPhone (String phone){
        driver.findElement(By.xpath(phoneXpath)).sendKeys(phone);

    }
    public void clicarGender (){
        //basta colocar um scroll automatico antes do click quando tem popup escondendo o campo a ser clicado
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,550)", "");
        driver.findElement(By.xpath(gender)).click();
    }
    public void clicarHobbies(){
        driver.findElement(By.xpath(hobbies)).click();
    }
    public void selecionarSkills(String ski){
        Select skillsSelect = new Select(driver.findElement(By.id(skills)));
        skillsSelect.selectByVisibleText(ski);
    }
    public void selecionarCountry (){
        driver.findElement(By.xpath(country)).click();
        driver.findElement(By.xpath(country2)).click();

    }
    public void selecionarAno (String ano1){
        Select ano = new Select(driver.findElement(By.id(year)));
        ano.selectByVisibleText(ano1);
    }
    public void selecionarMes(String meses){
        Select mes = new Select(driver.findElement(By.xpath(month)));
        mes.selectByVisibleText(meses);
    }
    public void selecionarDia(String dias){
        Select dia = new Select(driver.findElement(By.id(day)));
        dia.selectByVisibleText(dias);
}

}