package com.mercadona.shopone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MercadonaShopOneTest {

    @Test
    void itemGenericNotExpired() {
    	
        Item[] items = new Item[] { new Item("Yogurt", 3, 6) };
        
        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();
        
        assertEquals("Yogurt", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(5, app.items[0].quality);
      
    }
    
    @Test
    void itemGenericExpired() {
        Item[] items = new Item[] { new Item("Yogurt", 0, 6) };
        
        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();
        
        assertEquals("Yogurt", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);
      
      
    }
    
    @Test
    void itemGenericExpiredNonZeroQuality() {
        Item[] items = new Item[] { new Item("Yogurt", 0, 0) };
        
        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();
        
        assertEquals("Yogurt", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
      
    }
      
    @Test
    void breadNotExpired() {
        Item[] items = new Item[] { new Item("Bread", 6, 2) };
        
        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();
        
        assertEquals("Bread", app.items[0].name);
        assertEquals(5, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
      
    }
    
    @Test
    void breadExpired() {
        Item[] items = new Item[] { new Item("Bread", -1, 7) };
        
        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();
        
        assertEquals("Bread", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(5, app.items[0].quality);
      
    }
    
    
    @Test
    void agedBlueCheeseNotExpired() {
        Item[] items = new Item[] { new Item("Aged blue cheese", 5, 8) };
        
        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();
        
        assertEquals("Aged blue cheese", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
      
    }
    
    @Test
    void agedBlueCheeseExpired() {
        Item[] items = new Item[] { new Item("Aged blue cheese", 0, 2) };
        
        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();
        
        assertEquals("Aged blue cheese", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);
      
    }

    @Test
    void agedBlueCheeseNonZeroQuality() {
        Item[] items = new Item[] { new Item("Aged blue cheese", 0, 0) };
        
        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();
        
        assertEquals("Aged blue cheese", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
      
    }

    @Test
    void frozenCakeNotExpired() {
        Item[] items = new Item[] { new Item("Frozen cake", 6, 2) };
        
        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();
        
        assertEquals("Frozen cake", app.items[0].name);
        assertEquals(5, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
      
    }
    
    @Test
    void frozenCakeExpired() {
        Item[] items = new Item[] { new Item("Frozen cake", -2, 4) };
        
        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();
        
        assertEquals("Frozen cake", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
      
    }
    
    @Test
    void frozenCakeNonZeroQuality() {
        Item[] items = new Item[] { new Item("Frozen cake", 0, 0) };
        
        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();
        
        assertEquals("Frozen cake", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
      
    }
    
    
    @Test
    void hamNotExpired() {
        Item[] items = new Item[] { new Item("Ham", 6, 2) };
        
        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();
        
        assertEquals("Ham", app.items[0].name);
        assertEquals(5, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);
      
    }
    
    @Test
    void hamExpired() {
        Item[] items = new Item[] { new Item("Ham", -6, 0) };
        
        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();
        
        assertEquals("Ham", app.items[0].name);
        assertEquals(-7, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
      
    }
    
    @Test
    void hamNonZeroQuality() {
        Item[] items = new Item[] { new Item("Ham", 0, 0) };
        
        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();
        
        assertEquals("Ham", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
      
    }
    
    
    
    @Test
    void saltNotExpired() {
        Item[] items = new Item[] { new Item("Iodized salt", 2, 2) };
        
        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();
        
        assertEquals("Iodized salt", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
      
    }
    
 

    
}
