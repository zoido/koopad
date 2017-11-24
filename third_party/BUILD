package(default_visibility = ["//visibility:public"])

java_plugin(
    name = "dagger_plugin",
    processor_class = "dagger.internal.codegen.ComponentProcessor",
    generates_api = True,
    deps = [
        "@dagger_compiler//jar",
        "@dagger_javapoet//jar",
        "@dagger_producers//jar",
        "@dagger//jar",
        "@errorprone_javac//jar",
        "@google_java_format//jar",
        "@guava//jar",
        "@javax_inject//jar",
    ],
    # runtime = "@local_jdk//:jdk-default",
)

java_plugin(
    name = "dagger_grpc_plugin",
    processor_class = "dagger.grpc.server.processor.GrpcServiceProcessor",
    generates_api = True,
    deps = [
        "@dagger_compiler//jar",
        "@dagger_grpc_server_annotations//jar",
        "@dagger_grpc_server_processor//jar",
        "@dagger_grpc_server//jar",
        "@dagger_javapoet//jar",
        "@dagger_producers//jar",
        "@dagger//jar",
        "@errorprone_javac//jar",
        "@google_java_format//jar",
        "@guava//jar",
        "@javax_inject//jar",
    ],
)
