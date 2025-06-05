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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = AiGatewayGuardrailParameters.AiGatewayGuardrailParametersSerializer.class)
@JsonDeserialize(
    using = AiGatewayGuardrailParameters.AiGatewayGuardrailParametersDeserializer.class)
public class AiGatewayGuardrailParameters {
  /**
   * List of invalid keywords. AI guardrail uses keyword or string matching to decide if the keyword
   * exists in the request or response content.
   */
  private Collection<String> invalidKeywords;

  /** Configuration for guardrail PII filter. */
  private AiGatewayGuardrailPiiBehavior pii;

  /** Indicates whether the safety filter is enabled. */
  private Boolean safety;

  /**
   * The list of allowed topics. Given a chat request, this guardrail flags the request if its topic
   * is not in the allowed topics.
   */
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

  AiGatewayGuardrailParametersPb toPb() {
    AiGatewayGuardrailParametersPb pb = new AiGatewayGuardrailParametersPb();
    pb.setInvalidKeywords(invalidKeywords);
    pb.setPii(pii);
    pb.setSafety(safety);
    pb.setValidTopics(validTopics);

    return pb;
  }

  static AiGatewayGuardrailParameters fromPb(AiGatewayGuardrailParametersPb pb) {
    AiGatewayGuardrailParameters model = new AiGatewayGuardrailParameters();
    model.setInvalidKeywords(pb.getInvalidKeywords());
    model.setPii(pb.getPii());
    model.setSafety(pb.getSafety());
    model.setValidTopics(pb.getValidTopics());

    return model;
  }

  public static class AiGatewayGuardrailParametersSerializer
      extends JsonSerializer<AiGatewayGuardrailParameters> {
    @Override
    public void serialize(
        AiGatewayGuardrailParameters value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AiGatewayGuardrailParametersPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AiGatewayGuardrailParametersDeserializer
      extends JsonDeserializer<AiGatewayGuardrailParameters> {
    @Override
    public AiGatewayGuardrailParameters deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AiGatewayGuardrailParametersPb pb = mapper.readValue(p, AiGatewayGuardrailParametersPb.class);
      return AiGatewayGuardrailParameters.fromPb(pb);
    }
  }
}
