# Lab 01: Local build cache

This lab demonstrates using the local build cache without reaching out to a remote Gradle Enterprise instance for caching.

## Steps
-----

1. Open `.mvn/gradle-enterprise.xml`.
    - Note that the local cache is not configured explicitly since it is enabled by default.
2. Build the project using `./mvnw clean test` and look at the timeline in the build scan to confirm compilation and test goals were executed
    - Were the results of any cacheable goals stored within the cache?
    - Were there any timesavings due to the cache in these builds?
    - **Hint:** To search for tasks resolved from the cache, click the magnifying glass on the timeline view and set "Goal output cacheability" to "Cacheable".
3. Build again (using `./mvnw clean test`), and filter the timeline view by those goals whose output were taken from cache
    - Which goals were resolved from the cache?
    - Were there any cacheable goals that were not resolved from the cache?
    - How much faster is the fully cached build than the uncached build?
4. Execute just a clean using `./mvnw clean`
5. Then execute tests without clean (using `./mvnw test`) and notice the cache was not used leading to much longer build time than previously
