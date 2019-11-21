package android.support.design.bottomappbar;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.design.behavior.HideBottomViewOnScrollBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.CoordinatorLayout.C0412a;
import android.support.design.widget.CoordinatorLayout.C0413b;
import android.support.design.widget.CoordinatorLayout.C0416e;
import android.support.design.widget.FloatingActionButton;
import android.support.p044v4.graphics.drawable.C0575a;
import android.support.p044v4.view.C0667c;
import android.support.p044v4.view.C0697y;
import android.support.p047v7.widget.ActionMenuView;
import android.support.p047v7.widget.Toolbar;
import android.support.p047v7.widget.Toolbar.C0954b;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import p000a.p005b.p008c.p009a.C0021a;
import p000a.p005b.p008c.p016g.C0058b;

public class BottomAppBar extends Toolbar implements C0412a {

    /* renamed from: P */
    private final int f1230P;

    /* renamed from: Q */
    private final C0058b f1231Q;

    /* renamed from: R */
    private final C0376e f1232R;

    /* renamed from: S */
    private Animator f1233S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public Animator f1234T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public Animator f1235U;

    /* renamed from: V */
    private int f1236V;

    /* renamed from: W */
    private boolean f1237W;

    /* renamed from: aa */
    private boolean f1238aa;

    /* renamed from: ba */
    AnimatorListenerAdapter f1239ba;

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: d */
        private final Rect f1240d = new Rect();

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        private boolean m1375a(FloatingActionButton floatingActionButton, BottomAppBar bottomAppBar) {
            ((C0416e) floatingActionButton.getLayoutParams()).f1448d = 17;
            bottomAppBar.m1360a(floatingActionButton);
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo1353b(BottomAppBar bottomAppBar) {
            super.mo1353b(bottomAppBar);
            FloatingActionButton a = bottomAppBar.m1371t();
            if (a != null) {
                a.clearAnimation();
                a.animate().translationY(bottomAppBar.getFabTranslationY()).setInterpolator(C0021a.f25d).setDuration(225);
            }
        }

        /* renamed from: a */
        public boolean mo1352a(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            FloatingActionButton a = bottomAppBar.m1371t();
            if (a != null) {
                m1375a(a, bottomAppBar);
                a.mo1704b(this.f1240d);
                bottomAppBar.setFabDiameter(this.f1240d.height());
            }
            if (bottomAppBar.m1372u()) {
                coordinatorLayout.mo1616c((View) bottomAppBar, i);
                return super.mo1352a(coordinatorLayout, bottomAppBar, i);
            }
            BottomAppBar.m1367c(bottomAppBar);
            throw null;
        }

        /* renamed from: a */
        public boolean mo1379b(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i, int i2) {
            return bottomAppBar.getHideOnScroll() && super.mo1379b(coordinatorLayout, bottomAppBar, view, view2, i, i2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo1351a(BottomAppBar bottomAppBar) {
            super.mo1351a(bottomAppBar);
            FloatingActionButton a = bottomAppBar.m1371t();
            if (a != null) {
                a.mo1702a(this.f1240d);
                float measuredHeight = (float) (a.getMeasuredHeight() - this.f1240d.height());
                a.clearAnimation();
                a.animate().translationY(((float) (-a.getPaddingBottom())) + measuredHeight).setInterpolator(C0021a.f24c).setDuration(175);
            }
        }
    }

    /* renamed from: android.support.design.bottomappbar.BottomAppBar$a */
    static class C0371a extends C0667c {
        public static final Creator<C0371a> CREATOR = new C0375d();

        /* renamed from: c */
        int f1241c;

        /* renamed from: d */
        boolean f1242d;

        public C0371a(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1241c);
            parcel.writeInt(this.f1242d ? 1 : 0);
        }

        public C0371a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1241c = parcel.readInt();
            this.f1242d = parcel.readInt() != 0;
        }
    }

    /* renamed from: c */
    static /* synthetic */ void m1367c(BottomAppBar bottomAppBar) {
        bottomAppBar.m1374w();
        throw null;
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    private float getFabTranslationX() {
        return (float) m1366c(this.f1236V);
    }

    /* access modifiers changed from: private */
    public float getFabTranslationY() {
        return m1352a(this.f1238aa);
    }

    /* renamed from: s */
    private void m1370s() {
        Animator animator = this.f1233S;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f1235U;
        if (animator2 != null) {
            animator2.cancel();
        }
        Animator animator3 = this.f1234T;
        if (animator3 != null) {
            animator3.cancel();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public FloatingActionButton m1371t() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).mo1614c((View) this)) {
            if (view instanceof FloatingActionButton) {
                return (FloatingActionButton) view;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public boolean m1372u() {
        Animator animator = this.f1233S;
        if (animator == null || !animator.isRunning()) {
            Animator animator2 = this.f1235U;
            if (animator2 == null || !animator2.isRunning()) {
                Animator animator3 = this.f1234T;
                if (animator3 == null || !animator3.isRunning()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: v */
    private boolean m1373v() {
        FloatingActionButton t = m1371t();
        return t != null && t.mo1706b();
    }

    /* renamed from: w */
    private void m1374w() {
        this.f1232R.mo1394d(getFabTranslationX());
        throw null;
    }

    public ColorStateList getBackgroundTint() {
        this.f1231Q.mo167a();
        throw null;
    }

    public C0413b<BottomAppBar> getBehavior() {
        return new Behavior();
    }

    public float getCradleVerticalOffset() {
        this.f1232R.mo1387a();
        throw null;
    }

    public int getFabAlignmentMode() {
        return this.f1236V;
    }

    public float getFabCradleMargin() {
        this.f1232R.mo1389b();
        throw null;
    }

    public float getFabCradleRoundedCornerRadius() {
        this.f1232R.mo1391c();
        throw null;
    }

    public boolean getHideOnScroll() {
        return this.f1237W;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m1370s();
        m1374w();
        throw null;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0371a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0371a aVar = (C0371a) parcelable;
        super.onRestoreInstanceState(aVar.mo2730a());
        this.f1236V = aVar.f1241c;
        this.f1238aa = aVar.f1242d;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0371a aVar = new C0371a(super.onSaveInstanceState());
        aVar.f1241c = this.f1236V;
        aVar.f1242d = this.f1238aa;
        return aVar;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        C0575a.m2558a((Drawable) this.f1231Q, colorStateList);
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            this.f1232R.mo1388a(f);
            throw null;
        }
    }

    public void setFabAlignmentMode(int i) {
        m1369d(i);
        m1356a(i, this.f1238aa);
        this.f1236V = i;
    }

    public void setFabCradleMargin(float f) {
        if (f != getFabCradleMargin()) {
            this.f1232R.mo1390b(f);
            throw null;
        }
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            this.f1232R.mo1392c(f);
            throw null;
        }
    }

    /* access modifiers changed from: 0000 */
    public void setFabDiameter(int i) {
        this.f1232R.mo1393d();
        throw null;
    }

    public void setHideOnScroll(boolean z) {
        this.f1237W = z;
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    /* renamed from: c */
    private int m1366c(int i) {
        int i2 = 1;
        boolean z = C0697y.m2995j(this) == 1;
        if (i != 1) {
            return 0;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - this.f1230P;
        if (z) {
            i2 = -1;
        }
        return measuredWidth * i2;
    }

    /* renamed from: d */
    private void m1369d(int i) {
        if (this.f1236V != i && C0697y.m3008w(this)) {
            Animator animator = this.f1234T;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            m1355a(i, (List<Animator>) arrayList);
            m1363b(i, (List<Animator>) arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f1234T = animatorSet;
            this.f1234T.addListener(new C0372a(this));
            this.f1234T.start();
        }
    }

    /* renamed from: b */
    private void m1363b(int i, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m1371t(), "translationX", new float[]{(float) m1366c(i)});
        ofFloat.setDuration(300);
        list.add(ofFloat);
    }

    /* renamed from: a */
    private void m1355a(int i, List<Animator> list) {
        if (this.f1238aa) {
            float[] fArr = new float[2];
            this.f1232R.mo1395e();
            throw null;
        }
    }

    /* renamed from: b */
    private void m1364b(FloatingActionButton floatingActionButton) {
        floatingActionButton.mo1707c((AnimatorListener) this.f1239ba);
        floatingActionButton.mo1708d(this.f1239ba);
    }

    /* renamed from: a */
    private void m1356a(int i, boolean z) {
        if (C0697y.m3008w(this)) {
            Animator animator = this.f1235U;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (!m1373v()) {
                i = 0;
                z = false;
            }
            m1357a(i, z, (List<Animator>) arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f1235U = animatorSet;
            this.f1235U.addListener(new C0373b(this));
            this.f1235U.start();
        }
    }

    /* renamed from: a */
    private void m1357a(int i, boolean z, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            String str = "alpha";
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, str, new float[]{1.0f});
            if ((this.f1238aa || (z && m1373v())) && (this.f1236V == 1 || i == 1)) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, str, new float[]{0.0f});
                ofFloat2.addListener(new C0374c(this, actionMenuView, i, z));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(150);
                animatorSet.playSequentially(new Animator[]{ofFloat2, ofFloat});
                list.add(animatorSet);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        }
    }

    /* renamed from: a */
    private float m1352a(boolean z) {
        FloatingActionButton t = m1371t();
        if (t == null) {
            return 0.0f;
        }
        Rect rect = new Rect();
        t.mo1702a(rect);
        float height = (float) rect.height();
        if (height == 0.0f) {
            height = (float) t.getMeasuredHeight();
        }
        float height2 = (float) (t.getHeight() - rect.bottom);
        float f = (-getCradleVerticalOffset()) + (height / 2.0f) + height2;
        float height3 = ((float) (t.getHeight() - rect.height())) - ((float) t.getPaddingBottom());
        float f2 = (float) (-getMeasuredHeight());
        if (z) {
            height3 = f;
        }
        return f2 + height3;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1361a(ActionMenuView actionMenuView, int i, boolean z) {
        boolean z2 = C0697y.m2995j(this) == 1;
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if ((childAt.getLayoutParams() instanceof C0954b) && (((C0954b) childAt.getLayoutParams()).f2644a & 8388615) == 8388611) {
                i2 = Math.max(i2, z2 ? childAt.getLeft() : childAt.getRight());
            }
        }
        actionMenuView.setTranslationX((i != 1 || !z) ? 0.0f : (float) (i2 - (z2 ? actionMenuView.getRight() : actionMenuView.getLeft())));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1360a(FloatingActionButton floatingActionButton) {
        m1364b(floatingActionButton);
        floatingActionButton.mo1700a((AnimatorListener) this.f1239ba);
        floatingActionButton.mo1703b((AnimatorListener) this.f1239ba);
    }
}
