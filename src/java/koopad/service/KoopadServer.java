package koopad.service;

import com.google.devtools.common.options.OptionsParser;
import dagger.grpc.server.NettyServerModule;
import io.grpc.Server;
import koopad.service.options.ServerOptions;

/**
 * Main Koopad server class.
 *
 * <p>Parses flags and spawns the server.
 */
public class KoopadServer {

  public static void main(String[] args) {
    OptionsParser parser = OptionsParser.newOptionsParser(ServerOptions.class);
    parser.parseAndExitUponError(args);
    ServerOptions options = parser.getOptions(ServerOptions.class);

    try {
      KoopadServerComponent component =
          DaggerKoopadServerComponent.builder()
              .nettyServerModule(NettyServerModule.bindingToPort(options.port))
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
