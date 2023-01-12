// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.scim;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * List users
 */
@Generated("databricks-sdk-generator")
public class ListUsersRequest {
    /**
     * Comma-separated list of attributes to return in response.
     */
    @QueryParam("attributes")
    private String attributes;
    
    /**
     * Desired number of results per page.
     */
    @QueryParam("count")
    private Long count;
    
    /**
     * Comma-separated list of attributes to exclude in response.
     */
    @QueryParam("excludedAttributes")
    private String excludedAttributes;
    
    /**
     * Query by which the results have to be filtered. Supported operators are
     * equals(`eq`), contains(`co`), starts with(`sw`) and not equals(`ne`).
     * Additionally, simple expressions can be formed using logical operators -
     * `and` and `or`. The [SCIM RFC] has more details but we currently only
     * support simple expressions.
     * 
     * [SCIM RFC]: https://tools.ietf.org/html/rfc7644#section-3.4.2.2
     */
    @QueryParam("filter")
    private String filter;
    
    /**
     * Attribute to sort the results. Multi-part paths are supported. For
     * example, `userName`, `name.givenName`, and `emails`.
     */
    @QueryParam("sortBy")
    private String sortBy;
    
    /**
     * The order to sort the results.
     */
    @QueryParam("sortOrder")
    private ListSortOrder sortOrder;
    
    /**
     * Specifies the index of the first result. First item is number 1.
     */
    @QueryParam("startIndex")
    private Long startIndex;
    
    public ListUsersRequest setAttributes(String attributes) {
        this.attributes = attributes;
        return this;
    }

    public String getAttributes() {
        return attributes;
    }
    
    public ListUsersRequest setCount(Long count) {
        this.count = count;
        return this;
    }

    public Long getCount() {
        return count;
    }
    
    public ListUsersRequest setExcludedAttributes(String excludedAttributes) {
        this.excludedAttributes = excludedAttributes;
        return this;
    }

    public String getExcludedAttributes() {
        return excludedAttributes;
    }
    
    public ListUsersRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }

    public String getFilter() {
        return filter;
    }
    
    public ListUsersRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    public String getSortBy() {
        return sortBy;
    }
    
    public ListUsersRequest setSortOrder(ListSortOrder sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    public ListSortOrder getSortOrder() {
        return sortOrder;
    }
    
    public ListUsersRequest setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }

    public Long getStartIndex() {
        return startIndex;
    }
    
}
