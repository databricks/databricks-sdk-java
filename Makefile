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
	  -exec sed -i \
	    -e 's|databricks\.jfrog\.io/artifactory/db-maven|repo.maven.apache.org/maven2|g' \
	    -e 's@maven-proxy\.\(cloud\|dev\)\.databricks\.com@repo.maven.apache.org/maven2@g' {} +

