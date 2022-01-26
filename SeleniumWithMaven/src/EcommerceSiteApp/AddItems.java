package EcommerceSiteApp;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddItems {
	
	public void addItems(WebDriver driver, String[] itemsNeeded) {

		int j = 0;

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {

			// Brocolli - 1 Kg
			String name = products.get(i).getText().split("-")[0].trim();
			// System.out.println(name);

			List<String> itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(name)) {

				((List<WebElement>) driver.findElements(By.xpath("//div[@class='product-action']/button"))).get(i)
						.click();
				j++;
				if (j == itemsNeededList.size()) {
					break;
				}
			} // If Closure

		} // ForLoop Closure

	}// addItems Closure

}
