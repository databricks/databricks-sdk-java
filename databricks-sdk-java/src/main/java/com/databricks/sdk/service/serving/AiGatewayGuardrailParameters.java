// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class AiGatewayGuardrailParameters {
  /**
   * List of invalid keywords. AI guardrail uses keyword or string matching to decide if the keyword
   * exists in the request or response content.
   */
  @JsonProperty("invalid_keywords")
  private Collection<String> invalidKeywords;

  /** Configuration for guardrail PII filter. */
  @JsonProperty("pii")
  private AiGatewayGuardrailPiiBehavior pii;

  /** Indicates whether the safety filter is enabled. */
  @JsonProperty("safety")
  private Boolean safety;

  /**
   * The list of allowed topics. Given a chat request, this guardrail flags the request if its topic
   * is not in the allowed topics.
   */
  @JsonProperty("valid_topics")
  private Collection<String> validTopics;

  public AiGatewayGuardrailParameters setInvalidKeywords(Collection<String> invalidKeywords) {
    this.invalidKeywords = invalidKeywords;
    return this;
  }

  public Collection<String> getInvalidKeywords() {
    return invalidKeywords;
  }

  public AiGatewayGuardrailParameters setPii(AiGatewayGuardrailPiiBehavior pii) {
    this.pii = pii;
    return this;
  }

  public AiGatewayGuardrailPiiBehavior getPii() {
    return pii;
  }

  public AiGatewayGuardrailParameters setSafety(Boolean safety) {
    this.safety = safety;
    return this;
  }

  public Boolean getSafety() {
    return safety;
  }

  public AiGatewayGuardrailParameters setValidTopics(Collection<String> validTopics) {
    this.validTopics = validTopics;
    return this;
  }

  public Collection<String> getValidTopics() {
    return validTopics;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AiGatewayGuardrailParameters that = (AiGatewayGuardrailParameters) o;
    return Objects.equals(invalidKeywords, that.invalidKeywords)
        && Objects.equals(pii, that.pii)
        && Objects.equals(safety, that.safety)
        && Objects.equals(validTopics, that.validTopics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invalidKeywords, pii, safety, validTopics);
  }

  @Override
  public String toString() {
    return new ToStringer(AiGatewayGuardrailParameters.class)
        .add("invalidKeywords", invalidKeywords)
        .add("pii", pii)
        .add("safety", safety)
        .add("validTopics", validTopics)
        .toString();
  }
}
