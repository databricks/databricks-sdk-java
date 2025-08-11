package com.databricks.sdk.core.error.details;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.auto.value.AutoValue;
import java.util.List;

/**
 * DebugInfo describes additional debugging information.
 * 
 * <p>This class provides detailed information that can be used by developers
 * and support teams to understand what went wrong and where the error occurred.
 * The information is typically more technical and detailed than what would be
 * shown to end users.
 * 
 * <p>DebugInfo is particularly useful for:
 * <ul>
 *   <li>Development and testing environments</li>
 *   <li>Support ticket investigations</li>
 *   <li>System debugging and troubleshooting</li>
 *   <li>Understanding the root cause of errors</li>
 * </ul>
 */
@AutoValue
@JsonDeserialize(builder = AutoValue_DebugInfo.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class DebugInfo {

    /**
     * The stack trace entries indicating where the error occurred.
     * 
     * <p>This list contains the call stack at the time the error occurred,
     * typically starting from the most recent call and going backwards through
     * the call chain. Each entry usually represents a method call or function
     * invocation.
     * 
     * <p>Stack trace information is invaluable for:
     * <ul>
     *   <li>Identifying the exact location where an error occurred</li>
     *   <li>Understanding the execution path that led to the error</li>
     *   <li>Debugging complex error scenarios</li>
     *   <li>Providing context to support teams</li>
     * </ul>
     * 
     * @return the stack trace entries
     */
    @JsonProperty("stack_entries")
    public abstract List<String> stackEntries();

    /**
     * Additional debugging information provided by the server.
     * 
     * <p>This field can contain any additional context or details that the
     * server deems useful for debugging purposes. The exact content depends
     * on the service implementation and the specific error that occurred.
     * 
     * <p>Examples of additional debugging information might include:
     * <ul>
     *   <li>Internal error codes or identifiers</li>
     *   <li>System state information</li>
     *   <li>Configuration details</li>
     *   <li>Performance metrics</li>
     *   <li>Other diagnostic data</li>
     * </ul>
     * 
     * @return additional debugging information
     */
    @JsonProperty("detail")
    public abstract String detail();

    /**
     * Creates a new builder for constructing DebugInfo instances.
     * 
     * @return a new builder instance
     */
    public static Builder builder() {
        return new AutoValue_DebugInfo.Builder();
    }

    /**
     * Builder for constructing DebugInfo instances.
     */
    @AutoValue.Builder
    @JsonIgnoreProperties(ignoreUnknown = true)
    public abstract static class Builder {
        
        /**
         * Sets the stack trace entries.
         * 
         * @param stackEntries the stack trace entries
         * @return this builder for method chaining
         */
        @JsonProperty("stack_entries")
        public abstract Builder stackEntries(List<String> stackEntries);
        
        /**
         * Sets the additional debugging information.
         * 
         * @param detail additional debugging information
         * @return this builder for method chaining
         */
        @JsonProperty("detail")
        public abstract Builder detail(String detail);
        
        /**
         * Builds the DebugInfo instance.
         * 
         * @return a new DebugInfo instance
         */
        public abstract DebugInfo build();
    }
} 