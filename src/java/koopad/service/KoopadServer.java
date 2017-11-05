package koopad.service;

import dagger.grpc.server.NettyServerModule;
import io.grpc.Server;

public class KoopadServer {

  public static void main(String[] args) {
    try {
      KoopadServerComponent component =
          DaggerKoopadServerComponent.builder()
              .nettyServerModule(NettyServerModule.bindingToPort(5112))
              .build();
      Server server = component.server();
      System.out.println("PRE");
      server.start();
      server.awaitTermination();
      System.out.println("POST");
    } catch (Throwable t) {
      System.err.println(t);
      System.exit(1);
    }
  }
}
