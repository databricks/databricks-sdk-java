#!/bin/bash

# Wrapper for `mvn spotless:apply` that exports the javac-internals flags required by
# google-java-format on JDK 16+. Without these, GJF fails on JDK 17+ with either
# IllegalAccessError or NoSuchMethodError when it reaches into com.sun.tools.javac.*.
# On JDK <= 15 the flags are unrecognized and would break Maven startup, so we only
# set them when detected JDK major version is >= 16.

set -euo pipefail

JDK_VERSION_OUTPUT=$(java -version 2>&1 | head -1)
# Matches `"1.8.0_xxx"` (legacy) and `"17.0.1"` / `"25"` (modern) forms.
JDK_MAJOR=$(echo "$JDK_VERSION_OUTPUT" | sed -E 's/.*version "([0-9]+)(\.[0-9]+)?.*/\1/')
if [ "$JDK_MAJOR" = "1" ]; then
  JDK_MAJOR=$(echo "$JDK_VERSION_OUTPUT" | sed -E 's/.*version "1\.([0-9]+).*/\1/')
fi

if [ "${JDK_MAJOR:-0}" -ge 16 ]; then
  export MAVEN_OPTS="${MAVEN_OPTS:-} \
--add-exports=jdk.compiler/com.sun.tools.javac.api=ALL-UNNAMED \
--add-exports=jdk.compiler/com.sun.tools.javac.code=ALL-UNNAMED \
--add-exports=jdk.compiler/com.sun.tools.javac.file=ALL-UNNAMED \
--add-exports=jdk.compiler/com.sun.tools.javac.parser=ALL-UNNAMED \
--add-exports=jdk.compiler/com.sun.tools.javac.tree=ALL-UNNAMED \
--add-exports=jdk.compiler/com.sun.tools.javac.util=ALL-UNNAMED"
fi

exec mvn spotless:apply
