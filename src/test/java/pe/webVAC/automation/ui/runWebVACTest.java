package pe.webVAC.automation.ui;

import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


import pe.webVAC.automation.pageobjects.webPages;

public class runWebVACTest {
	
   	
	WebDriver driver;
	webPages objWebPages;
	
	
	@BeforeTest
	
	
	public void setup() {
		
		System.setProperty("webdriver.gecko.driver","C:\\automatizacion\\gecko\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		objWebPages = new webPages(driver);
		driver.get("https://www.ebay.com");
		driver.manage().window().maximize();	
		
		
		
	}
	
	@Test
	public void TestWeb() {
	
		// Buscar por SHOES, PUMA, Size 10
		String strsearchfor = "shoes";
		String strsearchbrand = "PUMA";
		String strsizebrand = "10";
		String strResults,numValue1,numValue2,numValue3,numValue4,numValue5;
		int Value1,Value2,Value3,Value4,Value5;
		String reValue1="",reValue2="",reValue3="",reValue4="",reValue5="";
		String prodValue1,prodValue2,prodValue3,prodValue4,prodValue5;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.findElement(objWebPages.getTxtSearchfor()).sendKeys(strsearchfor);
		driver.findElement(objWebPages.getBtnSearch()).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//scrolldown
		js.executeScript("window.scrollBy(0,500)");
		///
		driver.findElement(objWebPages.getTxtBrand()).sendKeys(strsearchbrand);
		driver.findElement(objWebPages.getChkBrand()).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//scrolldown
		js.executeScript("window.scrollBy(0,500)");
		///
		
		driver.findElement(objWebPages.getTxtSizeBrand()).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Order by price ascendant
		driver.findElement(objWebPages.getBtnOrder()).click();
		driver.findElement(objWebPages.getTxtAscendat()).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//scrolldown
		js.executeScript("window.scrollBy(0,250)");
		///
		
		// Assert 5 first, List Products and Prices
		Value1= driver.findElement(objWebPages.getTxrValue1()).getText().length();
		numValue1= driver.findElement(objWebPages.getTxrValue1()).getText().substring(4);
		Float numberValue1=Float.parseFloat(numValue1);
		
		Value2= driver.findElement(objWebPages.getTxrValue2()).getText().length();
		numValue2= driver.findElement(objWebPages.getTxrValue2()).getText().substring(4);
		Float numberValue2=Float.parseFloat(numValue2);
		
		Value3= driver.findElement(objWebPages.getTxrValue3()).getText().length();
		numValue3= driver.findElement(objWebPages.getTxrValue3()).getText().substring(4);
		Float numberValue3=Float.parseFloat(numValue3);
		
		prodValue1=driver.findElement(objWebPages.getTxtProducto1()).getText();
		prodValue2=driver.findElement(objWebPages.getTxtProducto2()).getText();
		prodValue3=driver.findElement(objWebPages.getTxtProducto3()).getText();
		
		List<String> ListarProductosAsc = new ArrayList<String>();
		ListarProductosAsc.add(prodValue1);
		ListarProductosAsc.add(prodValue2);
		ListarProductosAsc.add(prodValue3);
	        
		//scrolldown
		js.executeScript("window.scrollBy(0,300)");
		///
				
		
		Value4= driver.findElement(objWebPages.getTxrValue4()).getText().length();
		numValue4= driver.findElement(objWebPages.getTxrValue4()).getText().substring(4);
		Float numberValue4=Float.parseFloat(numValue4);
		
		Value5= driver.findElement(objWebPages.getTxrValue5()).getText().length();
		numValue5= driver.findElement(objWebPages.getTxrValue5()).getText().substring(4);
		Float numberValue5=Float.parseFloat(numValue5);

		prodValue4=driver.findElement(objWebPages.getTxtProducto4()).getText();
		prodValue5=driver.findElement(objWebPages.getTxtProducto5()).getText();
		
		ListarProductosAsc.add(prodValue4);
		ListarProductosAsc.add(prodValue5);
	
		if (numberValue1<=numberValue2) {
			reValue1 = "Valor 1 es menor de todos";
		} else if (numberValue1>numberValue2) {
			reValue1 = "Error en Valor 1";
		} 
		
		if (numberValue2<=numberValue3) {
			reValue2 = "Valor 2 es mayor que 1";
		} else if (numberValue2>numberValue3) {
			reValue2 = "Error en Valor 2";
		}
		if (numberValue3<=numberValue4) {
			reValue3 = "Valor 3 es mayor que 1 y 2";
			 
		} else if (numberValue3>numberValue4) {
			reValue3 = "Error en Valor 3";
			 
		} 
		
		if (numberValue4<=numberValue5) {
			reValue4 = "Valor 4 es mayor que 1, 2 y 3";
			
		} else if (numberValue4>numberValue5) {
			reValue4 = "Error en Valor 4";
			
		}
		
		if (numberValue5>=numberValue4) {
			reValue5 = "Valor 5 es mayor que todos";
			
		} else if (numberValue4>numberValue5) {
			reValue5 = "Error en Valor 5";
			
		}

		strResults = driver.findElement(objWebPages.getTxtResults()).getText();
		System.out.println("==================INICIO===================\n");
		System.out.println("Búsqueda: " + strResults);
		System.out.println("Assert: ");
		System.out.println("::>" +reValue1);
		System.out.println("::>" +reValue2);
		System.out.println("::>" +reValue3);
		System.out.println("::>" +reValue4);
		System.out.println("::>" +reValue5);
		
		System.out.println("\n Listar Producto con sus precios: \n");
		System.out.println("1) "+prodValue1+" - "+numberValue1);
		System.out.println("2) "+prodValue2+" - "+numberValue2);
		System.out.println("3) "+prodValue3+" - "+numberValue3);
		System.out.println("4) "+prodValue4+" - "+numberValue4);
		System.out.println("5) "+prodValue5+" - "+numberValue5);
		
		System.out.println("\n Listar Productos ascendente: \n");
	        Collections.sort(ListarProductosAsc); 
            for (String strListarProductosAsc : ListarProductosAsc) {
            	System.out.println("::> "+strListarProductosAsc);
            }
		
        System.out.println("\n Listar Precio de Productos descendente: \n");
        	List<Float> ListarProdPrecioDesc = new ArrayList<Float>();
        	ListarProdPrecioDesc.add(numberValue1);
        	ListarProdPrecioDesc.add(numberValue2);
        	ListarProdPrecioDesc.add(numberValue3);
        	ListarProdPrecioDesc.add(numberValue4);
        	ListarProdPrecioDesc.add(numberValue5);
        	
        	Collections.sort(ListarProdPrecioDesc, Collections.reverseOrder());
        	
        	for (Float intListarProdPrecioDesc : ListarProdPrecioDesc) {
        		System.out.println("::> "+intListarProdPrecioDesc);
        	}
        	

		
		System.out.println("===================FIN=====================");
		
	}
	

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }
  
 

}
