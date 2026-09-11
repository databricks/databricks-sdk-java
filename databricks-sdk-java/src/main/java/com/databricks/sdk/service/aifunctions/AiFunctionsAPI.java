// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.aifunctions;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;

/** Transform and enrich data with AI on Databricks. */
@Generated
public class AiFunctionsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(AiFunctionsAPI.class);

  private final AiFunctionsService impl;

  /** Regular-use constructor */
  public AiFunctionsAPI(ApiClient apiClient) {
    impl = new AiFunctionsImpl(apiClient);
  }

  /** Constructor for mocks */
  public AiFunctionsAPI(AiFunctionsService mock) {
    impl = mock;
  }

  /**
   * Classifies content according to a set of provided labels. For REST API requests, the default
   * rate limit is 1,200 requests per minute per workspace. Contact your Databricks account team to
   * request a higher limit.
   */
  public AiClassifyResponse aiClassify(AiClassifyRequest request) {
    return impl.aiClassify(request);
  }

  /**
   * Extracts structured data from text and documents according to a provided schema. For REST API
   * requests, the default rate limit is 120 requests per minute per workspace. Contact your
   * Databricks account team to request a higher limit.
   */
  public AiExtractResponse aiExtract(AiExtractRequest request) {
    return impl.aiExtract(request);
  }

  /**
   * Parse structured content from unstructured documents. For REST API requests, the default rate
   * limit is 120 pages per minute per workspace. Contact your Databricks account team to request a
   * higher limit.
   */
  public AiParseDocumentResponse aiParseDocument(AiParseDocumentRequest request) {
    return impl.aiParseDocument(request);
  }

  public AiFunctionsService impl() {
    return impl;
  }
}
