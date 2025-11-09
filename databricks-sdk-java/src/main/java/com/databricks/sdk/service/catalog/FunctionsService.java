// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;

/**
 * Functions implement User-Defined Functions (UDFs) in Unity Catalog.
 *
 * <p>The function implementation can be any SQL expression or Query, and it can be invoked wherever
 * a table reference is allowed in a query. In Unity Catalog, a function resides at the same level
 * as a table, so it can be referenced with the form
 * __catalog_name__.__schema_name__.__function_name__.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface FunctionsService {
  /**
   * **WARNING: This API is experimental and will change in future versions**
   *
   * <p>Creates a new function
   *
   * <p>The user must have the following permissions in order for the function to be created: -
   * **USE_CATALOG** on the function's parent catalog - **USE_SCHEMA** and **CREATE_FUNCTION** on
   * the function's parent schema
   */
  FunctionInfo create(CreateFunctionRequest createFunctionRequest);

  /**
   * Deletes the function that matches the supplied name. For the deletion to succeed, the user must
   * satisfy one of the following conditions: - Is the owner of the function's parent catalog - Is
   * the owner of the function's parent schema and have the **USE_CATALOG** privilege on its parent
   * catalog - Is the owner of the function itself and have both the **USE_CATALOG** privilege on
   * its parent catalog and the **USE_SCHEMA** privilege on its parent schema
   */
  void delete(DeleteFunctionRequest deleteFunctionRequest);

  /**
   * Gets a function from within a parent catalog and schema. For the fetch to succeed, the user
   * must satisfy one of the following requirements: - Is a metastore admin - Is an owner of the
   * function's parent catalog - Have the **USE_CATALOG** privilege on the function's parent catalog
   * and be the owner of the function - Have the **USE_CATALOG** privilege on the function's parent
   * catalog, the **USE_SCHEMA** privilege on the function's parent schema, and the **EXECUTE**
   * privilege on the function itself
   */
  FunctionInfo get(GetFunctionRequest getFunctionRequest);

  /**
   * List functions within the specified parent catalog and schema. If the user is a metastore
   * admin, all functions are returned in the output list. Otherwise, the user must have the
   * **USE_CATALOG** privilege on the catalog and the **USE_SCHEMA** privilege on the schema, and
   * the output list contains only functions for which either the user has the **EXECUTE** privilege
   * or the user is the owner. There is no guarantee of a specific ordering of the elements in the
   * array.
   *
   * <p>NOTE: we recommend using max_results=0 to use the paginated version of this API. Unpaginated
   * calls will be deprecated soon.
   *
   * <p>PAGINATION BEHAVIOR: When using pagination (max_results >= 0), a page may contain zero
   * results while still providing a next_page_token. Clients must continue reading pages until
   * next_page_token is absent, which is the only indication that the end of results has been
   * reached.
   */
  ListFunctionsResponse list(ListFunctionsRequest listFunctionsRequest);

  /**
   * Updates the function that matches the supplied name. Only the owner of the function can be
   * updated. If the user is not a metastore admin, the user must be a member of the group that is
   * the new function owner. - Is a metastore admin - Is the owner of the function's parent catalog
   * - Is the owner of the function's parent schema and has the **USE_CATALOG** privilege on its
   * parent catalog - Is the owner of the function itself and has the **USE_CATALOG** privilege on
   * its parent catalog as well as the **USE_SCHEMA** privilege on the function's parent schema.
   */
  FunctionInfo update(UpdateFunction updateFunction);
}
