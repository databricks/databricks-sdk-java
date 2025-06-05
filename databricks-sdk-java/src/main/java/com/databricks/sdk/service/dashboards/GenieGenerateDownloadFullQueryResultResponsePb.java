// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class GenieGenerateDownloadFullQueryResultResponsePb {
  @JsonProperty("download_id")
  private String downloadId;

  public GenieGenerateDownloadFullQueryResultResponsePb setDownloadId(String downloadId) {
    this.downloadId = downloadId;
    return this;
  }

  public String getDownloadId() {
    return downloadId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieGenerateDownloadFullQueryResultResponsePb that =
        (GenieGenerateDownloadFullQueryResultResponsePb) o;
    return Objects.equals(downloadId, that.downloadId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(downloadId);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieGenerateDownloadFullQueryResultResponsePb.class)
        .add("downloadId", downloadId)
        .toString();
  }
}
