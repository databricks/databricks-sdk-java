// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

@Generated
class CleanRoomsNotebookTaskPb {
  @JsonProperty("clean_room_name")
  private String cleanRoomName;

  @JsonProperty("etag")
  private String etag;

  @JsonProperty("notebook_base_parameters")
  private Map<String, String> notebookBaseParameters;

  @JsonProperty("notebook_name")
  private String notebookName;

  public CleanRoomsNotebookTaskPb setCleanRoomName(String cleanRoomName) {
    this.cleanRoomName = cleanRoomName;
    return this;
  }

  public String getCleanRoomName() {
    return cleanRoomName;
  }

  public CleanRoomsNotebookTaskPb setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public CleanRoomsNotebookTaskPb setNotebookBaseParameters(
      Map<String, String> notebookBaseParameters) {
    this.notebookBaseParameters = notebookBaseParameters;
    return this;
  }

  public Map<String, String> getNotebookBaseParameters() {
    return notebookBaseParameters;
  }

  public CleanRoomsNotebookTaskPb setNotebookName(String notebookName) {
    this.notebookName = notebookName;
    return this;
  }

  public String getNotebookName() {
    return notebookName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CleanRoomsNotebookTaskPb that = (CleanRoomsNotebookTaskPb) o;
    return Objects.equals(cleanRoomName, that.cleanRoomName)
        && Objects.equals(etag, that.etag)
        && Objects.equals(notebookBaseParameters, that.notebookBaseParameters)
        && Objects.equals(notebookName, that.notebookName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cleanRoomName, etag, notebookBaseParameters, notebookName);
  }

  @Override
  public String toString() {
    return new ToStringer(CleanRoomsNotebookTaskPb.class)
        .add("cleanRoomName", cleanRoomName)
        .add("etag", etag)
        .add("notebookBaseParameters", notebookBaseParameters)
        .add("notebookName", notebookName)
        .toString();
  }
}
