package(default_visibility = ["//:src"])

java_library(
    name = "greeter",
    srcs = glob(["*.java"]),
    exported_plugins = [
        "//third_party:dagger_grpc_plugin",
        "//third_party:dagger_plugin",
    ],
    plugins = [
        "//third_party:dagger_grpc_plugin",
        "//third_party:dagger_plugin",
    ],
    deps = [
        "//src/proto:greeter_java_grpc",
        "//src/proto:greeter_java_proto",
        "//src/proto:greeting_java_proto",
        "@dagger//jar",
        "@dagger_grpc_server//jar",
        "@dagger_grpc_server_annotations//jar",
        "@grpc_core//jar",
        "@grpc_stub//jar",
        "@guava//jar",
        "@javax_inject//jar",
    ],
)
