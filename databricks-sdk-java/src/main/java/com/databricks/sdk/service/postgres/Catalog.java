// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

@Generated
public class Catalog {
  /** A timestamp indicating when the catalog was created. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /**
   * Output only. The full resource path of the catalog.
   *
   * <p>Format: "catalogs/{catalog_id}".
   */
  @JsonProperty("name")
  private String name;

  /** The desired state of the Catalog. */
  @JsonProperty("spec")
  private CatalogCatalogSpec spec;

  /** The observed state of the Catalog. */
  @JsonProperty("status")
  private CatalogCatalogStatus status;

  /** System-generated unique identifier for the catalog. */
  @JsonProperty("uid")
  private String uid;

  /** A timestamp indicating when the catalog was last updated. */
  @JsonProperty("update_time")
  private Timestamp updateTime;

  public Catalog setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public Catalog setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Catalog setSpec(CatalogCatalogSpec spec) {
    this.spec = spec;
    return this;
  }

  public CatalogCatalogSpec getSpec() {
    return spec;
  }

  public Catalog setStatus(CatalogCatalogStatus status) {
    this.status = status;
    return this;
  }

  public CatalogCatalogStatus getStatus() {
    return status;
  }

  public Catalog setUid(String uid) {
    this.uid = uid;
    return this;
  }

  public String getUid() {
    return uid;
  }

  public Catalog setUpdateTime(Timestamp updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public Timestamp getUpdateTime() {
    return updateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Catalog that = (Catalog) o;
    return Objects.equals(createTime, that.createTime)
        && Objects.equals(name, that.name)
        && Objects.equals(spec, that.spec)
        && Objects.equals(status, that.status)
        && Objects.equals(uid, that.uid)
        && Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, name, spec, status, uid, updateTime);
  }

  @Override
  public String toString() {
    return new ToStringer(Catalog.class)
        .add("createTime", createTime)
        .add("name", name)
        .add("spec", spec)
        .add("status", status)
        .add("uid", uid)
        .add("updateTime", updateTime)
        .toString();
  }
}
