// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Get all artifacts
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListArtifactsRequest {
  /** Token indicating the page of artifact results to fetch */
  @QueryParam("page_token")
  private String pageToken;

  /** Filter artifacts matching this path (a relative path from the root artifact directory). */
  @QueryParam("path")
  private String path;

  /** ID of the run whose artifacts to list. Must be provided. */
  @QueryParam("run_id")
  private String runId;

  /**
   * [Deprecated, use run_id instead] ID of the run whose artifacts to list. This field will be
   * removed in a future MLflow version.
   */
  @QueryParam("run_uuid")
  private String runUuid;

  /**
   * <p>Setter for the field <code>pageToken</code>.</p>
   *
   * @param pageToken a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.ListArtifactsRequest} object
   */
  public ListArtifactsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  /**
   * <p>Getter for the field <code>pageToken</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getPageToken() {
    return pageToken;
  }

  /**
   * <p>Setter for the field <code>path</code>.</p>
   *
   * @param path a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.ListArtifactsRequest} object
   */
  public ListArtifactsRequest setPath(String path) {
    this.path = path;
    return this;
  }

  /**
   * <p>Getter for the field <code>path</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getPath() {
    return path;
  }

  /**
   * <p>Setter for the field <code>runId</code>.</p>
   *
   * @param runId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.ListArtifactsRequest} object
   */
  public ListArtifactsRequest setRunId(String runId) {
    this.runId = runId;
    return this;
  }

  /**
   * <p>Getter for the field <code>runId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getRunId() {
    return runId;
  }

  /**
   * <p>Setter for the field <code>runUuid</code>.</p>
   *
   * @param runUuid a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.ListArtifactsRequest} object
   */
  public ListArtifactsRequest setRunUuid(String runUuid) {
    this.runUuid = runUuid;
    return this;
  }

  /**
   * <p>Getter for the field <code>runUuid</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getRunUuid() {
    return runUuid;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListArtifactsRequest that = (ListArtifactsRequest) o;
    return Objects.equals(pageToken, that.pageToken)
        && Objects.equals(path, that.path)
        && Objects.equals(runId, that.runId)
        && Objects.equals(runUuid, that.runUuid);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(pageToken, path, runId, runUuid);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListArtifactsRequest.class)
        .add("pageToken", pageToken)
        .add("path", path)
        .add("runId", runId)
        .add("runUuid", runUuid)
        .toString();
  }
}
