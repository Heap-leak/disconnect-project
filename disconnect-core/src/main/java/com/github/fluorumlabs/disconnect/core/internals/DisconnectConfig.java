package com.github.fluorumlabs.disconnect.core.internals;

import org.teavm.jso.JSBody;


public abstract class DisconnectConfig {
    @JSBody(script = "return (self.Disconnect && self.Disconnect.RpcHost) ? self.Disconnect.RpcHost : ''")
    public static native String getRpcHost();
}
