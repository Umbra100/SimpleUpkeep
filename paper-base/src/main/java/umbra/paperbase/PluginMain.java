package umbra.paperbase;

import org.bukkit.plugin.java.JavaPlugin;

public class PluginMain extends JavaPlugin {
   public PluginMain(){
      super();
   }

   @Override
   public void onLoad() {
      this.getLogger().info("Hello World!");
   }
}
