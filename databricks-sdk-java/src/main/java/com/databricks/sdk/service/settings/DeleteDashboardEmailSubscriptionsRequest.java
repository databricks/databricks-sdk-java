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

/** Delete the Dashboard Email Subscriptions setting */
@Generated
@JsonSerialize(
    using =
        DeleteDashboardEmailSubscriptionsRequest.DeleteDashboardEmailSubscriptionsRequestSerializer
            .class)
@JsonDeserialize(
    using =
        DeleteDashboardEmailSubscriptionsRequest
            .DeleteDashboardEmailSubscriptionsRequestDeserializer.class)
public class DeleteDashboardEmailSubscriptionsRequest {
  /**
   * etag used for versioning. The response is at least as fresh as the eTag provided. This is used
   * for optimistic concurrency control as a way to help prevent simultaneous writes of a setting
   * overwriting each other. It is strongly suggested that systems make use of the etag in the read
   * -> delete pattern to perform setting deletions in order to avoid race conditions. That is, get
   * an etag from a GET request, and pass it with the DELETE request to identify the rule set
   * version you are deleting.
   */
  private String etag;

  public DeleteDashboardEmailSubscriptionsRequest setEtag(String etag) {
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
    DeleteDashboardEmailSubscriptionsRequest that = (DeleteDashboardEmailSubscriptionsRequest) o;
    return Objects.equals(etag, that.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteDashboardEmailSubscriptionsRequest.class)
        .add("etag", etag)
        .toString();
  }

  DeleteDashboardEmailSubscriptionsRequestPb toPb() {
    DeleteDashboardEmailSubscriptionsRequestPb pb =
        new DeleteDashboardEmailSubscriptionsRequestPb();
    pb.setEtag(etag);

    return pb;
  }

  static DeleteDashboardEmailSubscriptionsRequest fromPb(
      DeleteDashboardEmailSubscriptionsRequestPb pb) {
    DeleteDashboardEmailSubscriptionsRequest model = new DeleteDashboardEmailSubscriptionsRequest();
    model.setEtag(pb.getEtag());

    return model;
  }

  public static class DeleteDashboardEmailSubscriptionsRequestSerializer
      extends JsonSerializer<DeleteDashboardEmailSubscriptionsRequest> {
    @Override
    public void serialize(
        DeleteDashboardEmailSubscriptionsRequest value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      DeleteDashboardEmailSubscriptionsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteDashboardEmailSubscriptionsRequestDeserializer
      extends JsonDeserializer<DeleteDashboardEmailSubscriptionsRequest> {
    @Override
    public DeleteDashboardEmailSubscriptionsRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteDashboardEmailSubscriptionsRequestPb pb =
          mapper.readValue(p, DeleteDashboardEmailSubscriptionsRequestPb.class);
      return DeleteDashboardEmailSubscriptionsRequest.fromPb(pb);
    }
  }
}
