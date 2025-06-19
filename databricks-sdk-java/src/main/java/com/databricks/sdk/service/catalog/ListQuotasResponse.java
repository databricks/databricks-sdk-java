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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = ListQuotasResponse.ListQuotasResponseSerializer.class)
@JsonDeserialize(using = ListQuotasResponse.ListQuotasResponseDeserializer.class)
public class ListQuotasResponse {
  /**
   * Opaque token to retrieve the next page of results. Absent if there are no more pages.
   * __page_token__ should be set to this value for the next request.
   */
  private String nextPageToken;

  /** An array of returned QuotaInfos. */
  private Collection<QuotaInfo> quotas;

  public ListQuotasResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListQuotasResponse setQuotas(Collection<QuotaInfo> quotas) {
    this.quotas = quotas;
    return this;
  }

  public Collection<QuotaInfo> getQuotas() {
    return quotas;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListQuotasResponse that = (ListQuotasResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken) && Objects.equals(quotas, that.quotas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, quotas);
  }

  @Override
  public String toString() {
    return new ToStringer(ListQuotasResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("quotas", quotas)
        .toString();
  }

  ListQuotasResponsePb toPb() {
    ListQuotasResponsePb pb = new ListQuotasResponsePb();
    pb.setNextPageToken(nextPageToken);
    pb.setQuotas(quotas);

    return pb;
  }

  static ListQuotasResponse fromPb(ListQuotasResponsePb pb) {
    ListQuotasResponse model = new ListQuotasResponse();
    model.setNextPageToken(pb.getNextPageToken());
    model.setQuotas(pb.getQuotas());

    return model;
  }

  public static class ListQuotasResponseSerializer extends JsonSerializer<ListQuotasResponse> {
    @Override
    public void serialize(ListQuotasResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListQuotasResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListQuotasResponseDeserializer extends JsonDeserializer<ListQuotasResponse> {
    @Override
    public ListQuotasResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListQuotasResponsePb pb = mapper.readValue(p, ListQuotasResponsePb.class);
      return ListQuotasResponse.fromPb(pb);
    }
  }
}
