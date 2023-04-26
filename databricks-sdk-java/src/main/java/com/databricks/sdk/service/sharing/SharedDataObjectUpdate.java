// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>SharedDataObjectUpdate class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class SharedDataObjectUpdate {
  /** One of: **ADD**, **REMOVE**, **UPDATE**. */
  @JsonProperty("action")
  private SharedDataObjectUpdateAction action;

  /** The data object that is being added, removed, or updated. */
  @JsonProperty("data_object")
  private SharedDataObject dataObject;

  /**
   * <p>Setter for the field <code>action</code>.</p>
   *
   * @param action a {@link com.databricks.sdk.service.sharing.SharedDataObjectUpdateAction} object
   * @return a {@link com.databricks.sdk.service.sharing.SharedDataObjectUpdate} object
   */
  public SharedDataObjectUpdate setAction(SharedDataObjectUpdateAction action) {
    this.action = action;
    return this;
  }

  /**
   * <p>Getter for the field <code>action</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sharing.SharedDataObjectUpdateAction} object
   */
  public SharedDataObjectUpdateAction getAction() {
    return action;
  }

  /**
   * <p>Setter for the field <code>dataObject</code>.</p>
   *
   * @param dataObject a {@link com.databricks.sdk.service.sharing.SharedDataObject} object
   * @return a {@link com.databricks.sdk.service.sharing.SharedDataObjectUpdate} object
   */
  public SharedDataObjectUpdate setDataObject(SharedDataObject dataObject) {
    this.dataObject = dataObject;
    return this;
  }

  /**
   * <p>Getter for the field <code>dataObject</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sharing.SharedDataObject} object
   */
  public SharedDataObject getDataObject() {
    return dataObject;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SharedDataObjectUpdate that = (SharedDataObjectUpdate) o;
    return Objects.equals(action, that.action) && Objects.equals(dataObject, that.dataObject);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(action, dataObject);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(SharedDataObjectUpdate.class)
        .add("action", action)
        .add("dataObject", dataObject)
        .toString();
  }
}
