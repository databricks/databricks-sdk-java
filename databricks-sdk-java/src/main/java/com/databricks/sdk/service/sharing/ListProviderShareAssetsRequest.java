// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** List assets by provider share */
@Generated
public class ListProviderShareAssetsRequest {
  /** Maximum number of functions to return. */
  @JsonIgnore
  @QueryParam("function_max_results")
  private Long functionMaxResults;

  /** Maximum number of notebooks to return. */
  @JsonIgnore
  @QueryParam("notebook_max_results")
  private Long notebookMaxResults;

  /** The name of the provider who owns the share. */
  @JsonIgnore private String providerName;

  /** The name of the share. */
  @JsonIgnore private String shareName;

  /** Maximum number of tables to return. */
  @JsonIgnore
  @QueryParam("table_max_results")
  private Long tableMaxResults;

  /** Maximum number of volumes to return. */
  @JsonIgnore
  @QueryParam("volume_max_results")
  private Long volumeMaxResults;

  public ListProviderShareAssetsRequest setFunctionMaxResults(Long functionMaxResults) {
    this.functionMaxResults = functionMaxResults;
    return this;
  }

  public Long getFunctionMaxResults() {
    return functionMaxResults;
  }

  public ListProviderShareAssetsRequest setNotebookMaxResults(Long notebookMaxResults) {
    this.notebookMaxResults = notebookMaxResults;
    return this;
  }

  public Long getNotebookMaxResults() {
    return notebookMaxResults;
  }

  public ListProviderShareAssetsRequest setProviderName(String providerName) {
    this.providerName = providerName;
    return this;
  }

  public String getProviderName() {
    return providerName;
  }

  public ListProviderShareAssetsRequest setShareName(String shareName) {
    this.shareName = shareName;
    return this;
  }

  public String getShareName() {
    return shareName;
  }

  public ListProviderShareAssetsRequest setTableMaxResults(Long tableMaxResults) {
    this.tableMaxResults = tableMaxResults;
    return this;
  }

  public Long getTableMaxResults() {
    return tableMaxResults;
  }

  public ListProviderShareAssetsRequest setVolumeMaxResults(Long volumeMaxResults) {
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
    ListProviderShareAssetsRequest that = (ListProviderShareAssetsRequest) o;
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
    return new ToStringer(ListProviderShareAssetsRequest.class)
        .add("functionMaxResults", functionMaxResults)
        .add("notebookMaxResults", notebookMaxResults)
        .add("providerName", providerName)
        .add("shareName", shareName)
        .add("tableMaxResults", tableMaxResults)
        .add("volumeMaxResults", volumeMaxResults)
        .toString();
  }
}
