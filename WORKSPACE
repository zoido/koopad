maven_jar(
    name = "dagger",
    artifact = "com.google.dagger:dagger:2.12",
)

maven_jar(
    name = "dagger_compiler",
    artifact = "com.google.dagger:dagger-compiler:2.12",
)

maven_jar(
    name = "dagger_grpc_server",
    artifact = "com.google.dagger:dagger-grpc-server:2.12",
)
maven_jar(
    name = "dagger_grpc_server_annotations",
    artifact = "com.google.dagger:dagger-grpc-server-annotations:2.12",
)

maven_jar(
    name = "dagger_grpc_server_processor",
    artifact = "com.google.dagger:dagger-grpc-server-processor:2.12",
)

maven_jar(
    name = "dagger_producers",
    artifact = "com.google.dagger:dagger-producers:2.12",
)

maven_jar(
    name = "google_options",
    artifact = "com.github.pcj:google-options:jar:1.0.0",
)

maven_jar(
    name = "guava",
    artifact = "com.google.guava:guava:23.3-jre",
)
maven_jar(
    name = "errorprone_javac",
    artifact = "com.google.errorprone:javac:9-dev-r3297-1-shaded"
)
maven_jar(
    name = "dagger_javapoet",
    artifact = "com.squareup:javapoet:1.7.0"
    )

maven_jar(
    name = "google_java_format",
    artifact = "com.google.googlejavaformat:google-java-format:1.5",
)
maven_jar(
    name = "javax_inject",
    artifact = "javax.inject:javax.inject:1"
)



maven_jar(
    name = "grpc_core",
    artifact = "io.grpc:grpc-core:1.7.0",
)
maven_jar(
    name = "netty",
    artifact = "io.netty:netty-all:4.1.16.Final",
)
maven_jar(
    name = "grpc_netty",
    artifact = "io.grpc:grpc-netty:1.7.0",
)
maven_jar(
    name = "grpc_stub",
    artifact = "io.grpc:grpc-stub:1.7.0",
)

# maven_jar(
#     name = "jsr330_inject",
#     artifact = "javax.inject:javax.inject:1",
# )

# Build Dependencies
git_repository(
    name = "grpc_java",
    remote = "https://github.com/grpc/grpc-java.git",
    tag = "v1.7.0",
)
load("@grpc_java//:repositories.bzl", "grpc_java_repositories")
grpc_java_repositories()
