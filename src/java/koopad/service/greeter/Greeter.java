package koopad.service.greeter;

import dagger.grpc.server.GrpcService;
import io.grpc.stub.StreamObserver;
import javax.inject.Inject;
import koopad.Greeting;
import koopad.grpc.HelloReply;
import koopad.grpc.HelloRequest;
import koopad.grpc.KoopadGreeterGrpc;

@GrpcService(grpcClass = KoopadGreeterGrpc.class)
public final class Greeter extends KoopadGreeterGrpc.KoopadGreeterImplBase {

  @Inject
  Greeter() {}

  @Override
  public void greet(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
    Greeting greeting =
        Greeting.newBuilder().setMessage("Hello!").setName(request.getName()).build();
    HelloReply reply = HelloReply.newBuilder().setGreeting(greeting).build();

    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }
}
