package android.support.design.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: android.support.design.transformation.g */
/* compiled from: FabTransformationScrimBehavior */
class C0388g extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ boolean f1298a;

    /* renamed from: b */
    final /* synthetic */ View f1299b;

    /* renamed from: c */
    final /* synthetic */ FabTransformationScrimBehavior f1300c;

    C0388g(FabTransformationScrimBehavior fabTransformationScrimBehavior, boolean z, View view) {
        this.f1300c = fabTransformationScrimBehavior;
        this.f1298a = z;
        this.f1299b = view;
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.f1298a) {
            this.f1299b.setVisibility(4);
        }
    }

    public void onAnimationStart(Animator animator) {
        if (this.f1298a) {
            this.f1299b.setVisibility(0);
        }
    }
}
