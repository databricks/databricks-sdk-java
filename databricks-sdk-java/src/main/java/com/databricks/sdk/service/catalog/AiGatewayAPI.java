// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;

/**
 * Govern AI workloads in Unity Catalog. This API manages the Unity Catalog securables that bring
 * centralized access control, lineage, and auditing to AI-serving entities: model services
 * (governed access to foundation models and external LLMs), model provider services (governed
 * connections to external model providers), and MCP services (governed Model Context Protocol
 * servers).
 */
@Generated
public class AiGatewayAPI {
  private static final Logger LOG = LoggerFactory.getLogger(AiGatewayAPI.class);

  private final AiGatewayService impl;

  /** Regular-use constructor */
  public AiGatewayAPI(ApiClient apiClient) {
    impl = new AiGatewayImpl(apiClient);
  }

  /** Constructor for mocks */
  public AiGatewayAPI(AiGatewayService mock) {
    impl = mock;
  }

  /**
   * Creates an MCP service in a Unity Catalog schema. An MCP (Model Context Protocol) service is a
   * governed securable that registers an MCP server and exposes its tools for discovery, access
   * control, and invocation. The caller supplies the leaf name in `mcp_service_id`.
   *
   * <p>You must be the owner of the parent schema or have the `CREATE_SERVICE` and `USE_SCHEMA`
   * privileges on the parent schema and `USE_CATALOG` on the parent catalog. You also need
   * `USE_CONNECTION` on the connection the MCP service references.
   */
  public McpService createMcpService(CreateMcpServiceRequest request) {
    return impl.createMcpService(request);
  }

  /**
   * Creates a model provider service in a Unity Catalog schema. A model provider service is a
   * governed connection to an external model provider (for example OpenAI, Azure OpenAI, or Amazon
   * Bedrock) that model services reference to invoke that provider. The caller supplies the leaf
   * name in `model_provider_service_id`.
   *
   * <p>You must be the owner of the parent schema or have the `CREATE_SERVICE` and `USE_SCHEMA`
   * privileges on the parent schema and `USE_CATALOG` on the parent catalog.
   */
  public ModelProviderService createModelProviderService(
      CreateModelProviderServiceRequest request) {
    return impl.createModelProviderService(request);
  }

  /**
   * Creates a model service in a Unity Catalog schema. A model service is a governed AI Gateway
   * endpoint that routes inference requests to one or more model destinations. The caller supplies
   * the leaf name in `model_service_id`.
   *
   * <p>You must be the owner of the parent schema or have the `CREATE_SERVICE` and `USE_SCHEMA`
   * privileges on the parent schema and `USE_CATALOG` on the parent catalog.
   */
  public ModelService createModelService(CreateModelServiceRequest request) {
    return impl.createModelService(request);
  }

  public void deleteMcpService(String name) {
    deleteMcpService(new DeleteMcpServiceRequest().setName(name));
  }

  /**
   * Deletes the MCP service identified by its resource name. Optionally supply an `etag` to make
   * the delete conditional on the MCP service not having changed since it was read.
   *
   * <p>You must be the owner of the MCP service or have `MANAGE` on it, plus `USE_CATALOG` on the
   * parent catalog and `USE_SCHEMA` on the parent schema.
   */
  public void deleteMcpService(DeleteMcpServiceRequest request) {
    impl.deleteMcpService(request);
  }

  public void deleteModelProviderService(String name) {
    deleteModelProviderService(new DeleteModelProviderServiceRequest().setName(name));
  }

  /**
   * Deletes the model provider service identified by its resource name. Optionally supply an `etag`
   * to make the delete conditional on the model provider service not having changed since it was
   * read.
   *
   * <p>You must be the owner of the model provider service or have `MANAGE` on it, plus
   * `USE_CATALOG` on the parent catalog and `USE_SCHEMA` on the parent schema.
   */
  public void deleteModelProviderService(DeleteModelProviderServiceRequest request) {
    impl.deleteModelProviderService(request);
  }

  public void deleteModelService(String name) {
    deleteModelService(new DeleteModelServiceRequest().setName(name));
  }

  /**
   * Deletes the model service identified by its resource name. Optionally supply an `etag` to make
   * the delete conditional on the model service not having changed since it was read.
   *
   * <p>You must be the owner of the model service or have `MANAGE` on it, plus `USE_CATALOG` on the
   * parent catalog and `USE_SCHEMA` on the parent schema.
   */
  public void deleteModelService(DeleteModelServiceRequest request) {
    impl.deleteModelService(request);
  }

  public McpService getMcpService(String name) {
    return getMcpService(new GetMcpServiceRequest().setName(name));
  }

  /**
   * Returns the MCP service identified by its resource name.
   *
   * <p>You must be the owner of the MCP service or have `EXECUTE`, `READ_METADATA`, or `MANAGE` on
   * it, plus `USE_CATALOG` on the parent catalog and `USE_SCHEMA` on the parent schema.
   */
  public McpService getMcpService(GetMcpServiceRequest request) {
    return impl.getMcpService(request);
  }

  public ModelProviderService getModelProviderService(String name) {
    return getModelProviderService(new GetModelProviderServiceRequest().setName(name));
  }

  /**
   * Returns the model provider service identified by its resource name.
   *
   * <p>You must be the owner of the model provider service or have `EXECUTE`, `READ_METADATA`, or
   * `MANAGE` on it, plus `USE_CATALOG` on the parent catalog and `USE_SCHEMA` on the parent schema.
   */
  public ModelProviderService getModelProviderService(GetModelProviderServiceRequest request) {
    return impl.getModelProviderService(request);
  }

  public ModelService getModelService(String name) {
    return getModelService(new GetModelServiceRequest().setName(name));
  }

  /**
   * Returns the model service identified by its resource name.
   *
   * <p>You must be the owner of the model service or have `EXECUTE`, `READ_METADATA`, or `MANAGE`
   * on it, plus `USE_CATALOG` on the parent catalog and `USE_SCHEMA` on the parent schema.
   */
  public ModelService getModelService(GetModelServiceRequest request) {
    return impl.getModelService(request);
  }

  /**
   * Lists the MCP services in a Unity Catalog schema. Provide `parent` as
   * `schemas/{catalog}.{schema}`. Results are paginated; pass the returned `next_page_token` to
   * fetch subsequent pages.
   *
   * <p>Requires `USE_CATALOG` on the parent catalog and `USE_SCHEMA` on the parent schema. Only MCP
   * services the caller can access (as owner or through `EXECUTE`, `READ_METADATA`, or `MANAGE`)
   * are returned.
   */
  public Iterable<McpService> listMcpServices(ListMcpServicesRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::listMcpServices,
        ListMcpServicesResponse::getMcpServices,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /**
   * Lists the model provider services in a Unity Catalog schema. Provide `parent` as
   * `schemas/{catalog}.{schema}`. Results are paginated; pass the returned `next_page_token` to
   * fetch subsequent pages.
   *
   * <p>Requires `USE_CATALOG` on the parent catalog and `USE_SCHEMA` on the parent schema. Only
   * model provider services the caller can access (as owner or through `EXECUTE`, `READ_METADATA`,
   * or `MANAGE`) are returned.
   */
  public Iterable<ModelProviderService> listModelProviderServices(
      ListModelProviderServicesRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::listModelProviderServices,
        ListModelProviderServicesResponse::getModelProviderServices,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /**
   * Lists the model services in a Unity Catalog schema. Provide `parent` as
   * `schemas/{catalog}.{schema}`. Results are paginated; pass the returned `next_page_token` to
   * fetch subsequent pages.
   *
   * <p>Requires `USE_CATALOG` on the parent catalog and `USE_SCHEMA` on the parent schema. Only
   * model services the caller can access (as owner or through `EXECUTE`, `READ_METADATA`, or
   * `MANAGE`) are returned.
   */
  public Iterable<ModelService> listModelServices(ListModelServicesRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::listModelServices,
        ListModelServicesResponse::getModelServices,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /**
   * Updates an MCP service. Only the fields named in `update_mask` are changed; the resource name
   * is immutable. Optionally supply an `etag` to make the update conditional on the MCP service not
   * having changed since it was read.
   *
   * <p>You must be the owner of the MCP service or have `MANAGE` on it, plus `USE_CATALOG` on the
   * parent catalog and `USE_SCHEMA` on the parent schema.
   */
  public McpService updateMcpService(UpdateMcpServiceRequest request) {
    return impl.updateMcpService(request);
  }

  /**
   * Updates a model provider service. Only the fields named in `update_mask` are changed; the
   * resource name and provider type are immutable. Optionally supply an `etag` to make the update
   * conditional on the model provider service not having changed since it was read.
   *
   * <p>You must be the owner of the model provider service or have `MANAGE` on it, plus
   * `USE_CATALOG` on the parent catalog and `USE_SCHEMA` on the parent schema.
   */
  public ModelProviderService updateModelProviderService(
      UpdateModelProviderServiceRequest request) {
    return impl.updateModelProviderService(request);
  }

  /**
   * Updates a model service. Only the fields named in `update_mask` are changed; the resource name
   * is immutable. Optionally supply an `etag` to make the update conditional on the model service
   * not having changed since it was read.
   *
   * <p>You must be the owner of the model service or have `MANAGE` on it, plus `USE_CATALOG` on the
   * parent catalog and `USE_SCHEMA` on the parent schema.
   */
  public ModelService updateModelService(UpdateModelServiceRequest request) {
    return impl.updateModelService(request);
  }

  public AiGatewayService impl() {
    return impl;
  }
}
