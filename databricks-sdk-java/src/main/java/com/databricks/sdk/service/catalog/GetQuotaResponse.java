// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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
@JsonSerialize(using = GetQuotaResponse.GetQuotaResponseSerializer.class)
@JsonDeserialize(using = GetQuotaResponse.GetQuotaResponseDeserializer.class)
public class GetQuotaResponse {
  /** The returned QuotaInfo. */
  private QuotaInfo quotaInfo;

  public GetQuotaResponse setQuotaInfo(QuotaInfo quotaInfo) {
    this.quotaInfo = quotaInfo;
    return this;
  }

  public QuotaInfo getQuotaInfo() {
    return quotaInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetQuotaResponse that = (GetQuotaResponse) o;
    return Objects.equals(quotaInfo, that.quotaInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quotaInfo);
  }

  @Override
  public String toString() {
    return new ToStringer(GetQuotaResponse.class).add("quotaInfo", quotaInfo).toString();
  }

  GetQuotaResponsePb toPb() {
    GetQuotaResponsePb pb = new GetQuotaResponsePb();
    pb.setQuotaInfo(quotaInfo);

    return pb;
  }

  static GetQuotaResponse fromPb(GetQuotaResponsePb pb) {
    GetQuotaResponse model = new GetQuotaResponse();
    model.setQuotaInfo(pb.getQuotaInfo());

    return model;
  }

  public static class GetQuotaResponseSerializer extends JsonSerializer<GetQuotaResponse> {
    @Override
    public void serialize(GetQuotaResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetQuotaResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetQuotaResponseDeserializer extends JsonDeserializer<GetQuotaResponse> {
    @Override
    public GetQuotaResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetQuotaResponsePb pb = mapper.readValue(p, GetQuotaResponsePb.class);
      return GetQuotaResponse.fromPb(pb);
    }
  }
}
