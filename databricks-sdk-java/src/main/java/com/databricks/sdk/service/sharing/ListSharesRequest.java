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

/** List shares by Provider */
@Generated
@JsonSerialize(using = ListSharesRequest.ListSharesRequestSerializer.class)
@JsonDeserialize(using = ListSharesRequest.ListSharesRequestDeserializer.class)
public class ListSharesRequest {
  /**
   * Maximum number of shares to return. - when set to 0, the page length is set to a server
   * configured value (recommended); - when set to a value greater than 0, the page length is the
   * minimum of this value and a server configured value; - when set to a value less than 0, an
   * invalid parameter error is returned; - If not set, all valid shares are returned (not
   * recommended). - Note: The number of returned shares might be less than the specified
   * max_results size, even zero. The only definitive indication that no further shares can be
   * fetched is when the next_page_token is unset from the response.
   */
  private Long maxResults;

  /** Name of the provider in which to list shares. */
  private String name;

  /** Opaque pagination token to go to next page based on previous query. */
  private String pageToken;

  public ListSharesRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public ListSharesRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ListSharesRequest setPageToken(String pageToken) {
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
    ListSharesRequest that = (ListSharesRequest) o;
    return Objects.equals(maxResults, that.maxResults)
        && Objects.equals(name, that.name)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxResults, name, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListSharesRequest.class)
        .add("maxResults", maxResults)
        .add("name", name)
        .add("pageToken", pageToken)
        .toString();
  }

  ListSharesRequestPb toPb() {
    ListSharesRequestPb pb = new ListSharesRequestPb();
    pb.setMaxResults(maxResults);
    pb.setName(name);
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListSharesRequest fromPb(ListSharesRequestPb pb) {
    ListSharesRequest model = new ListSharesRequest();
    model.setMaxResults(pb.getMaxResults());
    model.setName(pb.getName());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListSharesRequestSerializer extends JsonSerializer<ListSharesRequest> {
    @Override
    public void serialize(ListSharesRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListSharesRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListSharesRequestDeserializer extends JsonDeserializer<ListSharesRequest> {
    @Override
    public ListSharesRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListSharesRequestPb pb = mapper.readValue(p, ListSharesRequestPb.class);
      return ListSharesRequest.fromPb(pb);
    }
  }
}
