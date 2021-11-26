package dev.vultureweb.java17.demo;

import jdk.jfr.Event;
import jdk.jfr.Label;
import jdk.jfr.Name;

import java.math.BigDecimal;

public final class Square implements Shape {

   @Name("dev.vultureweb.TestEvent")
   @Label("Calculate Area")
   static class TestEvent extends Event {

   }

   private final int width;
   private final int height;

   public Square(int width, int height) {
      this.width = width;
      this.height = height;
   }

   @Override
   public BigDecimal getArea() {
      var event = new TestEvent();
      event.begin();
      var area = BigDecimal.valueOf((long) width * height);
      event.commit();
      return area;
   }
}
