// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Online Table information. */
@Generated
class OnlineTablePb {
  @JsonProperty("name")
  private String name;

  @JsonProperty("spec")
  private OnlineTableSpec spec;

  @JsonProperty("status")
  private OnlineTableStatus status;

  @JsonProperty("table_serving_url")
  private String tableServingUrl;

  @JsonProperty("unity_catalog_provisioning_state")
  private ProvisioningInfoState unityCatalogProvisioningState;

  public OnlineTablePb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public OnlineTablePb setSpec(OnlineTableSpec spec) {
    this.spec = spec;
    return this;
  }

  public OnlineTableSpec getSpec() {
    return spec;
  }

  public OnlineTablePb setStatus(OnlineTableStatus status) {
    this.status = status;
    return this;
  }

  public OnlineTableStatus getStatus() {
    return status;
  }

  public OnlineTablePb setTableServingUrl(String tableServingUrl) {
    this.tableServingUrl = tableServingUrl;
    return this;
  }

  public String getTableServingUrl() {
    return tableServingUrl;
  }

  public OnlineTablePb setUnityCatalogProvisioningState(
      ProvisioningInfoState unityCatalogProvisioningState) {
    this.unityCatalogProvisioningState = unityCatalogProvisioningState;
    return this;
  }

  public ProvisioningInfoState getUnityCatalogProvisioningState() {
    return unityCatalogProvisioningState;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OnlineTablePb that = (OnlineTablePb) o;
    return Objects.equals(name, that.name)
        && Objects.equals(spec, that.spec)
        && Objects.equals(status, that.status)
        && Objects.equals(tableServingUrl, that.tableServingUrl)
        && Objects.equals(unityCatalogProvisioningState, that.unityCatalogProvisioningState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, spec, status, tableServingUrl, unityCatalogProvisioningState);
  }

  @Override
  public String toString() {
    return new ToStringer(OnlineTablePb.class)
        .add("name", name)
        .add("spec", spec)
        .add("status", status)
        .add("tableServingUrl", tableServingUrl)
        .add("unityCatalogProvisioningState", unityCatalogProvisioningState)
        .toString();
  }
}
