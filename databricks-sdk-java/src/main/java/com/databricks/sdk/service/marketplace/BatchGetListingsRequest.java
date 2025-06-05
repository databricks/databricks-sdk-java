// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

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

/** Get one batch of listings. One may specify up to 50 IDs per request. */
@Generated
@JsonSerialize(using = BatchGetListingsRequest.BatchGetListingsRequestSerializer.class)
@JsonDeserialize(using = BatchGetListingsRequest.BatchGetListingsRequestDeserializer.class)
public class BatchGetListingsRequest {
  /** */
  private Collection<String> ids;

  public BatchGetListingsRequest setIds(Collection<String> ids) {
    this.ids = ids;
    return this;
  }

  public Collection<String> getIds() {
    return ids;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BatchGetListingsRequest that = (BatchGetListingsRequest) o;
    return Objects.equals(ids, that.ids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids);
  }

  @Override
  public String toString() {
    return new ToStringer(BatchGetListingsRequest.class).add("ids", ids).toString();
  }

  BatchGetListingsRequestPb toPb() {
    BatchGetListingsRequestPb pb = new BatchGetListingsRequestPb();
    pb.setIds(ids);

    return pb;
  }

  static BatchGetListingsRequest fromPb(BatchGetListingsRequestPb pb) {
    BatchGetListingsRequest model = new BatchGetListingsRequest();
    model.setIds(pb.getIds());

    return model;
  }

  public static class BatchGetListingsRequestSerializer
      extends JsonSerializer<BatchGetListingsRequest> {
    @Override
    public void serialize(
        BatchGetListingsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      BatchGetListingsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class BatchGetListingsRequestDeserializer
      extends JsonDeserializer<BatchGetListingsRequest> {
    @Override
    public BatchGetListingsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      BatchGetListingsRequestPb pb = mapper.readValue(p, BatchGetListingsRequestPb.class);
      return BatchGetListingsRequest.fromPb(pb);
    }
  }
}
