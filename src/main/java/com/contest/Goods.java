package com.contest;

public class Goods extends Item {

    public Goods(String name, int sellIn, int quality){
			checkQualityThrowException();
			super(name, sellIn, quality);
	}

	private void checkQualityThrowException(){

			if(this.quality < 0)
					throw new Exception("quality error number: < 0");
			if(this.quality > 50){
					throw new Exception(name + "update quality error");
			}

	}

	private void updateQuality(){
			if(this.sellIn < 0){
				this.quality -= 2; 
			}
			else{
				this.quality --;
			}

			checkQualityThrowException();
	}

	priate void updateSellIn(){
			this.sellIn --;
	}

	public void updateDaily(){
			updateSellIn();
			updateQuality();
			System.out.println(toString());
	}
}


