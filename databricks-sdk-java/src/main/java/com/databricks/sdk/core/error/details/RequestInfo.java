package com.databricks.sdk.core.error.details;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.auto.value.AutoValue;

/**
 * RequestInfo contains metadata about the request that clients can attach when filing a bug or
 * providing other forms of feedback.
 *
 * <p>This class provides information that can be used to:
 *
 * <ul>
 *   <li>Identify specific requests in service logs for debugging
 *   <li>Provide context when reporting issues to support teams
 *   <li>Correlate client-side errors with server-side logs
 *   <li>Enable more effective troubleshooting of issues
 * </ul>
 *
 * <p>The information contained here is typically opaque to clients and should only be interpreted
 * by the service that generated it.
 */
@AutoValue
@JsonDeserialize(builder = AutoValue_RequestInfo.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class RequestInfo {

  /**
   * An opaque string that should only be interpreted by the service that generated it. For example,
   * it can be used to identify requests in the service's logs.
   *
   * <p>This identifier is typically used by service operators and support teams to trace the
   * execution of specific requests through the system.
   *
   * @return the request identifier
   */
  @JsonProperty("request_id")
  public abstract String requestId();

  /**
   * Any data that was used to serve this request. For example, an encrypted stack trace that can be
   * sent back to the service provider for debugging.
   *
   * <p>This field may contain sensitive information that is useful for debugging but should be
   * handled carefully. It might include:
   *
   * <ul>
   *   <li>Stack traces or error logs
   *   <li>Request context or parameters
   *   <li>System state information
   *   <li>Other diagnostic data
   * </ul>
   *
   * @return data that was used to serve the request
   */
  @JsonProperty("serving_data")
  public abstract String servingData();

  /**
   * Creates a new builder for constructing RequestInfo instances.
   *
   * @return a new builder instance
   */
  public static Builder builder() {
    return new AutoValue_RequestInfo.Builder();
  }

  /** Builder for constructing RequestInfo instances. */
  @AutoValue.Builder
  @JsonIgnoreProperties(ignoreUnknown = true)
  public abstract static class Builder {

    /**
     * Sets the request identifier.
     *
     * @param requestId the request identifier
     * @return this builder for method chaining
     */
    @JsonProperty("request_id")
    public abstract Builder setRequestId(String requestId);

    /**
     * Sets the serving data.
     *
     * @param servingData data that was used to serve the request
     * @return this builder for method chaining
     */
    @JsonProperty("serving_data")
    public abstract Builder setServingData(String servingData);

    /**
     * Builds the RequestInfo instance.
     *
     * @return a new RequestInfo instance
     */
    public abstract RequestInfo build();
  }
}
