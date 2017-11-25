package koopad.service.greeter;

import com.google.common.collect.ImmutableList;
import dagger.Module;
import dagger.Provides;
import dagger.grpc.server.ForGrpcService;
import io.grpc.ServerInterceptor;
import java.util.List;
import koopad.grpc.KoopadGreeterGrpc;

/** Interceptors binding for Greeter. */
@Module
public abstract class GreeterInterceptorsModule {
  @Provides
  @ForGrpcService(KoopadGreeterGrpc.class)
  static List<? extends ServerInterceptor> greeterInterceptors() {
    return ImmutableList.of();
  }
}
