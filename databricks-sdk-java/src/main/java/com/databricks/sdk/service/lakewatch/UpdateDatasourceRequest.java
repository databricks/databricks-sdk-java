// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.FieldMask;
import java.util.Objects;

@Generated
public class UpdateDatasourceRequest {
  /** */
  @JsonProperty("datasource")
  private Datasource datasource;

  /**
   * Optimistic-concurrency precondition: if set to a non-empty value that does not match the
   * resource's current `etag`, the update is rejected as a conflict (HTTP 409). Omit this field or
   * send an empty string to update unconditionally.
   */
  @JsonIgnore
  @QueryParam("etag")
  private String etag;

  /**
   * Resource name of the datasource, in the format `datasources/{datasource_id}`. Unlike the
   * datasource's Unity Catalog location (`catalog_name`, `schema_name`, and `datasource_name`), the
   * name does not change when the datasource or its catalog or schema is renamed in Unity Catalog.
   */
  @JsonIgnore private String name;

  /**
   * The field mask must be a single string, with multiple fields separated by commas (no spaces).
   * The field path is relative to the resource object, using a dot (`.`) to navigate sub-fields
   * (e.g., `author.given_name`). Specification of elements in sequence or map fields is not
   * allowed, as only the entire collection field can be specified. Field names must exactly match
   * the resource field names.
   *
   * <p>A field mask of `*` indicates full replacement. It’s recommended to always explicitly list
   * the fields being updated and avoid using `*` wildcards, as it can lead to unintended results if
   * the API changes in the future.
   */
  @JsonIgnore
  @QueryParam("update_mask")
  private FieldMask updateMask;

  public UpdateDatasourceRequest setDatasource(Datasource datasource) {
    this.datasource = datasource;
    return this;
  }

  public Datasource getDatasource() {
    return datasource;
  }

  public UpdateDatasourceRequest setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public UpdateDatasourceRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateDatasourceRequest setUpdateMask(FieldMask updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public FieldMask getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateDatasourceRequest that = (UpdateDatasourceRequest) o;
    return Objects.equals(datasource, that.datasource)
        && Objects.equals(etag, that.etag)
        && Objects.equals(name, that.name)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasource, etag, name, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateDatasourceRequest.class)
        .add("datasource", datasource)
        .add("etag", etag)
        .add("name", name)
        .add("updateMask", updateMask)
        .toString();
  }
}
