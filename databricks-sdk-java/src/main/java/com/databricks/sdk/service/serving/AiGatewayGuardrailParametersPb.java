// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class AiGatewayGuardrailParametersPb {
  @JsonProperty("invalid_keywords")
  private Collection<String> invalidKeywords;

  @JsonProperty("pii")
  private AiGatewayGuardrailPiiBehavior pii;

  @JsonProperty("safety")
  private Boolean safety;

  @JsonProperty("valid_topics")
  private Collection<String> validTopics;

  public AiGatewayGuardrailParametersPb setInvalidKeywords(Collection<String> invalidKeywords) {
    this.invalidKeywords = invalidKeywords;
    return this;
  }

  public Collection<String> getInvalidKeywords() {
    return invalidKeywords;
  }

  public AiGatewayGuardrailParametersPb setPii(AiGatewayGuardrailPiiBehavior pii) {
    this.pii = pii;
    return this;
  }

  public AiGatewayGuardrailPiiBehavior getPii() {
    return pii;
  }

  public AiGatewayGuardrailParametersPb setSafety(Boolean safety) {
    this.safety = safety;
    return this;
  }

  public Boolean getSafety() {
    return safety;
  }

  public AiGatewayGuardrailParametersPb setValidTopics(Collection<String> validTopics) {
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
    AiGatewayGuardrailParametersPb that = (AiGatewayGuardrailParametersPb) o;
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
    return new ToStringer(AiGatewayGuardrailParametersPb.class)
        .add("invalidKeywords", invalidKeywords)
        .add("pii", pii)
        .add("safety", safety)
        .add("validTopics", validTopics)
        .toString();
  }
}
