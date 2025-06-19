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

/** List providers */
@Generated
@JsonSerialize(using = ListProvidersRequest.ListProvidersRequestSerializer.class)
@JsonDeserialize(using = ListProvidersRequest.ListProvidersRequestDeserializer.class)
public class ListProvidersRequest {
  /**
   * If not provided, all providers will be returned. If no providers exist with this ID, no results
   * will be returned.
   */
  private String dataProviderGlobalMetastoreId;

  /**
   * Maximum number of providers to return. - when set to 0, the page length is set to a server
   * configured value (recommended); - when set to a value greater than 0, the page length is the
   * minimum of this value and a server configured value; - when set to a value less than 0, an
   * invalid parameter error is returned; - If not set, all valid providers are returned (not
   * recommended). - Note: The number of returned providers might be less than the specified
   * max_results size, even zero. The only definitive indication that no further providers can be
   * fetched is when the next_page_token is unset from the response.
   */
  private Long maxResults;

  /** Opaque pagination token to go to next page based on previous query. */
  private String pageToken;

  public ListProvidersRequest setDataProviderGlobalMetastoreId(
      String dataProviderGlobalMetastoreId) {
    this.dataProviderGlobalMetastoreId = dataProviderGlobalMetastoreId;
    return this;
  }

  public String getDataProviderGlobalMetastoreId() {
    return dataProviderGlobalMetastoreId;
  }

  public ListProvidersRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public ListProvidersRequest setPageToken(String pageToken) {
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
    ListProvidersRequest that = (ListProvidersRequest) o;
    return Objects.equals(dataProviderGlobalMetastoreId, that.dataProviderGlobalMetastoreId)
        && Objects.equals(maxResults, that.maxResults)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataProviderGlobalMetastoreId, maxResults, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListProvidersRequest.class)
        .add("dataProviderGlobalMetastoreId", dataProviderGlobalMetastoreId)
        .add("maxResults", maxResults)
        .add("pageToken", pageToken)
        .toString();
  }

  ListProvidersRequestPb toPb() {
    ListProvidersRequestPb pb = new ListProvidersRequestPb();
    pb.setDataProviderGlobalMetastoreId(dataProviderGlobalMetastoreId);
    pb.setMaxResults(maxResults);
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListProvidersRequest fromPb(ListProvidersRequestPb pb) {
    ListProvidersRequest model = new ListProvidersRequest();
    model.setDataProviderGlobalMetastoreId(pb.getDataProviderGlobalMetastoreId());
    model.setMaxResults(pb.getMaxResults());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListProvidersRequestSerializer extends JsonSerializer<ListProvidersRequest> {
    @Override
    public void serialize(
        ListProvidersRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListProvidersRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListProvidersRequestDeserializer
      extends JsonDeserializer<ListProvidersRequest> {
    @Override
    public ListProvidersRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListProvidersRequestPb pb = mapper.readValue(p, ListProvidersRequestPb.class);
      return ListProvidersRequest.fromPb(pb);
    }
  }
}
