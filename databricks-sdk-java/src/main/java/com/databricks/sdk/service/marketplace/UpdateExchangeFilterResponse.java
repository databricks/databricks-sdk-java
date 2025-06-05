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
@JsonSerialize(using = UpdateExchangeFilterResponse.UpdateExchangeFilterResponseSerializer.class)
@JsonDeserialize(
    using = UpdateExchangeFilterResponse.UpdateExchangeFilterResponseDeserializer.class)
public class UpdateExchangeFilterResponse {
  /** */
  private ExchangeFilter filter;

  public UpdateExchangeFilterResponse setFilter(ExchangeFilter filter) {
    this.filter = filter;
    return this;
  }

  public ExchangeFilter getFilter() {
    return filter;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateExchangeFilterResponse that = (UpdateExchangeFilterResponse) o;
    return Objects.equals(filter, that.filter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateExchangeFilterResponse.class).add("filter", filter).toString();
  }

  UpdateExchangeFilterResponsePb toPb() {
    UpdateExchangeFilterResponsePb pb = new UpdateExchangeFilterResponsePb();
    pb.setFilter(filter);

    return pb;
  }

  static UpdateExchangeFilterResponse fromPb(UpdateExchangeFilterResponsePb pb) {
    UpdateExchangeFilterResponse model = new UpdateExchangeFilterResponse();
    model.setFilter(pb.getFilter());

    return model;
  }

  public static class UpdateExchangeFilterResponseSerializer
      extends JsonSerializer<UpdateExchangeFilterResponse> {
    @Override
    public void serialize(
        UpdateExchangeFilterResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateExchangeFilterResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateExchangeFilterResponseDeserializer
      extends JsonDeserializer<UpdateExchangeFilterResponse> {
    @Override
    public UpdateExchangeFilterResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateExchangeFilterResponsePb pb = mapper.readValue(p, UpdateExchangeFilterResponsePb.class);
      return UpdateExchangeFilterResponse.fromPb(pb);
    }
  }
}
