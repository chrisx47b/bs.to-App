package android.support.design.internal;

import android.graphics.PorterDuff.Mode;

/* renamed from: android.support.design.internal.d */
/* compiled from: ViewUtils */
public class C0380d {
    /* renamed from: a */
    public static Mode m1408a(int i, Mode mode) {
        if (i == 3) {
            return Mode.SRC_OVER;
        }
        if (i == 5) {
            return Mode.SRC_IN;
        }
        if (i == 9) {
            return Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return Mode.MULTIPLY;
            case 15:
                return Mode.SCREEN;
            case 16:
                return Mode.ADD;
            default:
                return mode;
        }
    }
}
