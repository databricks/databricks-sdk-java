// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

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
@JsonSerialize(using = ListSubscriptionsResponse.ListSubscriptionsResponseSerializer.class)
@JsonDeserialize(using = ListSubscriptionsResponse.ListSubscriptionsResponseDeserializer.class)
public class ListSubscriptionsResponse {
  /**
   * A token that can be used as a `page_token` in subsequent requests to retrieve the next page of
   * results. If this field is omitted, there are no subsequent subscriptions.
   */
  private String nextPageToken;

  /** */
  private Collection<Subscription> subscriptions;

  public ListSubscriptionsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListSubscriptionsResponse setSubscriptions(Collection<Subscription> subscriptions) {
    this.subscriptions = subscriptions;
    return this;
  }

  public Collection<Subscription> getSubscriptions() {
    return subscriptions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListSubscriptionsResponse that = (ListSubscriptionsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(subscriptions, that.subscriptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, subscriptions);
  }

  @Override
  public String toString() {
    return new ToStringer(ListSubscriptionsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("subscriptions", subscriptions)
        .toString();
  }

  ListSubscriptionsResponsePb toPb() {
    ListSubscriptionsResponsePb pb = new ListSubscriptionsResponsePb();
    pb.setNextPageToken(nextPageToken);
    pb.setSubscriptions(subscriptions);

    return pb;
  }

  static ListSubscriptionsResponse fromPb(ListSubscriptionsResponsePb pb) {
    ListSubscriptionsResponse model = new ListSubscriptionsResponse();
    model.setNextPageToken(pb.getNextPageToken());
    model.setSubscriptions(pb.getSubscriptions());

    return model;
  }

  public static class ListSubscriptionsResponseSerializer
      extends JsonSerializer<ListSubscriptionsResponse> {
    @Override
    public void serialize(
        ListSubscriptionsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListSubscriptionsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListSubscriptionsResponseDeserializer
      extends JsonDeserializer<ListSubscriptionsResponse> {
    @Override
    public ListSubscriptionsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListSubscriptionsResponsePb pb = mapper.readValue(p, ListSubscriptionsResponsePb.class);
      return ListSubscriptionsResponse.fromPb(pb);
    }
  }
}
