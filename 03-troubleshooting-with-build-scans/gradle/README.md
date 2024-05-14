# Lab 03: Troubleshooting with build scans

This lab demonstrates using build scans to detect build performance issues.

## Steps
-----

1. Run a build to publish a build scan using `./gradlew build`
2. Follow the link in the console output to view your build scan.
3. Find the answers to the following questions:
    - How much time is being spent on garbage collection?
    - What is the peak memory usage?
4. Fix the issue degrading build performance
    - Hint: https://docs.gradle.org/current/userguide/build_environment.html#sec:configuring_jvm_memory
