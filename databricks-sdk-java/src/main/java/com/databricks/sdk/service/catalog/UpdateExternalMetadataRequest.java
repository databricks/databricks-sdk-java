// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateExternalMetadataRequest {
  /** */
  @JsonProperty("external_metadata")
  private ExternalMetadata externalMetadata;

  /**
   * Name of the external metadata object. The name is unique within the metastore, must follow the
   * [Unity Catalog naming requirements], and is stored in lowercase. It cannot be changed after
   * creation, and external lineage relationships refer to the object by this name.
   *
   * <p>[Unity Catalog naming requirements]:
   * https://docs.databricks.com/aws/en/data-governance/unity-catalog/requirements#naming-requirements
   */
  @JsonIgnore private String name;

  /**
   * Comma-separated list of the fields to update, for example `description,properties`. Only the
   * listed fields change. The other fields keep their current values. The mask must not be empty.
   */
  @JsonIgnore
  @QueryParam("update_mask")
  private String updateMask;

  public UpdateExternalMetadataRequest setExternalMetadata(ExternalMetadata externalMetadata) {
    this.externalMetadata = externalMetadata;
    return this;
  }

  public ExternalMetadata getExternalMetadata() {
    return externalMetadata;
  }

  public UpdateExternalMetadataRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateExternalMetadataRequest setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public String getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateExternalMetadataRequest that = (UpdateExternalMetadataRequest) o;
    return Objects.equals(externalMetadata, that.externalMetadata)
        && Objects.equals(name, that.name)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalMetadata, name, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateExternalMetadataRequest.class)
        .add("externalMetadata", externalMetadata)
        .add("name", name)
        .add("updateMask", updateMask)
        .toString();
  }
}
