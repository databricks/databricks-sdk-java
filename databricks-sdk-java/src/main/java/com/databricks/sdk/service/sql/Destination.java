// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Alert destination subscribed to the alert, if it exists. Alert destinations can be configured by
 * admins through the UI. See [here].
 *
 * <p>[here]: https://docs.databricks.com/sql/admin/alert-destinations.html
 */
public class Destination {
  /** ID of the alert destination. */
  @JsonProperty("id")
  private String id;

  /** Name of the alert destination. */
  @JsonProperty("name")
  private String name;

  /** Type of the alert destination. */
  @JsonProperty("type")
  private DestinationType typeValue;

  public Destination setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public Destination setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Destination setType(DestinationType typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public DestinationType getType() {
    return typeValue;
  }
}
