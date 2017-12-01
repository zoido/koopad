java_library(
    name = "tests",
    testonly = 1,
    srcs = glob(["*.java"]),
    deps = [
        "@grpc_testing//jar",
        "@junit4//jar",
        "@truth//jar",
        "//src/java/koopad/service/greeter",
        "//src/proto:greeter_java_grpc",
        "//src/proto:greeter_java_proto",
    ],
)

java_test(
    name = "GreeterTest",
    testonly = 1,
    size = "small",
    runtime_deps = [":tests"],
)
