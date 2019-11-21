package android.support.design.transformation;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public AnimatorSet f1272b;

    public ExpandableTransformationBehavior() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract AnimatorSet mo1431b(View view, View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo1428a(View view, View view2, boolean z, boolean z2) {
        boolean z3 = this.f1272b != null;
        if (z3) {
            this.f1272b.cancel();
        }
        this.f1272b = mo1431b(view, view2, z, z3);
        this.f1272b.addListener(new C0383b(this));
        this.f1272b.start();
        if (!z2) {
            this.f1272b.end();
        }
        return true;
    }
}
