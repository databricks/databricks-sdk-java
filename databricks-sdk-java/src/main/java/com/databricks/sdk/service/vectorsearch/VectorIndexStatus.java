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
@JsonSerialize(using = VectorIndexStatus.VectorIndexStatusSerializer.class)
@JsonDeserialize(using = VectorIndexStatus.VectorIndexStatusDeserializer.class)
public class VectorIndexStatus {
  /** Index API Url to be used to perform operations on the index */
  private String indexUrl;

  /** Number of rows indexed */
  private Long indexedRowCount;

  /** Message associated with the index status */
  private String message;

  /** Whether the index is ready for search */
  private Boolean ready;

  public VectorIndexStatus setIndexUrl(String indexUrl) {
    this.indexUrl = indexUrl;
    return this;
  }

  public String getIndexUrl() {
    return indexUrl;
  }

  public VectorIndexStatus setIndexedRowCount(Long indexedRowCount) {
    this.indexedRowCount = indexedRowCount;
    return this;
  }

  public Long getIndexedRowCount() {
    return indexedRowCount;
  }

  public VectorIndexStatus setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public VectorIndexStatus setReady(Boolean ready) {
    this.ready = ready;
    return this;
  }

  public Boolean getReady() {
    return ready;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    VectorIndexStatus that = (VectorIndexStatus) o;
    return Objects.equals(indexUrl, that.indexUrl)
        && Objects.equals(indexedRowCount, that.indexedRowCount)
        && Objects.equals(message, that.message)
        && Objects.equals(ready, that.ready);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indexUrl, indexedRowCount, message, ready);
  }

  @Override
  public String toString() {
    return new ToStringer(VectorIndexStatus.class)
        .add("indexUrl", indexUrl)
        .add("indexedRowCount", indexedRowCount)
        .add("message", message)
        .add("ready", ready)
        .toString();
  }

  VectorIndexStatusPb toPb() {
    VectorIndexStatusPb pb = new VectorIndexStatusPb();
    pb.setIndexUrl(indexUrl);
    pb.setIndexedRowCount(indexedRowCount);
    pb.setMessage(message);
    pb.setReady(ready);

    return pb;
  }

  static VectorIndexStatus fromPb(VectorIndexStatusPb pb) {
    VectorIndexStatus model = new VectorIndexStatus();
    model.setIndexUrl(pb.getIndexUrl());
    model.setIndexedRowCount(pb.getIndexedRowCount());
    model.setMessage(pb.getMessage());
    model.setReady(pb.getReady());

    return model;
  }

  public static class VectorIndexStatusSerializer extends JsonSerializer<VectorIndexStatus> {
    @Override
    public void serialize(VectorIndexStatus value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      VectorIndexStatusPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class VectorIndexStatusDeserializer extends JsonDeserializer<VectorIndexStatus> {
    @Override
    public VectorIndexStatus deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      VectorIndexStatusPb pb = mapper.readValue(p, VectorIndexStatusPb.class);
      return VectorIndexStatus.fromPb(pb);
    }
  }
}
