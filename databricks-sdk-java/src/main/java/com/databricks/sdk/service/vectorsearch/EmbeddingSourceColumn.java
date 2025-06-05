// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

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
@JsonSerialize(using = EmbeddingSourceColumn.EmbeddingSourceColumnSerializer.class)
@JsonDeserialize(using = EmbeddingSourceColumn.EmbeddingSourceColumnDeserializer.class)
public class EmbeddingSourceColumn {
  /** Name of the embedding model endpoint */
  private String embeddingModelEndpointName;

  /** Name of the column */
  private String name;

  public EmbeddingSourceColumn setEmbeddingModelEndpointName(String embeddingModelEndpointName) {
    this.embeddingModelEndpointName = embeddingModelEndpointName;
    return this;
  }

  public String getEmbeddingModelEndpointName() {
    return embeddingModelEndpointName;
  }

  public EmbeddingSourceColumn setName(String name) {
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
    EmbeddingSourceColumn that = (EmbeddingSourceColumn) o;
    return Objects.equals(embeddingModelEndpointName, that.embeddingModelEndpointName)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(embeddingModelEndpointName, name);
  }

  @Override
  public String toString() {
    return new ToStringer(EmbeddingSourceColumn.class)
        .add("embeddingModelEndpointName", embeddingModelEndpointName)
        .add("name", name)
        .toString();
  }

  EmbeddingSourceColumnPb toPb() {
    EmbeddingSourceColumnPb pb = new EmbeddingSourceColumnPb();
    pb.setEmbeddingModelEndpointName(embeddingModelEndpointName);
    pb.setName(name);

    return pb;
  }

  static EmbeddingSourceColumn fromPb(EmbeddingSourceColumnPb pb) {
    EmbeddingSourceColumn model = new EmbeddingSourceColumn();
    model.setEmbeddingModelEndpointName(pb.getEmbeddingModelEndpointName());
    model.setName(pb.getName());

    return model;
  }

  public static class EmbeddingSourceColumnSerializer
      extends JsonSerializer<EmbeddingSourceColumn> {
    @Override
    public void serialize(
        EmbeddingSourceColumn value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      EmbeddingSourceColumnPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EmbeddingSourceColumnDeserializer
      extends JsonDeserializer<EmbeddingSourceColumn> {
    @Override
    public EmbeddingSourceColumn deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EmbeddingSourceColumnPb pb = mapper.readValue(p, EmbeddingSourceColumnPb.class);
      return EmbeddingSourceColumn.fromPb(pb);
    }
  }
}
