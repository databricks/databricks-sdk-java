package com.databricks.sdk.core.oauth;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class OAuthHeaderFactoryFromTokenSourceTest {
    
    private static final String TOKEN_TYPE = "Bearer";
    private static final String TOKEN_VALUE = "test-token";
    
    @Mock
    private TokenSource tokenSource;
    
    @Test
    public void testTokenAndHeaders() {
        LocalDateTime expiry = LocalDateTime.now().plusHours(1);
        Token token = new Token(TOKEN_VALUE, TOKEN_TYPE, expiry);
        when(tokenSource.getToken()).thenReturn(token);
        OAuthHeaderFactoryFromTokenSource factory = new OAuthHeaderFactoryFromTokenSource(tokenSource);

        Token actualToken = factory.getToken();
        assertEquals(TOKEN_VALUE, actualToken.getAccessToken());
        assertEquals(TOKEN_TYPE, actualToken.getTokenType());
        
        Map<String, String> headers = factory.headers();
        assertNotNull(headers);
        assertEquals(1, headers.size());
        assertEquals(TOKEN_TYPE + " " + TOKEN_VALUE, headers.get("Authorization"));
        
        // Verify token source was called exactly twice (once for getToken, once for headers)
        verify(tokenSource, times(2)).getToken();
    }
}

