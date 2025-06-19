// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

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
@JsonSerialize(using = ManualTrigger.ManualTriggerSerializer.class)
@JsonDeserialize(using = ManualTrigger.ManualTriggerDeserializer.class)
public class ManualTrigger {

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    return new ToStringer(ManualTrigger.class).toString();
  }

  ManualTriggerPb toPb() {
    ManualTriggerPb pb = new ManualTriggerPb();

    return pb;
  }

  static ManualTrigger fromPb(ManualTriggerPb pb) {
    ManualTrigger model = new ManualTrigger();

    return model;
  }

  public static class ManualTriggerSerializer extends JsonSerializer<ManualTrigger> {
    @Override
    public void serialize(ManualTrigger value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ManualTriggerPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ManualTriggerDeserializer extends JsonDeserializer<ManualTrigger> {
    @Override
    public ManualTrigger deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ManualTriggerPb pb = mapper.readValue(p, ManualTriggerPb.class);
      return ManualTrigger.fromPb(pb);
    }
  }
}
