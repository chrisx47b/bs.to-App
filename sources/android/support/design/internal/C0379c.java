package android.support.design.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p000a.p005b.p008c.C0031b;
import p000a.p005b.p008c.C0061i;

/* renamed from: android.support.design.internal.c */
/* compiled from: ThemeEnforcement */
public final class C0379c {

    /* renamed from: a */
    private static final int[] f1269a = {C0031b.colorPrimary};

    /* renamed from: b */
    private static final int[] f1270b = {C0031b.colorSecondary};

    /* renamed from: a */
    public static TypedArray m1400a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m1402a(context, attributeSet, i, i2);
        m1406b(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* renamed from: b */
    private static void m1406b(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0061i.ThemeEnforcement, i, i2);
        if (!obtainStyledAttributes.getBoolean(C0061i.ThemeEnforcement_enforceTextAppearance, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        boolean z = (iArr2 == null || iArr2.length == 0) ? obtainStyledAttributes.getResourceId(C0061i.ThemeEnforcement_android_textAppearance, -1) != -1 : m1407c(context, attributeSet, iArr, i, i2, iArr2);
        obtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* renamed from: c */
    private static boolean m1407c(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        for (int resourceId : iArr2) {
            if (obtainStyledAttributes.getResourceId(resourceId, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: a */
    private static void m1402a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0061i.ThemeEnforcement, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(C0061i.ThemeEnforcement_enforceMaterialTheme, false);
        obtainStyledAttributes.recycle();
        if (z) {
            m1405b(context);
        }
        m1401a(context);
    }

    /* renamed from: a */
    public static void m1401a(Context context) {
        m1403a(context, f1269a, "Theme.AppCompat");
    }

    /* renamed from: a */
    private static boolean m1404a(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean hasValue = obtainStyledAttributes.hasValue(0);
        obtainStyledAttributes.recycle();
        return hasValue;
    }

    /* renamed from: b */
    public static void m1405b(Context context) {
        m1403a(context, f1270b, "Theme.MaterialComponents");
    }

    /* renamed from: a */
    private static void m1403a(Context context, int[] iArr, String str) {
        if (!m1404a(context, iArr)) {
            StringBuilder sb = new StringBuilder();
            sb.append("The style on this component requires your app theme to be ");
            sb.append(str);
            sb.append(" (or a descendant).");
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
