// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * The configuration for the tabular data files attached to the dashboard snapshot. `widgets` lists
 * the widgets whose data is exported and `file_format` is the output format; each referenced
 * widget's data is exported as a separate file.
 */
@Generated
public class SubscriptionAttachmentDataAttachment {
  /** The file format of the exported tabular data files. */
  @JsonProperty("file_format")
  private SubscriptionAttachmentDataAttachmentFileFormat fileFormat;

  /**
   * When true, the dashboard's applied filter values are included alongside the tabular data as an
   * additional attached file.
   */
  @JsonProperty("include_applied_filters")
  private Boolean includeAppliedFilters;

  /** The widgets whose underlying data is exported. At least one widget must be referenced. */
  @JsonProperty("widgets")
  private Collection<SubscriptionAttachmentDataAttachmentWidget> widgets;

  public SubscriptionAttachmentDataAttachment setFileFormat(
      SubscriptionAttachmentDataAttachmentFileFormat fileFormat) {
    this.fileFormat = fileFormat;
    return this;
  }

  public SubscriptionAttachmentDataAttachmentFileFormat getFileFormat() {
    return fileFormat;
  }

  public SubscriptionAttachmentDataAttachment setIncludeAppliedFilters(
      Boolean includeAppliedFilters) {
    this.includeAppliedFilters = includeAppliedFilters;
    return this;
  }

  public Boolean getIncludeAppliedFilters() {
    return includeAppliedFilters;
  }

  public SubscriptionAttachmentDataAttachment setWidgets(
      Collection<SubscriptionAttachmentDataAttachmentWidget> widgets) {
    this.widgets = widgets;
    return this;
  }

  public Collection<SubscriptionAttachmentDataAttachmentWidget> getWidgets() {
    return widgets;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionAttachmentDataAttachment that = (SubscriptionAttachmentDataAttachment) o;
    return Objects.equals(fileFormat, that.fileFormat)
        && Objects.equals(includeAppliedFilters, that.includeAppliedFilters)
        && Objects.equals(widgets, that.widgets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileFormat, includeAppliedFilters, widgets);
  }

  @Override
  public String toString() {
    return new ToStringer(SubscriptionAttachmentDataAttachment.class)
        .add("fileFormat", fileFormat)
        .add("includeAppliedFilters", includeAppliedFilters)
        .add("widgets", widgets)
        .toString();
  }
}
