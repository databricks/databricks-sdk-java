// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

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
@JsonSerialize(using = ProviderShare.ProviderShareSerializer.class)
@JsonDeserialize(using = ProviderShare.ProviderShareDeserializer.class)
public class ProviderShare {
  /** The name of the Provider Share. */
  private String name;

  public ProviderShare setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProviderShare that = (ProviderShare) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(ProviderShare.class).add("name", name).toString();
  }

  ProviderSharePb toPb() {
    ProviderSharePb pb = new ProviderSharePb();
    pb.setName(name);

    return pb;
  }

  static ProviderShare fromPb(ProviderSharePb pb) {
    ProviderShare model = new ProviderShare();
    model.setName(pb.getName());

    return model;
  }

  public static class ProviderShareSerializer extends JsonSerializer<ProviderShare> {
    @Override
    public void serialize(ProviderShare value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ProviderSharePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ProviderShareDeserializer extends JsonDeserializer<ProviderShare> {
    @Override
    public ProviderShare deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ProviderSharePb pb = mapper.readValue(p, ProviderSharePb.class);
      return ProviderShare.fromPb(pb);
    }
  }
}
