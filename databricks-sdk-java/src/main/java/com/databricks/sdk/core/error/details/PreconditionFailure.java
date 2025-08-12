package com.databricks.sdk.core.error.details;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.auto.value.AutoValue;
import java.util.List;

/**
 * PreconditionFailure describes what preconditions have failed.
 *
 * <p>This error type indicates that one or more conditions that must be met before a request can be
 * processed have not been satisfied. Preconditions are typically business logic rules or system
 * state requirements that must be true for the operation to succeed.
 *
 * <p>Examples of precondition failures might include:
 *
 * <ul>
 *   <li>Terms of service not accepted
 *   <li>Required configuration not set
 *   <li>System not in the correct state
 *   <li>Required permissions not granted
 *   <li>Dependencies not satisfied
 * </ul>
 *
 * <p>This information helps clients understand:
 *
 * <ul>
 *   <li>What conditions need to be met
 *   <li>How to resolve the precondition issues
 *   <li>What actions they need to take
 *   <li>Whether the issue is resolvable by the client
 * </ul>
 */
@AutoValue
@JsonDeserialize(builder = AutoValue_PreconditionFailure.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class PreconditionFailure {

  /**
   * Describes all precondition violations.
   *
   * <p>This list contains details about each specific precondition that failed. Multiple violations
   * can occur if multiple preconditions are not met simultaneously.
   *
   * @return the list of precondition violations
   */
  @JsonProperty("violations")
  public abstract List<PreconditionFailureViolation> violations();

  /**
   * Creates a new builder for constructing PreconditionFailure instances.
   *
   * @return a new builder instance
   */
  public static Builder builder() {
    return new AutoValue_PreconditionFailure.Builder();
  }

  /** Builder for constructing PreconditionFailure instances. */
  @AutoValue.Builder
  @JsonIgnoreProperties(ignoreUnknown = true)
  public abstract static class Builder {

    /**
     * Sets the precondition violations.
     *
     * @param violations the list of precondition violations
     * @return this builder for method chaining
     */
    @JsonProperty("violations")
    public abstract Builder setViolations(List<PreconditionFailureViolation> violations);

    /**
     * Builds the PreconditionFailure instance.
     *
     * @return a new PreconditionFailure instance
     */
    public abstract PreconditionFailure build();
  }

  /**
   * PreconditionFailureViolation describes a specific precondition violation.
   *
   * <p>Each violation provides details about what specific precondition failed and how the client
   * can resolve the issue.
   */
  @AutoValue
  @JsonDeserialize(
      builder = AutoValue_PreconditionFailure_PreconditionFailureViolation.Builder.class)
  @JsonIgnoreProperties(ignoreUnknown = true)
  public abstract static class PreconditionFailureViolation {

    /**
     * The type of PreconditionFailure.
     *
     * <p>This field categorizes the type of precondition that failed. Examples might include:
     *
     * <ul>
     *   <li>"TERMS_OF_SERVICE"
     *   <li>"CONFIGURATION"
     *   <li>"SYSTEM_STATE"
     *   <li>"PERMISSIONS"
     *   <li>"DEPENDENCIES"
     * </ul>
     *
     * @return the type of precondition failure
     */
    @JsonProperty("type")
    public abstract String type();

    /**
     * The subject, relative to the type, that failed.
     *
     * <p>This field identifies the specific entity or resource that failed the precondition check.
     * The interpretation depends on the type of precondition failure.
     *
     * <p>Examples:
     *
     * <ul>
     *   <li>For "TERMS_OF_SERVICE" type: user ID or account identifier
     *   <li>For "CONFIGURATION" type: configuration key or setting name
     *   <li>For "PERMISSIONS" type: resource name or permission scope
     *   <li>For "DEPENDENCIES" type: service name or component identifier
     * </ul>
     *
     * @return the subject of the precondition failure
     */
    @JsonProperty("subject")
    public abstract String subject();

    /**
     * A description of how the precondition failed. Developers can use this description to
     * understand how to fix the failure.
     *
     * <p>Examples of precondition failure descriptions:
     *
     * <ul>
     *   <li>"Terms of service not accepted"
     *   <li>"Required configuration 'api_key' not set"
     *   <li>"System is currently in maintenance mode"
     *   <li>"Insufficient permissions to access resource"
     *   <li>"Required service 'authentication' is not available"
     * </ul>
     *
     * @return description of the precondition failure
     */
    @JsonProperty("description")
    public abstract String description();

    /**
     * Creates a new builder for constructing PreconditionFailureViolation instances.
     *
     * @return a new builder instance
     */
    public static Builder builder() {
      return new AutoValue_PreconditionFailure_PreconditionFailureViolation.Builder();
    }

    /** Builder for constructing PreconditionFailureViolation instances. */
    @AutoValue.Builder
    @JsonIgnoreProperties(ignoreUnknown = true)
    public abstract static class Builder {

      /**
       * Sets the type of precondition failure.
       *
       * @param type the type of precondition failure
       * @return this builder for method chaining
       */
      @JsonProperty("type")
      public abstract Builder setType(String type);

      /**
       * Sets the subject of the precondition failure.
       *
       * @param subject the subject of the precondition failure
       * @return this builder for method chaining
       */
      @JsonProperty("subject")
      public abstract Builder setSubject(String subject);

      /**
       * Sets the description of the precondition failure.
       *
       * @param description description of the precondition failure
       * @return this builder for method chaining
       */
      @JsonProperty("description")
      public abstract Builder setDescription(String description);

      /**
       * Builds the PreconditionFailureViolation instance.
       *
       * @return a new PreconditionFailureViolation instance
       */
      public abstract PreconditionFailureViolation build();
    }
  }
}
