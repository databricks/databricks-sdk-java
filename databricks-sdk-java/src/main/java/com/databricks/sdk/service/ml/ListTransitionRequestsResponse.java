// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

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
@JsonSerialize(
    using = ListTransitionRequestsResponse.ListTransitionRequestsResponseSerializer.class)
@JsonDeserialize(
    using = ListTransitionRequestsResponse.ListTransitionRequestsResponseDeserializer.class)
public class ListTransitionRequestsResponse {
  /** Array of open transition requests. */
  private Collection<Activity> requests;

  public ListTransitionRequestsResponse setRequests(Collection<Activity> requests) {
    this.requests = requests;
    return this;
  }

  public Collection<Activity> getRequests() {
    return requests;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListTransitionRequestsResponse that = (ListTransitionRequestsResponse) o;
    return Objects.equals(requests, that.requests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requests);
  }

  @Override
  public String toString() {
    return new ToStringer(ListTransitionRequestsResponse.class)
        .add("requests", requests)
        .toString();
  }

  ListTransitionRequestsResponsePb toPb() {
    ListTransitionRequestsResponsePb pb = new ListTransitionRequestsResponsePb();
    pb.setRequests(requests);

    return pb;
  }

  static ListTransitionRequestsResponse fromPb(ListTransitionRequestsResponsePb pb) {
    ListTransitionRequestsResponse model = new ListTransitionRequestsResponse();
    model.setRequests(pb.getRequests());

    return model;
  }

  public static class ListTransitionRequestsResponseSerializer
      extends JsonSerializer<ListTransitionRequestsResponse> {
    @Override
    public void serialize(
        ListTransitionRequestsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListTransitionRequestsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListTransitionRequestsResponseDeserializer
      extends JsonDeserializer<ListTransitionRequestsResponse> {
    @Override
    public ListTransitionRequestsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListTransitionRequestsResponsePb pb =
          mapper.readValue(p, ListTransitionRequestsResponsePb.class);
      return ListTransitionRequestsResponse.fromPb(pb);
    }
  }
}
