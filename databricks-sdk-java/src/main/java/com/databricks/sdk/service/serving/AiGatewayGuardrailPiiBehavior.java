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
@JsonSerialize(using = AiGatewayGuardrailPiiBehavior.AiGatewayGuardrailPiiBehaviorSerializer.class)
@JsonDeserialize(
    using = AiGatewayGuardrailPiiBehavior.AiGatewayGuardrailPiiBehaviorDeserializer.class)
public class AiGatewayGuardrailPiiBehavior {
  /** Configuration for input guardrail filters. */
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

  AiGatewayGuardrailPiiBehaviorPb toPb() {
    AiGatewayGuardrailPiiBehaviorPb pb = new AiGatewayGuardrailPiiBehaviorPb();
    pb.setBehavior(behavior);

    return pb;
  }

  static AiGatewayGuardrailPiiBehavior fromPb(AiGatewayGuardrailPiiBehaviorPb pb) {
    AiGatewayGuardrailPiiBehavior model = new AiGatewayGuardrailPiiBehavior();
    model.setBehavior(pb.getBehavior());

    return model;
  }

  public static class AiGatewayGuardrailPiiBehaviorSerializer
      extends JsonSerializer<AiGatewayGuardrailPiiBehavior> {
    @Override
    public void serialize(
        AiGatewayGuardrailPiiBehavior value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AiGatewayGuardrailPiiBehaviorPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AiGatewayGuardrailPiiBehaviorDeserializer
      extends JsonDeserializer<AiGatewayGuardrailPiiBehavior> {
    @Override
    public AiGatewayGuardrailPiiBehavior deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AiGatewayGuardrailPiiBehaviorPb pb =
          mapper.readValue(p, AiGatewayGuardrailPiiBehaviorPb.class);
      return AiGatewayGuardrailPiiBehavior.fromPb(pb);
    }
  }
}
