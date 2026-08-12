// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class SourceConfig {
  /** Connector-specific top-level configuration for API Source connectors. */
  @JsonProperty("api_source_connector_config")
  private ApiSourceConnectorConfig apiSourceConnectorConfig;

  /** Catalog-level source configuration parameters */
  @JsonProperty("catalog")
  private SourceCatalogConfig catalog;

  /** */
  @JsonProperty("google_ads_config")
  private GoogleAdsConfig googleAdsConfig;

  public SourceConfig setApiSourceConnectorConfig(
      ApiSourceConnectorConfig apiSourceConnectorConfig) {
    this.apiSourceConnectorConfig = apiSourceConnectorConfig;
    return this;
  }

  public ApiSourceConnectorConfig getApiSourceConnectorConfig() {
    return apiSourceConnectorConfig;
  }

  public SourceConfig setCatalog(SourceCatalogConfig catalog) {
    this.catalog = catalog;
    return this;
  }

  public SourceCatalogConfig getCatalog() {
    return catalog;
  }

  public SourceConfig setGoogleAdsConfig(GoogleAdsConfig googleAdsConfig) {
    this.googleAdsConfig = googleAdsConfig;
    return this;
  }

  public GoogleAdsConfig getGoogleAdsConfig() {
    return googleAdsConfig;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SourceConfig that = (SourceConfig) o;
    return Objects.equals(apiSourceConnectorConfig, that.apiSourceConnectorConfig)
        && Objects.equals(catalog, that.catalog)
        && Objects.equals(googleAdsConfig, that.googleAdsConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiSourceConnectorConfig, catalog, googleAdsConfig);
  }

  @Override
  public String toString() {
    return new ToStringer(SourceConfig.class)
        .add("apiSourceConnectorConfig", apiSourceConnectorConfig)
        .add("catalog", catalog)
        .add("googleAdsConfig", googleAdsConfig)
        .toString();
  }
}
