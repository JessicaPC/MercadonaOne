package com.mercadona.shopone;

public class MercadonaShopOne {
    Item[] items;

    public MercadonaShopOne(Item[] items) {
        this.items = items;
    }
    
    final  String agedBlueCheese = "Aged blue cheese";
    final  String ham = "Ham";
    final  String iodizedSalt = "Iodized salt";
    final  String bread = "Bread";
    final  String yogurt = "Yogurt";
    final  String frozenCake = "Frozen cake";
    
    final  int maxQuality = 50;
    final int minQuality = 0;
    
    public void updateQuality() {
    	
    	for(Item item : items) {
    		if(!item.name.equals(iodizedSalt)) {
    			  item.sellIn = item.sellIn - 1;
    			switch(item.name) {
	    			case agedBlueCheese :
	    				if (isExpired(item)) {
	    					isQualityLowerThanMaxQuality(item,2);
	    				}else {
	    					isQualityLowerThanMaxQuality(item,1);
	    				}
	    					
	    				break;
	    			case ham :
	    					if (isExpired(item)) {
	    						item.quality = minQuality;
    						}else if (item.sellIn<5) {
	    						isQualityLowerThanMaxQuality(item,3);
	    					}else if (item.sellIn<10) {
	    						isQualityLowerThanMaxQuality(item,2);
	    					}else {
	    						isQualityLowerThanMaxQuality(item,1);
	    					}
	    					
	    					isQualityGreaterThanMaxQuality(item);
	    				break;
	    				
	    			case frozenCake :
	    				if (isExpired(item)) {
		    					if ((item.quality-4) >= minQuality) {
		                			isQualityGreaterThanMinQuality(item,4);
		                		}else {
		                			item.quality = minQuality;
		                		}
	    				}else {
	    					isQualityGreaterThanMinQuality(item,2);
	    				}
	    					
	    				break;
	    				
	    			default:
	    				if (isExpired(item)) {
	    					isQualityGreaterThanMinQuality(item,2);
	    				}else {
	    					isQualityGreaterThanMinQuality(item,1);
	    				}
	    				break;
    			}

    		}
        }
    }
    
    
    private  void isQualityLowerThanMaxQuality(Item item, int incrementQuality) {
    	if(item.quality < maxQuality) {
			item.quality += incrementQuality;
		}
    }
    
    private  void isQualityGreaterThanMaxQuality(Item item) {
    	if(item.quality > maxQuality) {
			item.quality = maxQuality;
		}
    }
    
    
    private  void isQualityGreaterThanMinQuality(Item item, int decrementQuality) {
    	if(item.quality > minQuality) {
			item.quality -= decrementQuality;
		}
    }
    
    private boolean isExpired (Item item) {
    	return item.sellIn<0;
    }
    
}