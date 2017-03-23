import static org.junit.Assert.*;
import org.junit.*;

public class SuperMarketTest{

SuperMarket store;
Apple apple;
Pear pear;
Orange orange;

@Before
public void before(){
  store = new SuperMarket("Tesco");
  apple = new Apple();
  pear = new Pear();
  orange = new Orange();
}

@Test
public void hasName(){
  assertEquals( "Tesco", store.storeName() );
} 

@Test
public void hasEmptyStock(){
  assertEquals( 0, store.stockLevel() );
}

@Test
public void hasStock(){
  store.addStock(apple);
  store.addStock(pear);
  store.addStock(orange);
  assertEquals( 3, store.stockLevel() );
}

@Test
public void canRemoveStock(){
  store.addStock(apple);
  store.addStock(orange);
  store.addStock(pear);
  assertEquals( 3, store.stockLevel() );
  store.removeStock();
  assertEquals( 0, store.stockLevel() );
}

@Test
public void canCheckIfStockNull(){
   Edible stockNumbers = store.returnStock();
  assertEquals(null, stockNumbers);
}

@Test
public void canCheckEdibleItem(){
  store.addStock(pear);
  Edible stockType = store.returnStock();
  assertEquals( "yum, a tasty pear!", stockType.taste() );
}

@Test 
public void canCheckSpecificStockItem(){
  store.addStock(orange);
  Edible stockType = store.returnStock();
  Orange returnedItem = (Orange) stockType;
  assertEquals( "this orange tastes orangy..", returnedItem.taste() );
}

}