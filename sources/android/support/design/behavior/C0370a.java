package android.support.design.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: android.support.design.behavior.a */
/* compiled from: HideBottomViewOnScrollBehavior */
class C0370a extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ HideBottomViewOnScrollBehavior f1229a;

    C0370a(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior) {
        this.f1229a = hideBottomViewOnScrollBehavior;
    }

    public void onAnimationEnd(Animator animator) {
        this.f1229a.f1228c = null;
    }
}
