// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AiGatewayGuardrailPiiBehavior {
  /**
   * Behavior for PII filter. Currently only 'BLOCK' is supported. If 'BLOCK' is set for the input
   * guardrail and the request contains PII, the request is not sent to the model server and 400
   * status code is returned; if 'BLOCK' is set for the output guardrail and the model response
   * contains PII, the PII info in the response is redacted and 400 status code is returned.
   */
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
