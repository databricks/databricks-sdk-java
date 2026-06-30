#!/bin/bash

# Wrapper for `mvn spotless:apply` that exports the javac-internals flags required by
# google-java-format on JDK 16+. Without these, GJF fails on JDK 17+ with either
# IllegalAccessError or NoSuchMethodError when it reaches into com.sun.tools.javac.*.
# On JDK <= 15 the flags are unrecognized and would break Maven startup, so we only
# set them when the detected JDK major version is >= 16.
#
# If that JDK can't run google-java-format (most often because it's older than JDK 17,
# which the pinned GJF 1.27.0 requires), we retry under an explicit JDK 17 install —
# mirroring the `make fmt` -> `make fmt-jdk17` fallback. Override the fallback location
# with JDK17_HOME, or just point JAVA_HOME at a JDK 17+ and re-run.

set -euo pipefail

# Location used by the JDK 17 fallback. Override for non-Debian layouts, e.g.
# `JDK17_HOME=$(/usr/libexec/java_home -v 17) bash scripts/mvn-spotless-apply.sh`.
JDK17_HOME="${JDK17_HOME:-/usr/lib/jvm/java-17-openjdk-amd64}"

# The --add-exports flags google-java-format needs to reach into com.sun.tools.javac.*
# on JDK 16+.
GJF_ADD_EXPORTS="\
--add-exports=jdk.compiler/com.sun.tools.javac.api=ALL-UNNAMED \
--add-exports=jdk.compiler/com.sun.tools.javac.code=ALL-UNNAMED \
--add-exports=jdk.compiler/com.sun.tools.javac.file=ALL-UNNAMED \
--add-exports=jdk.compiler/com.sun.tools.javac.parser=ALL-UNNAMED \
--add-exports=jdk.compiler/com.sun.tools.javac.tree=ALL-UNNAMED \
--add-exports=jdk.compiler/com.sun.tools.javac.util=ALL-UNNAMED"

# Detect the major version of the JDK Maven will actually use: $JAVA_HOME/bin/java when
# JAVA_HOME is set, otherwise `java` from PATH. mvn resolves its JVM the same way, so the
# add-exports gating below matches what the first attempt really runs (and re-running with
# JAVA_HOME pointed at a JDK 17+ makes that attempt succeed without hitting the fallback).
JAVA_BIN="java"
if [ -n "${JAVA_HOME:-}" ] && [ -x "${JAVA_HOME}/bin/java" ]; then
  JAVA_BIN="${JAVA_HOME}/bin/java"
fi

JDK_VERSION_OUTPUT=$("$JAVA_BIN" -version 2>&1 | head -1)
# Matches `"1.8.0_xxx"` (legacy) and `"17.0.1"` / `"25"` (modern) forms.
JDK_MAJOR=$(echo "$JDK_VERSION_OUTPUT" | sed -E 's/.*version "([0-9]+)(\.[0-9]+)?.*/\1/')
if [ "$JDK_MAJOR" = "1" ]; then
  JDK_MAJOR=$(echo "$JDK_VERSION_OUTPUT" | sed -E 's/.*version "1\.([0-9]+).*/\1/')
fi

DEFAULT_OPTS="${MAVEN_OPTS:-}"
if [ "${JDK_MAJOR:-0}" -ge 16 ]; then
  DEFAULT_OPTS="$DEFAULT_OPTS $GJF_ADD_EXPORTS"
fi

# First attempt: the JDK selected above (JAVA_HOME or PATH).
if MAVEN_OPTS="$DEFAULT_OPTS" mvn spotless:apply; then
  exit 0
fi

echo ""
echo "==> default JDK could not run google-java-format (likely < JDK 17). Retrying with JDK 17..."
echo ""

if [ ! -x "$JDK17_HOME/bin/java" ]; then
  echo "error: JDK 17 not found at $JDK17_HOME" >&2
  echo "       install it, set JDK17_HOME to a JDK 17 install, or point JAVA_HOME" >&2
  echo "       at a JDK 17+ and re-run." >&2
  exit 1
fi

# JDK 17 is always >= 16, so the add-exports flags are always required here.
exec env JAVA_HOME="$JDK17_HOME" \
  MAVEN_OPTS="${MAVEN_OPTS:-} $GJF_ADD_EXPORTS" \
  mvn spotless:apply
