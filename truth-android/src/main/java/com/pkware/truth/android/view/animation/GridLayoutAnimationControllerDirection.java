/*
 * Copyright 2013 Square, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.pkware.truth.android.view.animation;

import android.annotation.SuppressLint;
import android.support.annotation.IntDef;
import android.view.animation.GridLayoutAnimationController;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

// Suppressing lint because DIRECTION_TOP_TO_BOTTOM and DIRECTION_LEFT_TO_RIGHT are the same value
@SuppressLint("UniqueConstants")
@IntDef({
    GridLayoutAnimationController.DIRECTION_TOP_TO_BOTTOM,
    GridLayoutAnimationController.DIRECTION_BOTTOM_TO_TOP,
    GridLayoutAnimationController.DIRECTION_LEFT_TO_RIGHT,
    GridLayoutAnimationController.DIRECTION_RIGHT_TO_LEFT
})
@Retention(SOURCE)
@interface GridLayoutAnimationControllerDirection {
}
