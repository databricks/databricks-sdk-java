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

/** List credentials */
@Generated
@JsonSerialize(using = ListStorageCredentialsRequest.ListStorageCredentialsRequestSerializer.class)
@JsonDeserialize(
    using = ListStorageCredentialsRequest.ListStorageCredentialsRequestDeserializer.class)
public class ListStorageCredentialsRequest {
  /**
   * Maximum number of storage credentials to return. If not set, all the storage credentials are
   * returned (not recommended). - when set to a value greater than 0, the page length is the
   * minimum of this value and a server configured value; - when set to 0, the page length is set to
   * a server configured value (recommended); - when set to a value less than 0, an invalid
   * parameter error is returned;
   */
  private Long maxResults;

  /** Opaque pagination token to go to next page based on previous query. */
  private String pageToken;

  public ListStorageCredentialsRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public ListStorageCredentialsRequest setPageToken(String pageToken) {
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
    ListStorageCredentialsRequest that = (ListStorageCredentialsRequest) o;
    return Objects.equals(maxResults, that.maxResults) && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxResults, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListStorageCredentialsRequest.class)
        .add("maxResults", maxResults)
        .add("pageToken", pageToken)
        .toString();
  }

  ListStorageCredentialsRequestPb toPb() {
    ListStorageCredentialsRequestPb pb = new ListStorageCredentialsRequestPb();
    pb.setMaxResults(maxResults);
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListStorageCredentialsRequest fromPb(ListStorageCredentialsRequestPb pb) {
    ListStorageCredentialsRequest model = new ListStorageCredentialsRequest();
    model.setMaxResults(pb.getMaxResults());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListStorageCredentialsRequestSerializer
      extends JsonSerializer<ListStorageCredentialsRequest> {
    @Override
    public void serialize(
        ListStorageCredentialsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListStorageCredentialsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListStorageCredentialsRequestDeserializer
      extends JsonDeserializer<ListStorageCredentialsRequest> {
    @Override
    public ListStorageCredentialsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListStorageCredentialsRequestPb pb =
          mapper.readValue(p, ListStorageCredentialsRequestPb.class);
      return ListStorageCredentialsRequest.fromPb(pb);
    }
  }
}
