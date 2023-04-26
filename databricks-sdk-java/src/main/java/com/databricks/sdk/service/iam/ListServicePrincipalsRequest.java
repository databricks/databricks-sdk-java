// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * List service principals
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListServicePrincipalsRequest {
  /** Comma-separated list of attributes to return in response. */
  @QueryParam("attributes")
  private String attributes;

  /** Desired number of results per page. */
  @QueryParam("count")
  private Long count;

  /** Comma-separated list of attributes to exclude in response. */
  @QueryParam("excludedAttributes")
  private String excludedAttributes;

  /**
   * Query by which the results have to be filtered. Supported operators are equals(`eq`),
   * contains(`co`), starts with(`sw`) and not equals(`ne`). Additionally, simple expressions can be
   * formed using logical operators - `and` and `or`. The [SCIM RFC] has more details but we
   * currently only support simple expressions.
   *
   * <p>[SCIM RFC]: https://tools.ietf.org/html/rfc7644#section-3.4.2.2
   */
  @QueryParam("filter")
  private String filter;

  /** Attribute to sort the results. */
  @QueryParam("sortBy")
  private String sortBy;

  /** The order to sort the results. */
  @QueryParam("sortOrder")
  private ListSortOrder sortOrder;

  /** Specifies the index of the first result. First item is number 1. */
  @QueryParam("startIndex")
  private Long startIndex;

  /**
   * <p>Setter for the field <code>attributes</code>.</p>
   *
   * @param attributes a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.iam.ListServicePrincipalsRequest} object
   */
  public ListServicePrincipalsRequest setAttributes(String attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * <p>Getter for the field <code>attributes</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getAttributes() {
    return attributes;
  }

  /**
   * <p>Setter for the field <code>count</code>.</p>
   *
   * @param count a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.iam.ListServicePrincipalsRequest} object
   */
  public ListServicePrincipalsRequest setCount(Long count) {
    this.count = count;
    return this;
  }

  /**
   * <p>Getter for the field <code>count</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getCount() {
    return count;
  }

  /**
   * <p>Setter for the field <code>excludedAttributes</code>.</p>
   *
   * @param excludedAttributes a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.iam.ListServicePrincipalsRequest} object
   */
  public ListServicePrincipalsRequest setExcludedAttributes(String excludedAttributes) {
    this.excludedAttributes = excludedAttributes;
    return this;
  }

  /**
   * <p>Getter for the field <code>excludedAttributes</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getExcludedAttributes() {
    return excludedAttributes;
  }

  /**
   * <p>Setter for the field <code>filter</code>.</p>
   *
   * @param filter a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.iam.ListServicePrincipalsRequest} object
   */
  public ListServicePrincipalsRequest setFilter(String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * <p>Getter for the field <code>filter</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getFilter() {
    return filter;
  }

  /**
   * <p>Setter for the field <code>sortBy</code>.</p>
   *
   * @param sortBy a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.iam.ListServicePrincipalsRequest} object
   */
  public ListServicePrincipalsRequest setSortBy(String sortBy) {
    this.sortBy = sortBy;
    return this;
  }

  /**
   * <p>Getter for the field <code>sortBy</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getSortBy() {
    return sortBy;
  }

  /**
   * <p>Setter for the field <code>sortOrder</code>.</p>
   *
   * @param sortOrder a {@link com.databricks.sdk.service.iam.ListSortOrder} object
   * @return a {@link com.databricks.sdk.service.iam.ListServicePrincipalsRequest} object
   */
  public ListServicePrincipalsRequest setSortOrder(ListSortOrder sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

  /**
   * <p>Getter for the field <code>sortOrder</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.iam.ListSortOrder} object
   */
  public ListSortOrder getSortOrder() {
    return sortOrder;
  }

  /**
   * <p>Setter for the field <code>startIndex</code>.</p>
   *
   * @param startIndex a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.iam.ListServicePrincipalsRequest} object
   */
  public ListServicePrincipalsRequest setStartIndex(Long startIndex) {
    this.startIndex = startIndex;
    return this;
  }

  /**
   * <p>Getter for the field <code>startIndex</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getStartIndex() {
    return startIndex;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListServicePrincipalsRequest that = (ListServicePrincipalsRequest) o;
    return Objects.equals(attributes, that.attributes)
        && Objects.equals(count, that.count)
        && Objects.equals(excludedAttributes, that.excludedAttributes)
        && Objects.equals(filter, that.filter)
        && Objects.equals(sortBy, that.sortBy)
        && Objects.equals(sortOrder, that.sortOrder)
        && Objects.equals(startIndex, that.startIndex);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        attributes, count, excludedAttributes, filter, sortBy, sortOrder, startIndex);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListServicePrincipalsRequest.class)
        .add("attributes", attributes)
        .add("count", count)
        .add("excludedAttributes", excludedAttributes)
        .add("filter", filter)
        .add("sortBy", sortBy)
        .add("sortOrder", sortOrder)
        .add("startIndex", startIndex)
        .toString();
  }
}
