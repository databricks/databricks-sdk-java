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

/** List system schemas */
@Generated
@JsonSerialize(using = ListSystemSchemasRequest.ListSystemSchemasRequestSerializer.class)
@JsonDeserialize(using = ListSystemSchemasRequest.ListSystemSchemasRequestDeserializer.class)
public class ListSystemSchemasRequest {
  /**
   * Maximum number of schemas to return. - When set to 0, the page length is set to a server
   * configured value (recommended); - When set to a value greater than 0, the page length is the
   * minimum of this value and a server configured value; - When set to a value less than 0, an
   * invalid parameter error is returned; - If not set, all the schemas are returned (not
   * recommended).
   */
  private Long maxResults;

  /** The ID for the metastore in which the system schema resides. */
  private String metastoreId;

  /** Opaque pagination token to go to next page based on previous query. */
  private String pageToken;

  public ListSystemSchemasRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public ListSystemSchemasRequest setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public ListSystemSchemasRequest setPageToken(String pageToken) {
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
    ListSystemSchemasRequest that = (ListSystemSchemasRequest) o;
    return Objects.equals(maxResults, that.maxResults)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxResults, metastoreId, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListSystemSchemasRequest.class)
        .add("maxResults", maxResults)
        .add("metastoreId", metastoreId)
        .add("pageToken", pageToken)
        .toString();
  }

  ListSystemSchemasRequestPb toPb() {
    ListSystemSchemasRequestPb pb = new ListSystemSchemasRequestPb();
    pb.setMaxResults(maxResults);
    pb.setMetastoreId(metastoreId);
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListSystemSchemasRequest fromPb(ListSystemSchemasRequestPb pb) {
    ListSystemSchemasRequest model = new ListSystemSchemasRequest();
    model.setMaxResults(pb.getMaxResults());
    model.setMetastoreId(pb.getMetastoreId());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListSystemSchemasRequestSerializer
      extends JsonSerializer<ListSystemSchemasRequest> {
    @Override
    public void serialize(
        ListSystemSchemasRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListSystemSchemasRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListSystemSchemasRequestDeserializer
      extends JsonDeserializer<ListSystemSchemasRequest> {
    @Override
    public ListSystemSchemasRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListSystemSchemasRequestPb pb = mapper.readValue(p, ListSystemSchemasRequestPb.class);
      return ListSystemSchemasRequest.fromPb(pb);
    }
  }
}
