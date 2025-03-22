package umbra.simpleupkeep;

import umbra.simpleupkeep.model.ServerHarness;

public class Runner {
   private ServerHarness server;

   public Runner(ServerHarness server){
      this.server = server;
      System.out.println(server.getName());
   }

   public void onLoad(){
      System.out.println("Runner loaded!");
   }
}
