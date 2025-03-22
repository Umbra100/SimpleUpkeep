package umbra.fabricbase;

import net.fabricmc.api.ModInitializer;

import umbra.simpleupkeep.Runner;

public class FabricMain implements ModInitializer {
   public static final String MOD_ID = "SimpleUpkeep";

   private Harness serverHarness;
   private Runner app;

   public FabricMain(){
      this.serverHarness = new Harness();
      this.app = new Runner(serverHarness);
   }

   @Override
   public void onInitialize() {
      app.onLoad();
   }
}
