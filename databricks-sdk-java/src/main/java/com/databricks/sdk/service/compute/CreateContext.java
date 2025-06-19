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
@JsonSerialize(using = CreateContext.CreateContextSerializer.class)
@JsonDeserialize(using = CreateContext.CreateContextDeserializer.class)
public class CreateContext {
  /** Running cluster id */
  private String clusterId;

  /** */
  private Language language;

  public CreateContext setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public CreateContext setLanguage(Language language) {
    this.language = language;
    return this;
  }

  public Language getLanguage() {
    return language;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateContext that = (CreateContext) o;
    return Objects.equals(clusterId, that.clusterId) && Objects.equals(language, that.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, language);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateContext.class)
        .add("clusterId", clusterId)
        .add("language", language)
        .toString();
  }

  CreateContextPb toPb() {
    CreateContextPb pb = new CreateContextPb();
    pb.setClusterId(clusterId);
    pb.setLanguage(language);

    return pb;
  }

  static CreateContext fromPb(CreateContextPb pb) {
    CreateContext model = new CreateContext();
    model.setClusterId(pb.getClusterId());
    model.setLanguage(pb.getLanguage());

    return model;
  }

  public static class CreateContextSerializer extends JsonSerializer<CreateContext> {
    @Override
    public void serialize(CreateContext value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateContextPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateContextDeserializer extends JsonDeserializer<CreateContext> {
    @Override
    public CreateContext deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateContextPb pb = mapper.readValue(p, CreateContextPb.class);
      return CreateContext.fromPb(pb);
    }
  }
}
