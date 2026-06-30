// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class GenieGenerateDownloadFullQueryResultResponse {
  /** Download ID. Use this ID to track the download request in subsequent polling calls */
  @JsonProperty("download_id")
  private String downloadId;

  /** JWT signature for the download_id to ensure secure access to query results */
  @JsonProperty("download_id_signature")
  private String downloadIdSignature;

  public GenieGenerateDownloadFullQueryResultResponse setDownloadId(String downloadId) {
    this.downloadId = downloadId;
    return this;
  }

  public String getDownloadId() {
    return downloadId;
  }

  public GenieGenerateDownloadFullQueryResultResponse setDownloadIdSignature(
      String downloadIdSignature) {
    this.downloadIdSignature = downloadIdSignature;
    return this;
  }

  public String getDownloadIdSignature() {
    return downloadIdSignature;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieGenerateDownloadFullQueryResultResponse that =
        (GenieGenerateDownloadFullQueryResultResponse) o;
    return Objects.equals(downloadId, that.downloadId)
        && Objects.equals(downloadIdSignature, that.downloadIdSignature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(downloadId, downloadIdSignature);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieGenerateDownloadFullQueryResultResponse.class)
        .add("downloadId", downloadId)
        .add("downloadIdSignature", downloadIdSignature)
        .toString();
  }
}
