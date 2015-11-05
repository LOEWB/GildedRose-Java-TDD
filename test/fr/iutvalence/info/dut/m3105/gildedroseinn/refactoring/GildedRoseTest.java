package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GildedRoseTest
{
	public void qualityAndSellinUpdateTestProduction(ExpectedItem expectedItem) 
	{
		Item testItem = expectedItem.getItem();
		GildedRose.updateAllItems(testItem);
		assertEquals(testItem.getQuality(),expectedItem.getExpectedQuality());
		assertEquals(testItem.getSellIn(),expectedItem.getExpectedSellin());
	}
	
	@Test
	public void everyDayQualityAndSellinDecrementing()
	{
		qualityAndSellinUpdateTestProduction(new ExpectedItem(new Item(10,10),9,9));
	}
	@Test
	public void everyDayUpdateWithSellinNegativeTest()
	{
		qualityAndSellinUpdateTestProduction(new ExpectedItem(new Item(0,5),-1,3));
	}
	@Test
	public void qualityAlwaysPositive()
	{
		qualityAndSellinUpdateTestProduction(new ExpectedItem(new Item(0,0),-1,0));
		qualityAndSellinUpdateTestProduction(new ExpectedItem(new Item(0,1),-1,0));
		qualityAndSellinUpdateTestProduction(new ExpectedItem(new Item(1,0),0,0));
	}
	@Test
	public void qualityOfAgedBrieIncreasesWhenItGetsOlder()
	{
		qualityAndSellinUpdateTestProduction(new ExpectedItem(new Item("Aged Brie",0,0),-1,1));
	}
	@Test
	public void qualityCanNeverBeMoreThan50()
	{
		qualityAndSellinUpdateTestProduction(new ExpectedItem(new Item("Aged Brie",0,50),-1,50));
	}
	@Test
	public void qualityOfSulfurasNeverDecreases()
	{
		qualityAndSellinUpdateTestProduction(new ExpectedItem(new Item("Sulfuras",0,10),-1,10));
	}
	

}