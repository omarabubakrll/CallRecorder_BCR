/*
 * SPDX-FileCopyrightText: 2022-2023 Andrew Gunnerson
 * SPDX-FileCopyrightText: 2023 Patryk Miś
 * SPDX-License-Identifier: GPL-3.0-only
 */

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.parcelize) apply false
    alias(libs.plugins.kotlin.serialization) apply false
    id("com.google.gms.google-services") version "4.4.2" apply false // 👈
}
