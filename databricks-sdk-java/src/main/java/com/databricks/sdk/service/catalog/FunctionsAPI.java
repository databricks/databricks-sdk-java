// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;

/**
 * Functions implement User-Defined Functions (UDFs) in Unity Catalog.
 *
 * <p>The function implementation can be any SQL expression or Query, and it can be invoked wherever
 * a table reference is allowed in a query. In Unity Catalog, a function resides at the same level
 * as a table, so it can be referenced with the form
 * <b>catalog_name</b>.<b>schema_name</b>.<b>function_name</b>.
 */
@Generated
public class FunctionsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(FunctionsAPI.class);

  private final FunctionsService impl;

  /** Regular-use constructor */
  public FunctionsAPI(ApiClient apiClient) {
    impl = new FunctionsImpl(apiClient);
  }

  /** Constructor for mocks */
  public FunctionsAPI(FunctionsService mock) {
    impl = mock;
  }

  /**
   * <b>WARNING: This API is experimental and will change in future versions</b>
   *
   * <p>Creates a new function
   *
   * <p>The user must have the following permissions in order for the function to be created:
   *
   * <ul>
   *   <li><b>USE_CATALOG</b> on the function's parent catalog
   *   <li><b>USE_SCHEMA</b> and <b>CREATE_FUNCTION</b> on the function's parent schema
   * </ul>
   */
  public FunctionInfo create(CreateFunctionRequest request) {
    return impl.create(request);
  }

  public void delete(String name) {
    delete(new DeleteFunctionRequest().setName(name));
  }

  /**
   * Deletes the function that matches the supplied name. For the deletion to succeed, the user must
   * satisfy one of the following conditions:
   *
   * <ul>
   *   <li>Is the owner of the function's parent catalog
   *   <li>Is the owner of the function's parent schema and have the <b>USE_CATALOG</b> privilege on
   *       its parent catalog
   *   <li>Is the owner of the function itself and have both the <b>USE_CATALOG</b> privilege on its
   *       parent catalog and the <b>USE_SCHEMA</b> privilege on its parent schema
   * </ul>
   */
  public void delete(DeleteFunctionRequest request) {
    impl.delete(request);
  }

  public FunctionInfo get(String name) {
    return get(new GetFunctionRequest().setName(name));
  }

  /**
   * Gets a function from within a parent catalog and schema. For the fetch to succeed, the user
   * must satisfy one of the following requirements:
   *
   * <ul>
   *   <li>Is a metastore admin
   *   <li>Is an owner of the function's parent catalog
   *   <li>Have the <b>USE_CATALOG</b> privilege on the function's parent catalog and be the owner
   *       of the function
   *   <li>Have the <b>USE_CATALOG</b> privilege on the function's parent catalog, the
   *       <b>USE_SCHEMA</b> privilege on the function's parent schema, and the <b>EXECUTE</b>
   *       privilege on the function itself
   * </ul>
   */
  public FunctionInfo get(GetFunctionRequest request) {
    return impl.get(request);
  }

  public Iterable<FunctionInfo> list(String catalogName, String schemaName) {
    return list(new ListFunctionsRequest().setCatalogName(catalogName).setSchemaName(schemaName));
  }

  /**
   * List functions within the specified parent catalog and schema. If the user is a metastore
   * admin, all functions are returned in the output list. Otherwise, the user must have the
   * <b>USE_CATALOG</b> privilege on the catalog and the <b>USE_SCHEMA</b> privilege on the schema,
   * and the output list contains only functions for which either the user has the <b>EXECUTE</b>
   * privilege or the user is the owner. There is no guarantee of a specific ordering of the
   * elements in the array.
   *
   * <p>NOTE: we recommend using max_results=0 to use the paginated version of this API. Unpaginated
   * calls will be deprecated soon.
   *
   * <p>PAGINATION BEHAVIOR: When using pagination (max_results &gt;= 0), a page may contain zero
   * results while still providing a next_page_token. Clients must continue reading pages until
   * next_page_token is absent, which is the only indication that the end of results has been
   * reached.
   */
  public Iterable<FunctionInfo> list(ListFunctionsRequest request) {

    if (request.getMaxResults() == null) {
      request.setMaxResults(0L);
    }
    return Paginator.newTokenPagination(
        request,
        impl::list,
        ListFunctionsResponse::getFunctions,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /**
   * Updates the function that matches the supplied name. Only the owner of the function can be
   * updated. If the user is not a metastore admin, the user must be a member of the group that is
   * the new function owner.
   *
   * <ul>
   *   <li>Is a metastore admin
   *   <li>Is the owner of the function's parent catalog
   *   <li>Is the owner of the function's parent schema and has the <b>USE_CATALOG</b> privilege on
   *       its parent catalog
   *   <li>Is the owner of the function itself and has the <b>USE_CATALOG</b> privilege on its
   *       parent catalog as well as the <b>USE_SCHEMA</b> privilege on the function's parent
   *       schema.
   * </ul>
   */
  public FunctionInfo update(UpdateFunction request) {
    return impl.update(request);
  }

  public FunctionsService impl() {
    return impl;
  }
}
