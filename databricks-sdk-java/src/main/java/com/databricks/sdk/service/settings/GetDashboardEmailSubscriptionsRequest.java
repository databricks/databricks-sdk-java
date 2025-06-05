// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

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

/** Get the Dashboard Email Subscriptions setting */
@Generated
@JsonSerialize(
    using =
        GetDashboardEmailSubscriptionsRequest.GetDashboardEmailSubscriptionsRequestSerializer.class)
@JsonDeserialize(
    using =
        GetDashboardEmailSubscriptionsRequest.GetDashboardEmailSubscriptionsRequestDeserializer
            .class)
public class GetDashboardEmailSubscriptionsRequest {
  /**
   * etag used for versioning. The response is at least as fresh as the eTag provided. This is used
   * for optimistic concurrency control as a way to help prevent simultaneous writes of a setting
   * overwriting each other. It is strongly suggested that systems make use of the etag in the read
   * -> delete pattern to perform setting deletions in order to avoid race conditions. That is, get
   * an etag from a GET request, and pass it with the DELETE request to identify the rule set
   * version you are deleting.
   */
  private String etag;

  public GetDashboardEmailSubscriptionsRequest setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetDashboardEmailSubscriptionsRequest that = (GetDashboardEmailSubscriptionsRequest) o;
    return Objects.equals(etag, that.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag);
  }

  @Override
  public String toString() {
    return new ToStringer(GetDashboardEmailSubscriptionsRequest.class).add("etag", etag).toString();
  }

  GetDashboardEmailSubscriptionsRequestPb toPb() {
    GetDashboardEmailSubscriptionsRequestPb pb = new GetDashboardEmailSubscriptionsRequestPb();
    pb.setEtag(etag);

    return pb;
  }

  static GetDashboardEmailSubscriptionsRequest fromPb(GetDashboardEmailSubscriptionsRequestPb pb) {
    GetDashboardEmailSubscriptionsRequest model = new GetDashboardEmailSubscriptionsRequest();
    model.setEtag(pb.getEtag());

    return model;
  }

  public static class GetDashboardEmailSubscriptionsRequestSerializer
      extends JsonSerializer<GetDashboardEmailSubscriptionsRequest> {
    @Override
    public void serialize(
        GetDashboardEmailSubscriptionsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetDashboardEmailSubscriptionsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetDashboardEmailSubscriptionsRequestDeserializer
      extends JsonDeserializer<GetDashboardEmailSubscriptionsRequest> {
    @Override
    public GetDashboardEmailSubscriptionsRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetDashboardEmailSubscriptionsRequestPb pb =
          mapper.readValue(p, GetDashboardEmailSubscriptionsRequestPb.class);
      return GetDashboardEmailSubscriptionsRequest.fromPb(pb);
    }
  }
}
