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
