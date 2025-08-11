package com.databricks.sdk.core.error.details;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.auto.value.AutoValue;
import java.util.List;

/**
 * Help provides links to documentation or for performing an out of band action.
 * 
 * <p>For example, if a quota check failed with an error indicating the calling
 * project hasn't enabled the accessed service, this can contain a URL pointing
 * directly to the right place in the developer console to flip the bit.
 * 
 * <p>Help information is particularly useful for:
 * <ul>
 *   <li>Guiding users to self-service solutions</li>
 *   <li>Providing context-specific documentation</li>
 *   <li>Offering actionable steps to resolve issues</li>
 *   <li>Reducing support ticket volume</li>
 *   <li>Improving user experience during error scenarios</li>
 * </ul>
 * 
 * <p>This type of error detail helps transform error responses from simple
 * failure notifications into actionable guidance that users can follow to
 * resolve their issues.
 */
@AutoValue
@JsonDeserialize(builder = AutoValue_Help.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class Help {

    /**
     * URL(s) pointing to additional information on handling the current error.
     * 
     * <p>This list contains links to resources that can help users understand
     * and resolve the error they encountered. Each link should provide specific,
     * actionable guidance related to the current error context.
     * 
     * <p>Examples of helpful links might include:
     * <ul>
     *   <li>Documentation pages explaining the error</li>
     *   <li>Troubleshooting guides</li>
     *   <li>Configuration pages in developer consoles</li>
     *   <li>Support contact forms</li>
     *   <li>Community forums or knowledge bases</li>
     *   <li>Video tutorials or walkthroughs</li>
     *   <li>API reference documentation</li>
     * </ul>
     * 
     * @return the list of helpful links
     */
    @JsonProperty("links")
    public abstract List<HelpLink> links();

    /**
     * Creates a new builder for constructing Help instances.
     * 
     * @return a new builder instance
     */
    public static Builder builder() {
        return new AutoValue_Help.Builder();
    }

    /**
     * Builder for constructing Help instances.
     */
    @AutoValue.Builder
    @JsonIgnoreProperties(ignoreUnknown = true)
    public abstract static class Builder {
        
        /**
         * Sets the helpful links.
         * 
         * @param links the list of helpful links
         * @return this builder for method chaining
         */
        @JsonProperty("links")
        public abstract Builder links(List<HelpLink> links);
        
        /**
         * Builds the Help instance.
         * 
         * @return a new Help instance
         */
        public abstract Help build();
    }

    /**
     * HelpLink provides a single helpful resource for resolving an error.
     * 
     * <p>Each link should be specific to the error context and provide
     * actionable guidance that users can follow to resolve their issue.
     */
    @AutoValue
    @JsonDeserialize(builder = AutoValue_Help_HelpLink.Builder.class)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public abstract static class HelpLink {

        /**
         * Describes what the link offers.
         * 
         * <p>This field provides a human-readable description of what users
         * can expect to find when they follow the link. The description should
         * be clear and specific enough for users to decide whether the link
         * is relevant to their situation.
         * 
         * <p>Examples of link descriptions:
         * <ul>
         *   <li>"Enable the service in the developer console"</li>
         *   <li>"View API rate limiting documentation"</li>
         *   <li>"Check your authentication configuration"</li>
         *   <li>"Learn about required permissions"</li>
         *   <li>"Troubleshoot common connection issues"</li>
         *   <li>"Contact support for this error"</li>
         *   <li>"View example code and usage patterns"</li>
         *   <li>"Check service status and known issues"</li>
         * </ul>
         * 
         * <p>A good description helps users understand:
         * <ul>
         *   <li>What the link will help them with</li>
         *   <li>Whether it's relevant to their specific error</li>
         *   <li>What they can expect to learn or accomplish</li>
         * </ul>
         * 
         * @return description of what the link offers
         */
        @JsonProperty("description")
        public abstract String description();

        /**
         * The URL of the link.
         * 
         * <p>This field contains the actual URL that users can follow to access
         * the helpful resource. The URL should be:
         * <ul>
         *   <li>Accessible to the user (not requiring special access)</li>
         *   <li>Stable and not likely to change frequently</li>
         *   <li>Secure (HTTPS for web resources)</li>
         *   <li>Relevant to the current error context</li>
         * </ul>
         * 
         * <p>Examples of helpful URLs:
         * <ul>
         *   <li>Documentation pages: "https://docs.example.com/errors/rate-limit"</li>
         *   <li>Developer console: "https://console.example.com/settings/api"</li>
         *   <li>Support forms: "https://support.example.com/contact"</li>
         *   <li>Knowledge base: "https://help.example.com/troubleshooting"</li>
         *   <li>Community forums: "https://community.example.com/errors"</li>
         * </ul>
         * 
         * @return the URL of the helpful resource
         */
        @JsonProperty("url")
        public abstract String url();

        /**
         * Creates a new builder for constructing HelpLink instances.
         * 
         * @return a new builder instance
         */
        public static Builder builder() {
            return new AutoValue_Help_HelpLink.Builder();
        }

        /**
         * Builder for constructing HelpLink instances.
         */
        @AutoValue.Builder
        @JsonIgnoreProperties(ignoreUnknown = true)
        public abstract static class Builder {
            
            /**
             * Sets the link description.
             * 
             * @param description description of what the link offers
             * @return this builder for method chaining
             */
            @JsonProperty("description")
            public abstract Builder description(String description);
            
            /**
             * Sets the link URL.
             * 
             * @param url the URL of the helpful resource
             * @return this builder for method chaining
             */
            @JsonProperty("url")
            public abstract Builder url(String url);
            
            /**
             * Builds the HelpLink instance.
             * 
             * @return a new HelpLink instance
             */
            public abstract HelpLink build();
        }
    }
} 