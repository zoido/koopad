package(default_visibility = ["//:src"])

java_binary(
    name = "koopad_server",
    main_class = "koopad.service.KoopadServer",
    runtime_deps = [
        "@grpc_netty//jar",
        "@netty//jar",
        ":koopad_lib",
    ],
)

java_library(
    name = "koopad_lib",
    srcs = glob(["*.java"]),
    deps = [
        "@dagger_grpc_server_annotations//jar",
        "@dagger_grpc_server//jar",
        "@dagger//jar",
        "@google_options//jar",
        "@grpc_core//jar",
        "@guava//jar",
        "@javax_inject//jar",
        "//src/java/koopad/service/greeter",
        "//src/java/koopad/service/options",
        "//src/proto:greeter_java_grpc",
    ]
)
