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

/** List table summaries */
@Generated
@JsonSerialize(using = ListSummariesRequest.ListSummariesRequestSerializer.class)
@JsonDeserialize(using = ListSummariesRequest.ListSummariesRequestDeserializer.class)
public class ListSummariesRequest {
  /** Name of parent catalog for tables of interest. */
  private String catalogName;

  /** Whether to include a manifest containing capabilities the table has. */
  private Boolean includeManifestCapabilities;

  /**
   * Maximum number of summaries for tables to return. If not set, the page length is set to a
   * server configured value (10000, as of 1/5/2024). - when set to a value greater than 0, the page
   * length is the minimum of this value and a server configured value (10000, as of 1/5/2024); -
   * when set to 0, the page length is set to a server configured value (10000, as of 1/5/2024)
   * (recommended); - when set to a value less than 0, an invalid parameter error is returned;
   */
  private Long maxResults;

  /** Opaque pagination token to go to next page based on previous query. */
  private String pageToken;

  /**
   * A sql LIKE pattern (% and _) for schema names. All schemas will be returned if not set or
   * empty.
   */
  private String schemaNamePattern;

  /**
   * A sql LIKE pattern (% and _) for table names. All tables will be returned if not set or empty.
   */
  private String tableNamePattern;

  public ListSummariesRequest setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public ListSummariesRequest setIncludeManifestCapabilities(Boolean includeManifestCapabilities) {
    this.includeManifestCapabilities = includeManifestCapabilities;
    return this;
  }

  public Boolean getIncludeManifestCapabilities() {
    return includeManifestCapabilities;
  }

  public ListSummariesRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public ListSummariesRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListSummariesRequest setSchemaNamePattern(String schemaNamePattern) {
    this.schemaNamePattern = schemaNamePattern;
    return this;
  }

  public String getSchemaNamePattern() {
    return schemaNamePattern;
  }

  public ListSummariesRequest setTableNamePattern(String tableNamePattern) {
    this.tableNamePattern = tableNamePattern;
    return this;
  }

  public String getTableNamePattern() {
    return tableNamePattern;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListSummariesRequest that = (ListSummariesRequest) o;
    return Objects.equals(catalogName, that.catalogName)
        && Objects.equals(includeManifestCapabilities, that.includeManifestCapabilities)
        && Objects.equals(maxResults, that.maxResults)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(schemaNamePattern, that.schemaNamePattern)
        && Objects.equals(tableNamePattern, that.tableNamePattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        catalogName,
        includeManifestCapabilities,
        maxResults,
        pageToken,
        schemaNamePattern,
        tableNamePattern);
  }

  @Override
  public String toString() {
    return new ToStringer(ListSummariesRequest.class)
        .add("catalogName", catalogName)
        .add("includeManifestCapabilities", includeManifestCapabilities)
        .add("maxResults", maxResults)
        .add("pageToken", pageToken)
        .add("schemaNamePattern", schemaNamePattern)
        .add("tableNamePattern", tableNamePattern)
        .toString();
  }

  ListSummariesRequestPb toPb() {
    ListSummariesRequestPb pb = new ListSummariesRequestPb();
    pb.setCatalogName(catalogName);
    pb.setIncludeManifestCapabilities(includeManifestCapabilities);
    pb.setMaxResults(maxResults);
    pb.setPageToken(pageToken);
    pb.setSchemaNamePattern(schemaNamePattern);
    pb.setTableNamePattern(tableNamePattern);

    return pb;
  }

  static ListSummariesRequest fromPb(ListSummariesRequestPb pb) {
    ListSummariesRequest model = new ListSummariesRequest();
    model.setCatalogName(pb.getCatalogName());
    model.setIncludeManifestCapabilities(pb.getIncludeManifestCapabilities());
    model.setMaxResults(pb.getMaxResults());
    model.setPageToken(pb.getPageToken());
    model.setSchemaNamePattern(pb.getSchemaNamePattern());
    model.setTableNamePattern(pb.getTableNamePattern());

    return model;
  }

  public static class ListSummariesRequestSerializer extends JsonSerializer<ListSummariesRequest> {
    @Override
    public void serialize(
        ListSummariesRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListSummariesRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListSummariesRequestDeserializer
      extends JsonDeserializer<ListSummariesRequest> {
    @Override
    public ListSummariesRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListSummariesRequestPb pb = mapper.readValue(p, ListSummariesRequestPb.class);
      return ListSummariesRequest.fromPb(pb);
    }
  }
}
