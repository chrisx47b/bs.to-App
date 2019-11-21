package android.support.design.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: android.support.design.bottomappbar.b */
/* compiled from: BottomAppBar */
class C0373b extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ BottomAppBar f1244a;

    C0373b(BottomAppBar bottomAppBar) {
        this.f1244a = bottomAppBar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f1244a.f1235U = null;
    }
}
