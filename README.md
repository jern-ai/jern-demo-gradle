# jern demo, Gradle — an agent under repository rules

The Gradle twin of [jern-demo](https://github.com/jern-ai/jern-demo): a
deliberately small Gradle project with one failing JUnit test, used by Jern
Cloud's [task benchmark](https://github.com/jern-ai/jern-cloud/blob/main/docs/benchmark.md)
to qualify Gradle under the runner sandbox.

```bash
gradle --no-daemon test      # one test fails: fahrenheitToCelsius
jern run "fix the failing test"
```

Pull requests opened by benchmark runs are closed, not merged: the bug is
the point.

A Jern Cloud maintenance campaign on staging runs against this repository
every hour; its runs settle against the campaign's terms, not this README.
