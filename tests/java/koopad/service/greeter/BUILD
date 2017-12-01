java_library(
    name = "tests",
    testonly = 1,
    srcs = glob(["*.java"]),
    deps = [
        "//src/java/koopad/service/greeter",
        "//src/proto:greeter_java_grpc",
        "//src/proto:greeter_java_proto",
        "@grpc_testing//jar",
        "@junit4//jar",
        "@truth//jar",
    ],
)

java_test(
    name = "GreeterTest",
    size = "small",
    testonly = 1,
    runtime_deps = [":tests"],
)
