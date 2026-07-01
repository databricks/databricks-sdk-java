// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class DownloadMessageAttachmentVisualizationRequest {
  /**
   * The resource name of the attachment to render, in the format
   * `spaces/{space_id}/conversations/{conversation_id}/messages/{message_id}/attachments/{attachment_id}`.
   */
  @JsonIgnore private String name;

  public DownloadMessageAttachmentVisualizationRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DownloadMessageAttachmentVisualizationRequest that =
        (DownloadMessageAttachmentVisualizationRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(DownloadMessageAttachmentVisualizationRequest.class)
        .add("name", name)
        .toString();
  }
}
