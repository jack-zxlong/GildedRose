package com.contest;

public class AgedBrie extends Goods {

	public void AgedBrie(int sellIn, int quality){
			super("AgedBrie", sellIn, quality);
	}

	private void updateQuality(){
			this.quality ++;
			checkQualityThrowException();
	}
}
