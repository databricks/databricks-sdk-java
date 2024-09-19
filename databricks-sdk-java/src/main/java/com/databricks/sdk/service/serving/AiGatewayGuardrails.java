// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AiGatewayGuardrails {
  /** Configuration for input guardrail filters. */
  @JsonProperty("input")
  private AiGatewayGuardrailParameters input;

  /** Configuration for output guardrail filters. */
  @JsonProperty("output")
  private AiGatewayGuardrailParameters output;

  public AiGatewayGuardrails setInput(AiGatewayGuardrailParameters input) {
    this.input = input;
    return this;
  }

  public AiGatewayGuardrailParameters getInput() {
    return input;
  }

  public AiGatewayGuardrails setOutput(AiGatewayGuardrailParameters output) {
    this.output = output;
    return this;
  }

  public AiGatewayGuardrailParameters getOutput() {
    return output;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AiGatewayGuardrails that = (AiGatewayGuardrails) o;
    return Objects.equals(input, that.input) && Objects.equals(output, that.output);
  }

  @Override
  public int hashCode() {
    return Objects.hash(input, output);
  }

  @Override
  public String toString() {
    return new ToStringer(AiGatewayGuardrails.class)
        .add("input", input)
        .add("output", output)
        .toString();
  }
}
