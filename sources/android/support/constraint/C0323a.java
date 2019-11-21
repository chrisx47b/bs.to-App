package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.constraint.p042a.p043a.C0326b;
import android.util.AttributeSet;

/* renamed from: android.support.constraint.a */
/* compiled from: Barrier */
public class C0323a extends C0360b {

    /* renamed from: g */
    private int f839g;

    /* renamed from: h */
    private int f840h;

    /* renamed from: i */
    private C0326b f841i;

    public C0323a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1087a(AttributeSet attributeSet) {
        super.mo1087a(attributeSet);
        this.f841i = new C0326b();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0369i.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0369i.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0369i.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f841i.mo1111c(obtainStyledAttributes.getBoolean(index, true));
                }
            }
        }
        this.f1129d = this.f841i;
        mo1318a();
    }

    public int getType() {
        return this.f839g;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f841i.mo1111c(z);
    }

    public void setType(int i) {
        this.f839g = i;
        this.f840h = i;
        if (VERSION.SDK_INT < 17) {
            int i2 = this.f839g;
            if (i2 == 5) {
                this.f840h = 0;
            } else if (i2 == 6) {
                this.f840h = 1;
            }
        } else {
            if (1 == getResources().getConfiguration().getLayoutDirection()) {
                int i3 = this.f839g;
                if (i3 == 5) {
                    this.f840h = 1;
                } else if (i3 == 6) {
                    this.f840h = 0;
                }
            } else {
                int i4 = this.f839g;
                if (i4 == 5) {
                    this.f840h = 0;
                } else if (i4 == 6) {
                    this.f840h = 1;
                }
            }
        }
        this.f841i.mo1112t(this.f840h);
    }
}
