/**
 * Copyright (c) 2010-2019 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.deconz.internal.netutils;

import org.eclipse.jdt.annotation.NonNullByDefault;

/**
 * Informs about the websocket connection.
 *
 * @author David Graeff - Initial contribution
 */
@NonNullByDefault
public interface WebSocketConnectionListener {
    /**
     * An error occurred during connection or while connecting.
     *
     * @param e The error
     */
    void connectionError(Throwable e);

    /**
     * Connection successfully established.
     */
    void connectionEstablished();

    /**
     * Connection lost. A reconnect timer has been started.
     *
     * @param reason A reason for the disconnection
     */
    void connectionLost(String reason);
}