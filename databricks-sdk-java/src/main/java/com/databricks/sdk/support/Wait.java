package com.databricks.sdk.support;

import java.time.Duration;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;

@DeveloperApi
public class Wait<T, R> {
  private final WaitStarter<T> impl;
  private final R response;
  private Consumer<T> progress;

  public Wait(WaitStarter<T> impl) {
    this(impl, null);
  }

  public Wait(WaitStarter<T> impl, R response) {
    this.impl = impl;
    this.response = response;
  }

  public Wait<T, R> onProgress(Consumer<T> progress) {
    this.progress = progress;
    return this;
  }

  public T get() throws TimeoutException {
    return get(Duration.ofMinutes(20));
  }

  public T get(Duration timeout) throws TimeoutException {
    return impl.apply(timeout, progress);
  }

  public R getResponse() {
    return response;
  }
}
