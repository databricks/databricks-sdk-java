// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Identifies a dashboard widget whose data to attach. `page_id` and `widget_id` are the URL
 * identifiers from the dashboard's serialized definition returned by the Get dashboard API
 * (`serialized_dashboard`), and together they uniquely identify the widget.
 */
@Generated
public class SubscriptionAttachmentDataAttachmentWidget {
  /**
   * The URL identifier of the page containing the widget. This is the value of the `name` field of
   * the corresponding entry under `pages` in the serialized dashboard definition. Format:
   * alphanumeric, hyphen, and underscore characters allowed, max length 63.
   */
  @JsonProperty("page_id")
  private String pageId;

  /**
   * The URL identifier of the widget. This is the value of the `name` field of the corresponding
   * widget under that page's `layout` in the serialized dashboard definition. Format: alphanumeric,
   * hyphen, and underscore characters allowed, max length 63.
   */
  @JsonProperty("widget_id")
  private String widgetId;

  public SubscriptionAttachmentDataAttachmentWidget setPageId(String pageId) {
    this.pageId = pageId;
    return this;
  }

  public String getPageId() {
    return pageId;
  }

  public SubscriptionAttachmentDataAttachmentWidget setWidgetId(String widgetId) {
    this.widgetId = widgetId;
    return this;
  }

  public String getWidgetId() {
    return widgetId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionAttachmentDataAttachmentWidget that =
        (SubscriptionAttachmentDataAttachmentWidget) o;
    return Objects.equals(pageId, that.pageId) && Objects.equals(widgetId, that.widgetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageId, widgetId);
  }

  @Override
  public String toString() {
    return new ToStringer(SubscriptionAttachmentDataAttachmentWidget.class)
        .add("pageId", pageId)
        .add("widgetId", widgetId)
        .toString();
  }
}
