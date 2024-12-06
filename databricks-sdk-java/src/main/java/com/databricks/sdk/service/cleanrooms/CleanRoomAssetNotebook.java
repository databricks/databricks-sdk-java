// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CleanRoomAssetNotebook {
  /** Server generated checksum that represents the notebook version. */
  @JsonProperty("etag")
  private String etag;

  /**
   * Base 64 representation of the notebook contents. This is the same format as returned by
   * :method:workspace/export with the format of **HTML**.
   */
  @JsonProperty("notebook_content")
  private String notebookContent;

  public CleanRoomAssetNotebook setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public CleanRoomAssetNotebook setNotebookContent(String notebookContent) {
    this.notebookContent = notebookContent;
    return this;
  }

  public String getNotebookContent() {
    return notebookContent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CleanRoomAssetNotebook that = (CleanRoomAssetNotebook) o;
    return Objects.equals(etag, that.etag) && Objects.equals(notebookContent, that.notebookContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, notebookContent);
  }

  @Override
  public String toString() {
    return new ToStringer(CleanRoomAssetNotebook.class)
        .add("etag", etag)
        .add("notebookContent", notebookContent)
        .toString();
  }
}
