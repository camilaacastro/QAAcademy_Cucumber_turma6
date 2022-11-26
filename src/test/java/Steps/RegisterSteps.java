package Steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import register.RegisterPage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.time.Duration;

public class RegisterSteps {
    RegisterPage registerPage;
    WebDriver driver;

    @Before("@register")
    public void abrirBrowser(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));

    }

    @After("@register")
    public void fecharBrowser(){
       driver.quit();

    }

    @AfterStep("@register")
    public void print(){
    TakesScreenshot screenshot = ((TakesScreenshot) driver); // Convertendo o driver em TakesScreenshot
    byte[] printBytes = screenshot.getScreenshotAs(OutputType.BYTES);
    InputStream printStream = new ByteArrayInputStream(printBytes);
    Allure.addAttachment("CEP",printStream);
}

    @Dado("que eu acesse o site Register")
    public void queEuAcesseOSiteRegister(){
    driver.get ("https://demo.automationtesting.in/Register.html");

    }

    @Quando("preencho o campo nome com valor {string} e sobrenome {string}")
    public void preenchoOCampoNomeComValorESobrenome(String nome, String sobrenome){
    registerPage = new RegisterPage(driver);
    registerPage.preencherNome(nome);
    registerPage.preencherSobrenome(sobrenome);

    }

    @E("preencho o campo endereço com valor {string}")
    public void preenchoOCampoEnderecoComValor(String end) {
        registerPage.preencherEndereco(end);
    }

    @E("preencho o email com valor {string}")
    public void preenchoOEmailComValor(String email) {
        registerPage.preencherEmail(email);
    }

    @E("preencho o campo telefone com valor {string}")
    public void preenchoOCampoTelefoneComValor(String fone) {
        registerPage.preencherPhone(fone);
    }

    @E("clico no checkbox feminino")
    public void clicoNoCheckboxFeminino() {
        registerPage.clicarGender();
    }

    @E("clico no checkbox movies")
    public void clicoNoCheckboxMovies() {
        registerPage.clicarHobbies();
    }

    @E("seleciono skills {string}")
    public void selecionoSkills(String skill) {
        registerPage.selecionarSkills(skill);
    }

    @E("seleciono um country")
    public void selecionoUmCountry() {
        registerPage.selecionarCountry();
    }

    @E("seleciono o ano {string}, o mes {string}, o dia {string}")
    public void selecionoOAnoOMesODia(String ano, String mes, String dia) {
        registerPage.selecionarAno(ano);
        registerPage.selecionarMes(mes);
        registerPage.selecionarDia(dia);
}
  }