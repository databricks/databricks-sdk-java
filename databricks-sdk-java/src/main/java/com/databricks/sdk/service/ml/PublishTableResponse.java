// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class PublishTableResponse {
  /** The full three-part (catalog, schema, table) name of the online table. */
  @JsonProperty("online_table_name")
  private String onlineTableName;

  /** The ID of the pipeline that syncs the online table with the source table. */
  @JsonProperty("pipeline_id")
  private String pipelineId;

  public PublishTableResponse setOnlineTableName(String onlineTableName) {
    this.onlineTableName = onlineTableName;
    return this;
  }

  public String getOnlineTableName() {
    return onlineTableName;
  }

  public PublishTableResponse setPipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
    return this;
  }

  public String getPipelineId() {
    return pipelineId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PublishTableResponse that = (PublishTableResponse) o;
    return Objects.equals(onlineTableName, that.onlineTableName)
        && Objects.equals(pipelineId, that.pipelineId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onlineTableName, pipelineId);
  }

  @Override
  public String toString() {
    return new ToStringer(PublishTableResponse.class)
        .add("onlineTableName", onlineTableName)
        .add("pipelineId", pipelineId)
        .toString();
  }
}
