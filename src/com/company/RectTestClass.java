package com.company;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class RectTestClass {
   private float h = (float) 3;
   private float w = (float) 2;
   private Rectangle rectangle = new Rectangle(w, h);

   @Test
   public void testRectangleArea() {
      assertEquals(h * w, rectangle.computeArea(), 0.0001);

      Rectangle rectangle_1 = new Rectangle((float)2.1, (float)10.4);
      assertEquals((float)2.1 * 10.4, rectangle_1.computeArea(), 0.0001);

      Rectangle rectangle_2 = new Rectangle((float)100.89, (float)23.9);
      assertEquals((float)100.89 * 23.9, rectangle_2.computeArea(), 0.0001);
   }

   @Test
   public void testSetGetWidth(){
      rectangle.setW((float) 5.1);
      assertEquals(5.1, rectangle.getW(), 0.0001);
   }

   @Test
   public void testSetGetHight(){
      rectangle.setH((float) 10.1);
      assertEquals(10.1, rectangle.getH(), 0.0001);
   }
}
