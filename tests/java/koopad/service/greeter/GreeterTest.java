package koopad.service.greeter;

import static com.google.common.truth.Truth.assertThat;

import io.grpc.testing.GrpcServerRule;
import koopad.grpc.HelloRequest;
import koopad.grpc.HelloResponse;
import koopad.grpc.KoopadGreeterGrpc;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GreeterTest {
  private static final String REQUEST_NAME = "TestName";

  private KoopadGreeterGrpc.KoopadGreeterBlockingStub greeterBlockingStub;

  @Rule public final GrpcServerRule grpcServerRule = new GrpcServerRule().directExecutor();

  @Before
  public void setUp() throws Exception {
    grpcServerRule.getServiceRegistry().addService(new Greeter());
    greeterBlockingStub = KoopadGreeterGrpc.newBlockingStub(grpcServerRule.getChannel());
  }

  @Test
  public void nameFromRequestIsAlsoInReply() throws Exception {
    // given
    HelloRequest request = HelloRequest.newBuilder().setName(REQUEST_NAME).build();

    // when
    HelloResponse response = greeterBlockingStub.greet(request);

    // then
    assertThat(response.getGreeting().getName()).isEqualTo(REQUEST_NAME);
  }
}
