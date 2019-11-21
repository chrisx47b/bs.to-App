package android.support.design.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import p000a.p005b.p008c.p011c.C0043f;

/* renamed from: android.support.design.transformation.e */
/* compiled from: FabTransformationBehavior */
class C0386e extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C0043f f1293a;

    /* renamed from: b */
    final /* synthetic */ Drawable f1294b;

    /* renamed from: c */
    final /* synthetic */ FabTransformationBehavior f1295c;

    C0386e(FabTransformationBehavior fabTransformationBehavior, C0043f fVar, Drawable drawable) {
        this.f1295c = fabTransformationBehavior;
        this.f1293a = fVar;
        this.f1294b = drawable;
    }

    public void onAnimationEnd(Animator animator) {
        this.f1293a.setCircularRevealOverlayDrawable(null);
    }

    public void onAnimationStart(Animator animator) {
        this.f1293a.setCircularRevealOverlayDrawable(this.f1294b);
    }
}
