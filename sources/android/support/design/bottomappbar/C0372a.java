package android.support.design.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: android.support.design.bottomappbar.a */
/* compiled from: BottomAppBar */
class C0372a extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ BottomAppBar f1243a;

    C0372a(BottomAppBar bottomAppBar) {
        this.f1243a = bottomAppBar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f1243a.f1234T = null;
    }
}
