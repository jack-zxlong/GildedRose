package com.contest;

public class BackstagePasses extends AgedBrie{

	public int dateBeforeShowing;

	public void BackstagePasses(int sellIn, int quality, int dateBeforeShowing){
			if(dateBeforeShowing <= 0)
					throw new Exception("BackstagePasses init error")
			super("BackstagePasses", sellIn, quality);
			this.dateBeforeShowing = dateBeforeShowing;
			
	}

	private void updateQuality(){
			if(dateBeforeShowing > 10){
					this.quality ++;
			}
			else if(dateBeforeShowing > 5){
					this.quality += 2;
			}
			else if(dateBeforeShowing > 0){
					this.quality += 3;
			}
			else{
					this.quality = 0;
			}

			checkQualityThrowException();
	}

	private void updateDateBeforeShowing(){
			this.dateBeforeShowing --;
	}

	public void updateDaily(){
			updateDateBeforeShowing();
			updateQuality();
	}

}
