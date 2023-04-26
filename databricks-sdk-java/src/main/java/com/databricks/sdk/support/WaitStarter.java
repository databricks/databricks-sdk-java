package com.databricks.sdk.support;

import java.time.Duration;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;

/**
 * <p>WaitStarter interface.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
@FunctionalInterface
public interface WaitStarter<T> {
  /**
   * <p>apply.</p>
   *
   * @param timeout a {@link java.time.Duration} object
   * @param progress a {@link java.util.function.Consumer} object
   * @return a T object
   * @throws java.util.concurrent.TimeoutException if any.
   */
  T apply(Duration timeout, Consumer<T> progress) throws TimeoutException;
}
