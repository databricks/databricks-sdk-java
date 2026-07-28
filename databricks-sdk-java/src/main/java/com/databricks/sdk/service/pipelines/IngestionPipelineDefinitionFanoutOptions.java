// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * Fanout configuration for multi-table routing from streaming sources. Routes each input record to
 * a destination table based on a routing key derived from the record. The key value becomes the
 * table name suffix: {destination_catalog}.{destination_schema}.{key_value}.
 */
@Generated
public class IngestionPipelineDefinitionFanoutOptions {
  /**
   * Column path or SQL expression whose value determines the destination table. Supports dotted
   * paths (e.g. "value.event_name") and expressions (e.g. "value:event_name::string").
   */
  @JsonProperty("fanout_by")
  private String fanoutBy;

  /**
   * Optional transforms applied to each route's DataFrame before writing to the destination table.
   */
  @JsonProperty("transforms")
  private Collection<Transformer> transforms;

  public IngestionPipelineDefinitionFanoutOptions setFanoutBy(String fanoutBy) {
    this.fanoutBy = fanoutBy;
    return this;
  }

  public String getFanoutBy() {
    return fanoutBy;
  }

  public IngestionPipelineDefinitionFanoutOptions setTransforms(
      Collection<Transformer> transforms) {
    this.transforms = transforms;
    return this;
  }

  public Collection<Transformer> getTransforms() {
    return transforms;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    IngestionPipelineDefinitionFanoutOptions that = (IngestionPipelineDefinitionFanoutOptions) o;
    return Objects.equals(fanoutBy, that.fanoutBy) && Objects.equals(transforms, that.transforms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fanoutBy, transforms);
  }

  @Override
  public String toString() {
    return new ToStringer(IngestionPipelineDefinitionFanoutOptions.class)
        .add("fanoutBy", fanoutBy)
        .add("transforms", transforms)
        .toString();
  }
}
