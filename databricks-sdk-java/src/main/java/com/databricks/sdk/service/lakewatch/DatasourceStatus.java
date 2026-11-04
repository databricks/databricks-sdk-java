// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Read-only runtime status of a datasource, with the status of each job and pipeline that runs it.
 */
@Generated
public class DatasourceStatus {
  /** Status of the datasource's ingestion job. */
  @JsonProperty("ingestion_job")
  private ResourceStatus ingestionJob;

  /**
   * Status of the managed ingestion pipeline. Populated only when `unity_catalog_connection` is
   * set, with `pipeline_id` identifying the pipeline.
   */
  @JsonProperty("ingestion_pipeline")
  private ResourceStatus ingestionPipeline;

  public DatasourceStatus setIngestionJob(ResourceStatus ingestionJob) {
    this.ingestionJob = ingestionJob;
    return this;
  }

  public ResourceStatus getIngestionJob() {
    return ingestionJob;
  }

  public DatasourceStatus setIngestionPipeline(ResourceStatus ingestionPipeline) {
    this.ingestionPipeline = ingestionPipeline;
    return this;
  }

  public ResourceStatus getIngestionPipeline() {
    return ingestionPipeline;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DatasourceStatus that = (DatasourceStatus) o;
    return Objects.equals(ingestionJob, that.ingestionJob)
        && Objects.equals(ingestionPipeline, that.ingestionPipeline);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ingestionJob, ingestionPipeline);
  }

  @Override
  public String toString() {
    return new ToStringer(DatasourceStatus.class)
        .add("ingestionJob", ingestionJob)
        .add("ingestionPipeline", ingestionPipeline)
        .toString();
  }
}
