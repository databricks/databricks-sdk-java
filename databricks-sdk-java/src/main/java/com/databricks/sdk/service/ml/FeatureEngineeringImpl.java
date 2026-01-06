// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.ml;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of FeatureEngineering */
@Generated
class FeatureEngineeringImpl implements FeatureEngineeringService {
  private final ApiClient apiClient;

  public FeatureEngineeringImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public BatchCreateMaterializedFeaturesResponse batchCreateMaterializedFeatures(
      BatchCreateMaterializedFeaturesRequest request) {
    String path = "/api/2.0/feature-engineering/materialized-features:batchCreate";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, BatchCreateMaterializedFeaturesResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Feature createFeature(CreateFeatureRequest request) {
    String path = "/api/2.0/feature-engineering/features";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getFeature()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, Feature.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public KafkaConfig createKafkaConfig(CreateKafkaConfigRequest request) {
    String path = "/api/2.0/feature-engineering/features/kafka-configs";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getKafkaConfig()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, KafkaConfig.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public MaterializedFeature createMaterializedFeature(CreateMaterializedFeatureRequest request) {
    String path = "/api/2.0/feature-engineering/materialized-features";
    try {
      Request req =
          new Request("POST", path, apiClient.serialize(request.getMaterializedFeature()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, MaterializedFeature.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void deleteFeature(DeleteFeatureRequest request) {
    String path = String.format("/api/2.0/feature-engineering/features/%s", request.getFullName());
    try {
      Request req = new Request("DELETE", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void deleteKafkaConfig(DeleteKafkaConfigRequest request) {
    String path =
        String.format(
            "/api/2.0/feature-engineering/features/kafka-configs/kafka/%s", request.getName());
    try {
      Request req = new Request("DELETE", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void deleteMaterializedFeature(DeleteMaterializedFeatureRequest request) {
    String path =
        String.format(
            "/api/2.0/feature-engineering/materialized-features/%s",
            request.getMaterializedFeatureId());
    try {
      Request req = new Request("DELETE", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Feature getFeature(GetFeatureRequest request) {
    String path = String.format("/api/2.0/feature-engineering/features/%s", request.getFullName());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, Feature.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public KafkaConfig getKafkaConfig(GetKafkaConfigRequest request) {
    String path =
        String.format("/api/2.0/feature-engineering/features/kafka-configs/%s", request.getName());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, KafkaConfig.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public MaterializedFeature getMaterializedFeature(GetMaterializedFeatureRequest request) {
    String path =
        String.format(
            "/api/2.0/feature-engineering/materialized-features/%s",
            request.getMaterializedFeatureId());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, MaterializedFeature.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListFeaturesResponse listFeatures(ListFeaturesRequest request) {
    String path = "/api/2.0/feature-engineering/features";
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListFeaturesResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListKafkaConfigsResponse listKafkaConfigs(ListKafkaConfigsRequest request) {
    String path = "/api/2.0/feature-engineering/features/kafka-configs";
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListKafkaConfigsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListMaterializedFeaturesResponse listMaterializedFeatures(
      ListMaterializedFeaturesRequest request) {
    String path = "/api/2.0/feature-engineering/materialized-features";
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListMaterializedFeaturesResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Feature updateFeature(UpdateFeatureRequest request) {
    String path = String.format("/api/2.0/feature-engineering/features/%s", request.getFullName());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request.getFeature()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, Feature.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public KafkaConfig updateKafkaConfig(UpdateKafkaConfigRequest request) {
    String path =
        String.format("/api/2.0/feature-engineering/features/kafka-configs/%s", request.getName());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request.getKafkaConfig()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, KafkaConfig.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public MaterializedFeature updateMaterializedFeature(UpdateMaterializedFeatureRequest request) {
    String path =
        String.format(
            "/api/2.0/feature-engineering/materialized-features/%s",
            request.getMaterializedFeatureId());
    try {
      Request req =
          new Request("PATCH", path, apiClient.serialize(request.getMaterializedFeature()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, MaterializedFeature.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
