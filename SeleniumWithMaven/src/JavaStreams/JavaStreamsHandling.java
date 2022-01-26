package JavaStreams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import systemProperty.setProperty;

public class JavaStreamsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setProperty property = new setProperty();
		property.setData();
		WebDriver driver = property.getChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		driver.findElement(By.xpath("//tr/th[1]")).click();

		List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));

		for (int i = 0; i < elementsList.size(); i++)
			System.out.println(elementsList.get(i).getText());

		List<String> originalList = elementsList.stream().map(s -> s.getText()).collect(Collectors.toList());
		System.out.println(originalList);

		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);

		Assert.assertTrue(originalList.equals(sortedList));
		List<String> price;

		do {

			List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));

			price = rows.stream().filter(s -> s.getText().contains("Rice")).map(s -> getPriceVeggie(s))
					.collect(Collectors.toList());

			price.forEach(a -> System.out.println(a));

			if (price.size() < 1) {
				driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
			}
		} while (price.size() < 1);

	}

	private static String getPriceVeggie(WebElement s) {
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}

}
