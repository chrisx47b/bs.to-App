package android.support.design.transformation;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.CoordinatorLayout.C0413b;
import android.support.p044v4.view.C0697y;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;
import p000a.p005b.p008c.p013d.C0050b;

public abstract class ExpandableBehavior extends C0413b<View> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f1271a = 0;

    public ExpandableBehavior() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo1428a(View view, View view2, boolean z, boolean z2);

    /* renamed from: b */
    public boolean mo1429b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        C0050b bVar = (C0050b) view2;
        if (!m1410a(bVar.mo161a())) {
            return false;
        }
        this.f1271a = bVar.mo161a() ? 1 : 2;
        return mo1428a((View) bVar, view, bVar.mo161a(), true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C0050b mo1430e(CoordinatorLayout coordinatorLayout, View view) {
        List b = coordinatorLayout.mo1609b(view);
        int size = b.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) b.get(i);
            if (mo1434a(coordinatorLayout, view, view2)) {
                return (C0050b) view2;
            }
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo1352a(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (!C0697y.m3008w(view)) {
            C0050b e = mo1430e(coordinatorLayout, view);
            if (e != null && m1410a(e.mo161a())) {
                this.f1271a = e.mo161a() ? 1 : 2;
                view.getViewTreeObserver().addOnPreDrawListener(new C0382a(this, view, this.f1271a, e));
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private boolean m1410a(boolean z) {
        boolean z2 = false;
        if (z) {
            int i = this.f1271a;
            if (i == 0 || i == 2) {
                z2 = true;
            }
            return z2;
        }
        if (this.f1271a == 1) {
            z2 = true;
        }
        return z2;
    }
}
