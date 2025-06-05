// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

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
@JsonSerialize(using = Created.CreatedSerializer.class)
@JsonDeserialize(using = Created.CreatedDeserializer.class)
public class Created {
  /** */
  private String id;

  public Created setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Created that = (Created) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return new ToStringer(Created.class).add("id", id).toString();
  }

  CreatedPb toPb() {
    CreatedPb pb = new CreatedPb();
    pb.setId(id);

    return pb;
  }

  static Created fromPb(CreatedPb pb) {
    Created model = new Created();
    model.setId(pb.getId());

    return model;
  }

  public static class CreatedSerializer extends JsonSerializer<Created> {
    @Override
    public void serialize(Created value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreatedPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreatedDeserializer extends JsonDeserializer<Created> {
    @Override
    public Created deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreatedPb pb = mapper.readValue(p, CreatedPb.class);
      return Created.fromPb(pb);
    }
  }
}
