/*
 * Copyright (C) 2014 Andrew Comminos
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.morlunk.jumble.util;

import android.os.RemoteException;

import com.morlunk.jumble.IJumbleObserver;
import com.morlunk.jumble.model.Channel;
import com.morlunk.jumble.model.IChannel;
import com.morlunk.jumble.model.IMessage;
import com.morlunk.jumble.model.IUser;
import com.morlunk.jumble.model.Message;
import com.morlunk.jumble.model.User;

/**
 * Stub class for Jumble service observation.
 * Created by andrew on 31/07/13.
 */
public class JumbleObserver extends IJumbleObserver.Stub {
    @Override
    public void onConnected() throws RemoteException {

    }

    @Override
    public void onConnecting() throws RemoteException {

    }

    @Override
    public void onDisconnected(JumbleException e) throws RemoteException {

    }

    @Override
    public void onTLSHandshakeFailed(ParcelableByteArray cert) throws RemoteException {

    }

    @Override
    public void onChannelAdded(IChannel channel) throws RemoteException {

    }

    @Override
    public void onChannelStateUpdated(IChannel channel) throws RemoteException {

    }

    @Override
    public void onChannelRemoved(IChannel channel) throws RemoteException {

    }

    @Override
    public void onChannelPermissionsUpdated(IChannel channel) throws RemoteException {

    }

    @Override
    public void onUserConnected(IUser user) throws RemoteException {

    }

    @Override
    public void onUserStateUpdated(IUser user) throws RemoteException {

    }

    @Override
    public void onUserTalkStateUpdated(IUser user) throws RemoteException {
        
    }

    @Override
    public void onUserJoinedChannel(IUser user, IChannel newChannel, IChannel oldChannel) throws RemoteException {

    }

    @Override
    public void onUserRemoved(IUser user, String reason) throws RemoteException {

    }

    @Override
    public void onPermissionDenied(String reason) throws RemoteException {

    }

    @Override
    public void onMessageLogged(IMessage message) throws RemoteException {

    }

    @Override
    public void onLogInfo(String message) throws RemoteException {

    }

    @Override
    public void onLogWarning(String message) throws RemoteException {

    }

    @Override
    public void onLogError(String message) throws RemoteException {

    }

}
