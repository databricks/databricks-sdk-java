// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class EmbeddingsV1ResponseEmbeddingElementPb {
  @JsonProperty("embedding")
  private Collection<Double> embedding;

  @JsonProperty("index")
  private Long index;

  @JsonProperty("object")
  private EmbeddingsV1ResponseEmbeddingElementObject object;

  public EmbeddingsV1ResponseEmbeddingElementPb setEmbedding(Collection<Double> embedding) {
    this.embedding = embedding;
    return this;
  }

  public Collection<Double> getEmbedding() {
    return embedding;
  }

  public EmbeddingsV1ResponseEmbeddingElementPb setIndex(Long index) {
    this.index = index;
    return this;
  }

  public Long getIndex() {
    return index;
  }

  public EmbeddingsV1ResponseEmbeddingElementPb setObject(
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
    EmbeddingsV1ResponseEmbeddingElementPb that = (EmbeddingsV1ResponseEmbeddingElementPb) o;
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
    return new ToStringer(EmbeddingsV1ResponseEmbeddingElementPb.class)
        .add("embedding", embedding)
        .add("index", index)
        .add("object", object)
        .toString();
  }
}
