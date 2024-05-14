# Lab 02: Goal inputs comparison

This lab demonstrates using the task input comparison tool to detect cache misses.

## Steps
-----

1. Build the project **two times** in a row using `./mvnw clean test`
    - Which goal(s) are cacheable but are still executed instead of being resolved from the cache?

2. From either scan, click the Compare Build scan button on the lower left and compare these two builds.
    - Which inputs are impacting goal cacheability?
    - How would you fix the timestamp problem? Apply those changes before moving forward.

3. Now build the project **two times** (using `./mvnw clean test`) in a row again and look at both scans.
    - Are all cacheable goals being resolved from the cache or does some volatility remain?
    - Are the avoidance savings for these builds better or worse than the builds that included timestamp files?
