package dev.vultureweb.java17.demo;

import java.math.BigDecimal;

public class SwitchPattern {

   public static void main(String[] args) {
      var test = """
            Dit is een multiline string
            """;
      System.out.println(test);

      var value = args.length > 1 ? args[0] : null;
      var result = switch (value) {
         case null -> "No value";
         case String s -> "Hello World " +s;
      };
      System.out.println(result);
   }

   /**
    * Calculate the area of a shape
    *
    * @param shape for which the area needs to be calculated
    */
   public BigDecimal getArea(Shape shape) {
      return switch(shape) {
         case Circle circle -> circle.getArea();
         case Qube qube -> qube.getArea();
         case Square square -> square.getArea();
      };
   }
}
