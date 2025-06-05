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

/** List Registered Models */
@Generated
@JsonSerialize(using = ListRegisteredModelsRequest.ListRegisteredModelsRequestSerializer.class)
@JsonDeserialize(using = ListRegisteredModelsRequest.ListRegisteredModelsRequestDeserializer.class)
public class ListRegisteredModelsRequest {
  /**
   * The identifier of the catalog under which to list registered models. If specified, schema_name
   * must be specified.
   */
  private String catalogName;

  /**
   * Whether to include registered models in the response for which the principal can only access
   * selective metadata for
   */
  private Boolean includeBrowse;

  /**
   * Max number of registered models to return.
   *
   * <p>If both catalog and schema are specified: - when max_results is not specified, the page
   * length is set to a server configured value (10000, as of 4/2/2024). - when set to a value
   * greater than 0, the page length is the minimum of this value and a server configured value
   * (10000, as of 4/2/2024); - when set to 0, the page length is set to a server configured value
   * (10000, as of 4/2/2024); - when set to a value less than 0, an invalid parameter error is
   * returned;
   *
   * <p>If neither schema nor catalog is specified: - when max_results is not specified, the page
   * length is set to a server configured value (100, as of 4/2/2024). - when set to a value greater
   * than 0, the page length is the minimum of this value and a server configured value (1000, as of
   * 4/2/2024); - when set to 0, the page length is set to a server configured value (100, as of
   * 4/2/2024); - when set to a value less than 0, an invalid parameter error is returned;
   */
  private Long maxResults;

  /** Opaque token to send for the next page of results (pagination). */
  private String pageToken;

  /**
   * The identifier of the schema under which to list registered models. If specified, catalog_name
   * must be specified.
   */
  private String schemaName;

  public ListRegisteredModelsRequest setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public ListRegisteredModelsRequest setIncludeBrowse(Boolean includeBrowse) {
    this.includeBrowse = includeBrowse;
    return this;
  }

  public Boolean getIncludeBrowse() {
    return includeBrowse;
  }

  public ListRegisteredModelsRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public ListRegisteredModelsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListRegisteredModelsRequest setSchemaName(String schemaName) {
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
    ListRegisteredModelsRequest that = (ListRegisteredModelsRequest) o;
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
    return new ToStringer(ListRegisteredModelsRequest.class)
        .add("catalogName", catalogName)
        .add("includeBrowse", includeBrowse)
        .add("maxResults", maxResults)
        .add("pageToken", pageToken)
        .add("schemaName", schemaName)
        .toString();
  }

  ListRegisteredModelsRequestPb toPb() {
    ListRegisteredModelsRequestPb pb = new ListRegisteredModelsRequestPb();
    pb.setCatalogName(catalogName);
    pb.setIncludeBrowse(includeBrowse);
    pb.setMaxResults(maxResults);
    pb.setPageToken(pageToken);
    pb.setSchemaName(schemaName);

    return pb;
  }

  static ListRegisteredModelsRequest fromPb(ListRegisteredModelsRequestPb pb) {
    ListRegisteredModelsRequest model = new ListRegisteredModelsRequest();
    model.setCatalogName(pb.getCatalogName());
    model.setIncludeBrowse(pb.getIncludeBrowse());
    model.setMaxResults(pb.getMaxResults());
    model.setPageToken(pb.getPageToken());
    model.setSchemaName(pb.getSchemaName());

    return model;
  }

  public static class ListRegisteredModelsRequestSerializer
      extends JsonSerializer<ListRegisteredModelsRequest> {
    @Override
    public void serialize(
        ListRegisteredModelsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListRegisteredModelsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListRegisteredModelsRequestDeserializer
      extends JsonDeserializer<ListRegisteredModelsRequest> {
    @Override
    public ListRegisteredModelsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListRegisteredModelsRequestPb pb = mapper.readValue(p, ListRegisteredModelsRequestPb.class);
      return ListRegisteredModelsRequest.fromPb(pb);
    }
  }
}
