// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CleanRoomNotebookInfo {
  /** The base64 representation of the notebook content in HTML. */
  @JsonProperty("notebook_content")
  private String notebookContent;

  /** The name of the notebook. */
  @JsonProperty("notebook_name")
  private String notebookName;

  public CleanRoomNotebookInfo setNotebookContent(String notebookContent) {
    this.notebookContent = notebookContent;
    return this;
  }

  public String getNotebookContent() {
    return notebookContent;
  }

  public CleanRoomNotebookInfo setNotebookName(String notebookName) {
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
    CleanRoomNotebookInfo that = (CleanRoomNotebookInfo) o;
    return Objects.equals(notebookContent, that.notebookContent)
        && Objects.equals(notebookName, that.notebookName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notebookContent, notebookName);
  }

  @Override
  public String toString() {
    return new ToStringer(CleanRoomNotebookInfo.class)
        .add("notebookContent", notebookContent)
        .add("notebookName", notebookName)
        .toString();
  }
}
