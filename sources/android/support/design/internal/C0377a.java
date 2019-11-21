package android.support.design.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p047v7.widget.C1055oa;
import android.util.AttributeSet;
import android.view.Gravity;
import p000a.p005b.p008c.C0061i;

/* renamed from: android.support.design.internal.a */
/* compiled from: ForegroundLinearLayout */
public class C0377a extends C1055oa {

    /* renamed from: p */
    private Drawable f1262p;

    /* renamed from: q */
    private final Rect f1263q;

    /* renamed from: r */
    private final Rect f1264r;

    /* renamed from: s */
    private int f1265s;

    /* renamed from: t */
    protected boolean f1266t;

    /* renamed from: u */
    boolean f1267u;

    public C0377a(Context context) {
        this(context, null);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f1262p;
        if (drawable != null) {
            if (this.f1267u) {
                this.f1267u = false;
                Rect rect = this.f1263q;
                Rect rect2 = this.f1264r;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f1266t) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f1265s, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @TargetApi(21)
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f1262p;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1262p;
        if (drawable != null && drawable.isStateful()) {
            this.f1262p.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.f1262p;
    }

    public int getForegroundGravity() {
        return this.f1265s;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1262p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f1267u = z | this.f1267u;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f1267u = true;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f1262p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f1262p);
            }
            this.f1262p = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f1265s == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i) {
        if (this.f1265s != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f1265s = i;
            if (this.f1265s == 119 && this.f1262p != null) {
                this.f1262p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1262p;
    }

    public C0377a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0377a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1263q = new Rect();
        this.f1264r = new Rect();
        this.f1265s = 119;
        this.f1266t = true;
        this.f1267u = false;
        TypedArray a = C0379c.m1400a(context, attributeSet, C0061i.ForegroundLinearLayout, i, 0, new int[0]);
        this.f1265s = a.getInt(C0061i.ForegroundLinearLayout_android_foregroundGravity, this.f1265s);
        Drawable drawable = a.getDrawable(C0061i.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f1266t = a.getBoolean(C0061i.ForegroundLinearLayout_foregroundInsidePadding, true);
        a.recycle();
    }
}
