package com.databricks.sdk.core.error.details;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.auto.value.AutoValue;
import java.util.List;

/**
 * QuotaFailure describes how a quota check failed.
 * 
 * <p>For example, if a daily limit was exceeded for the calling project,
 * a service could respond with a QuotaFailure detail containing the project
 * id and the description of the quota limit that was exceeded. If the
 * calling project hasn't enabled the service in the developer console, then
 * a service could respond with the project id and set {@code service_disabled}
 * to true.
 * 
 * <p>Also see {@link RetryInfo} and {@link Help} types for other details
 * about handling a quota failure.
 * 
 * <p>This information helps clients understand:
 * <ul>
 *   <li>What quota limits were exceeded</li>
 *   <li>How to resolve quota-related issues</li>
 *   <li>What actions they can take to continue</li>
 *   <li>Whether they need to contact support</li>
 * </ul>
 */
@AutoValue
@JsonDeserialize(builder = AutoValue_QuotaFailure.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class QuotaFailure {

    /**
     * Describes all quota violations.
     * 
     * <p>This list contains details about each specific quota violation that
     * occurred. Multiple violations can happen in a single request if multiple
     * quota limits are exceeded simultaneously.
     * 
     * @return the list of quota violations
     */
    @JsonProperty("violations")
    public abstract List<QuotaFailureViolation> violations();

    /**
     * Creates a new builder for constructing QuotaFailure instances.
     * 
     * @return a new builder instance
     */
    public static Builder builder() {
        return new AutoValue_QuotaFailure.Builder();
    }

    /**
     * Builder for constructing QuotaFailure instances.
     */
    @AutoValue.Builder
    @JsonIgnoreProperties(ignoreUnknown = true)
    public abstract static class Builder {
        
        /**
         * Sets the quota violations.
         * 
         * @param violations the list of quota violations
         * @return this builder for method chaining
         */
        @JsonProperty("violations")
        public abstract Builder violations(List<QuotaFailureViolation> violations);
        
        /**
         * Builds the QuotaFailure instance.
         * 
         * @return a new QuotaFailure instance
         */
        public abstract QuotaFailure build();
    }

    /**
     * QuotaFailureViolation describes a specific quota violation.
     * 
     * <p>Each violation provides details about what specific quota limit
     * was exceeded and how the client can resolve the issue.
     */
    @AutoValue
    @JsonDeserialize(builder = AutoValue_QuotaFailure_QuotaFailureViolation.Builder.class)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public abstract static class QuotaFailureViolation {

        /**
         * The subject on which the quota check failed.
         * 
         * <p>This typically identifies the specific resource, project, user,
         * or other entity that exceeded the quota limit. Examples might include:
         * <ul>
         *   <li>Project ID</li>
         *   <li>User ID</li>
         *   <li>Resource name</li>
         *   <li>Service identifier</li>
         * </ul>
         * 
         * @return the subject of the quota violation
         */
        @JsonProperty("subject")
        public abstract String subject();

        /**
         * A description of how the quota check failed. Clients can use this
         * description to find more about the quota configuration in the service's
         * public documentation, or find the relevant quota limit to adjust through
         * developer console.
         * 
         * <p>Examples of quota violation descriptions:
         * <ul>
         *   <li>"Service disabled"</li>
         *   <li>"Daily Limit for read operations exceeded"</li>
         *   <li>"Rate limit exceeded: 100 requests per minute"</li>
         *   <li>"Storage quota exceeded: 1GB limit"</li>
         * </ul>
         * 
         * @return description of the quota violation
         */
        @JsonProperty("description")
        public abstract String description();

        /**
         * Creates a new builder for constructing QuotaFailureViolation instances.
         * 
         * @return a new builder instance
         */
        public static Builder builder() {
            return new AutoValue_QuotaFailure_QuotaFailureViolation.Builder();
        }

        /**
         * Builder for constructing QuotaFailureViolation instances.
         */
        @AutoValue.Builder
        @JsonIgnoreProperties(ignoreUnknown = true)
        public abstract static class Builder {
            
            /**
             * Sets the subject of the quota violation.
             * 
             * @param subject the subject of the quota violation
             * @return this builder for method chaining
             */
            @JsonProperty("subject")
            public abstract Builder subject(String subject);
            
            /**
             * Sets the description of the quota violation.
             * 
             * @param description description of the quota violation
             * @return this builder for method chaining
             */
            @JsonProperty("description")
            public abstract Builder description(String description);
            
            /**
             * Builds the QuotaFailureViolation instance.
             * 
             * @return a new QuotaFailureViolation instance
             */
            public abstract QuotaFailureViolation build();
        }
    }
} 