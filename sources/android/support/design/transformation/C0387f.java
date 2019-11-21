package android.support.design.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import p000a.p005b.p008c.p011c.C0043f;
import p000a.p005b.p008c.p011c.C0043f.C0047d;

/* renamed from: android.support.design.transformation.f */
/* compiled from: FabTransformationBehavior */
class C0387f extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C0043f f1296a;

    /* renamed from: b */
    final /* synthetic */ FabTransformationBehavior f1297b;

    C0387f(FabTransformationBehavior fabTransformationBehavior, C0043f fVar) {
        this.f1297b = fabTransformationBehavior;
        this.f1296a = fVar;
    }

    public void onAnimationEnd(Animator animator) {
        C0047d revealInfo = this.f1296a.getRevealInfo();
        revealInfo.f85c = Float.MAX_VALUE;
        this.f1296a.setRevealInfo(revealInfo);
    }
}
