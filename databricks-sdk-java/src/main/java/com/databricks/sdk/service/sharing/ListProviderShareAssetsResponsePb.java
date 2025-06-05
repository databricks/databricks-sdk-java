// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Response to ListProviderShareAssets, which contains the list of assets of a share. */
@Generated
class ListProviderShareAssetsResponsePb {
  @JsonProperty("functions")
  private Collection<DeltaSharingFunction> functions;

  @JsonProperty("notebooks")
  private Collection<NotebookFile> notebooks;

  @JsonProperty("tables")
  private Collection<Table> tables;

  @JsonProperty("volumes")
  private Collection<Volume> volumes;

  public ListProviderShareAssetsResponsePb setFunctions(
      Collection<DeltaSharingFunction> functions) {
    this.functions = functions;
    return this;
  }

  public Collection<DeltaSharingFunction> getFunctions() {
    return functions;
  }

  public ListProviderShareAssetsResponsePb setNotebooks(Collection<NotebookFile> notebooks) {
    this.notebooks = notebooks;
    return this;
  }

  public Collection<NotebookFile> getNotebooks() {
    return notebooks;
  }

  public ListProviderShareAssetsResponsePb setTables(Collection<Table> tables) {
    this.tables = tables;
    return this;
  }

  public Collection<Table> getTables() {
    return tables;
  }

  public ListProviderShareAssetsResponsePb setVolumes(Collection<Volume> volumes) {
    this.volumes = volumes;
    return this;
  }

  public Collection<Volume> getVolumes() {
    return volumes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListProviderShareAssetsResponsePb that = (ListProviderShareAssetsResponsePb) o;
    return Objects.equals(functions, that.functions)
        && Objects.equals(notebooks, that.notebooks)
        && Objects.equals(tables, that.tables)
        && Objects.equals(volumes, that.volumes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(functions, notebooks, tables, volumes);
  }

  @Override
  public String toString() {
    return new ToStringer(ListProviderShareAssetsResponsePb.class)
        .add("functions", functions)
        .add("notebooks", notebooks)
        .add("tables", tables)
        .add("volumes", volumes)
        .toString();
  }
}
