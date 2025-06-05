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
import java.util.Objects;

/** List share recipients */
@Generated
@JsonSerialize(using = ListRecipientsRequest.ListRecipientsRequestSerializer.class)
@JsonDeserialize(using = ListRecipientsRequest.ListRecipientsRequestDeserializer.class)
public class ListRecipientsRequest {
  /**
   * If not provided, all recipients will be returned. If no recipients exist with this ID, no
   * results will be returned.
   */
  private String dataRecipientGlobalMetastoreId;

  /**
   * Maximum number of recipients to return. - when set to 0, the page length is set to a server
   * configured value (recommended); - when set to a value greater than 0, the page length is the
   * minimum of this value and a server configured value; - when set to a value less than 0, an
   * invalid parameter error is returned; - If not set, all valid recipients are returned (not
   * recommended). - Note: The number of returned recipients might be less than the specified
   * max_results size, even zero. The only definitive indication that no further recipients can be
   * fetched is when the next_page_token is unset from the response.
   */
  private Long maxResults;

  /** Opaque pagination token to go to next page based on previous query. */
  private String pageToken;

  public ListRecipientsRequest setDataRecipientGlobalMetastoreId(
      String dataRecipientGlobalMetastoreId) {
    this.dataRecipientGlobalMetastoreId = dataRecipientGlobalMetastoreId;
    return this;
  }

  public String getDataRecipientGlobalMetastoreId() {
    return dataRecipientGlobalMetastoreId;
  }

  public ListRecipientsRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public ListRecipientsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListRecipientsRequest that = (ListRecipientsRequest) o;
    return Objects.equals(dataRecipientGlobalMetastoreId, that.dataRecipientGlobalMetastoreId)
        && Objects.equals(maxResults, that.maxResults)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataRecipientGlobalMetastoreId, maxResults, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListRecipientsRequest.class)
        .add("dataRecipientGlobalMetastoreId", dataRecipientGlobalMetastoreId)
        .add("maxResults", maxResults)
        .add("pageToken", pageToken)
        .toString();
  }

  ListRecipientsRequestPb toPb() {
    ListRecipientsRequestPb pb = new ListRecipientsRequestPb();
    pb.setDataRecipientGlobalMetastoreId(dataRecipientGlobalMetastoreId);
    pb.setMaxResults(maxResults);
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListRecipientsRequest fromPb(ListRecipientsRequestPb pb) {
    ListRecipientsRequest model = new ListRecipientsRequest();
    model.setDataRecipientGlobalMetastoreId(pb.getDataRecipientGlobalMetastoreId());
    model.setMaxResults(pb.getMaxResults());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListRecipientsRequestSerializer
      extends JsonSerializer<ListRecipientsRequest> {
    @Override
    public void serialize(
        ListRecipientsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListRecipientsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListRecipientsRequestDeserializer
      extends JsonDeserializer<ListRecipientsRequest> {
    @Override
    public ListRecipientsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListRecipientsRequestPb pb = mapper.readValue(p, ListRecipientsRequestPb.class);
      return ListRecipientsRequest.fromPb(pb);
    }
  }
}
