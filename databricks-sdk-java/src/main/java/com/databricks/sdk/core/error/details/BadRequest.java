package com.databricks.sdk.core.error.details;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.auto.value.AutoValue;
import java.util.List;

/**
 * BadRequest describes violations in a client request. This error type focuses on the syntactic
 * aspects of the request.
 *
 * <p>BadRequest errors occur when the request format, structure, or content does not meet the
 * service's requirements. This is different from business logic errors or system failures - it
 * specifically indicates that the client sent a malformed or invalid request.
 *
 * <p>Examples of bad request violations might include:
 *
 * <ul>
 *   <li>Missing required fields
 *   <li>Invalid field values (wrong type, format, or range)
 *   <li>Malformed JSON or XML
 *   <li>Unsupported field combinations
 *   <li>Invalid enum values
 *   <li>Field length or size violations
 * </ul>
 *
 * <p>This information helps clients:
 *
 * <ul>
 *   <li>Identify what's wrong with their request
 *   <li>Fix the request format before retrying
 *   <li>Understand the service's input requirements
 *   <li>Implement proper input validation
 * </ul>
 */
@AutoValue
@JsonDeserialize(builder = AutoValue_BadRequest.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class BadRequest {

  /**
   * Describes all field violations in the request.
   *
   * <p>This list contains details about each specific field or aspect of the request that violated
   * the service's requirements. Multiple violations can occur if the request has multiple problems.
   *
   * @return the list of field violations
   */
  @JsonProperty("field_violations")
  public abstract List<BadRequestFieldViolation> fieldViolations();

  /**
   * Creates a new builder for constructing BadRequest instances.
   *
   * @return a new builder instance
   */
  public static Builder builder() {
    return new AutoValue_BadRequest.Builder();
  }

  /** Builder for constructing BadRequest instances. */
  @AutoValue.Builder
  @JsonIgnoreProperties(ignoreUnknown = true)
  public abstract static class Builder {

    /**
     * Sets the field violations.
     *
     * @param fieldViolations the list of field violations
     * @return this builder for method chaining
     */
    @JsonProperty("field_violations")
    public abstract Builder fieldViolations(List<BadRequestFieldViolation> fieldViolations);

    /**
     * Builds the BadRequest instance.
     *
     * @return a new BadRequest instance
     */
    public abstract BadRequest build();
  }

  /**
   * BadRequestFieldViolation describes a specific field violation in a request.
   *
   * <p>Each violation provides details about what specific field or aspect of the request was
   * invalid and how the client can fix it.
   */
  @AutoValue
  @JsonDeserialize(builder = AutoValue_BadRequest_BadRequestFieldViolation.Builder.class)
  @JsonIgnoreProperties(ignoreUnknown = true)
  public abstract static class BadRequestFieldViolation {

    /**
     * A path leading to a field in the request body.
     *
     * <p>This field identifies the specific location of the violation within the request structure.
     * The path format depends on the request format but typically follows a hierarchical structure.
     *
     * <p>Examples of field paths:
     *
     * <ul>
     *   <li>"name" - top-level field
     *   <li>"user.email" - nested field
     *   <li>"items[0].id" - array element field
     *   <li>"metadata.api_key" - deeply nested field
     *   <li>"settings.notifications.enabled" - multi-level nested field
     * </ul>
     *
     * <p>This path helps clients quickly locate and fix the problematic field in their request.
     *
     * @return the path to the violating field
     */
    @JsonProperty("field")
    public abstract String field();

    /**
     * A description of why the request element is bad.
     *
     * <p>This field provides a human-readable explanation of what's wrong with the field and how to
     * fix it. The description should be clear enough for developers to understand and resolve the
     * issue.
     *
     * <p>Examples of field violation descriptions:
     *
     * <ul>
     *   <li>"Field is required and cannot be empty"
     *   <li>"Value must be a positive integer"
     *   <li>"Invalid email format"
     *   <li>"String length must be between 1 and 100 characters"
     *   <li>"Unsupported enum value. Must be one of: [A, B, C]"
     *   <li>"Field cannot contain special characters"
     *   <li>"Date must be in ISO 8601 format (YYYY-MM-DD)"
     * </ul>
     *
     * @return description of why the field is invalid
     */
    @JsonProperty("description")
    public abstract String description();

    /**
     * Creates a new builder for constructing BadRequestFieldViolation instances.
     *
     * @return a new builder instance
     */
    public static Builder builder() {
      return new AutoValue_BadRequest_BadRequestFieldViolation.Builder();
    }

    /** Builder for constructing BadRequestFieldViolation instances. */
    @AutoValue.Builder
    @JsonIgnoreProperties(ignoreUnknown = true)
    public abstract static class Builder {

      /**
       * Sets the field path.
       *
       * @param field the path to the violating field
       * @return this builder for method chaining
       */
      @JsonProperty("field")
      public abstract Builder field(String field);

      /**
       * Sets the violation description.
       *
       * @param description description of why the field is invalid
       * @return this builder for method chaining
       */
      @JsonProperty("description")
      public abstract Builder description(String description);

      /**
       * Builds the BadRequestFieldViolation instance.
       *
       * @return a new BadRequestFieldViolation instance
       */
      public abstract BadRequestFieldViolation build();
    }
  }
}
