// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class NotificationDestination {
  /** The unique identifier for the destination. */
  @JsonProperty("destination_id")
  private String destinationId;

  /** The type of the destination. */
  @JsonProperty("destination_type")
  private DestinationType destinationType;

  /**
   * This field is used to denote whether the destination is the email of the owner of the securable
   * object.
   */
  @JsonProperty("special_destination")
  private SpecialDestination specialDestination;

  public NotificationDestination setDestinationId(String destinationId) {
    this.destinationId = destinationId;
    return this;
  }

  public String getDestinationId() {
    return destinationId;
  }

  public NotificationDestination setDestinationType(DestinationType destinationType) {
    this.destinationType = destinationType;
    return this;
  }

  public DestinationType getDestinationType() {
    return destinationType;
  }

  public NotificationDestination setSpecialDestination(SpecialDestination specialDestination) {
    this.specialDestination = specialDestination;
    return this;
  }

  public SpecialDestination getSpecialDestination() {
    return specialDestination;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NotificationDestination that = (NotificationDestination) o;
    return Objects.equals(destinationId, that.destinationId)
        && Objects.equals(destinationType, that.destinationType)
        && Objects.equals(specialDestination, that.specialDestination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationId, destinationType, specialDestination);
  }

  @Override
  public String toString() {
    return new ToStringer(NotificationDestination.class)
        .add("destinationId", destinationId)
        .add("destinationType", destinationType)
        .add("specialDestination", specialDestination)
        .toString();
  }
}
