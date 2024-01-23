package com.databricks.sdk.support;

import java.time.Duration;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;

/**
 * A Wait object is returned by long-running operations. It can be used to wait for the operation to
 * complete.
 *
 * <p>Several operations, such as starting a cluster or submitting a job, are long-running
 * operations. After being initiated by a call to the API, these operations continue to run in the
 * background until they complete. A separate API call can be made to check the status of the
 * operation. {@code Wait} objects encapsulate this process, polling for the status of the operation
 * until it completes.
 *
 * <p>{@code Wait} objects expose both the response from the triggering API call and the awaited
 * resource. For example, the {@link
 * com.databricks.sdk.service.compute.ClustersAPI#create(com.databricks.sdk.service.compute.CreateCluster)}
 * method returns a {@code Wait<ClusterDetails, CreateClusterResponse>} object. The response from
 * the API call to create the cluster is available via the {@link #getResponse()} method. The
 * awaited resource, the cluster details, is available via the {@link #get()} method.
 *
 * <p>The {@link #get()} method waits for the operation to complete for up to 20 minutes. To wait
 * for a custom duration, use the {@link #get(Duration)} method.
 *
 * @param <T>
 * @param <R>
 */
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

  /**
   * Wait for the operation to complete for up to 20 minutes.
   *
   * @return the awaited resource
   * @throws TimeoutException if the operation does not complete within 20 minutes
   */
  public T get() throws TimeoutException {
    return get(Duration.ofMinutes(20));
  }

  /**
   * Wait for the operation to complete for up to the specified duration.
   *
   * @param timeout the maximum duration to wait
   * @return the awaited resource
   * @throws TimeoutException if the operation does not complete within the specified duration
   */
  public T get(Duration timeout) throws TimeoutException {
    return impl.apply(timeout, progress);
  }

  /**
   * Get the response for the initial API call made to start the operation.
   *
   * @return the response object
   */
  public R getResponse() {
    return response;
  }
}
