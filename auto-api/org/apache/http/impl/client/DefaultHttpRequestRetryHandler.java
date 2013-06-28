package org.apache.http.impl.client;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.ExecutionContext;

public class DefaultHttpRequestRetryHandler implements HttpRequestRetryHandler {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:40.125 -0400", hash_original_field = "B4DF5887CB02A4F326343B4E2FC8DC1E", hash_generated_field = "1D6143EFD067DE65E0F1632FD027ED68")

    private int retryCount;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:40.125 -0400", hash_original_field = "FE8B8D4C96FA75ADA834853E0A88A2B1", hash_generated_field = "5229ECE23C7E3ED8EB78411CF48864E4")

    private boolean requestSentRetryEnabled;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:40.125 -0400", hash_original_method = "6D9057C3F9363D21510D9933DD6755F5", hash_generated_method = "4582FB4D07EF2C7BD4CEC0E86D9868D6")
    public  DefaultHttpRequestRetryHandler(int retryCount, boolean requestSentRetryEnabled) {
        super();
        this.retryCount = retryCount;
        this.requestSentRetryEnabled = requestSentRetryEnabled;
        // ---------- Original Method ----------
        //this.retryCount = retryCount;
        //this.requestSentRetryEnabled = requestSentRetryEnabled;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:40.126 -0400", hash_original_method = "5F4132CBD367F2EB70F7284BB1D2E959", hash_generated_method = "2BF645713EE7B0044C6A526FDD62C704")
    public  DefaultHttpRequestRetryHandler() {
        this(3, false);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:40.126 -0400", hash_original_method = "CD15A57681F805F21E0C1F750415FEC8", hash_generated_method = "FEBCCF5519AEBDC90A7AAC23A8B6A2CA")
    public boolean retryRequest(
            final IOException exception, 
            int executionCount,
            final HttpContext context) {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("Exception parameter may not be null");
        } //End block
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("HTTP context may not be null");
        } //End block
        Boolean b = (Boolean)
            context.getAttribute(ExecutionContext.HTTP_REQ_SENT);
        boolean sent = (b != null && b.booleanValue());
        addTaint(exception.getTaint());
        addTaint(executionCount);
        addTaint(context.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_87256990 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_87256990;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:40.127 -0400", hash_original_method = "D094CEC45107E8B04F6D27DB66E61646", hash_generated_method = "C5EEEF6AC56F51CEB8C126378BE66998")
    public boolean isRequestSentRetryEnabled() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_139192896 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_139192896;
        // ---------- Original Method ----------
        //return requestSentRetryEnabled;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:40.127 -0400", hash_original_method = "C82A3B7CA490A8560B081A320AF1EB0A", hash_generated_method = "5508B4D93E5D39E826B788C3954F2952")
    public int getRetryCount() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1518454558 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1518454558;
        // ---------- Original Method ----------
        //return retryCount;
    }

    
}

