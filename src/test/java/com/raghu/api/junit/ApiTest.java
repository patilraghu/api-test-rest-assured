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

			for (NavPriceArray navPriceArray : priceList.navPriceArray) {

				Assert.assertNotNull(navPriceArray.getAmountChange());
				Assert.assertNotNull(navPriceArray.getAsOfDate());
				Assert.assertNotNull(navPriceArray.getIsFinal());
				Assert.assertNotNull(navPriceArray.getPercentChange());
				Assert.assertNotNull(navPriceArray.getPrice());
				//Assert.assertNotNull(navPriceArray.yield); This can be null sometimes
				Assert.assertNotNull(navPriceArray.getFinal());

				Assert.assertNotNull(navPriceArray.currency.getCurrencyCode());
				Assert.assertNotNull(navPriceArray.currency.getCurrencyLocation());
				Assert.assertNotNull(navPriceArray.currency.getCurrencySymbol());

				Assert.assertNotNull(navPriceArray.measureType.getMeasureCode());
				Assert.assertNotNull(navPriceArray.measureType.getMeasureDesc());

				Assert.assertNotNull(navPriceArray.pricePeriodType.getPricePeriodCode());
				Assert.assertNotNull(navPriceArray.pricePeriodType.getPricePeriodDesc());

				Assert.assertNotNull(navPriceArray.priceStatusType.getPriceStatusCode());
				Assert.assertNotNull(navPriceArray.priceStatusType.getPriceStatusDesc());

			}
		}
	}
}



