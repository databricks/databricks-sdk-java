package com.databricks.sdk.core.oauth;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.core.http.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GithubIDTokenSourceTest {
    private static final String TEST_REQUEST_URL = "https://github.com/token";
    private static final String TEST_REQUEST_TOKEN = "test-request-token";
    private static final String TEST_ID_TOKEN = "test-id-token";
    private static final String TEST_AUDIENCE = "test-audience";

    @Mock
    private HttpClient mockHttpClient;

    private GithubIDTokenSource tokenSource;
    private ObjectMapper mapper;

    @BeforeEach
    void setUp() throws IOException {
        MockitoAnnotations.openMocks(this);
        mapper = new ObjectMapper();
        tokenSource = new GithubIDTokenSource(TEST_REQUEST_URL, TEST_REQUEST_TOKEN, mockHttpClient);
    }

    @Test
    void testSuccessfulTokenRetrieval() throws IOException {
        // Prepare mock response
        ObjectNode responseJson = mapper.createObjectNode();
        responseJson.put("value", TEST_ID_TOKEN);
        Response mockResponse = makeResponse(responseJson.toString(), 200);
        when(mockHttpClient.execute(any(Request.class))).thenReturn(mockResponse);

        // Test token retrieval
        IDToken token = tokenSource.getIDToken(TEST_AUDIENCE);
        
        assertNotNull(token);
        assertEquals(TEST_ID_TOKEN, token.getValue());
        
        // Verify the request was made with correct parameters
        verify(mockHttpClient).execute(argThat(request -> {
            return request.getMethod().equals("GET") &&
                   request.getUrl().startsWith(TEST_REQUEST_URL) &&
                   request.getUrl().contains("audience=" + TEST_AUDIENCE) &&
                   request.getHeaders().get("Authorization").equals("Bearer " + TEST_REQUEST_TOKEN);
        }));
    }

    @Test
    void testSuccessfulTokenRetrievalWithoutAudience() throws IOException {
        // Prepare mock response
        ObjectNode responseJson = mapper.createObjectNode();
        responseJson.put("value", TEST_ID_TOKEN);
        Response mockResponse = makeResponse(responseJson.toString(), 200);
        when(mockHttpClient.execute(any(Request.class))).thenReturn(mockResponse);

        // Test token retrieval without audience
        IDToken token = tokenSource.getIDToken("");
        
        assertNotNull(token);
        assertEquals(TEST_ID_TOKEN, token.getValue());
        
        // Verify the request was made with correct parameters
        verify(mockHttpClient).execute(argThat(request -> {
            return request.getMethod().equals("GET") &&
                   request.getUrl().equals(TEST_REQUEST_URL) &&
                   request.getHeaders().get("Authorization").equals("Bearer " + TEST_REQUEST_TOKEN);
        }));
    }

    @Test
    void testMissingRequestURL() {
        assertThrows(DatabricksException.class, 
            () -> new GithubIDTokenSource(null, TEST_REQUEST_TOKEN, mockHttpClient));
    }

    @Test
    void testMissingRequestToken() {
        assertThrows(DatabricksException.class, 
            () -> new GithubIDTokenSource(TEST_REQUEST_URL, null, mockHttpClient));
    }

    @Test
    void testHttpClientError() throws IOException {
        when(mockHttpClient.execute(any(Request.class)))
            .thenThrow(new IOException("Network error"));

        assertThrows(DatabricksException.class, () -> tokenSource.getIDToken(TEST_AUDIENCE));
    }

    @Test
    void testNonSuccessStatusCode() throws IOException {
        Response errorResponse = makeResponse("Error response", 400);
        when(mockHttpClient.execute(any(Request.class))).thenReturn(errorResponse);

        assertThrows(DatabricksException.class, () -> tokenSource.getIDToken(TEST_AUDIENCE));
    }

    @Test
    void testInvalidJsonResponse() throws IOException {
        Response invalidResponse = makeResponse("invalid json", 200);
        when(mockHttpClient.execute(any(Request.class))).thenReturn(invalidResponse);

        assertThrows(DatabricksException.class, () -> tokenSource.getIDToken(TEST_AUDIENCE));
    }

    @Test
    void testMissingTokenValue() throws IOException {
        ObjectNode responseJson = mapper.createObjectNode();
        // Deliberately omit the 'value' field
        Response invalidResponse = makeResponse(responseJson.toString(), 200);
        when(mockHttpClient.execute(any(Request.class))).thenReturn(invalidResponse);

        assertThrows(DatabricksException.class, () -> tokenSource.getIDToken(TEST_AUDIENCE));
    }

    @Test
    void testEmptyTokenValue() throws IOException {
        ObjectNode responseJson = mapper.createObjectNode();
        responseJson.put("value", "");
        Response invalidResponse = makeResponse(responseJson.toString(), 200);
        when(mockHttpClient.execute(any(Request.class))).thenReturn(invalidResponse);

        assertThrows(DatabricksException.class, () -> tokenSource.getIDToken(TEST_AUDIENCE));
    }

    private static Response makeResponse(String body, int status) throws MalformedURLException {
        return new Response(body, status, "status", new URL("https://databricks.com/"));
    }
}
