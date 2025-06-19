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

/** List functions */
@Generated
@JsonSerialize(using = ListFunctionsRequest.ListFunctionsRequestSerializer.class)
@JsonDeserialize(using = ListFunctionsRequest.ListFunctionsRequestDeserializer.class)
public class ListFunctionsRequest {
  /** Name of parent catalog for functions of interest. */
  private String catalogName;

  /**
   * Whether to include functions in the response for which the principal can only access selective
   * metadata for
   */
  private Boolean includeBrowse;

  /**
   * Maximum number of functions to return. If not set, all the functions are returned (not
   * recommended). - when set to a value greater than 0, the page length is the minimum of this
   * value and a server configured value; - when set to 0, the page length is set to a server
   * configured value (recommended); - when set to a value less than 0, an invalid parameter error
   * is returned;
   */
  private Long maxResults;

  /** Opaque pagination token to go to next page based on previous query. */
  private String pageToken;

  /** Parent schema of functions. */
  private String schemaName;

  public ListFunctionsRequest setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public ListFunctionsRequest setIncludeBrowse(Boolean includeBrowse) {
    this.includeBrowse = includeBrowse;
    return this;
  }

  public Boolean getIncludeBrowse() {
    return includeBrowse;
  }

  public ListFunctionsRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public ListFunctionsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListFunctionsRequest setSchemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  public String getSchemaName() {
    return schemaName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListFunctionsRequest that = (ListFunctionsRequest) o;
    return Objects.equals(catalogName, that.catalogName)
        && Objects.equals(includeBrowse, that.includeBrowse)
        && Objects.equals(maxResults, that.maxResults)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(schemaName, that.schemaName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogName, includeBrowse, maxResults, pageToken, schemaName);
  }

  @Override
  public String toString() {
    return new ToStringer(ListFunctionsRequest.class)
        .add("catalogName", catalogName)
        .add("includeBrowse", includeBrowse)
        .add("maxResults", maxResults)
        .add("pageToken", pageToken)
        .add("schemaName", schemaName)
        .toString();
  }

  ListFunctionsRequestPb toPb() {
    ListFunctionsRequestPb pb = new ListFunctionsRequestPb();
    pb.setCatalogName(catalogName);
    pb.setIncludeBrowse(includeBrowse);
    pb.setMaxResults(maxResults);
    pb.setPageToken(pageToken);
    pb.setSchemaName(schemaName);

    return pb;
  }

  static ListFunctionsRequest fromPb(ListFunctionsRequestPb pb) {
    ListFunctionsRequest model = new ListFunctionsRequest();
    model.setCatalogName(pb.getCatalogName());
    model.setIncludeBrowse(pb.getIncludeBrowse());
    model.setMaxResults(pb.getMaxResults());
    model.setPageToken(pb.getPageToken());
    model.setSchemaName(pb.getSchemaName());

    return model;
  }

  public static class ListFunctionsRequestSerializer extends JsonSerializer<ListFunctionsRequest> {
    @Override
    public void serialize(
        ListFunctionsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListFunctionsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListFunctionsRequestDeserializer
      extends JsonDeserializer<ListFunctionsRequest> {
    @Override
    public ListFunctionsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListFunctionsRequestPb pb = mapper.readValue(p, ListFunctionsRequestPb.class);
      return ListFunctionsRequest.fromPb(pb);
    }
  }
}
