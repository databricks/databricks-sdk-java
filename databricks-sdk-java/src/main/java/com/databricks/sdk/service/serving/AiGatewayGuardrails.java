// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Objects;

@Generated
@JsonSerialize(using = AiGatewayGuardrails.AiGatewayGuardrailsSerializer.class)
@JsonDeserialize(using = AiGatewayGuardrails.AiGatewayGuardrailsDeserializer.class)
public class AiGatewayGuardrails {
  /** Configuration for input guardrail filters. */
  private AiGatewayGuardrailParameters input;

  /** Configuration for output guardrail filters. */
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

  AiGatewayGuardrailsPb toPb() {
    AiGatewayGuardrailsPb pb = new AiGatewayGuardrailsPb();
    pb.setInput(input);
    pb.setOutput(output);

    return pb;
  }

  static AiGatewayGuardrails fromPb(AiGatewayGuardrailsPb pb) {
    AiGatewayGuardrails model = new AiGatewayGuardrails();
    model.setInput(pb.getInput());
    model.setOutput(pb.getOutput());

    return model;
  }

  public static class AiGatewayGuardrailsSerializer extends JsonSerializer<AiGatewayGuardrails> {
    @Override
    public void serialize(AiGatewayGuardrails value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AiGatewayGuardrailsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AiGatewayGuardrailsDeserializer
      extends JsonDeserializer<AiGatewayGuardrails> {
    @Override
    public AiGatewayGuardrails deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AiGatewayGuardrailsPb pb = mapper.readValue(p, AiGatewayGuardrailsPb.class);
      return AiGatewayGuardrails.fromPb(pb);
    }
  }
}
