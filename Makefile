fmt:
	@mvn spotless:apply || ( \
	  echo ""; \
	  echo "==> default JDK could not run google-java-format (likely < JDK 17). Retrying with JDK 17..."; \
	  echo ""; \
	  $(MAKE) fmt-jdk17 \
	)

# Same as `fmt` but runs under JDK 17 explicitly. Use this when your default
# JDK is older than 17 (e.g. JDK 11), since google-java-format 1.27.0 — pinned
# in pom.xml for JDK 25 generator support — requires JRE 17+ to load.
fmt-jdk17:
	JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64 mvn spotless:apply

test:
	mvn test

lock:
	mvn io.github.chains-project:maven-lockfile:5.5.2:generate

check-lock:
	mvn io.github.chains-project:maven-lockfile:5.5.2:validate

fix-lockfile:
	@# Replace JFrog proxy URLs with public Maven Central equivalents in lockfiles.
	@# Prevents proxy URLs from being accidentally committed.
	find . -type f -name 'lockfile.json' \
	  -exec sed -i 's|databricks\.jfrog\.io/artifactory/db-maven|repo.maven.apache.org/maven2|g' {} +

