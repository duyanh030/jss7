/*
 * TeleStax, Open Source Cloud Communications  Copyright 2012.
 * and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.mobicents.protocols.ss7.m3ua.impl;

import org.mobicents.protocols.ss7.m3ua.State;

/**
 *
 * @author amit bhayani
 *
 */
public enum AspState implements State {
    DOWN(STATE_DOWN), DOWN_SENT("DOWN_SENT"), UP_SENT("UP_SENT"), INACTIVE_SENT("INACTIVE_SENT"), INACTIVE(STATE_INACTIVE), ACTIVE_SENT(
            "ACTIVE_SENT"), ACTIVE(STATE_ACTIVE);

    private String name;

    private AspState(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static AspState getState(String name) {
        if (name.compareTo(DOWN.getName()) == 0) {
            return DOWN;
        } else if (name.equals(INACTIVE.getName())) {
            return INACTIVE;
        } else if (name.equals(ACTIVE.getName())) {
            return ACTIVE;
        } else if (name.equals(UP_SENT.getName())) {
            return UP_SENT;
        } else if (name.equals(DOWN_SENT.getName())) {
            return DOWN_SENT;
        } else if (name.equals(INACTIVE_SENT.getName())) {
            return INACTIVE_SENT;
        } else if (name.equals(ACTIVE_SENT.getName())) {
            return ACTIVE_SENT;
        }

        return null;
    }
}
