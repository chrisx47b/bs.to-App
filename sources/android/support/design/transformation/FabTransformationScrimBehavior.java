package android.support.design.transformation;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import p000a.p005b.p008c.p009a.C0022b;
import p000a.p005b.p008c.p009a.C0029i;

public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final C0029i f1279c = new C0029i(75, 150);

    /* renamed from: d */
    private final C0029i f1280d = new C0029i(0, 150);

    public FabTransformationScrimBehavior() {
    }

    /* renamed from: a */
    public boolean mo1434a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    /* renamed from: b */
    public boolean mo1435b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.mo1435b(coordinatorLayout, view, motionEvent);
    }

    /* renamed from: a */
    private void m1440a(View view, boolean z, boolean z2, List<Animator> list, List<AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        C0029i iVar = z ? this.f1279c : this.f1280d;
        if (z) {
            if (!z2) {
                view.setAlpha(0.0f);
            }
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.0f});
        }
        iVar.mo56a((Animator) objectAnimator);
        list.add(objectAnimator);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public AnimatorSet mo1431b(View view, View view2, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        m1440a(view2, z, z2, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        C0022b.m32a(animatorSet, arrayList);
        animatorSet.addListener(new C0388g(this, z, view2));
        return animatorSet;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
