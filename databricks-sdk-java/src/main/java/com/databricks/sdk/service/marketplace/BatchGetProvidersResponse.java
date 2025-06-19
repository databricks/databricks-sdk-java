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

@Generated
@JsonSerialize(using = BatchGetProvidersResponse.BatchGetProvidersResponseSerializer.class)
@JsonDeserialize(using = BatchGetProvidersResponse.BatchGetProvidersResponseDeserializer.class)
public class BatchGetProvidersResponse {
  /** */
  private Collection<ProviderInfo> providers;

  public BatchGetProvidersResponse setProviders(Collection<ProviderInfo> providers) {
    this.providers = providers;
    return this;
  }

  public Collection<ProviderInfo> getProviders() {
    return providers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BatchGetProvidersResponse that = (BatchGetProvidersResponse) o;
    return Objects.equals(providers, that.providers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providers);
  }

  @Override
  public String toString() {
    return new ToStringer(BatchGetProvidersResponse.class).add("providers", providers).toString();
  }

  BatchGetProvidersResponsePb toPb() {
    BatchGetProvidersResponsePb pb = new BatchGetProvidersResponsePb();
    pb.setProviders(providers);

    return pb;
  }

  static BatchGetProvidersResponse fromPb(BatchGetProvidersResponsePb pb) {
    BatchGetProvidersResponse model = new BatchGetProvidersResponse();
    model.setProviders(pb.getProviders());

    return model;
  }

  public static class BatchGetProvidersResponseSerializer
      extends JsonSerializer<BatchGetProvidersResponse> {
    @Override
    public void serialize(
        BatchGetProvidersResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      BatchGetProvidersResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class BatchGetProvidersResponseDeserializer
      extends JsonDeserializer<BatchGetProvidersResponse> {
    @Override
    public BatchGetProvidersResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      BatchGetProvidersResponsePb pb = mapper.readValue(p, BatchGetProvidersResponsePb.class);
      return BatchGetProvidersResponse.fromPb(pb);
    }
  }
}
