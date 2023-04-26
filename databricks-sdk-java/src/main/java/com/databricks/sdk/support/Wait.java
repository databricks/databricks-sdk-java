package com.databricks.sdk.support;

import java.time.Duration;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;

/**
 * <p>Wait class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class Wait<T, R> {
  private final WaitStarter<T> impl;
  private final R response;
  private Consumer<T> progress;

  /**
   * <p>Constructor for Wait.</p>
   *
   * @param impl a {@link com.databricks.sdk.support.WaitStarter} object
   */
  public Wait(WaitStarter<T> impl) {
    this(impl, null);
  }

  /**
   * <p>Constructor for Wait.</p>
   *
   * @param impl a {@link com.databricks.sdk.support.WaitStarter} object
   * @param response a R object
   */
  public Wait(WaitStarter<T> impl, R response) {
    this.impl = impl;
    this.response = response;
  }

  /**
   * <p>onProgress.</p>
   *
   * @param progress a {@link java.util.function.Consumer} object
   * @return a {@link com.databricks.sdk.support.Wait} object
   */
  public Wait<T, R> onProgress(Consumer<T> progress) {
    this.progress = progress;
    return this;
  }

  /**
   * <p>get.</p>
   *
   * @return a T object
   * @throws java.util.concurrent.TimeoutException if any.
   */
  public T get() throws TimeoutException {
    return get(Duration.ofMinutes(20));
  }

  /**
   * <p>get.</p>
   *
   * @param timeout a {@link java.time.Duration} object
   * @return a T object
   * @throws java.util.concurrent.TimeoutException if any.
   */
  public T get(Duration timeout) throws TimeoutException {
    return impl.apply(timeout, progress);
  }

  /**
   * <p>Getter for the field <code>response</code>.</p>
   *
   * @return a R object
   */
  public R getResponse() {
    return response;
  }
}
