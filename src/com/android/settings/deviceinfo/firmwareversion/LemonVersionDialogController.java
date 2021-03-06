/*
 * Copyright (C) 2017 The Android Open Source Project
 * Copyright (C) 2018 The LineageOS Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.settings.deviceinfo.firmwareversion;

import android.os.SystemProperties;
import android.support.annotation.VisibleForTesting;

import com.android.settings.R;

public class LemonVersionDialogController {

    private static final String KEY_LEMON_VERSION_PROP = "ro.lemon.display.version";

    @VisibleForTesting
    static final int LEMON_VERSION_ID = R.id.lemon_version_value;

    private final FirmwareVersionDialogFragment mDialog;

    public LemonVersionDialogController(FirmwareVersionDialogFragment dialog) {
        mDialog = dialog;
    }

    /**
     * Updates the build number to the dialog.
     */
    public void initialize() {
        mDialog.setText(LEMON_VERSION_ID, SystemProperties.get(KEY_LEMON_VERSION_PROP, "Unknown"));
    }
}
