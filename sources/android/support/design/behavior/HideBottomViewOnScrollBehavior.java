package android.support.design.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.CoordinatorLayout.C0413b;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import p000a.p005b.p008c.p009a.C0021a;

public class HideBottomViewOnScrollBehavior<V extends View> extends C0413b<V> {

    /* renamed from: a */
    private int f1226a = 0;

    /* renamed from: b */
    private int f1227b = 2;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public ViewPropertyAnimator f1228c;

    public HideBottomViewOnScrollBehavior() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo1353b(V v) {
        ViewPropertyAnimator viewPropertyAnimator = this.f1228c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f1227b = 2;
        m1346a(v, 0, 225, C0021a.f25d);
    }

    /* renamed from: b */
    public boolean mo1354b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        return i == 2;
    }

    /* renamed from: a */
    public boolean mo1352a(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f1226a = v.getMeasuredHeight();
        return super.mo1352a(coordinatorLayout, v, i);
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo1350a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        if (this.f1227b != 1 && i2 > 0) {
            mo1351a(v);
        } else if (this.f1227b != 2 && i2 < 0) {
            mo1353b(v);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1351a(V v) {
        ViewPropertyAnimator viewPropertyAnimator = this.f1228c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f1227b = 1;
        m1346a(v, this.f1226a, 175, C0021a.f24c);
    }

    /* renamed from: a */
    private void m1346a(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f1228c = v.animate().translationY((float) i).setInterpolator(timeInterpolator).setDuration(j).setListener(new C0370a(this));
    }
}
