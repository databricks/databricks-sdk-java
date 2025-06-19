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
import java.util.Objects;

@Generated
@JsonSerialize(using = UpdateExchangeFilterRequest.UpdateExchangeFilterRequestSerializer.class)
@JsonDeserialize(using = UpdateExchangeFilterRequest.UpdateExchangeFilterRequestDeserializer.class)
public class UpdateExchangeFilterRequest {
  /** */
  private ExchangeFilter filter;

  /** */
  private String id;

  public UpdateExchangeFilterRequest setFilter(ExchangeFilter filter) {
    this.filter = filter;
    return this;
  }

  public ExchangeFilter getFilter() {
    return filter;
  }

  public UpdateExchangeFilterRequest setId(String id) {
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
    UpdateExchangeFilterRequest that = (UpdateExchangeFilterRequest) o;
    return Objects.equals(filter, that.filter) && Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, id);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateExchangeFilterRequest.class)
        .add("filter", filter)
        .add("id", id)
        .toString();
  }

  UpdateExchangeFilterRequestPb toPb() {
    UpdateExchangeFilterRequestPb pb = new UpdateExchangeFilterRequestPb();
    pb.setFilter(filter);
    pb.setId(id);

    return pb;
  }

  static UpdateExchangeFilterRequest fromPb(UpdateExchangeFilterRequestPb pb) {
    UpdateExchangeFilterRequest model = new UpdateExchangeFilterRequest();
    model.setFilter(pb.getFilter());
    model.setId(pb.getId());

    return model;
  }

  public static class UpdateExchangeFilterRequestSerializer
      extends JsonSerializer<UpdateExchangeFilterRequest> {
    @Override
    public void serialize(
        UpdateExchangeFilterRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateExchangeFilterRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateExchangeFilterRequestDeserializer
      extends JsonDeserializer<UpdateExchangeFilterRequest> {
    @Override
    public UpdateExchangeFilterRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateExchangeFilterRequestPb pb = mapper.readValue(p, UpdateExchangeFilterRequestPb.class);
      return UpdateExchangeFilterRequest.fromPb(pb);
    }
  }
}
