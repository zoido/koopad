package koopad.service;

import dagger.Component;
import dagger.grpc.server.GrpcCallMetadataModule;
import dagger.grpc.server.NettyServerModule;
import io.grpc.Server;
import javax.inject.Singleton;
import koopad.service.greeter.GreeterGrpcProxyModule;
import koopad.service.greeter.GreeterSubComponent;

@Singleton
@Component(
  modules = {GreeterGrpcProxyModule.class, KoopadServerModule.class, NettyServerModule.class}
)
interface KoopadServerComponent {
  GreeterSubComponent greeterComponent(GrpcCallMetadataModule metadataModule);

  Server server();
}
