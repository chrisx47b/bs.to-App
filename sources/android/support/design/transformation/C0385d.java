package android.support.design.transformation;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

/* renamed from: android.support.design.transformation.d */
/* compiled from: FabTransformationBehavior */
class C0385d implements AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ View f1291a;

    /* renamed from: b */
    final /* synthetic */ FabTransformationBehavior f1292b;

    C0385d(FabTransformationBehavior fabTransformationBehavior, View view) {
        this.f1292b = fabTransformationBehavior;
        this.f1291a = view;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f1291a.invalidate();
    }
}
