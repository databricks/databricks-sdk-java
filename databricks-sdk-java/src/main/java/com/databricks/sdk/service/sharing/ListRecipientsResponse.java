// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

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
@JsonSerialize(using = ListRecipientsResponse.ListRecipientsResponseSerializer.class)
@JsonDeserialize(using = ListRecipientsResponse.ListRecipientsResponseDeserializer.class)
public class ListRecipientsResponse {
  /**
   * Opaque token to retrieve the next page of results. Absent if there are no more pages.
   * __page_token__ should be set to this value for the next request (for the next page of results).
   */
  private String nextPageToken;

  /** An array of recipient information objects. */
  private Collection<RecipientInfo> recipients;

  public ListRecipientsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListRecipientsResponse setRecipients(Collection<RecipientInfo> recipients) {
    this.recipients = recipients;
    return this;
  }

  public Collection<RecipientInfo> getRecipients() {
    return recipients;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListRecipientsResponse that = (ListRecipientsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(recipients, that.recipients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, recipients);
  }

  @Override
  public String toString() {
    return new ToStringer(ListRecipientsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("recipients", recipients)
        .toString();
  }

  ListRecipientsResponsePb toPb() {
    ListRecipientsResponsePb pb = new ListRecipientsResponsePb();
    pb.setNextPageToken(nextPageToken);
    pb.setRecipients(recipients);

    return pb;
  }

  static ListRecipientsResponse fromPb(ListRecipientsResponsePb pb) {
    ListRecipientsResponse model = new ListRecipientsResponse();
    model.setNextPageToken(pb.getNextPageToken());
    model.setRecipients(pb.getRecipients());

    return model;
  }

  public static class ListRecipientsResponseSerializer
      extends JsonSerializer<ListRecipientsResponse> {
    @Override
    public void serialize(
        ListRecipientsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListRecipientsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListRecipientsResponseDeserializer
      extends JsonDeserializer<ListRecipientsResponse> {
    @Override
    public ListRecipientsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListRecipientsResponsePb pb = mapper.readValue(p, ListRecipientsResponsePb.class);
      return ListRecipientsResponse.fromPb(pb);
    }
  }
}
