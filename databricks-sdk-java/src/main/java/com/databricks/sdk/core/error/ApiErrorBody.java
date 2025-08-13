package com.databricks.sdk.core.error;

import com.databricks.sdk.core.error.details.ErrorDetails;
import com.databricks.sdk.core.error.details.ErrorInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.auto.value.AutoValue;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The union of all JSON error responses from the Databricks APIs, not including HTML responses.
 *
 * <p>Unknown properties in the response should be ignored.
 */
@AutoValue
@JsonDeserialize(builder = AutoValue_ApiErrorBody.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class ApiErrorBody {

  @JsonProperty("error_code")
  @Nullable public abstract String errorCode();

  @JsonProperty("message")
  @Nullable public abstract String message();

  @JsonProperty("detail")
  @Nullable public abstract String scimDetail();

  @JsonProperty("status")
  @Nullable public abstract String scimStatus();

  @JsonProperty("scimType")
  @Nullable public abstract String scimType();

  @JsonProperty("error")
  @Nullable public abstract String api12Error();

  @JsonProperty("details")
  @Nullable public abstract ErrorDetails errorDetails();

  @JsonProperty("errorDetailsList")
  @Nullable public abstract List<ErrorDetail> errorDetailsList();

  /**
   * Returns a builder for constructing ApiErrorBody instances with the same values as this
   * instance.
   *
   * @return a new builder instance
   */
  public abstract Builder toBuilder();

  /**
   * Creates a new builder for constructing ApiErrorBody instances.
   *
   * @return a new builder instance
   */
  public static Builder builder() {
    return new AutoValue_ApiErrorBody.Builder();
  }

  /**
   * Converts ErrorDetails to a List of legacy ErrorDetail objects for backward compatibility. This
   * method extracts the structured error information and converts it to the format expected by
   * legacy error handling code.
   *
   * @return a list of ErrorDetail objects, or an empty list if errorDetails() is null
   */
  public List<ErrorDetail> getErrorDetailsList() {
    // If we have a direct errorDetailsList from JSON, use it
    if (errorDetailsList() != null) {
      return errorDetailsList();
    }

    // Fallback to converting from ErrorDetails for backward compatibility
    if (errorDetails() == null) {
      return Collections.emptyList();
    }
    if (!errorDetails().errorInfo().isPresent()) {
      return Collections.emptyList();
    }

    ErrorInfo errorInfo = errorDetails().errorInfo().get();
    return Collections.singletonList(
        new ErrorDetail(
            "type.googleapis.com/google.rpc.ErrorInfo",
            errorInfo.reason(),
            errorInfo.domain(),
            errorInfo.metadata()));
  }

  /** Builder for constructing ApiErrorBody instances. */
  @AutoValue.Builder
  @JsonIgnoreProperties(ignoreUnknown = true)
  public abstract static class Builder {

    /**
     * Sets the error code.
     *
     * @param errorCode the error code
     * @return this builder for method chaining
     */
    @JsonProperty("error_code")
    public abstract Builder setErrorCode(@Nullable String errorCode);

    /**
     * Sets the message.
     *
     * @param message the message
     * @return this builder for method chaining
     */
    @JsonProperty("message")
    public abstract Builder setMessage(@Nullable String message);

    /**
     * Sets the SCIM detail.
     *
     * @param scimDetail the SCIM detail
     * @return this builder for method chaining
     */
    @JsonProperty("detail")
    public abstract Builder setScimDetail(@Nullable String scimDetail);

    /**
     * Sets the SCIM status.
     *
     * @param scimStatus the SCIM status
     * @return this builder for method chaining
     */
    @JsonProperty("status")
    public abstract Builder setScimStatus(@Nullable String scimStatus);

    /**
     * Sets the SCIM type.
     *
     * @param scimType the SCIM type
     * @return this builder for method chaining
     */
    @JsonProperty("scimType")
    public abstract Builder setScimType(@Nullable String scimType);

    /**
     * Sets the API 1.2 error.
     *
     * @param api12Error the API 1.2 error
     * @return this builder for method chaining
     */
    @JsonProperty("error")
    public abstract Builder setApi12Error(@Nullable String api12Error);

    /**
     * Sets the error details.
     *
     * @param errorDetails the error details
     * @return this builder for method chaining
     */
    @JsonProperty("details")
    public abstract Builder setErrorDetails(@Nullable ErrorDetails errorDetails);

    /**
     * Sets the error details list.
     *
     * @param errorDetailsList the error details list
     * @return this builder for method chaining
     */
    @JsonProperty("errorDetailsList")
    public abstract Builder setErrorDetailsList(@Nullable List<ErrorDetail> errorDetailsList);

    /**
     * Builds the ApiErrorBody instance.
     *
     * @return a new ApiErrorBody instance
     */
    public abstract ApiErrorBody build();
  }
}
