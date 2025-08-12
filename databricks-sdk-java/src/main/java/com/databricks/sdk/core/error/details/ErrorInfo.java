package com.databricks.sdk.core.error.details;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.auto.value.AutoValue;
import java.util.Map;

/**
 * ErrorInfo describes the cause of the error with structured details.
 *
 * <p>This class provides structured information about what went wrong, including:
 *
 * <ul>
 *   <li>The reason for the error (a constant value identifying the proximate cause)
 *   <li>The logical grouping to which the "reason" belongs
 *   <li>Additional structured details about the error
 * </ul>
 *
 * <p>This information can be used by clients to:
 *
 * <ul>
 *   <li>Understand what went wrong
 *   <li>Provide better error messages to users
 *   <li>Implement appropriate error handling logic
 *   <li>Debug issues more effectively
 * </ul>
 */
@AutoValue
@JsonDeserialize(builder = AutoValue_ErrorInfo.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class ErrorInfo {

  /**
   * The reason of the error. This is a constant value that identifies the proximate cause of the
   * error.
   *
   * <p>Examples might include: "INVALID_ARGUMENT", "RESOURCE_NOT_FOUND", "PERMISSION_DENIED", etc.
   *
   * @return the reason for the error
   */
  @JsonProperty("reason")
  public abstract String reason();

  /**
   * The logical grouping to which the "reason" belongs.
   *
   * <p>This provides context about the domain or category of the error. Examples might include:
   * "databricks.api", "databricks.auth", etc.
   *
   * @return the domain of the error
   */
  @JsonProperty("domain")
  public abstract String domain();

  /**
   * Additional structured details about this error.
   *
   * <p>This map can contain arbitrary key-value pairs that provide additional context about the
   * error. The exact contents depend on the specific error type and the service implementation.
   *
   * @return additional metadata about the error
   */
  @JsonProperty("metadata")
  public abstract Map<String, String> metadata();

  /**
   * Creates a new builder for constructing ErrorInfo instances.
   *
   * @return a new builder instance
   */
  public static Builder builder() {
    return new AutoValue_ErrorInfo.Builder();
  }

  /** Builder for constructing ErrorInfo instances. */
  @AutoValue.Builder
  @JsonIgnoreProperties(ignoreUnknown = true)
  public abstract static class Builder {

    /**
     * Sets the reason for the error.
     *
     * @param reason the reason for the error
     * @return this builder for method chaining
     */
    @JsonProperty("reason")
    public abstract Builder setReason(String reason);

    /**
     * Sets the domain of the error.
     *
     * @param domain the domain of the error
     * @return this builder for method chaining
     */
    @JsonProperty("domain")
    public abstract Builder setDomain(String domain);

    /**
     * Sets the additional metadata about the error.
     *
     * @param metadata additional metadata about the error
     * @return this builder for method chaining
     */
    @JsonProperty("metadata")
    public abstract Builder setMetadata(Map<String, String> metadata);

    /**
     * Builds the ErrorInfo instance.
     *
     * @return a new ErrorInfo instance
     */
    public abstract ErrorInfo build();
  }
}
