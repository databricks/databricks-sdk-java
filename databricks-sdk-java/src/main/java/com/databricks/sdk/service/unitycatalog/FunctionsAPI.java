// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.client.ApiClient;
import java.util.Collection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Functions implement User-Defined Functions (UDFs) in Unity Catalog.
 *
 * <p>The function implementation can be any SQL expression or Query, and it can be invoked wherever
 * a table reference is allowed in a query. In Unity Catalog, a function resides at the same level
 * as a table, so it can be referenced with the form
 * __catalog_name__.__schema_name__.__function_name__.
 */
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

  public FunctionInfo create(
      String name,
      String catalogName,
      String schemaName,
      Collection<FunctionParameterInfo> inputParams,
      ColumnTypeName dataType,
      String fullDataType,
      Collection<FunctionParameterInfo> returnParams,
      CreateFunctionRoutineBody routineBody,
      String routineDefinition,
      Collection<Dependency> routineDependencies,
      CreateFunctionParameterStyle parameterStyle,
      boolean isDeterministic,
      CreateFunctionSqlDataAccess sqlDataAccess,
      boolean isNullCall,
      CreateFunctionSecurityType securityType,
      String specificName) {
    return create(
        new CreateFunction()
            .setName(name)
            .setCatalogName(catalogName)
            .setSchemaName(schemaName)
            .setInputParams(inputParams)
            .setDataType(dataType)
            .setFullDataType(fullDataType)
            .setReturnParams(returnParams)
            .setRoutineBody(routineBody)
            .setRoutineDefinition(routineDefinition)
            .setRoutineDependencies(routineDependencies)
            .setParameterStyle(parameterStyle)
            .setIsDeterministic(isDeterministic)
            .setSqlDataAccess(sqlDataAccess)
            .setIsNullCall(isNullCall)
            .setSecurityType(securityType)
            .setSpecificName(specificName));
  }

  /**
   * Create a function.
   *
   * <p>Creates a new function
   *
   * <p>The user must have the following permissions in order for the function to be created: -
   * **USE_CATALOG** on the function's parent catalog - **USE_SCHEMA** and **CREATE_FUNCTION** on
   * the function's parent schema
   */
  public FunctionInfo create(CreateFunction request) {
    return impl.create(request);
  }

  public void delete(String name) {
    delete(new DeleteFunctionRequest().setName(name));
  }

  /**
   * Delete a function.
   *
   * <p>Deletes the function that matches the supplied name. For the deletion to succeed, the user
   * must satisfy one of the following conditions: - Is the owner of the function's parent catalog -
   * Is the owner of the function's parent schema and have the **USE_CATALOG** privilege on its
   * parent catalog - Is the owner of the function itself and have both the **USE_CATALOG**
   * privilege on its parent catalog and the **USE_SCHEMA** privilege on its parent schema
   */
  public void delete(DeleteFunctionRequest request) {
    impl.delete(request);
  }

  public FunctionInfo get(String name) {
    return get(new GetFunctionRequest().setName(name));
  }

  /**
   * Get a function.
   *
   * <p>Gets a function from within a parent catalog and schema. For the fetch to succeed, the user
   * must satisfy one of the following requirements: - Is a metastore admin - Is an owner of the
   * function's parent catalog - Have the **USE_CATALOG** privilege on the function's parent catalog
   * and be the owner of the function - Have the **USE_CATALOG** privilege on the function's parent
   * catalog, the **USE_SCHEMA** privilege on the function's parent schema, and the **EXECUTE**
   * privilege on the function itself
   */
  public FunctionInfo get(GetFunctionRequest request) {
    return impl.get(request);
  }

  public ListFunctionsResponse list(String catalogName, String schemaName) {
    return list(new ListFunctionsRequest().setCatalogName(catalogName).setSchemaName(schemaName));
  }

  /**
   * List functions.
   *
   * <p>List functions within the specified parent catalog and schema. If the user is a metastore
   * admin, all functions are returned in the output list. Otherwise, the user must have the
   * **USE_CATALOG** privilege on the catalog and the **USE_SCHEMA** privilege on the schema, and
   * the output list contains only functions for which either the user has the **EXECUTE** privilege
   * or the user is the owner. There is no guarantee of a specific ordering of the elements in the
   * array.
   */
  public ListFunctionsResponse list(ListFunctionsRequest request) {
    return impl.list(request);
  }

  public FunctionInfo update(String name) {
    return update(new UpdateFunction().setName(name));
  }

  /**
   * Update a function.
   *
   * <p>Updates the function that matches the supplied name. Only the owner of the function can be
   * updated. If the user is not a metastore admin, the user must be a member of the group that is
   * the new function owner. - Is a metastore admin - Is the owner of the function's parent catalog
   * - Is the owner of the function's parent schema and has the **USE_CATALOG** privilege on its
   * parent catalog - Is the owner of the function itself and has the **USE_CATALOG** privilege on
   * its parent catalog as well as the **USE_SCHEMA** privilege on the function's parent schema.
   */
  public FunctionInfo update(UpdateFunction request) {
    return impl.update(request);
  }

  public FunctionsService impl() {
    return impl;
  }
}
