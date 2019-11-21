package android.support.design.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: android.support.design.transformation.c */
/* compiled from: FabTransformationBehavior */
class C0384c extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ boolean f1287a;

    /* renamed from: b */
    final /* synthetic */ View f1288b;

    /* renamed from: c */
    final /* synthetic */ View f1289c;

    /* renamed from: d */
    final /* synthetic */ FabTransformationBehavior f1290d;

    C0384c(FabTransformationBehavior fabTransformationBehavior, boolean z, View view, View view2) {
        this.f1290d = fabTransformationBehavior;
        this.f1287a = z;
        this.f1288b = view;
        this.f1289c = view2;
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.f1287a) {
            this.f1288b.setVisibility(4);
            this.f1289c.setAlpha(1.0f);
            this.f1289c.setVisibility(0);
        }
    }

    public void onAnimationStart(Animator animator) {
        if (this.f1287a) {
            this.f1288b.setVisibility(0);
            this.f1289c.setAlpha(0.0f);
            this.f1289c.setVisibility(4);
        }
    }
}
