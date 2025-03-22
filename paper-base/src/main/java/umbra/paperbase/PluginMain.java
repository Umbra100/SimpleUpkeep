package umbra.paperbase;

import org.bukkit.plugin.java.JavaPlugin;

import umbra.simpleupkeep.Runner;

public class PluginMain extends JavaPlugin {
   @SuppressWarnings("unused")
   private Harness serverHarness;
   private Runner app;

   public PluginMain(){
      super();
      this.serverHarness = new Harness();
      this.app = new Runner(serverHarness);
   }

   @Override
   public void onLoad() {
      app.onLoad();
   }
}
