
package com.tencent.tws.assistant.interpolator;


public class CubicEaseOutInterpolator extends BaseInterpolator {

    @Override
    public Float calculate(float t, float b, float c, float d) {
        return c * (t /= d) * t * t + b;
    }
}
