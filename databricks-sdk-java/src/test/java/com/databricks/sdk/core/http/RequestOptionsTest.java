package com.databricks.sdk.core.http;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.*;
import java.util.stream.Stream;

public class RequestOptionsTest {
    private static final String DEFAULT_METHOD = "GET";
    private static final String DEFAULT_URL = "https://example.com";
    private static final String DEFAULT_AUTH = "Bearer token123";
    private static final String DEFAULT_USER_AGENT = "TestAgent/1.0";
    private static final String NEW_URL = "https://new-url.com/api/v1";
    private static final String NEW_AUTH = "Bearer token456";
    private static final String NEW_USER_AGENT = "NewAgent/1.0";
    
    private static Request createDefaultRequest() {
        return new Request(DEFAULT_METHOD, DEFAULT_URL)
            .withHeader("Authorization", DEFAULT_AUTH)
            .withHeader("User-Agent", DEFAULT_USER_AGENT);
    }
    
    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
            // Default constructor test
            Arguments.of(
                "Default constructor should not modify request",
                new RequestOptions(),
                DEFAULT_AUTH,
                DEFAULT_URL,
                DEFAULT_USER_AGENT
            ),
            // Authorization header test
            Arguments.of(
                "Authorization header should be updated",
                new RequestOptions().withAuthorization(NEW_AUTH),
                NEW_AUTH,
                DEFAULT_URL,
                DEFAULT_USER_AGENT
            ),
            // URL test
            Arguments.of(
                "URL should be updated",
                new RequestOptions().withUrl(NEW_URL),
                DEFAULT_AUTH,
                NEW_URL,
                DEFAULT_USER_AGENT
            ),
            // User-Agent test
            Arguments.of(
                "User-Agent header should be updated",
                new RequestOptions().withUserAgent(NEW_USER_AGENT),
                DEFAULT_AUTH,
                DEFAULT_URL,
                NEW_USER_AGENT
            ),
            // Multiple options test
            Arguments.of(
                "Multiple options should be applied",
                new RequestOptions()
                    .withAuthorization(NEW_AUTH)
                    .withUrl(NEW_URL)
                    .withUserAgent(NEW_USER_AGENT),
                NEW_AUTH,
                NEW_URL,
                NEW_USER_AGENT
            )
        );
    }
    
    @ParameterizedTest(name = "{0}")
    @MethodSource("provideTestCases")
    public void testRequestOptions(
            String testName,
            RequestOptions options,
            String expectedAuth,
            String expectedUrl,
            String expectedUserAgent) {
        
        Request originalRequest = createDefaultRequest();
        Request result = options.applyOptions(originalRequest);
        
        // Verify method is unchanged
        assertEquals(DEFAULT_METHOD, result.getMethod());
        
        // Verify URL
        assertEquals(expectedUrl, result.getUrl());
        
        // Verify headers
        assertEquals(expectedAuth, result.getHeaders().get("Authorization"));
        assertEquals(expectedUserAgent, result.getHeaders().get("User-Agent"));
    }
}
