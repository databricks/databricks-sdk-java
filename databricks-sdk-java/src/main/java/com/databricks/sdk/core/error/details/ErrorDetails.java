package com.databricks.sdk.core.error.details;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.auto.value.AutoValue;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * ErrorDetails contains the error details of an API error. It is the union of known error details
 * types and unknown details.
 */
@AutoValue
@JsonDeserialize(using = ErrorDetailsDeserializer.class)
@JsonSerialize(using = ErrorDetailsSerializer.class)
public abstract class ErrorDetails {

  public abstract Optional<ErrorInfo> errorInfo();

  public abstract Optional<RequestInfo> requestInfo();

  public abstract Optional<RetryInfo> retryInfo();

  public abstract Optional<DebugInfo> debugInfo();

  public abstract Optional<QuotaFailure> quotaFailure();

  public abstract Optional<PreconditionFailure> preconditionFailure();

  public abstract Optional<BadRequest> badRequest();

  public abstract Optional<ResourceInfo> resourceInfo();

  public abstract Optional<Help> help();

  public abstract List<JsonNode> unknownDetails();

  public static Builder builder() {
    return new AutoValue_ErrorDetails.Builder().setUnknownDetails(Collections.emptyList());
  }

  @AutoValue.Builder
  public abstract static class Builder {
    public abstract Builder setErrorInfo(ErrorInfo errorInfo);

    public abstract Builder setRequestInfo(RequestInfo requestInfo);

    public abstract Builder setRetryInfo(RetryInfo retryInfo);

    public abstract Builder setDebugInfo(DebugInfo debugInfo);

    public abstract Builder setQuotaFailure(QuotaFailure quotaFailure);

    public abstract Builder setPreconditionFailure(PreconditionFailure preconditionFailure);

    public abstract Builder setBadRequest(BadRequest badRequest);

    public abstract Builder setResourceInfo(ResourceInfo resourceInfo);

    public abstract Builder setHelp(Help help);

    public abstract Builder setUnknownDetails(List<JsonNode> unknownDetails);

    public abstract ErrorDetails build();
  }
}
