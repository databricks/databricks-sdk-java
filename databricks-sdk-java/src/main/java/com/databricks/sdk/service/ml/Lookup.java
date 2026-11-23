// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * Looks up an upstream Feature using entity values bound from other Features or from the request.
 * When a binding is an array, such as the output of a SecondaryKeys Feature, returns one value per
 * position as an array aligned with that binding. The Feature's source must be a FeatureViewSource
 * that includes `feature` and every Feature referenced in `entities`. Currently, exactly one entity
 * must be bound to a Feature: a SecondaryKeys Feature whose key has the same name as that entity.
 * Its target can be `feature` or another Feature. Every other entity must be bound to a request
 * column of the same name. Names are compared without struct prefixes, so `user_id` matches
 * `value.user_id`. A FeatureSpec can't also look up `feature` with all of its entities supplied.
 */
@Generated
public class Lookup {
  /**
   * One binding per entity column of the upstream Feature. Every entity column must be bound
   * exactly once.
   */
  @JsonProperty("entities")
  private Collection<EntityBinding> entities;

  /** The upstream Feature to look up. */
  @JsonProperty("feature")
  private FeatureReference feature;

  public Lookup setEntities(Collection<EntityBinding> entities) {
    this.entities = entities;
    return this;
  }

  public Collection<EntityBinding> getEntities() {
    return entities;
  }

  public Lookup setFeature(FeatureReference feature) {
    this.feature = feature;
    return this;
  }

  public FeatureReference getFeature() {
    return feature;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Lookup that = (Lookup) o;
    return Objects.equals(entities, that.entities) && Objects.equals(feature, that.feature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, feature);
  }

  @Override
  public String toString() {
    return new ToStringer(Lookup.class)
        .add("entities", entities)
        .add("feature", feature)
        .toString();
  }
}
