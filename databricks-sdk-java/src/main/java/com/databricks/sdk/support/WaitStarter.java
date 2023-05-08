package com.databricks.sdk.support;

import java.time.Duration;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;

@DeveloperApi
@FunctionalInterface
public interface WaitStarter<T> {
  T apply(Duration timeout, Consumer<T> progress) throws TimeoutException;
}
