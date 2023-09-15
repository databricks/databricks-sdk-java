package com.databricks.sdk.core.error;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collections;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ErrorDetail {

  private String type;

  private String reason;

  private String domain;

  private Map<String, String> metadata;

  public ErrorDetail() {}

  public ErrorDetail(
      @JsonProperty("@type") String type,
      @JsonProperty("reason") String reason,
      @JsonProperty("domain") String domain,
      @JsonProperty("metadata") Map<String, String> metadata) {
    this.type = type;
    this.reason = reason;
    this.domain = domain;
    this.metadata = Collections.unmodifiableMap(metadata);
  }

  public String getType() {
    return type;
  }

  public String getReason() {
    return reason;
  }

  public Map<String, String> getMetadata() {
    return metadata;
  }

  public String getDomain() {
    return domain;
  }

  @Override
  public String toString() {
    return "ErrorDetails{"
        + "type='"
        + type
        + '\''
        + ", reason='"
        + reason
        + '\''
        + ", domain='"
        + domain
        + '\''
        + ", metadata="
        + metadata
        + '}';
  }
}
