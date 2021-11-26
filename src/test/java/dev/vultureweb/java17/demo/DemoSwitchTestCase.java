package dev.vultureweb.java17.demo;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayNameGeneration(DisplayNameGenerator.Simple.class)
class DemoSwitchTestCase {

   @Test
   void assertThatAreaOfASquareIsCalculatedCorrectly() {
      Square square = new Square(2,3);
      SwitchPattern switchPattern = new SwitchPattern();

      assertEquals(BigDecimal.valueOf(6),switchPattern.getArea(square));

   }

}
