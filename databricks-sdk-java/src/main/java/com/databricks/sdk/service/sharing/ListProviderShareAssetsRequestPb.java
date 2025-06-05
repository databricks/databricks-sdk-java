// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** List assets by provider share */
@Generated
class ListProviderShareAssetsRequestPb {
  @JsonIgnore
  @QueryParam("function_max_results")
  private Long functionMaxResults;

  @JsonIgnore
  @QueryParam("notebook_max_results")
  private Long notebookMaxResults;

  @JsonIgnore private String providerName;

  @JsonIgnore private String shareName;

  @JsonIgnore
  @QueryParam("table_max_results")
  private Long tableMaxResults;

  @JsonIgnore
  @QueryParam("volume_max_results")
  private Long volumeMaxResults;

  public ListProviderShareAssetsRequestPb setFunctionMaxResults(Long functionMaxResults) {
    this.functionMaxResults = functionMaxResults;
    return this;
  }

  public Long getFunctionMaxResults() {
    return functionMaxResults;
  }

  public ListProviderShareAssetsRequestPb setNotebookMaxResults(Long notebookMaxResults) {
    this.notebookMaxResults = notebookMaxResults;
    return this;
  }

  public Long getNotebookMaxResults() {
    return notebookMaxResults;
  }

  public ListProviderShareAssetsRequestPb setProviderName(String providerName) {
    this.providerName = providerName;
    return this;
  }

  public String getProviderName() {
    return providerName;
  }

  public ListProviderShareAssetsRequestPb setShareName(String shareName) {
    this.shareName = shareName;
    return this;
  }

  public String getShareName() {
    return shareName;
  }

  public ListProviderShareAssetsRequestPb setTableMaxResults(Long tableMaxResults) {
    this.tableMaxResults = tableMaxResults;
    return this;
  }

  public Long getTableMaxResults() {
    return tableMaxResults;
  }

  public ListProviderShareAssetsRequestPb setVolumeMaxResults(Long volumeMaxResults) {
    this.volumeMaxResults = volumeMaxResults;
    return this;
  }

  public Long getVolumeMaxResults() {
    return volumeMaxResults;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListProviderShareAssetsRequestPb that = (ListProviderShareAssetsRequestPb) o;
    return Objects.equals(functionMaxResults, that.functionMaxResults)
        && Objects.equals(notebookMaxResults, that.notebookMaxResults)
        && Objects.equals(providerName, that.providerName)
        && Objects.equals(shareName, that.shareName)
        && Objects.equals(tableMaxResults, that.tableMaxResults)
        && Objects.equals(volumeMaxResults, that.volumeMaxResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        functionMaxResults,
        notebookMaxResults,
        providerName,
        shareName,
        tableMaxResults,
        volumeMaxResults);
  }

  @Override
  public String toString() {
    return new ToStringer(ListProviderShareAssetsRequestPb.class)
        .add("functionMaxResults", functionMaxResults)
        .add("notebookMaxResults", notebookMaxResults)
        .add("providerName", providerName)
        .add("shareName", shareName)
        .add("tableMaxResults", tableMaxResults)
        .add("volumeMaxResults", volumeMaxResults)
        .toString();
  }
}
