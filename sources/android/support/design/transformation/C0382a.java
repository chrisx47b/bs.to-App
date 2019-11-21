package android.support.design.transformation;

import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import p000a.p005b.p008c.p013d.C0050b;

/* renamed from: android.support.design.transformation.a */
/* compiled from: ExpandableBehavior */
class C0382a implements OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ View f1282a;

    /* renamed from: b */
    final /* synthetic */ int f1283b;

    /* renamed from: c */
    final /* synthetic */ C0050b f1284c;

    /* renamed from: d */
    final /* synthetic */ ExpandableBehavior f1285d;

    C0382a(ExpandableBehavior expandableBehavior, View view, int i, C0050b bVar) {
        this.f1285d = expandableBehavior;
        this.f1282a = view;
        this.f1283b = i;
        this.f1284c = bVar;
    }

    public boolean onPreDraw() {
        this.f1282a.getViewTreeObserver().removeOnPreDrawListener(this);
        if (this.f1285d.f1271a == this.f1283b) {
            ExpandableBehavior expandableBehavior = this.f1285d;
            C0050b bVar = this.f1284c;
            expandableBehavior.mo1428a((View) bVar, this.f1282a, bVar.mo161a(), false);
        }
        return false;
    }
}
