// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>StartUpdate class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class StartUpdate {
  /** */
  @JsonProperty("cause")
  private StartUpdateCause cause;

  /** If true, this update will reset all tables before running. */
  @JsonProperty("full_refresh")
  private Boolean fullRefresh;

  /**
   * A list of tables to update with fullRefresh. If both refresh_selection and
   * full_refresh_selection are empty, this is a full graph update. Full Refresh on a table means
   * that the states of the table will be reset before the refresh.
   */
  @JsonProperty("full_refresh_selection")
  private Collection<String> fullRefreshSelection;

  /** */
  private String pipelineId;

  /**
   * A list of tables to update without fullRefresh. If both refresh_selection and
   * full_refresh_selection are empty, this is a full graph update. Full Refresh on a table means
   * that the states of the table will be reset before the refresh.
   */
  @JsonProperty("refresh_selection")
  private Collection<String> refreshSelection;

  /**
   * <p>Setter for the field <code>cause</code>.</p>
   *
   * @param cause a {@link com.databricks.sdk.service.pipelines.StartUpdateCause} object
   * @return a {@link com.databricks.sdk.service.pipelines.StartUpdate} object
   */
  public StartUpdate setCause(StartUpdateCause cause) {
    this.cause = cause;
    return this;
  }

  /**
   * <p>Getter for the field <code>cause</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.pipelines.StartUpdateCause} object
   */
  public StartUpdateCause getCause() {
    return cause;
  }

  /**
   * <p>Setter for the field <code>fullRefresh</code>.</p>
   *
   * @param fullRefresh a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.pipelines.StartUpdate} object
   */
  public StartUpdate setFullRefresh(Boolean fullRefresh) {
    this.fullRefresh = fullRefresh;
    return this;
  }

  /**
   * <p>Getter for the field <code>fullRefresh</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getFullRefresh() {
    return fullRefresh;
  }

  /**
   * <p>Setter for the field <code>fullRefreshSelection</code>.</p>
   *
   * @param fullRefreshSelection a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.pipelines.StartUpdate} object
   */
  public StartUpdate setFullRefreshSelection(Collection<String> fullRefreshSelection) {
    this.fullRefreshSelection = fullRefreshSelection;
    return this;
  }

  /**
   * <p>Getter for the field <code>fullRefreshSelection</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<String> getFullRefreshSelection() {
    return fullRefreshSelection;
  }

  /**
   * <p>Setter for the field <code>pipelineId</code>.</p>
   *
   * @param pipelineId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.StartUpdate} object
   */
  public StartUpdate setPipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
    return this;
  }

  /**
   * <p>Getter for the field <code>pipelineId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getPipelineId() {
    return pipelineId;
  }

  /**
   * <p>Setter for the field <code>refreshSelection</code>.</p>
   *
   * @param refreshSelection a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.pipelines.StartUpdate} object
   */
  public StartUpdate setRefreshSelection(Collection<String> refreshSelection) {
    this.refreshSelection = refreshSelection;
    return this;
  }

  /**
   * <p>Getter for the field <code>refreshSelection</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<String> getRefreshSelection() {
    return refreshSelection;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StartUpdate that = (StartUpdate) o;
    return Objects.equals(cause, that.cause)
        && Objects.equals(fullRefresh, that.fullRefresh)
        && Objects.equals(fullRefreshSelection, that.fullRefreshSelection)
        && Objects.equals(pipelineId, that.pipelineId)
        && Objects.equals(refreshSelection, that.refreshSelection);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(cause, fullRefresh, fullRefreshSelection, pipelineId, refreshSelection);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(StartUpdate.class)
        .add("cause", cause)
        .add("fullRefresh", fullRefresh)
        .add("fullRefreshSelection", fullRefreshSelection)
        .add("pipelineId", pipelineId)
        .add("refreshSelection", refreshSelection)
        .toString();
  }
}
