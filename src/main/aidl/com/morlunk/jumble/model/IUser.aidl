/*
 * Copyright (C) 2013 Andrew Comminos
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.morlunk.jumble.model;

import com.morlunk.jumble.model.IChannel;
import com.morlunk.jumble.model.TalkState;

interface IUser {
    int getSession();
    IChannel getChannel();
    int getUserId();
    String getName();
    String getComment();
    byte[] getCommentHash();
    byte[] getTexture();
    byte[] getTextureHash();
    String getHash();
    boolean isMuted();
    boolean isDeafened();
    boolean isSuppressed();
    boolean isSelfMuted();
    boolean isSelfDeafened();
    boolean isPrioritySpeaker();
    boolean isRecording();
    boolean isLocalMuted();
    boolean isLocalIgnored();
    void setLocalMuted(boolean localMuted);
    void setLocalIgnored(boolean localIgnored);
    TalkState getTalkState();
}