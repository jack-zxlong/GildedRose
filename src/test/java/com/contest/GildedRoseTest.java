package com.contest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GildedRoseTest {

	@Test
	public void agedBrieTest(){
			AgedBrie agedBrieObject = new AgedBrie(10, 20);
			GildedRose gildedRose = new GildedRose(agedBrieObject);

			gildedRose.updateDaily();

			assertEquals(9, (gildedRose.items[0]).sellIn);
			assertEquals(22, (gildedRose.items[0]).sellIn);

	}

	@Test
	public void sulfurasTest(){
			Sulfuras sulfurasObject = new Sulfuras(20);

			GildedRose gildedRose = new GildedRose(sulfurasObject);

			gildedRose.updateDaily();

			assertEquals(19, (gildedRose.items[0]).sellIn);
			assertEquals(80, (gildedRose.items[0]).sellIn);

	}

}
