/*
 * Copyright (C) 2008 The Android Open Source Project
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

package android.hardware;

import droidsafe.annotations.*;
import droidsafe.helpers.*;

public class SensorEvent {
    public final float[] values;
   
    public Sensor sensor;

    public int accuracy;

    public long timestamp;

    @DSModeled(DSC.SAFE)
    public SensorEvent(int size) {
        values = new float[size];
    }
    
    @DSModeled(DSC.SAFE)
    public SensorEvent() {
    	//Method doesn't exist in original implementation, needed for specdump
    	this(0);  //Call the original constructor with a size of 0
    }
}
