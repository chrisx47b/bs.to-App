package android.support.design.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.p047v7.widget.ActionMenuView;

/* renamed from: android.support.design.bottomappbar.c */
/* compiled from: BottomAppBar */
class C0374c extends AnimatorListenerAdapter {

    /* renamed from: a */
    public boolean f1245a;

    /* renamed from: b */
    final /* synthetic */ ActionMenuView f1246b;

    /* renamed from: c */
    final /* synthetic */ int f1247c;

    /* renamed from: d */
    final /* synthetic */ boolean f1248d;

    /* renamed from: e */
    final /* synthetic */ BottomAppBar f1249e;

    C0374c(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z) {
        this.f1249e = bottomAppBar;
        this.f1246b = actionMenuView;
        this.f1247c = i;
        this.f1248d = z;
    }

    public void onAnimationCancel(Animator animator) {
        this.f1245a = true;
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.f1245a) {
            this.f1249e.m1361a(this.f1246b, this.f1247c, this.f1248d);
        }
    }
}
