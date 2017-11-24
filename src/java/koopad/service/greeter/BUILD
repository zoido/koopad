package(default_visibility = ["//:src"])


java_library(
    name = "greeter",
    srcs = glob(["*.java"]),
    plugins = [
        "//third_party:dagger_grpc_plugin",
        "//third_party:dagger_plugin",
    ],
    exported_plugins = [
        "//third_party:dagger_grpc_plugin",
        "//third_party:dagger_plugin",
    ],
    deps = [
        "@dagger_grpc_server_annotations//jar",
        "@dagger_grpc_server//jar",
        "@dagger//jar",
        "@grpc_core//jar",
        "@grpc_stub//jar",
        "@guava//jar",
        "@javax_inject//jar",
        "//src/proto:greeter_java_grpc",
        "//src/proto:greeter_java_proto",
        "//src/proto:greeting_java_proto",
    ],
)
