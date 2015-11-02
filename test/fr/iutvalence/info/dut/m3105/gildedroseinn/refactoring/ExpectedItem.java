package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

public class ExpectedItem 
{
	Item item;
	int expectedQuality;
	int expectedSellin;
	
	public ExpectedItem(Item item,int expectedSellin,int expectedQuality)
	{
		this.item = item;
		this.expectedQuality = expectedQuality;
		this.expectedSellin = expectedSellin;
	}

	public Item getItem() {
		return item;
	}

	public int getExpectedQuality() {
		return expectedQuality;
	}

	public int getExpectedSellin() {
		return expectedSellin;
	}
}
