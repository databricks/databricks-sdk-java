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
@JsonSerialize(using = EmbeddingVectorColumn.EmbeddingVectorColumnSerializer.class)
@JsonDeserialize(using = EmbeddingVectorColumn.EmbeddingVectorColumnDeserializer.class)
public class EmbeddingVectorColumn {
  /** Dimension of the embedding vector */
  private Long embeddingDimension;

  /** Name of the column */
  private String name;

  public EmbeddingVectorColumn setEmbeddingDimension(Long embeddingDimension) {
    this.embeddingDimension = embeddingDimension;
    return this;
  }

  public Long getEmbeddingDimension() {
    return embeddingDimension;
  }

  public EmbeddingVectorColumn setName(String name) {
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
    EmbeddingVectorColumn that = (EmbeddingVectorColumn) o;
    return Objects.equals(embeddingDimension, that.embeddingDimension)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(embeddingDimension, name);
  }

  @Override
  public String toString() {
    return new ToStringer(EmbeddingVectorColumn.class)
        .add("embeddingDimension", embeddingDimension)
        .add("name", name)
        .toString();
  }

  EmbeddingVectorColumnPb toPb() {
    EmbeddingVectorColumnPb pb = new EmbeddingVectorColumnPb();
    pb.setEmbeddingDimension(embeddingDimension);
    pb.setName(name);

    return pb;
  }

  static EmbeddingVectorColumn fromPb(EmbeddingVectorColumnPb pb) {
    EmbeddingVectorColumn model = new EmbeddingVectorColumn();
    model.setEmbeddingDimension(pb.getEmbeddingDimension());
    model.setName(pb.getName());

    return model;
  }

  public static class EmbeddingVectorColumnSerializer
      extends JsonSerializer<EmbeddingVectorColumn> {
    @Override
    public void serialize(
        EmbeddingVectorColumn value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      EmbeddingVectorColumnPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EmbeddingVectorColumnDeserializer
      extends JsonDeserializer<EmbeddingVectorColumn> {
    @Override
    public EmbeddingVectorColumn deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EmbeddingVectorColumnPb pb = mapper.readValue(p, EmbeddingVectorColumnPb.class);
      return EmbeddingVectorColumn.fromPb(pb);
    }
  }
}
