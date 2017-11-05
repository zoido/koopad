package(default_visibility = ["//visibility:public"])

java_plugin(
    name = "dagger_plugin",
    processor_class = "dagger.internal.codegen.ComponentProcessor",
    generates_api = True,
    deps = [
        "@dagger//jar",
        "@dagger_compiler//jar",
        "@dagger_producers//jar",
        "@guava//jar",
        "@javax_inject//jar",
        "@dagger_javapoet//jar",
        "@errorprone_javac//jar",
        "@google_java_format//jar",
    ],
)

java_plugin(
    name = "dagger_grpc_plugin",
    processor_class = "dagger.grpc.server.processor.GrpcServiceProcessor",
    generates_api = True,
    deps = [
        "@dagger//jar",
        "@dagger_compiler//jar",
        "@dagger_producers//jar",
        "@dagger_grpc_server_processor//jar",
        "@dagger_grpc_server//jar",
        "@dagger_grpc_server_annotations//jar",
        "@guava//jar",
        "@javax_inject//jar",
        "@dagger_javapoet//jar",
        "@errorprone_javac//jar",
        "@google_java_format//jar",
    ],
)
