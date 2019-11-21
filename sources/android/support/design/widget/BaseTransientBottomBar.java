package android.support.design.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.support.design.internal.C0379c;
import android.support.design.widget.BaseTransientBottomBar;
import android.support.design.widget.CoordinatorLayout.C0413b;
import android.support.design.widget.CoordinatorLayout.C0416e;
import android.support.design.widget.SwipeDismissBehavior.C0441a;
import android.support.p044v4.view.C0668d;
import android.support.p044v4.view.C0691s;
import android.support.p044v4.view.C0697y;
import android.support.p044v4.view.p045a.C0652b;
import android.support.p044v4.view.p045a.C0652b.C0653a;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import java.util.List;
import p000a.p005b.p008c.C0031b;
import p000a.p005b.p008c.C0056g;
import p000a.p005b.p008c.C0061i;
import p000a.p005b.p008c.p009a.C0021a;
import p000a.p005b.p008c.p017h.C0060a;

public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: a */
    static final Handler f1369a = new Handler(Looper.getMainLooper(), new C0461f());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final boolean f1370b;

    /* renamed from: c */
    private static final int[] f1371c = {C0031b.snackbarStyle};

    /* renamed from: d */
    private final ViewGroup f1372d;

    /* renamed from: e */
    private final Context f1373e;

    /* renamed from: f */
    protected final C0407e f1374f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C0060a f1375g;

    /* renamed from: h */
    private int f1376h;

    /* renamed from: i */
    private List<C0403a<B>> f1377i;

    /* renamed from: j */
    private Behavior f1378j;

    /* renamed from: k */
    private final AccessibilityManager f1379k;

    /* renamed from: l */
    final C0431a f1380l = new C0464i(this);

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: k */
        private final C0404b f1381k = new C0404b(this);

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m1592a(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f1381k.mo1569a(baseTransientBottomBar);
        }

        /* renamed from: a */
        public boolean mo1566a(View view) {
            return this.f1381k.mo1571a(view);
        }

        /* renamed from: a */
        public boolean mo1565a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f1381k.mo1570a(coordinatorLayout, view, motionEvent);
            return super.mo1565a(coordinatorLayout, view, motionEvent);
        }
    }

    /* renamed from: android.support.design.widget.BaseTransientBottomBar$a */
    public static abstract class C0403a<B> {
        /* renamed from: a */
        public void mo1567a(B b) {
        }

        /* renamed from: a */
        public void mo1568a(B b, int i) {
        }
    }

    /* renamed from: android.support.design.widget.BaseTransientBottomBar$b */
    public static class C0404b {

        /* renamed from: a */
        private C0431a f1382a;

        public C0404b(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.mo1811b(0.1f);
            swipeDismissBehavior.mo1808a(0.6f);
            swipeDismissBehavior.mo1809a(0);
        }

        /* renamed from: a */
        public void mo1569a(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f1382a = baseTransientBottomBar.f1380l;
        }

        /* renamed from: a */
        public boolean mo1571a(View view) {
            return view instanceof C0407e;
        }

        /* renamed from: a */
        public void mo1570a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    C0430K.m1810a().mo1781e(this.f1382a);
                }
            } else if (coordinatorLayout.mo1607a(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                C0430K.m1810a().mo1780d(this.f1382a);
            }
        }
    }

    /* renamed from: android.support.design.widget.BaseTransientBottomBar$c */
    protected interface C0405c {
        void onViewAttachedToWindow(View view);

        void onViewDetachedFromWindow(View view);
    }

    /* renamed from: android.support.design.widget.BaseTransientBottomBar$d */
    protected interface C0406d {
        /* renamed from: a */
        void mo1574a(View view, int i, int i2, int i3, int i4);
    }

    /* renamed from: android.support.design.widget.BaseTransientBottomBar$e */
    protected static class C0407e extends FrameLayout {

        /* renamed from: a */
        private final AccessibilityManager f1383a;

        /* renamed from: b */
        private final C0653a f1384b;

        /* renamed from: c */
        private C0406d f1385c;

        /* renamed from: d */
        private C0405c f1386d;

        protected C0407e(Context context) {
            this(context, null);
        }

        /* access modifiers changed from: private */
        public void setClickableOrFocusableBasedOnAccessibility(boolean z) {
            setClickable(!z);
            setFocusable(z);
        }

        /* access modifiers changed from: protected */
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            C0405c cVar = this.f1386d;
            if (cVar != null) {
                cVar.onViewAttachedToWindow(this);
            }
            C0697y.m2955A(this);
        }

        /* access modifiers changed from: protected */
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            C0405c cVar = this.f1386d;
            if (cVar != null) {
                cVar.onViewDetachedFromWindow(this);
            }
            C0652b.m2818b(this.f1383a, this.f1384b);
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            C0406d dVar = this.f1385c;
            if (dVar != null) {
                dVar.mo1574a(this, i, i2, i3, i4);
            }
        }

        /* access modifiers changed from: 0000 */
        public void setOnAttachStateChangeListener(C0405c cVar) {
            this.f1386d = cVar;
        }

        /* access modifiers changed from: 0000 */
        public void setOnLayoutChangeListener(C0406d dVar) {
            this.f1385c = dVar;
        }

        protected C0407e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0061i.SnackbarLayout);
            if (obtainStyledAttributes.hasValue(C0061i.SnackbarLayout_elevation)) {
                C0697y.m2961a((View) this, (float) obtainStyledAttributes.getDimensionPixelSize(C0061i.SnackbarLayout_elevation, 0));
            }
            obtainStyledAttributes.recycle();
            this.f1383a = (AccessibilityManager) context.getSystemService("accessibility");
            this.f1384b = new C0471p(this);
            C0652b.m2817a(this.f1383a, this.f1384b);
            setClickableOrFocusableBasedOnAccessibility(this.f1383a.isTouchExplorationEnabled());
        }
    }

    static {
        int i = VERSION.SDK_INT;
        f1370b = i >= 16 && i <= 19;
    }

    protected BaseTransientBottomBar(ViewGroup viewGroup, View view, C0060a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        } else if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (aVar != null) {
            this.f1372d = viewGroup;
            this.f1375g = aVar;
            this.f1373e = viewGroup.getContext();
            C0379c.m1401a(this.f1373e);
            this.f1374f = (C0407e) LayoutInflater.from(this.f1373e).inflate(mo1557f(), this.f1372d, false);
            this.f1374f.addView(view);
            C0697y.m2983c(this.f1374f, 1);
            C0697y.m2985d(this.f1374f, 1);
            C0697y.m2975a((View) this.f1374f, true);
            C0697y.m2970a((View) this.f1374f, (C0691s) new C0462g(this));
            C0697y.m2969a((View) this.f1374f, (C0668d) new C0463h(this));
            this.f1379k = (AccessibilityManager) this.f1373e.getSystemService("accessibility");
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }

    /* renamed from: n */
    private int m1574n() {
        int height = this.f1374f.getHeight();
        LayoutParams layoutParams = this.f1374f.getLayoutParams();
        return layoutParams instanceof MarginLayoutParams ? height + ((MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1550b() {
        int n = m1574n();
        if (f1370b) {
            C0697y.m2979b((View) this.f1374f, n);
        } else {
            this.f1374f.setTranslationY((float) n);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{n, 0});
        valueAnimator.setInterpolator(C0021a.f23b);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new C0469n(this));
        valueAnimator.addUpdateListener(new C0470o(this, n));
        valueAnimator.start();
    }

    /* renamed from: c */
    public void mo1552c() {
        mo1549a(3);
    }

    /* renamed from: d */
    public B mo1555d(int i) {
        this.f1376h = i;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public SwipeDismissBehavior<? extends View> mo1556e() {
        return new Behavior();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo1557f() {
        return mo1559h() ? C0056g.mtrl_layout_snackbar : C0056g.design_layout_snackbar;
    }

    /* renamed from: g */
    public View mo1558g() {
        return this.f1374f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo1559h() {
        TypedArray obtainStyledAttributes = this.f1373e.obtainStyledAttributes(f1371c);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        if (resourceId != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public boolean mo1560i() {
        return C0430K.m1810a().mo1777a(this.f1380l);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo1561j() {
        C0430K.m1810a().mo1779c(this.f1380l);
        List<C0403a<B>> list = this.f1377i;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((C0403a) this.f1377i.get(size)).mo1567a(this);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public boolean mo1562k() {
        List enabledAccessibilityServiceList = this.f1379k.getEnabledAccessibilityServiceList(1);
        if (enabledAccessibilityServiceList == null || !enabledAccessibilityServiceList.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public void mo1563l() {
        C0430K.m1810a().mo1774a(mo1554d(), this.f1380l);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public final void mo1564m() {
        if (this.f1374f.getParent() == null) {
            LayoutParams layoutParams = this.f1374f.getLayoutParams();
            if (layoutParams instanceof C0416e) {
                C0416e eVar = (C0416e) layoutParams;
                SwipeDismissBehavior swipeDismissBehavior = this.f1378j;
                if (swipeDismissBehavior == null) {
                    swipeDismissBehavior = mo1556e();
                }
                if (swipeDismissBehavior instanceof Behavior) {
                    ((Behavior) swipeDismissBehavior).m1592a(this);
                }
                swipeDismissBehavior.mo1810a((C0441a) new C0465j(this));
                eVar.mo1674a((C0413b) swipeDismissBehavior);
                eVar.f1451g = 80;
            }
            this.f1372d.addView(this.f1374f);
        }
        this.f1374f.setOnAttachStateChangeListener(new C0467l(this));
        if (!C0697y.m3008w(this.f1374f)) {
            this.f1374f.setOnLayoutChangeListener(new C0468m(this));
        } else if (mo1562k()) {
            mo1550b();
        } else {
            mo1561j();
        }
    }

    /* renamed from: e */
    private void mo1802e(int i) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{0, m1574n()});
        valueAnimator.setInterpolator(C0021a.f23b);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new C0459d(this, i));
        valueAnimator.addUpdateListener(new C0460e(this));
        valueAnimator.start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo1553c(int i) {
        C0430K.m1810a().mo1778b(this.f1380l);
        List<C0403a<B>> list = this.f1377i;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((C0403a) this.f1377i.get(size)).mo1568a(this, i);
            }
        }
        ViewParent parent = this.f1374f.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f1374f);
        }
    }

    /* renamed from: d */
    public int mo1554d() {
        return this.f1376h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1549a(int i) {
        C0430K.m1810a().mo1775a(this.f1380l, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo1551b(int i) {
        if (!mo1562k() || this.f1374f.getVisibility() != 0) {
            mo1553c(i);
        } else {
            mo1802e(i);
        }
    }
}
