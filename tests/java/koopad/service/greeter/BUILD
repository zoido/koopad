java_library(
    name = "tests",
    testonly = 1,
    srcs = glob(["*.java"]),
    deps = [
        "@junit4//jar",
        "@truth//jar",
        "//src/java/koopad/service/greeter",
    ],
)

java_test(
    name = "GreeterTest",
    testonly = 1,
    runtime_deps = [":tests"],
)
