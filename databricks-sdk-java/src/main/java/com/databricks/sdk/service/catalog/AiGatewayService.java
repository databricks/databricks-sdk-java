// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;

/**
 * Govern AI workloads in Unity Catalog. This API manages the Unity Catalog securables that bring
 * centralized access control, lineage, and auditing to AI-serving entities: model services
 * (governed access to foundation models and external LLMs), model provider services (governed
 * connections to external model providers), MCP services (governed Model Context Protocol servers),
 * and agent services (governed agents).
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface AiGatewayService {
  /**
   * Creates an MCP service in a Unity Catalog schema. An MCP (Model Context Protocol) service is a
   * governed securable that registers an MCP server and exposes its tools for discovery, access
   * control, and invocation. The caller supplies the leaf name in `mcp_service_id`.
   *
   * <p>You must be the owner of the parent schema or have the `CREATE_SERVICE` and `USE_SCHEMA`
   * privileges on the parent schema and `USE_CATALOG` on the parent catalog. You also need
   * `USE_CONNECTION` on the connection the MCP service references.
   */
  McpService createMcpService(CreateMcpServiceRequest createMcpServiceRequest);

  /**
   * Creates a model provider service in a Unity Catalog schema. A model provider service is a
   * governed connection to an external model provider (for example OpenAI, Azure OpenAI, or Amazon
   * Bedrock) that model services reference to invoke that provider. The caller supplies the leaf
   * name in `model_provider_service_id`.
   *
   * <p>You must be the owner of the parent schema or have the `CREATE_SERVICE` and `USE_SCHEMA`
   * privileges on the parent schema and `USE_CATALOG` on the parent catalog.
   */
  ModelProviderService createModelProviderService(
      CreateModelProviderServiceRequest createModelProviderServiceRequest);

  /**
   * Creates a model service in a Unity Catalog schema. A model service is a governed AI Gateway
   * endpoint that routes inference requests to one or more model destinations. The caller supplies
   * the leaf name in `model_service_id`.
   *
   * <p>You must be the owner of the parent schema or have the `CREATE_SERVICE` and `USE_SCHEMA`
   * privileges on the parent schema and `USE_CATALOG` on the parent catalog.
   */
  ModelService createModelService(CreateModelServiceRequest createModelServiceRequest);

  /**
   * Deletes the MCP service identified by its resource name. Optionally supply an `etag` to make
   * the delete conditional on the MCP service not having changed since it was read.
   *
   * <p>You must be the owner of the MCP service or have `MANAGE` on it, plus `USE_CATALOG` on the
   * parent catalog and `USE_SCHEMA` on the parent schema.
   */
  void deleteMcpService(DeleteMcpServiceRequest deleteMcpServiceRequest);

  /**
   * Deletes the model provider service identified by its resource name. Optionally supply an `etag`
   * to make the delete conditional on the model provider service not having changed since it was
   * read.
   *
   * <p>You must be the owner of the model provider service or have `MANAGE` on it, plus
   * `USE_CATALOG` on the parent catalog and `USE_SCHEMA` on the parent schema.
   */
  void deleteModelProviderService(
      DeleteModelProviderServiceRequest deleteModelProviderServiceRequest);

  /**
   * Deletes the model service identified by its resource name. Optionally supply an `etag` to make
   * the delete conditional on the model service not having changed since it was read.
   *
   * <p>You must be the owner of the model service or have `MANAGE` on it, plus `USE_CATALOG` on the
   * parent catalog and `USE_SCHEMA` on the parent schema.
   */
  void deleteModelService(DeleteModelServiceRequest deleteModelServiceRequest);

  /**
   * Returns the MCP service identified by its resource name.
   *
   * <p>You must be the owner of the MCP service or have `EXECUTE`, `READ_METADATA`, or `MANAGE` on
   * it, plus `USE_CATALOG` on the parent catalog and `USE_SCHEMA` on the parent schema.
   */
  McpService getMcpService(GetMcpServiceRequest getMcpServiceRequest);

  /**
   * Returns the model provider service identified by its resource name.
   *
   * <p>You must be the owner of the model provider service or have `EXECUTE`, `READ_METADATA`, or
   * `MANAGE` on it, plus `USE_CATALOG` on the parent catalog and `USE_SCHEMA` on the parent schema.
   */
  ModelProviderService getModelProviderService(
      GetModelProviderServiceRequest getModelProviderServiceRequest);

  /**
   * Returns the model service identified by its resource name.
   *
   * <p>You must be the owner of the model service or have `EXECUTE`, `READ_METADATA`, or `MANAGE`
   * on it, plus `USE_CATALOG` on the parent catalog and `USE_SCHEMA` on the parent schema.
   */
  ModelService getModelService(GetModelServiceRequest getModelServiceRequest);

  /**
   * Lists the MCP services in a Unity Catalog schema. Provide `parent` as
   * `schemas/{catalog}.{schema}`. Results are paginated; pass the returned `next_page_token` to
   * fetch subsequent pages.
   *
   * <p>Requires `USE_CATALOG` on the parent catalog and `USE_SCHEMA` on the parent schema. Only MCP
   * services the caller can access (as owner or through `EXECUTE`, `READ_METADATA`, or `MANAGE`)
   * are returned.
   */
  ListMcpServicesResponse listMcpServices(ListMcpServicesRequest listMcpServicesRequest);

  /**
   * Lists the model provider services in a Unity Catalog schema. Provide `parent` as
   * `schemas/{catalog}.{schema}`. Results are paginated; pass the returned `next_page_token` to
   * fetch subsequent pages.
   *
   * <p>Requires `USE_CATALOG` on the parent catalog and `USE_SCHEMA` on the parent schema. Only
   * model provider services the caller can access (as owner or through `EXECUTE`, `READ_METADATA`,
   * or `MANAGE`) are returned.
   */
  ListModelProviderServicesResponse listModelProviderServices(
      ListModelProviderServicesRequest listModelProviderServicesRequest);

  /**
   * Lists the model services in a Unity Catalog schema. Provide `parent` as
   * `schemas/{catalog}.{schema}`. Results are paginated; pass the returned `next_page_token` to
   * fetch subsequent pages.
   *
   * <p>Requires `USE_CATALOG` on the parent catalog and `USE_SCHEMA` on the parent schema. Only
   * model services the caller can access (as owner or through `EXECUTE`, `READ_METADATA`, or
   * `MANAGE`) are returned.
   */
  ListModelServicesResponse listModelServices(ListModelServicesRequest listModelServicesRequest);

  /**
   * Updates an MCP service. Only the fields named in `update_mask` are changed; the resource name
   * is immutable. Optionally supply an `etag` to make the update conditional on the MCP service not
   * having changed since it was read.
   *
   * <p>You must be the owner of the MCP service or have `MANAGE` on it, plus `USE_CATALOG` on the
   * parent catalog and `USE_SCHEMA` on the parent schema.
   */
  McpService updateMcpService(UpdateMcpServiceRequest updateMcpServiceRequest);

  /**
   * Updates a model provider service. Only the fields named in `update_mask` are changed; the
   * resource name and provider type are immutable. Optionally supply an `etag` to make the update
   * conditional on the model provider service not having changed since it was read.
   *
   * <p>You must be the owner of the model provider service or have `MANAGE` on it, plus
   * `USE_CATALOG` on the parent catalog and `USE_SCHEMA` on the parent schema.
   */
  ModelProviderService updateModelProviderService(
      UpdateModelProviderServiceRequest updateModelProviderServiceRequest);

  /**
   * Updates a model service. Only the fields named in `update_mask` are changed; the resource name
   * is immutable. Optionally supply an `etag` to make the update conditional on the model service
   * not having changed since it was read.
   *
   * <p>You must be the owner of the model service or have `MANAGE` on it, plus `USE_CATALOG` on the
   * parent catalog and `USE_SCHEMA` on the parent schema.
   */
  ModelService updateModelService(UpdateModelServiceRequest updateModelServiceRequest);
}
