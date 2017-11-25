package koopad.service.greeter;

import dagger.grpc.server.GrpcService;
import io.grpc.stub.StreamObserver;
import javax.inject.Inject;
import koopad.Greeting;
import koopad.grpc.HelloRequest;
import koopad.grpc.HelloResponse;
import koopad.grpc.KoopadGreeterGrpc;

/** Simple implementation of {@link KoopadGreeterGrpc}. */
@GrpcService(grpcClass = KoopadGreeterGrpc.class)
public final class Greeter extends KoopadGreeterGrpc.KoopadGreeterImplBase {

  @Inject
  Greeter() {}

  @Override
  public void greet(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
    Greeting greeting =
        Greeting.newBuilder().setMessage("Hello!").setName(request.getName()).build();
    HelloResponse reply = HelloResponse.newBuilder().setGreeting(greeting).build();

    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }
}
