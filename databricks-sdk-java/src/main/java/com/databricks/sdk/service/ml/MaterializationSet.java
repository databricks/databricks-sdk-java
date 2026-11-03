// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** A group of materialized features created and managed as a single unit. */
@Generated
public class MaterializationSet {
  /** Server-assigned unique identifier for the materialization set. */
  @JsonProperty("materialization_set_id")
  private String materializationSetId;

  /**
   * The materialized features in this set. Order is not significant. Updating the set with a
   * materialized feature removed from this set will cause it to be deleted.
   */
  @JsonProperty("materialized_features")
  private Collection<MaterializedFeature> materializedFeatures;

  /**
   * Notification configuration around the materialization job or pipeline lifecycle. They are
   * applied to every job and pipeline that materializes a feature in this set. Features which are
   * materialized in the same pipeline will share the same notification.
   */
  @JsonProperty("notifications")
  private MaterializationNotifications notifications;

  public MaterializationSet setMaterializationSetId(String materializationSetId) {
    this.materializationSetId = materializationSetId;
    return this;
  }

  public String getMaterializationSetId() {
    return materializationSetId;
  }

  public MaterializationSet setMaterializedFeatures(
      Collection<MaterializedFeature> materializedFeatures) {
    this.materializedFeatures = materializedFeatures;
    return this;
  }

  public Collection<MaterializedFeature> getMaterializedFeatures() {
    return materializedFeatures;
  }

  public MaterializationSet setNotifications(MaterializationNotifications notifications) {
    this.notifications = notifications;
    return this;
  }

  public MaterializationNotifications getNotifications() {
    return notifications;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MaterializationSet that = (MaterializationSet) o;
    return Objects.equals(materializationSetId, that.materializationSetId)
        && Objects.equals(materializedFeatures, that.materializedFeatures)
        && Objects.equals(notifications, that.notifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(materializationSetId, materializedFeatures, notifications);
  }

  @Override
  public String toString() {
    return new ToStringer(MaterializationSet.class)
        .add("materializationSetId", materializationSetId)
        .add("materializedFeatures", materializedFeatures)
        .add("notifications", notifications)
        .toString();
  }
}
