// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.aifunctions;

import com.databricks.sdk.support.Generated;

/**
 * Transform and enrich data with AI on Databricks.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface AiFunctionsService {
  /**
   * Classifies content according to a set of provided labels. For REST API requests, the default
   * rate limit is 1,200 requests per minute per workspace. Contact your Databricks account team to
   * request a higher limit.
   */
  AiClassifyResponse aiClassify(AiClassifyRequest aiClassifyRequest);

  /**
   * Extracts structured data from text and documents according to a provided schema. For REST API
   * requests, the default rate limit is 120 requests per minute per workspace. Contact your
   * Databricks account team to request a higher limit.
   */
  AiExtractResponse aiExtract(AiExtractRequest aiExtractRequest);

  /**
   * Parse structured content from unstructured documents. For REST API requests, the default rate
   * limit is 120 pages per minute per workspace. Contact your Databricks account team to request a
   * higher limit.
   */
  AiParseDocumentResponse aiParseDocument(AiParseDocumentRequest aiParseDocumentRequest);
}
