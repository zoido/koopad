package(default_visibility = ["//:src"])

load("@grpc_java//:java_grpc_library.bzl", "java_grpc_library")

proto_library(
    name = "greeting_proto",
    srcs = ["greeting.proto"],
)

java_proto_library(
    name = "greeting_java_proto",
    deps = [":greeting_proto"],
)

proto_library(
    name = "greeter_proto",
    srcs = ["greeter.proto"],
    deps = [":greeting_proto"],
)

java_proto_library(
    name = "greeter_java_proto",
    deps = [":greeter_proto"],
)

java_grpc_library(
    name = "greeter_java_grpc",
    srcs = [":greeter_proto"],
    deps = [":greeter_java_proto"],
)
