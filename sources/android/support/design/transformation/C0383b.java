package android.support.design.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: android.support.design.transformation.b */
/* compiled from: ExpandableTransformationBehavior */
class C0383b extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ ExpandableTransformationBehavior f1286a;

    C0383b(ExpandableTransformationBehavior expandableTransformationBehavior) {
        this.f1286a = expandableTransformationBehavior;
    }

    public void onAnimationEnd(Animator animator) {
        this.f1286a.f1272b = null;
    }
}
