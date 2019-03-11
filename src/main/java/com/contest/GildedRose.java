package com.contest;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

	public updateDaily(){
		for(int i=0; i < items.size(); i++){
				item[i].updateDaily();
		}
	}
	

	public static void main(String[] args){
			Item items = new Item()
			AgedBrie agedBrieObject = new AgedBrie(10, 20);
			Sulfuras sulfurasObject = new Sulfuras(20);
			BackstagePasses backstagePassesObject = new BackstagePasses(10, 20, 30);

			GildedRose gildedRoseObject = new GildedRose();

			while(1){
					gildedRoseObject.updateDaily();
			}

	}
}
