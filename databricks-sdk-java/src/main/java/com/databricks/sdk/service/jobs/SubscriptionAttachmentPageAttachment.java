// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * The selection of dashboard pages included in the attached PDF. `page_selection` chooses between
 * all pages, the first page only, or an explicit subset listed in `page_ids`.
 */
@Generated
public class SubscriptionAttachmentPageAttachment {
  /**
   * The identifiers of the pages to include in the PDF. Only specified when `page_selection` is
   * `PAGE_SELECTION_SUBSET`. Each value is the identifier of a page in the dashboard's serialized
   * definition returned by the Get dashboard API (`serialized_dashboard`): the value of the `name`
   * field of an entry under `pages`. Format: alphanumeric, hyphen, and underscore characters
   * allowed, max length 63.
   */
  @JsonProperty("page_ids")
  private Collection<String> pageIds;

  /**
   * How the attached pages are selected. When set to `PAGE_SELECTION_SUBSET`, the pages to include
   * are listed in `page_ids`.
   */
  @JsonProperty("page_selection")
  private SubscriptionAttachmentPageAttachmentPageSelection pageSelection;

  public SubscriptionAttachmentPageAttachment setPageIds(Collection<String> pageIds) {
    this.pageIds = pageIds;
    return this;
  }

  public Collection<String> getPageIds() {
    return pageIds;
  }

  public SubscriptionAttachmentPageAttachment setPageSelection(
      SubscriptionAttachmentPageAttachmentPageSelection pageSelection) {
    this.pageSelection = pageSelection;
    return this;
  }

  public SubscriptionAttachmentPageAttachmentPageSelection getPageSelection() {
    return pageSelection;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionAttachmentPageAttachment that = (SubscriptionAttachmentPageAttachment) o;
    return Objects.equals(pageIds, that.pageIds)
        && Objects.equals(pageSelection, that.pageSelection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageIds, pageSelection);
  }

  @Override
  public String toString() {
    return new ToStringer(SubscriptionAttachmentPageAttachment.class)
        .add("pageIds", pageIds)
        .add("pageSelection", pageSelection)
        .toString();
  }
}
