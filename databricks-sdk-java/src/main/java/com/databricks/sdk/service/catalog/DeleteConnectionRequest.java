// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Delete a connection */
@Generated
public class DeleteConnectionRequest {
  /** The name of the connection to be deleted. */
  private String nameArg;

  public DeleteConnectionRequest setNameArg(String nameArg) {
    this.nameArg = nameArg;
    return this;
  }

  public String getNameArg() {
    return nameArg;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteConnectionRequest that = (DeleteConnectionRequest) o;
    return Objects.equals(nameArg, that.nameArg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nameArg);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteConnectionRequest.class).add("nameArg", nameArg).toString();
  }
}
