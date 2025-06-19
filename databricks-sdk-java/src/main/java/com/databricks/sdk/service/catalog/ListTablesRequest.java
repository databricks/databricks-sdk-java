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

/** List tables */
@Generated
@JsonSerialize(using = ListTablesRequest.ListTablesRequestSerializer.class)
@JsonDeserialize(using = ListTablesRequest.ListTablesRequestDeserializer.class)
public class ListTablesRequest {
  /** Name of parent catalog for tables of interest. */
  private String catalogName;

  /**
   * Whether to include tables in the response for which the principal can only access selective
   * metadata for
   */
  private Boolean includeBrowse;

  /** Whether delta metadata should be included in the response. */
  private Boolean includeDeltaMetadata;

  /** Whether to include a manifest containing capabilities the table has. */
  private Boolean includeManifestCapabilities;

  /**
   * Maximum number of tables to return. If not set, all the tables are returned (not recommended).
   * - when set to a value greater than 0, the page length is the minimum of this value and a server
   * configured value; - when set to 0, the page length is set to a server configured value
   * (recommended); - when set to a value less than 0, an invalid parameter error is returned;
   */
  private Long maxResults;

  /** Whether to omit the columns of the table from the response or not. */
  private Boolean omitColumns;

  /** Whether to omit the properties of the table from the response or not. */
  private Boolean omitProperties;

  /**
   * Whether to omit the username of the table (e.g. owner, updated_by, created_by) from the
   * response or not.
   */
  private Boolean omitUsername;

  /** Opaque token to send for the next page of results (pagination). */
  private String pageToken;

  /** Parent schema of tables. */
  private String schemaName;

  public ListTablesRequest setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public ListTablesRequest setIncludeBrowse(Boolean includeBrowse) {
    this.includeBrowse = includeBrowse;
    return this;
  }

  public Boolean getIncludeBrowse() {
    return includeBrowse;
  }

  public ListTablesRequest setIncludeDeltaMetadata(Boolean includeDeltaMetadata) {
    this.includeDeltaMetadata = includeDeltaMetadata;
    return this;
  }

  public Boolean getIncludeDeltaMetadata() {
    return includeDeltaMetadata;
  }

  public ListTablesRequest setIncludeManifestCapabilities(Boolean includeManifestCapabilities) {
    this.includeManifestCapabilities = includeManifestCapabilities;
    return this;
  }

  public Boolean getIncludeManifestCapabilities() {
    return includeManifestCapabilities;
  }

  public ListTablesRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public ListTablesRequest setOmitColumns(Boolean omitColumns) {
    this.omitColumns = omitColumns;
    return this;
  }

  public Boolean getOmitColumns() {
    return omitColumns;
  }

  public ListTablesRequest setOmitProperties(Boolean omitProperties) {
    this.omitProperties = omitProperties;
    return this;
  }

  public Boolean getOmitProperties() {
    return omitProperties;
  }

  public ListTablesRequest setOmitUsername(Boolean omitUsername) {
    this.omitUsername = omitUsername;
    return this;
  }

  public Boolean getOmitUsername() {
    return omitUsername;
  }

  public ListTablesRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListTablesRequest setSchemaName(String schemaName) {
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
    ListTablesRequest that = (ListTablesRequest) o;
    return Objects.equals(catalogName, that.catalogName)
        && Objects.equals(includeBrowse, that.includeBrowse)
        && Objects.equals(includeDeltaMetadata, that.includeDeltaMetadata)
        && Objects.equals(includeManifestCapabilities, that.includeManifestCapabilities)
        && Objects.equals(maxResults, that.maxResults)
        && Objects.equals(omitColumns, that.omitColumns)
        && Objects.equals(omitProperties, that.omitProperties)
        && Objects.equals(omitUsername, that.omitUsername)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(schemaName, that.schemaName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        catalogName,
        includeBrowse,
        includeDeltaMetadata,
        includeManifestCapabilities,
        maxResults,
        omitColumns,
        omitProperties,
        omitUsername,
        pageToken,
        schemaName);
  }

  @Override
  public String toString() {
    return new ToStringer(ListTablesRequest.class)
        .add("catalogName", catalogName)
        .add("includeBrowse", includeBrowse)
        .add("includeDeltaMetadata", includeDeltaMetadata)
        .add("includeManifestCapabilities", includeManifestCapabilities)
        .add("maxResults", maxResults)
        .add("omitColumns", omitColumns)
        .add("omitProperties", omitProperties)
        .add("omitUsername", omitUsername)
        .add("pageToken", pageToken)
        .add("schemaName", schemaName)
        .toString();
  }

  ListTablesRequestPb toPb() {
    ListTablesRequestPb pb = new ListTablesRequestPb();
    pb.setCatalogName(catalogName);
    pb.setIncludeBrowse(includeBrowse);
    pb.setIncludeDeltaMetadata(includeDeltaMetadata);
    pb.setIncludeManifestCapabilities(includeManifestCapabilities);
    pb.setMaxResults(maxResults);
    pb.setOmitColumns(omitColumns);
    pb.setOmitProperties(omitProperties);
    pb.setOmitUsername(omitUsername);
    pb.setPageToken(pageToken);
    pb.setSchemaName(schemaName);

    return pb;
  }

  static ListTablesRequest fromPb(ListTablesRequestPb pb) {
    ListTablesRequest model = new ListTablesRequest();
    model.setCatalogName(pb.getCatalogName());
    model.setIncludeBrowse(pb.getIncludeBrowse());
    model.setIncludeDeltaMetadata(pb.getIncludeDeltaMetadata());
    model.setIncludeManifestCapabilities(pb.getIncludeManifestCapabilities());
    model.setMaxResults(pb.getMaxResults());
    model.setOmitColumns(pb.getOmitColumns());
    model.setOmitProperties(pb.getOmitProperties());
    model.setOmitUsername(pb.getOmitUsername());
    model.setPageToken(pb.getPageToken());
    model.setSchemaName(pb.getSchemaName());

    return model;
  }

  public static class ListTablesRequestSerializer extends JsonSerializer<ListTablesRequest> {
    @Override
    public void serialize(ListTablesRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListTablesRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListTablesRequestDeserializer extends JsonDeserializer<ListTablesRequest> {
    @Override
    public ListTablesRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListTablesRequestPb pb = mapper.readValue(p, ListTablesRequestPb.class);
      return ListTablesRequest.fromPb(pb);
    }
  }
}
