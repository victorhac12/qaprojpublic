package pe.webVAC.automation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class webPages {

	WebDriver driver;
	
	public webPages(WebDriver driver) {
		this.driver=driver;
	}
											
	private By homePageLanguage = By.xpath("/html/body/header/div/ul[2]/li[2]/div/a/span[2]");
	
	private By homePageEnglish = By.xpath("/html/body/header/div/ul[2]/li[2]/div/div/ul/li/a/span[2]");
	private By homePageLanguageId = By.id("gh-eb-Geo-a-default");
	private By txtSearchfor = By.id("gh-ac");
	private By btnSearch = By.id("gh-btn");
	private By txtBrand = By.id("w3-w5-0[0]");
	private By chkBrand = By.xpath("/html/body/div[3]/div[4]/ul/li[1]/ul/li[2]/ul/li[2]/div[2]/ul/li[7]/div/a/span[1]");
	private By txtSizeBrand=By.xpath("/html/body/div[3]/div[4]/ul/li[1]/ul/li[2]/ul/li[1]/div[2]/div/a[5]");
	private By txtResults=By.xpath("/html/body/div[3]/div[5]/div[1]/div/div[2]/div/div[1]/h1");
	private By btnOrder=By.xpath("/html/body/div[3]/div[5]/div[1]/div/div[1]/div[3]/div[1]/div/button/div/div");
	private By txtAscendat=By.xpath("/html/body/div[3]/div[5]/div[1]/div/div[1]/div[3]/div[1]/div/div/div/ul/li[4]/a/span");
	private By txrValue1=By.xpath("//ul/li[1]/div/div[2]/div[3]/div[1]/span");
	private By txrValue2=By.xpath("//ul/li[2]/div/div[2]/div[3]/div[1]/span");
	private By txrValue3=By.xpath("//ul/li[3]/div/div[2]/div[3]/div[1]/span");
	private By txrValue4=By.xpath("//ul/li[4]/div/div[2]/div[3]/div[1]/span");
	private By txrValue5=By.xpath("//ul/li[5]/div/div[2]/div[3]/div[1]/span");

	private By txtProducto1=By.xpath("//ul/li[1]/div/div[2]/a/h3");
	private By txtProducto2=By.xpath("//ul/li[2]/div/div[2]/a/h3");
	private By txtProducto3=By.xpath("//ul/li[3]/div/div[2]/a/h3");
	private By txtProducto4=By.xpath("//ul/li[4]/div/div[2]/a/h3");
	private By txtProducto5=By.xpath("//ul/li[5]/div/div[2]/a/h3");
	
	
	public By getHomePageLanguage() {
		return homePageLanguage;
	}

	public void setHomePageLanguage(By homePageLanguage) {
		this.homePageLanguage = homePageLanguage;
	}

	public By getHomePageEnglish() {
		return homePageEnglish;
	}

	public void setHomePageEnglish(By homePageEnglish) {
		this.homePageEnglish = homePageEnglish;
	}

	public By getHomePageLanguageId() {
		return homePageLanguageId;
	}

	public void setHomePageLanguageId(By homePageLanguageId) {
		this.homePageLanguageId = homePageLanguageId;
	}

	public By getTxtSearchfor() {
		return txtSearchfor;
	}

	public void setTxtSearchfor(By txtsearchfor) {
		this.txtSearchfor = txtsearchfor;
	}

	public By getBtnSearch() {
		return btnSearch;
	}

	public void setBtnSearch(By btnsearch) {
		this.btnSearch = btnsearch;
	}

	public By getTxtBrand() {
		return txtBrand;
	}

	public void setTxtBrand(By txtbrand) {
		this.txtBrand = txtbrand;
	}

	public By getChkBrand() {
		return chkBrand;
	}

	public void setChkBrand(By chkbrand) {
		this.chkBrand = chkbrand;
	}

	public By getTxtSizeBrand() {
		return txtSizeBrand;
	}

	public void setTxtSizeBrand(By txtSizeBrand) {
		this.txtSizeBrand = txtSizeBrand;
	}

	public By getTxtResults() {
		return txtResults;
	}

	public void setTxtResults(By txtResults) {
		this.txtResults = txtResults;
	}

	public By getBtnOrder() {
		return btnOrder;
	}

	public void setBtnOrder(By btnOrder) {
		this.btnOrder = btnOrder;
	}

	public By getTxtAscendat() {
		return txtAscendat;
	}

	public void setTxtAscendat(By txtAscendat) {
		this.txtAscendat = txtAscendat;
	}

	public By getTxrValue1() {
		return txrValue1;
	}

	public void setTxrValue1(By txrValue1) {
		this.txrValue1 = txrValue1;
	}

	public By getTxrValue2() {
		return txrValue2;
	}

	public void setTxrValue2(By txrValue2) {
		this.txrValue2 = txrValue2;
	}

	public By getTxrValue3() {
		return txrValue3;
	}

	public void setTxrValue3(By txrValue3) {
		this.txrValue3 = txrValue3;
	}

	public By getTxrValue4() {
		return txrValue4;
	}

	public void setTxrValue4(By txrValue4) {
		this.txrValue4 = txrValue4;
	}

	public By getTxrValue5() {
		return txrValue5;
	}

	public void setTxrValue5(By txrValue5) {
		this.txrValue5 = txrValue5;
	}

	public By getTxtProducto1() {
		return txtProducto1;
	}

	public void setTxtProducto1(By txtProducto1) {
		this.txtProducto1 = txtProducto1;
	}

	public By getTxtProducto2() {
		return txtProducto2;
	}

	public void setTxtProducto2(By txtProducto2) {
		this.txtProducto2 = txtProducto2;
	}

	public By getTxtProducto3() {
		return txtProducto3;
	}

	public void setTxtProducto3(By txtProducto3) {
		this.txtProducto3 = txtProducto3;
	}

	public By getTxtProducto4() {
		return txtProducto4;
	}

	public void setTxtProducto4(By txtProducto4) {
		this.txtProducto4 = txtProducto4;
	}

	public By getTxtProducto5() {
		return txtProducto5;
	}

	public void setTxtProducto5(By txtProducto5) {
		this.txtProducto5 = txtProducto5;
	}




	
}
