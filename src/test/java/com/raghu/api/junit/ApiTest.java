/*
 * 
 * Vanguard API test
 * 
 */

package com.raghu.api.junit;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.junit.Test;
import org.junit.Assert;
import java.util.*;

public class ApiTest {
	private String url = "https://www.vanguardinvestments.com.au/retail/mvc/getNavPriceList.jsonp";
	static final int HTTP_SUCCESS = 200;

	@Test
	public void verifyJsonStructureAndFieldPresence(){

		JsonPath jsonPath = RestAssured.given()
				.when()
				.get(url)
				.then()
				.assertThat()
				.statusCode(HTTP_SUCCESS)
				.assertThat()
				.extract().body().jsonPath();

		//This means Json structure is matched
		List<NavPriceList> navPriceLists = jsonPath.getList("", NavPriceList.class);

		//Assert that all mandatory fields exists
		for (NavPriceList priceList : navPriceLists) {
			Assert.assertNotNull(priceList.getPortId());

			Assert.assertNotNull(priceList.navPriceArray[0].getAmountChange());
			Assert.assertNotNull(priceList.navPriceArray[0].getAsOfDate());
			Assert.assertNotNull(priceList.navPriceArray[0].getIsFinal());
			Assert.assertNotNull(priceList.navPriceArray[0].getPercentChange());
			Assert.assertNotNull(priceList.navPriceArray[0].getPrice());
			//Assert.assertNotNull(item.navPriceArray[0].yield); This can be null sometimes
			Assert.assertNotNull(priceList.navPriceArray[0].getFinal());

			Assert.assertNotNull(priceList.navPriceArray[0].currency.getCurrencyCode());
			Assert.assertNotNull(priceList.navPriceArray[0].currency.getCurrencyLocation());
			Assert.assertNotNull(priceList.navPriceArray[0].currency.getCurrencySymbol());

			Assert.assertNotNull(priceList.navPriceArray[0].measureType.getMeasureCode());
			Assert.assertNotNull(priceList.navPriceArray[0].measureType.getMeasureDesc());

			Assert.assertNotNull(priceList.navPriceArray[0].pricePeriodType.getPricePeriodCode());
			Assert.assertNotNull(priceList.navPriceArray[0].pricePeriodType.getPricePeriodDesc());

			Assert.assertNotNull(priceList.navPriceArray[0].priceStatusType.getPriceStatusCode());
			Assert.assertNotNull(priceList.navPriceArray[0].priceStatusType.getPriceStatusDesc());
		}
	}
}



