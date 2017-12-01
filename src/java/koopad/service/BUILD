package(default_visibility = ["//:src"])

java_binary(
    name = "koopad_server",
    main_class = "koopad.service.KoopadServer",
    runtime_deps = [
        ":koopad_lib",
        "@grpc_netty//jar",
        "@netty//jar",
    ],
)

java_library(
    name = "koopad_lib",
    srcs = glob(["*.java"]),
    deps = [
        "//src/java/koopad/service/greeter",
        "//src/java/koopad/service/options",
        "//src/proto:greeter_java_grpc",
        "@dagger//jar",
        "@dagger_grpc_server//jar",
        "@dagger_grpc_server_annotations//jar",
        "@google_options//jar",
        "@grpc_core//jar",
        "@guava//jar",
        "@javax_inject//jar",
    ],
)
