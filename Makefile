fmt:
	mvn spotless:apply

test:
	mvn test

lock:
	mvn io.github.chains-project:maven-lockfile:5.5.2:generate

check-lock:
	mvn io.github.chains-project:maven-lockfile:5.5.2:validate

