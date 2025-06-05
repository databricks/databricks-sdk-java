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
@JsonSerialize(
    using =
        EmbeddingsV1ResponseEmbeddingElement.EmbeddingsV1ResponseEmbeddingElementSerializer.class)
@JsonDeserialize(
    using =
        EmbeddingsV1ResponseEmbeddingElement.EmbeddingsV1ResponseEmbeddingElementDeserializer.class)
public class EmbeddingsV1ResponseEmbeddingElement {
  /** */
  private Collection<Double> embedding;

  /** The index of the embedding in the response. */
  private Long index;

  /** This will always be 'embedding'. */
  private EmbeddingsV1ResponseEmbeddingElementObject object;

  public EmbeddingsV1ResponseEmbeddingElement setEmbedding(Collection<Double> embedding) {
    this.embedding = embedding;
    return this;
  }

  public Collection<Double> getEmbedding() {
    return embedding;
  }

  public EmbeddingsV1ResponseEmbeddingElement setIndex(Long index) {
    this.index = index;
    return this;
  }

  public Long getIndex() {
    return index;
  }

  public EmbeddingsV1ResponseEmbeddingElement setObject(
      EmbeddingsV1ResponseEmbeddingElementObject object) {
    this.object = object;
    return this;
  }

  public EmbeddingsV1ResponseEmbeddingElementObject getObject() {
    return object;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EmbeddingsV1ResponseEmbeddingElement that = (EmbeddingsV1ResponseEmbeddingElement) o;
    return Objects.equals(embedding, that.embedding)
        && Objects.equals(index, that.index)
        && Objects.equals(object, that.object);
  }

  @Override
  public int hashCode() {
    return Objects.hash(embedding, index, object);
  }

  @Override
  public String toString() {
    return new ToStringer(EmbeddingsV1ResponseEmbeddingElement.class)
        .add("embedding", embedding)
        .add("index", index)
        .add("object", object)
        .toString();
  }

  EmbeddingsV1ResponseEmbeddingElementPb toPb() {
    EmbeddingsV1ResponseEmbeddingElementPb pb = new EmbeddingsV1ResponseEmbeddingElementPb();
    pb.setEmbedding(embedding);
    pb.setIndex(index);
    pb.setObject(object);

    return pb;
  }

  static EmbeddingsV1ResponseEmbeddingElement fromPb(EmbeddingsV1ResponseEmbeddingElementPb pb) {
    EmbeddingsV1ResponseEmbeddingElement model = new EmbeddingsV1ResponseEmbeddingElement();
    model.setEmbedding(pb.getEmbedding());
    model.setIndex(pb.getIndex());
    model.setObject(pb.getObject());

    return model;
  }

  public static class EmbeddingsV1ResponseEmbeddingElementSerializer
      extends JsonSerializer<EmbeddingsV1ResponseEmbeddingElement> {
    @Override
    public void serialize(
        EmbeddingsV1ResponseEmbeddingElement value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      EmbeddingsV1ResponseEmbeddingElementPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EmbeddingsV1ResponseEmbeddingElementDeserializer
      extends JsonDeserializer<EmbeddingsV1ResponseEmbeddingElement> {
    @Override
    public EmbeddingsV1ResponseEmbeddingElement deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EmbeddingsV1ResponseEmbeddingElementPb pb =
          mapper.readValue(p, EmbeddingsV1ResponseEmbeddingElementPb.class);
      return EmbeddingsV1ResponseEmbeddingElement.fromPb(pb);
    }
  }
}
