// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AiGatewayGuardrailPiiBehavior {
  /** Configuration for input guardrail filters. */
  @JsonProperty("behavior")
  private AiGatewayGuardrailPiiBehaviorBehavior behavior;

  public AiGatewayGuardrailPiiBehavior setBehavior(AiGatewayGuardrailPiiBehaviorBehavior behavior) {
    this.behavior = behavior;
    return this;
  }

  public AiGatewayGuardrailPiiBehaviorBehavior getBehavior() {
    return behavior;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AiGatewayGuardrailPiiBehavior that = (AiGatewayGuardrailPiiBehavior) o;
    return Objects.equals(behavior, that.behavior);
  }

  @Override
  public int hashCode() {
    return Objects.hash(behavior);
  }

  @Override
  public String toString() {
    return new ToStringer(AiGatewayGuardrailPiiBehavior.class).add("behavior", behavior).toString();
  }
}
