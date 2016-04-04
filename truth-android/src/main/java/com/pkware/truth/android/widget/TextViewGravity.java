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
package com.pkware.truth.android.widget;

import android.support.annotation.IntDef;
import android.view.Gravity;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    Gravity.NO_GRAVITY,
    Gravity.TOP,
    Gravity.BOTTOM,
    Gravity.LEFT,
    Gravity.RIGHT,
    Gravity.CENTER_VERTICAL,
    Gravity.FILL_VERTICAL,
    Gravity.CENTER_HORIZONTAL,
    Gravity.FILL_HORIZONTAL,
    Gravity.CENTER,
    Gravity.FILL,
    Gravity.CLIP_VERTICAL,
    Gravity.CLIP_HORIZONTAL,
    Gravity.START,
    Gravity.END
})
@Retention(SOURCE)
@interface TextViewGravity {
}
