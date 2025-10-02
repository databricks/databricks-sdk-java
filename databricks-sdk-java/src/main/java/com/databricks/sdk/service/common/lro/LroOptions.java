package com.databricks.sdk.service.common.lro;

import java.time.Duration;
import java.util.Objects;
import java.util.Optional;

/**
 * Options for configuring long-running operation behavior.
 *
 * <p>This class provides configuration options for long-running operations, such as timeouts and
 * other behavioral settings.
 */
public class LroOptions {

  /**
   * The maximum duration to wait for the operation to complete. If empty, the default timeout will
   * be used (typically 20 minutes).
   */
  private final Optional<Duration> timeout;

  /** Private constructor for builder pattern. */
  private LroOptions(Builder builder) {
    this.timeout = Optional.ofNullable(builder.timeout);
  }

  /**
   * Gets the timeout for the operation.
   *
   * @return the timeout duration, or empty if using the default
   */
  public Optional<Duration> getTimeout() {
    return timeout;
  }

  /**
   * Creates a new builder for LroOptions.
   *
   * @return a new Builder instance
   */
  public static Builder newBuilder() {
    return new Builder();
  }

  /**
   * Creates LroOptions with the specified timeout. Convenience method for simple timeout
   * configuration.
   *
   * @param timeout the maximum duration to wait for operation completion
   * @return a new LroOptions instance
   */
  public static LroOptions withTimeout(Duration timeout) {
    return newBuilder().setTimeout(timeout).build();
  }

  /** Builder for LroOptions. */
  public static class Builder {
    private Duration timeout;

    /**
     * Sets the timeout for the operation.
     *
     * @param timeout the maximum duration to wait for operation completion
     * @return this Builder instance for method chaining
     */
    public Builder setTimeout(Duration timeout) {
      this.timeout = timeout;
      return this;
    }

    /**
     * Builds the LroOptions instance.
     *
     * @return a new LroOptions instance
     */
    public LroOptions build() {
      return new LroOptions(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LroOptions that = (LroOptions) o;
    return Objects.equals(timeout, that.timeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeout);
  }

  @Override
  public String toString() {
    return "LroOptions{" + "timeout=" + timeout + '}';
  }
}
