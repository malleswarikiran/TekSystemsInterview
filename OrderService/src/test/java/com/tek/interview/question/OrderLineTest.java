package com.tek.interview.question;

import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class OrderLineTest {

  private OrderLine underTest;

  @After
  public void tearDown() {
    underTest = null;
  }

  @Test
  public void testOrderLineItemNull() throws Exception {
    try {
      underTest = new OrderLine(null, 2);
      fail("Should throw Exception");
    } catch (Exception exception) {
      assertEquals("Item is NULL", exception.getMessage());
    }
  }
  
  @Test
  public void testOrderLineQunatityZero() throws Exception {
    try {
      underTest = new OrderLine(new Item("test", 1.0f), 0);
      fail("Should throw Exception");
    } catch (Exception exception) {
      assertEquals("Quantity is less than or equal to zero", exception.getMessage());
    }
  }
  
  @Test
  public void testOrderLineQunatityLessThanZero() throws Exception {
    try {
      underTest = new OrderLine(new Item("test", 1.0f), -5);
      fail("Should throw Exception");
    } catch (Exception exception) {
      assertEquals("Quantity is less than or equal to zero", exception.getMessage());
    }
  }
  
  @Test
  public void testGetItem() throws Exception {
      Item item = new Item("test", 1.0f);
      underTest = new OrderLine(item, 5);
      assertNotNull(underTest.getItem());
      assertEquals(underTest.getItem(), item);
  }
  
  @Test
  public void testGetQuantity() throws Exception {
      Item item = new Item("test", 1.0f);
      underTest = new OrderLine(item, 5);
      assertEquals(underTest.getQuantity(), 5);
  }

}
