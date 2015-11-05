package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import java.util.List;

public class GildedRose
{

	/*
	 * The code below is intended to help writing test fixtures
	 * 
	 * items = new ArrayList<Item>(); 
	 * items.add(new Item("+5 Dexterity Vest", 10, 20)); 
	 * items.add(new Item("Aged Brie", 2, 0)); 
	 * items.add(new Item("Elixir of the Mongoose", 5, 7)); 
	 * items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80)); 
	 * items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20)); 
	 * items.add(new Item("Conjured Mana Cake", 3, 6));
	 */

	public static void updateItems(List<Item> items)
	{
		for (int indexInItemList = 0; indexInItemList < items.size(); indexInItemList++)
			updateAllItems(items.get(indexInItemList));
	}

	public static void updateAllItems(Item item)
	{
		if(item.getName() == "Aged Brie")
			updateAgedBrieItem(item);
		else
			updateAllItemsExeptAgedBrie(item);
		
		item.setSellIn(item.getSellIn()-1);

		if (item.getQuality()<0)
			item.setQuality(0);
	}

	private static void updateAllItemsExeptAgedBrie(Item item) 
	{
		if (item.getSellIn()<1)
		{
			item.setQuality(item.getQuality()-2);
		}
		else
		{
			item.setQuality(item.getQuality()-1);
		}
		
		
		
	}

	private static void updateAgedBrieItem(Item item) 
	{
		item.setQuality(item.getQuality()+1);
	}

}
