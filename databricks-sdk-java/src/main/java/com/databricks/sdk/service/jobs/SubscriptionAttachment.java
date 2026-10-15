// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * The configuration for the files attached to the dashboard snapshot notification sent to
 * subscribers. `data_attachment` describes the underlying data of dashboard widgets attached as
 * data files, and `page_attachment` describes which dashboard pages are included in the attached
 * PDF.
 */
@Generated
public class SubscriptionAttachment {
  /**
   * Optional: The configuration for the underlying data of dashboard widgets attached as tabular
   * data files. If not specified, no tabular data is attached.
   */
  @JsonProperty("data_attachment")
  private SubscriptionAttachmentDataAttachment dataAttachment;

  /**
   * Optional: The selection of dashboard pages included in the attached PDF. If not specified, only
   * the first page is included.
   */
  @JsonProperty("page_attachment")
  private SubscriptionAttachmentPageAttachment pageAttachment;

  public SubscriptionAttachment setDataAttachment(
      SubscriptionAttachmentDataAttachment dataAttachment) {
    this.dataAttachment = dataAttachment;
    return this;
  }

  public SubscriptionAttachmentDataAttachment getDataAttachment() {
    return dataAttachment;
  }

  public SubscriptionAttachment setPageAttachment(
      SubscriptionAttachmentPageAttachment pageAttachment) {
    this.pageAttachment = pageAttachment;
    return this;
  }

  public SubscriptionAttachmentPageAttachment getPageAttachment() {
    return pageAttachment;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionAttachment that = (SubscriptionAttachment) o;
    return Objects.equals(dataAttachment, that.dataAttachment)
        && Objects.equals(pageAttachment, that.pageAttachment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataAttachment, pageAttachment);
  }

  @Override
  public String toString() {
    return new ToStringer(SubscriptionAttachment.class)
        .add("dataAttachment", dataAttachment)
        .add("pageAttachment", pageAttachment)
        .toString();
  }
}
