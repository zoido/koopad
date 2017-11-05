package(default_visibility = ["//visibility:public"])

# java_test(
java_binary(
    name = "google_java_format",
    main_class = "com.google.googlejavaformat.java.Main",
    # test_class = "com.google.googlejavaformat.java.Main",
    # use_testrunner = 0,
    args = [
        "--version",
    ],
    # data = ["//:java_files"],
    runtime_deps = [
        "@google_java_format//jar",
        "@guava//jar"
    ]
)
