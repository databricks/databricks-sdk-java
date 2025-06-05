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

/** List schemas */
@Generated
@JsonSerialize(using = ListSchemasRequest.ListSchemasRequestSerializer.class)
@JsonDeserialize(using = ListSchemasRequest.ListSchemasRequestDeserializer.class)
public class ListSchemasRequest {
  /** Parent catalog for schemas of interest. */
  private String catalogName;

  /**
   * Whether to include schemas in the response for which the principal can only access selective
   * metadata for
   */
  private Boolean includeBrowse;

  /**
   * Maximum number of schemas to return. If not set, all the schemas are returned (not
   * recommended). - when set to a value greater than 0, the page length is the minimum of this
   * value and a server configured value; - when set to 0, the page length is set to a server
   * configured value (recommended); - when set to a value less than 0, an invalid parameter error
   * is returned;
   */
  private Long maxResults;

  /** Opaque pagination token to go to next page based on previous query. */
  private String pageToken;

  public ListSchemasRequest setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public ListSchemasRequest setIncludeBrowse(Boolean includeBrowse) {
    this.includeBrowse = includeBrowse;
    return this;
  }

  public Boolean getIncludeBrowse() {
    return includeBrowse;
  }

  public ListSchemasRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public ListSchemasRequest setPageToken(String pageToken) {
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
    ListSchemasRequest that = (ListSchemasRequest) o;
    return Objects.equals(catalogName, that.catalogName)
        && Objects.equals(includeBrowse, that.includeBrowse)
        && Objects.equals(maxResults, that.maxResults)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogName, includeBrowse, maxResults, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListSchemasRequest.class)
        .add("catalogName", catalogName)
        .add("includeBrowse", includeBrowse)
        .add("maxResults", maxResults)
        .add("pageToken", pageToken)
        .toString();
  }

  ListSchemasRequestPb toPb() {
    ListSchemasRequestPb pb = new ListSchemasRequestPb();
    pb.setCatalogName(catalogName);
    pb.setIncludeBrowse(includeBrowse);
    pb.setMaxResults(maxResults);
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListSchemasRequest fromPb(ListSchemasRequestPb pb) {
    ListSchemasRequest model = new ListSchemasRequest();
    model.setCatalogName(pb.getCatalogName());
    model.setIncludeBrowse(pb.getIncludeBrowse());
    model.setMaxResults(pb.getMaxResults());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListSchemasRequestSerializer extends JsonSerializer<ListSchemasRequest> {
    @Override
    public void serialize(ListSchemasRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListSchemasRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListSchemasRequestDeserializer extends JsonDeserializer<ListSchemasRequest> {
    @Override
    public ListSchemasRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListSchemasRequestPb pb = mapper.readValue(p, ListSchemasRequestPb.class);
      return ListSchemasRequest.fromPb(pb);
    }
  }
}
