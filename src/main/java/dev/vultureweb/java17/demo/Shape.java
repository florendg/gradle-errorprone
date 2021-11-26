package dev.vultureweb.java17.demo;

import java.math.BigDecimal;

public sealed interface Shape permits Square,Circle,Qube {

   default BigDecimal getArea() {
      return BigDecimal.ZERO;
   }
}
