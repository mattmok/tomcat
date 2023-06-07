/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by jextract

package org.apache.tomcat.util.openssl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$13 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$13() {}
    static final FunctionDescriptor SSL_CIPHER_get_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SSL_CIPHER_get_name$MH = RuntimeHelper.downcallHandle(
        "SSL_CIPHER_get_name",
        constants$13.SSL_CIPHER_get_name$FUNC
    );
    static final FunctionDescriptor SSL_CIPHER_get_kx_nid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SSL_CIPHER_get_kx_nid$MH = RuntimeHelper.downcallHandle(
        "SSL_CIPHER_get_kx_nid",
        constants$13.SSL_CIPHER_get_kx_nid$FUNC
    );
    static final FunctionDescriptor SSL_CIPHER_get_auth_nid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SSL_CIPHER_get_auth_nid$MH = RuntimeHelper.downcallHandle(
        "SSL_CIPHER_get_auth_nid",
        constants$13.SSL_CIPHER_get_auth_nid$FUNC
    );
    static final FunctionDescriptor SSL_pending$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SSL_pending$MH = RuntimeHelper.downcallHandle(
        "SSL_pending",
        constants$13.SSL_pending$FUNC
    );
    static final FunctionDescriptor SSL_set_bio$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SSL_set_bio$MH = RuntimeHelper.downcallHandle(
        "SSL_set_bio",
        constants$13.SSL_set_bio$FUNC
    );
    static final FunctionDescriptor SSL_set_cipher_list$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SSL_set_cipher_list$MH = RuntimeHelper.downcallHandle(
        "SSL_set_cipher_list",
        constants$13.SSL_set_cipher_list$FUNC
    );
}


