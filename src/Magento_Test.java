
import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Magento_Test extends parameters_magento {
	@Test(priority = 50)
	public void sign_up() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[3]/a")).click();
		String[] My_info = { "Mohammed", "Al-Omari", "mohmmedomari17@gmail.com", "Omari123123@", "Amman" };
		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys(My_info[0]);
		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys(My_info[1]);
		driver.findElement(By.xpath("//*[@id=\"email_address\"]")).sendKeys(My_info[2]);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(My_info[3]);
		driver.findElement(By.xpath("//*[@id=\"password-confirmation\"]")).sendKeys(My_info[3]);
		driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button")).click();

		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(My_info[2]);
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(My_info[3]);
		driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
		String actule_valdition = driver.findElement(By.className("base")).getText();
		myassertion.assertEquals(actule_valdition, "My Account");
		myassertion.assertAll();
	}

	@Test(priority = 100)
	public void search_bar() {

		String[] item = { "Jacket", "t-shirt", "jeans for men", "jeans for women", "pants" };
		Random rand_num = new Random();
		int number_item = rand_num.nextInt(4);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys(item[number_item]);
		System.out.println(item[number_item]);

	}

	@Test(priority = 150)
	public void home_page_items_test() throws InterruptedException {
		Random rand = new Random();
		// Radiant_tee
		driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/a/img")).click();
		driver.findElement(
				By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[1]/div/a/span/span/img"))
				.click();
		String[] size = { "//*[@id=\"option-label-size-143-item-166\"]", "//*[@id=\"option-label-size-143-item-167\"]",
				"//*[@id=\"option-label-size-143-item-168\"]", "//*[@id=\"option-label-size-143-item-169\"]",
				"//*[@id=\"option-label-size-143-item-170\"]" };

		String[] color = { "//*[@id=\"option-label-color-93-item-50\"]", "//*[@id=\"option-label-color-93-item-56\"]",
				"//*[@id=\"option-label-color-93-item-57\"]" };
		// 3
		for (int i = 0; i < 1; i++) {
			int size_num = rand.nextInt(4);
			int color_num = rand.nextInt(3);
			Thread.sleep(5000);
			driver.findElement(By.xpath(size[size_num])).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath(color[color_num])).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
			Thread.sleep(5000);
		}
		// breathe- easy tank
		driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/a/img")).click();
		driver.findElement(
				By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[2]/div/a/span/span/img"))
				.click();

		String[] color2 = { "//*[@id=\"option-label-color-93-item-57\"]", "//*[@id=\"option-label-color-93-item-59\"]",
				"//*[@id=\"option-label-color-93-item-60\"]" };
//2
		for (int i = 0; i < 1; i++) {
			int size_num = rand.nextInt(4);
			int color_num = rand.nextInt(3);
			Thread.sleep(5000);
			driver.findElement(By.xpath(size[size_num])).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath(color2[color_num])).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
		}
		// argus all weather tank
		driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/a/img")).click();
		driver.findElement(
				By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[3]/div/a/span/span/img"))
				.click();
		// 4
		for (int i = 0; i < 1; i++) {
			int size_num = rand.nextInt(4);
			Thread.sleep(6000);
			driver.findElement(By.xpath(size[size_num])).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id=\"option-label-color-93-item-52\"]")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
			Thread.sleep(6000);
		}
		// hero hoodie
		driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/a/img")).click();
		driver.findElement(
				By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[4]/div/a/span/span/img"))
				.click();
		int size_num = rand.nextInt(4);
		int color_num = rand.nextInt(3);
		driver.findElement(By.xpath(size[size_num])).click();
		String[] color4 = { "//*[@id=\"option-label-color-93-item-49\"]", "//*[@id=\"option-label-color-93-item-52\"]",
				"//*[@id=\"option-label-color-93-item-53\"]" };
		driver.findElement(By.xpath(color4[color_num])).click();

		driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();

		// fusion backpack
		driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/a/img")).click();
		driver.findElement(
				By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[5]/div/a/span/span/img"))
				.click();

		// 5
		for (int i = 0; i < 1; i++) {
			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
			Thread.sleep(6000);
		}
	}

	@Test(priority = 200)
	public void CHECKOUT() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[1]/a/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"top-cart-btn-checkout\"]")).click();
		// WebElement City =
		// driver.findElement(By.xpath("//*[@id=\"shipping-new-address-form\"]/div[4]/div"));
		// List <WebElement> CityInput = City.findElements(By.tagName("input"));
		// CityInput.get(0).sendKeys("Irbid");

		Thread.sleep(5000);
		WebElement Next_one = driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div"));
		List<WebElement> NextSpan = Next_one.findElements(By.tagName("span"));
		NextSpan.get(0).click();
		Thread.sleep(5000);
	}

	@Test(priority = 250)
	public void PLACE_ORDER() throws InterruptedException {

		WebElement place = driver
				.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]"));
		List<WebElement> NextSpan = place.findElements(By.tagName("span"));
		NextSpan.get(0).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/p[1]/a")).click();
		Thread.sleep(5000);
		WebElement Total = driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tfoot/tr[3]/td/strong/span"));
		String Total1 = Total.getText();
		String price1 = Total1.replaceAll("\\$", "");
		String price2 = price1.replaceAll(".0", "");
		String price3 = price2.replaceAll("0", "");

		int price = Integer.parseInt(price3);

		int expcted_result = 152;
		myassertion.assertEquals(price, expcted_result);
		myassertion.assertAll();
	}

	@Test(priority = 300)
	public void re_order() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/span/button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("mohmmedomari17@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Omari123123@");
		driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();

//5
		for (int i = 0; i < 1; i++) {
			driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/span/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/div/ul/li[1]/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"block-collapsible-nav\"]/ul/li[2]/a")).click();
			Thread.sleep(4000);

			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tbody/tr[1]/td[6]/a[2]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[1]/ul/li[1]/button")).click();
			Thread.sleep(5000);
			WebElement Next_one = driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div"));
			List<WebElement> NextSpan = Next_one.findElements(By.tagName("span"));
			NextSpan.get(0).click();
			Thread.sleep(5000);

			WebElement place = driver
					.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]"));
			List<WebElement> NextSpan1 = place.findElements(By.tagName("span"));
			NextSpan1.get(0).click();

		}

	}

	@Test(priority = 350)
	public void invoices_5() throws InterruptedException

	{
		Thread.sleep(5000);

		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/span/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/div/ul/li[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"block-collapsible-nav\"]/ul/li[2]/a")).click();
		Thread.sleep(4000);

		WebElement invo_1 = driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tbody/tr[2]/td[6]/a[1]"));
		invo_1.click();
		String Total = driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tfoot/tr[3]/td/strong/span"))
				.getText();

		String price11 = Total.replaceAll("\\$", "");
		String price12 = price11.replaceAll(".0", "");
		String price13 = price12.replaceAll("0", "");
		int price_invo1 = Integer.parseInt(price13);
		int expcted_result1 = 152;
		myassertion.assertEquals(price_invo1, expcted_result1);
		myassertion.assertAll();

		driver.findElement(By.xpath("//*[@id=\"block-collapsible-nav\"]/ul/li[2]/a")).click();
		WebElement invo_2 = driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tbody/tr[4]/td[6]/a[1]"));
		invo_2.click();
		String Total2 = driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tfoot/tr[3]/td/strong/span"))
				.getText();
		String price21 = Total2.replaceAll("\\$", "");
		String price22 = price21.replaceAll(".0", "");
		String price23 = price22.replaceAll("0", "");
		int price2_invo = Integer.parseInt(price23);
		int expcted_result2 = 152;
		myassertion.assertEquals(price2_invo, expcted_result2);
		myassertion.assertAll();

		driver.findElement(By.xpath("//*[@id=\"block-collapsible-nav\"]/ul/li[2]/a")).click();
		WebElement invo_3 = driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tbody/tr[6]/td[6]/a[1]"));
		invo_3.click();
		String Total3 = driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tfoot/tr[3]/td/strong/span"))
				.getText();
		String price31 = Total3.replaceAll("\\$", "");
		String price32 = price31.replaceAll(".0", "");
		String price33 = price32.replaceAll("0", "");
		int price3_invo = Integer.parseInt(price33);
		int expcted_result3 = 152;
		myassertion.assertEquals(price3_invo, expcted_result3);
		myassertion.assertAll();

		driver.findElement(By.xpath("//*[@id=\"block-collapsible-nav\"]/ul/li[2]/a")).click();
		WebElement invo_4 = driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tbody/tr[3]/td[6]/a[1]"));
		invo_4.click();
		String Total4 = driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tfoot/tr[3]/td/strong/span"))
				.getText();
		String price41 = Total4.replaceAll("\\$", "");
		String price42 = price41.replaceAll(".0", "");
		String price43 = price42.replaceAll("0", "");
		int price4_invo = Integer.parseInt(price43);
		int expcted_result4 = 152;
		myassertion.assertEquals(price4_invo, expcted_result4);
		myassertion.assertAll();

		driver.findElement(By.xpath("//*[@id=\"block-collapsible-nav\"]/ul/li[2]/a")).click();
		WebElement invo_5 = driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tbody/tr[7]/td[6]/a[1]"));
		invo_5.click();
		String Total5 = driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tfoot/tr[3]/td/strong/span"))
				.getText();
		String price51 = Total5.replaceAll("\\$", "");
		String price52 = price51.replaceAll(".0", "");
		String price53 = price52.replaceAll("0", "");
		int price5_invo = Integer.parseInt(price53);
		int expcted_result5 = 152;
		myassertion.assertEquals(price5_invo, expcted_result5);
		myassertion.assertAll();

	}

}
