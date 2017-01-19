package com.tek.interview.question;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OrderTest {
  
  private Order underTest;
  
  @Before
  public void setUp() {
    underTest = new Order();
  }
  
  @After
  public void tearDown() {
    underTest = null;
  }

  @Test
  public void testAddThrowIllegalArgumentException() throws Exception{
    try{
      underTest.add(null);
      fail("Should throw IllegalArgumentException");
    }catch (IllegalArgumentException illegalArgumentException){
      assertEquals("Order is NULL", illegalArgumentException.getMessage());
    }
  }
  
  @Test
  public void testAddSuccess() throws Exception{
    
    Item item = new Item("test", 1.0f);
    OrderLine orderLine = new OrderLine(item, 2);
    underTest.add(orderLine);
    OrderLine actual = underTest.get(0);
    assertNotNull(actual);
    assertEquals(orderLine, actual);
  }
  
  @Test
  public void testSize() throws Exception{
    assertEquals(0, underTest.size());
    Item item = new Item("test", 1.0f);
    OrderLine orderLine = new OrderLine(item, 2);
    underTest.add(orderLine);
    assertEquals(1, underTest.size());
  }
  
  @Test
  public void testClear() throws Exception{
    assertEquals(0, underTest.size());
    Item item = new Item("test", 1.0f);
    OrderLine orderLine = new OrderLine(item, 2);
    underTest.add(orderLine);
    assertEquals(1, underTest.size());
    underTest.clear();
    assertEquals(0, underTest.size());
  }

}
