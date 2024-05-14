# Lab 01: Local build cache

This lab demonstrates using the local build cache without reaching out to a remote Gradle Enterprise instance for caching.

## Steps
-----

1. Build the project using `./gradlew build` and look at the timeline in the build scan to confirm compilation and test tasks were executed
    - Were the results of any cacheable tasks stored within the cache?
    - Were there any timesavings due to the cache in these builds?
    - **Hint:** To search for tasks resolved from the cache, click the magnifying glass on the Timeline view and set "Task output cacheability" to "Cacheable".
2. Build again with `clean` (using `./gradlew clean build`), and filter the Timeline view by those tasks whose output were taken from cache
    - Which tasks were resolved from the cache?
    - Were there any cacheable tasks that were **not** resolved from the cache?
    - How much faster is the fully cached build than the uncached build?
