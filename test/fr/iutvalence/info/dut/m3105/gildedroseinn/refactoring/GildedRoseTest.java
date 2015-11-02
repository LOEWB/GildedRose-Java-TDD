package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GildedRoseTest
{
	@Test
	public void everyDayQualityAndSellinDecrementing()
	{
		Item testItem = new Item("test_item",10,10);
		GildedRose.updateItem(testItem);
		assertEquals(testItem.getQuality(),9);
		assertEquals(testItem.getSellIn(),9);
	}
	
	public void everyDayUpdateWithSellinNegativeTest()
	{
		Item testItem = new Item("test_item",0,5);
		GildedRose.updateItem(testItem);
		assertEquals(testItem.getQuality(),3);
		assertEquals(testItem.getSellIn(),-1);
	}
	

}