package umbra.paperbase;

import umbra.simpleupkeep.model.ServerHarness;

public class Harness implements ServerHarness {
   public Harness(){}
   
   @Override
   public String getName() {
      return "This is SimpleUpkeep!";
   }
}
