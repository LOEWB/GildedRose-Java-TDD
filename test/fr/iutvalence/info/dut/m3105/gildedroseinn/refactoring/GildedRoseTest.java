package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GildedRoseTest
{
	public void qualityAndSellinTestProduction(ExpectedItem expectedItem) 
	{
		Item testItem = expectedItem.getItem();
		GildedRose.updateItem(testItem);
		assertEquals(testItem.getQuality(),expectedItem.getExpectedQuality());
		assertEquals(testItem.getSellIn(),expectedItem.getExpectedSellin());
	}
	
	@Test
	public void everyDayQualityAndSellinDecrementing()
	{
		qualityAndSellinTestProduction(new ExpectedItem(new Item(10,10),9,9));
	}
	@Test
	public void everyDayUpdateWithSellinNegativeTest()
	{
		qualityAndSellinTestProduction(new ExpectedItem(new Item(0,5),-1,3));
	}
	@Test
	public void qualityAlwaysPositive()
	{
		qualityAndSellinTestProduction(new ExpectedItem(new Item(0,0),-1,0));
		qualityAndSellinTestProduction(new ExpectedItem(new Item(0,1),-1,0));
		qualityAndSellinTestProduction(new ExpectedItem(new Item(1,0),0,0));
	}
	
	

}