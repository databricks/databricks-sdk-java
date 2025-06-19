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

/** Get one batch of providers. One may specify up to 50 IDs per request. */
@Generated
@JsonSerialize(using = BatchGetProvidersRequest.BatchGetProvidersRequestSerializer.class)
@JsonDeserialize(using = BatchGetProvidersRequest.BatchGetProvidersRequestDeserializer.class)
public class BatchGetProvidersRequest {
  /** */
  private Collection<String> ids;

  public BatchGetProvidersRequest setIds(Collection<String> ids) {
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
    BatchGetProvidersRequest that = (BatchGetProvidersRequest) o;
    return Objects.equals(ids, that.ids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids);
  }

  @Override
  public String toString() {
    return new ToStringer(BatchGetProvidersRequest.class).add("ids", ids).toString();
  }

  BatchGetProvidersRequestPb toPb() {
    BatchGetProvidersRequestPb pb = new BatchGetProvidersRequestPb();
    pb.setIds(ids);

    return pb;
  }

  static BatchGetProvidersRequest fromPb(BatchGetProvidersRequestPb pb) {
    BatchGetProvidersRequest model = new BatchGetProvidersRequest();
    model.setIds(pb.getIds());

    return model;
  }

  public static class BatchGetProvidersRequestSerializer
      extends JsonSerializer<BatchGetProvidersRequest> {
    @Override
    public void serialize(
        BatchGetProvidersRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      BatchGetProvidersRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class BatchGetProvidersRequestDeserializer
      extends JsonDeserializer<BatchGetProvidersRequest> {
    @Override
    public BatchGetProvidersRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      BatchGetProvidersRequestPb pb = mapper.readValue(p, BatchGetProvidersRequestPb.class);
      return BatchGetProvidersRequest.fromPb(pb);
    }
  }
}
