// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

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
import java.util.Map;
import java.util.Objects;

@Generated
@JsonSerialize(using = TerminationReason.TerminationReasonSerializer.class)
@JsonDeserialize(using = TerminationReason.TerminationReasonDeserializer.class)
public class TerminationReason {
  /** status code indicating why the cluster was terminated */
  private TerminationReasonCode code;

  /** list of parameters that provide additional information about why the cluster was terminated */
  private Map<String, String> parameters;

  /** type of the termination */
  private TerminationReasonType typeValue;

  public TerminationReason setCode(TerminationReasonCode code) {
    this.code = code;
    return this;
  }

  public TerminationReasonCode getCode() {
    return code;
  }

  public TerminationReason setParameters(Map<String, String> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Map<String, String> getParameters() {
    return parameters;
  }

  public TerminationReason setType(TerminationReasonType typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public TerminationReasonType getType() {
    return typeValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TerminationReason that = (TerminationReason) o;
    return Objects.equals(code, that.code)
        && Objects.equals(parameters, that.parameters)
        && Objects.equals(typeValue, that.typeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, parameters, typeValue);
  }

  @Override
  public String toString() {
    return new ToStringer(TerminationReason.class)
        .add("code", code)
        .add("parameters", parameters)
        .add("typeValue", typeValue)
        .toString();
  }

  TerminationReasonPb toPb() {
    TerminationReasonPb pb = new TerminationReasonPb();
    pb.setCode(code);
    pb.setParameters(parameters);
    pb.setType(typeValue);

    return pb;
  }

  static TerminationReason fromPb(TerminationReasonPb pb) {
    TerminationReason model = new TerminationReason();
    model.setCode(pb.getCode());
    model.setParameters(pb.getParameters());
    model.setType(pb.getType());

    return model;
  }

  public static class TerminationReasonSerializer extends JsonSerializer<TerminationReason> {
    @Override
    public void serialize(TerminationReason value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      TerminationReasonPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class TerminationReasonDeserializer extends JsonDeserializer<TerminationReason> {
    @Override
    public TerminationReason deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      TerminationReasonPb pb = mapper.readValue(p, TerminationReasonPb.class);
      return TerminationReason.fromPb(pb);
    }
  }
}
