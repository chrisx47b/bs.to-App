package android.support.design.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.design.internal.C0379c;
import android.support.design.widget.CoordinatorLayout.C0413b;
import android.support.design.widget.CoordinatorLayout.C0414c;
import android.support.design.widget.CoordinatorLayout.C0416e;
import android.support.p044v4.view.C0639N;
import android.support.p044v4.view.C0667c;
import android.support.p044v4.view.C0686n;
import android.support.p044v4.view.C0691s;
import android.support.p044v4.view.C0697y;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import java.lang.ref.WeakReference;
import java.util.List;
import p000a.p005b.p008c.C0031b;
import p000a.p005b.p008c.C0059h;
import p000a.p005b.p008c.C0061i;
import p000a.p005b.p008c.p009a.C0021a;
import p000a.p005b.p022f.p028d.C0195a;
import p000a.p005b.p022f.p032h.C0237k;

@C0414c(Behavior.class)
public class AppBarLayout extends LinearLayout {

    /* renamed from: a */
    private int f1302a;

    /* renamed from: b */
    private int f1303b;

    /* renamed from: c */
    private int f1304c;

    /* renamed from: d */
    private boolean f1305d;

    /* renamed from: e */
    private int f1306e;

    /* renamed from: f */
    private C0639N f1307f;

    /* renamed from: g */
    private List<C0394a> f1308g;

    /* renamed from: h */
    private boolean f1309h;

    /* renamed from: i */
    private boolean f1310i;

    /* renamed from: j */
    private boolean f1311j;

    /* renamed from: k */
    private boolean f1312k;

    /* renamed from: l */
    private int[] f1313l;

    protected static class BaseBehavior<T extends AppBarLayout> extends C0420D<T> {
        /* access modifiers changed from: private */

        /* renamed from: k */
        public int f1314k;

        /* renamed from: l */
        private int f1315l;

        /* renamed from: m */
        private ValueAnimator f1316m;

        /* renamed from: n */
        private int f1317n = -1;

        /* renamed from: o */
        private boolean f1318o;

        /* renamed from: p */
        private float f1319p;

        /* renamed from: q */
        private WeakReference<View> f1320q;

        /* renamed from: r */
        private C0392a f1321r;

        /* renamed from: android.support.design.widget.AppBarLayout$BaseBehavior$a */
        public static abstract class C0392a<T extends AppBarLayout> {
            /* renamed from: a */
            public abstract boolean mo1499a(T t);
        }

        /* renamed from: android.support.design.widget.AppBarLayout$BaseBehavior$b */
        protected static class C0393b extends C0667c {
            public static final Creator<C0393b> CREATOR = new C0458c();

            /* renamed from: c */
            int f1322c;

            /* renamed from: d */
            float f1323d;

            /* renamed from: e */
            boolean f1324e;

            public C0393b(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f1322c = parcel.readInt();
                this.f1323d = parcel.readFloat();
                this.f1324e = parcel.readByte() != 0;
            }

            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.f1322c);
                parcel.writeFloat(this.f1323d);
                parcel.writeByte(this.f1324e ? (byte) 1 : 0);
            }

            public C0393b(Parcelable parcelable) {
                super(parcelable);
            }
        }

        public BaseBehavior() {
        }

        /* renamed from: a */
        private static boolean m1466a(int i, int i2) {
            return (i & i2) == i2;
        }

        /* renamed from: d */
        private void m1471d(CoordinatorLayout coordinatorLayout, T t) {
            int c = mo1494c();
            int b = m1468b(t, c);
            if (b >= 0) {
                View childAt = t.getChildAt(b);
                C0395b bVar = (C0395b) childAt.getLayoutParams();
                int a = bVar.mo1507a();
                if ((a & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (b == t.getChildCount() - 1) {
                        i2 += t.getTopInset();
                    }
                    if (m1466a(a, 2)) {
                        i2 += C0697y.m2996k(childAt);
                    } else if (m1466a(a, 5)) {
                        int k = C0697y.m2996k(childAt) + i2;
                        if (c < k) {
                            i = k;
                        } else {
                            i2 = k;
                        }
                    }
                    if (m1466a(a, 32)) {
                        i += bVar.topMargin;
                        i2 -= bVar.bottomMargin;
                    }
                    if (c < (i2 + i) / 2) {
                        i = i2;
                    }
                    m1463a(coordinatorLayout, t, C0195a.m599a(i, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public int mo1496c(T t) {
            return t.getTotalScrollRange();
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: c */
        private int m1469c(T t, int i) {
            int abs = Math.abs(i);
            int childCount = t.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i3);
                C0395b bVar = (C0395b) childAt.getLayoutParams();
                Interpolator b = bVar.mo1508b();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else if (b != null) {
                    int a = bVar.mo1507a();
                    if ((a & 1) != 0) {
                        i2 = 0 + childAt.getHeight() + bVar.topMargin + bVar.bottomMargin;
                        if ((a & 2) != 0) {
                            i2 -= C0697y.m2996k(childAt);
                        }
                    }
                    if (C0697y.m2991g(childAt)) {
                        i2 -= t.getTopInset();
                    }
                    if (i2 > 0) {
                        float f = (float) i2;
                        return Integer.signum(i) * (childAt.getTop() + Math.round(f * b.getInterpolation(((float) (abs - childAt.getTop())) / f)));
                    }
                }
            }
            return i;
        }

        /* renamed from: b */
        private int m1468b(T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C0395b bVar = (C0395b) childAt.getLayoutParams();
                if (m1466a(bVar.mo1507a(), 32)) {
                    top -= bVar.topMargin;
                    bottom += bVar.bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        /* renamed from: a */
        public boolean mo1379b(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i, int i2) {
            boolean z = (i & 2) != 0 && (t.mo1453c() || m1467a(coordinatorLayout, t, view));
            if (z) {
                ValueAnimator valueAnimator = this.f1316m;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
            }
            this.f1320q = null;
            this.f1315l = i2;
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo1492b(T t) {
            return -t.getDownNestedScrollRange();
        }

        /* renamed from: b */
        public Parcelable mo1497d(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable d = super.mo1497d(coordinatorLayout, t);
            int b = mo1501b();
            int childCount = t.getChildCount();
            boolean z = false;
            int i = 0;
            while (i < childCount) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + b;
                if (childAt.getTop() + b > 0 || bottom < 0) {
                    i++;
                } else {
                    C0393b bVar = new C0393b(d);
                    bVar.f1322c = i;
                    if (bottom == C0697y.m2996k(childAt) + t.getTopInset()) {
                        z = true;
                    }
                    bVar.f1324e = z;
                    bVar.f1323d = ((float) bottom) / ((float) childAt.getHeight());
                    return bVar;
                }
            }
            return d;
        }

        /* renamed from: a */
        private boolean m1467a(CoordinatorLayout coordinatorLayout, T t, View view) {
            return t.mo1452b() && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight();
        }

        /* renamed from: a */
        public void mo1483a(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i6 = -t.getTotalScrollRange();
                    i5 = i6;
                    i4 = t.getDownNestedPreScrollRange() + i6;
                } else {
                    i5 = -t.getUpNestedPreScrollRange();
                    i4 = 0;
                }
                if (i5 != i4) {
                    iArr[1] = mo1691a(coordinatorLayout, t, i2, i5, i4);
                    m1462a(i2, t, view, i3);
                }
            }
        }

        /* renamed from: c */
        private boolean m1470c(CoordinatorLayout coordinatorLayout, T t) {
            List c = coordinatorLayout.mo1614c((View) t);
            int size = c.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                C0413b d = ((C0416e) ((View) c.get(i)).getLayoutParams()).mo1683d();
                if (d instanceof ScrollingViewBehavior) {
                    if (((ScrollingViewBehavior) d).mo1698c() != 0) {
                        z = true;
                    }
                    return z;
                }
            }
            return false;
        }

        /* renamed from: a */
        public void mo1482a(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int i3, int i4, int i5) {
            if (i4 < 0) {
                mo1691a(coordinatorLayout, t, i4, -t.getDownNestedScrollRange(), 0);
                m1462a(i4, t, view, i5);
            }
            if (t.mo1453c()) {
                t.mo1451a(view.getScrollY() > 0);
            }
        }

        /* renamed from: a */
        private void m1462a(int i, T t, View view, int i2) {
            if (i2 == 1) {
                int c = mo1494c();
                if ((i < 0 && c == 0) || (i > 0 && c == (-t.getDownNestedScrollRange()))) {
                    C0697y.m2989f(view, 1);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public int mo1494c() {
            return mo1501b() + this.f1314k;
        }

        /* renamed from: a */
        public void mo1481a(CoordinatorLayout coordinatorLayout, T t, View view, int i) {
            if (this.f1315l == 0 || i == 1) {
                m1471d(coordinatorLayout, t);
            }
            this.f1320q = new WeakReference<>(view);
        }

        /* renamed from: a */
        private void m1463a(CoordinatorLayout coordinatorLayout, T t, int i, float f) {
            int i2;
            int abs = Math.abs(mo1494c() - i);
            float abs2 = Math.abs(f);
            if (abs2 > 0.0f) {
                i2 = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
            } else {
                i2 = (int) (((((float) abs) / ((float) t.getHeight())) + 1.0f) * 150.0f);
            }
            m1464a(coordinatorLayout, t, i, i2);
        }

        /* renamed from: a */
        private void m1464a(CoordinatorLayout coordinatorLayout, T t, int i, int i2) {
            int c = mo1494c();
            if (c == i) {
                ValueAnimator valueAnimator = this.f1316m;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f1316m.cancel();
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f1316m;
            if (valueAnimator2 == null) {
                this.f1316m = new ValueAnimator();
                this.f1316m.setInterpolator(C0021a.f26e);
                this.f1316m.addUpdateListener(new C0457b(this, coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.f1316m.setDuration((long) Math.min(i2, 600));
            this.f1316m.setIntValues(new int[]{c, i});
            this.f1316m.start();
        }

        /* renamed from: a */
        public boolean mo1488a(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3, int i4) {
            if (((C0416e) t.getLayoutParams()).height != -2) {
                return super.mo1488a(coordinatorLayout, t, i, i2, i3, i4);
            }
            coordinatorLayout.mo1601a((View) t, i, i2, MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* renamed from: a */
        public boolean mo1352a(CoordinatorLayout coordinatorLayout, T t, int i) {
            int i2;
            boolean a = super.mo1352a(coordinatorLayout, t, i);
            int pendingAction = t.getPendingAction();
            int i3 = this.f1317n;
            if (i3 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t.getChildAt(i3);
                int i4 = -childAt.getBottom();
                if (this.f1318o) {
                    i2 = C0697y.m2996k(childAt) + t.getTopInset();
                } else {
                    i2 = Math.round(((float) childAt.getHeight()) * this.f1319p);
                }
                mo1693c(coordinatorLayout, t, i4 + i2);
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i5 = -t.getUpNestedPreScrollRange();
                    if (z) {
                        m1463a(coordinatorLayout, t, i5, 0.0f);
                    } else {
                        mo1693c(coordinatorLayout, t, i5);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        m1463a(coordinatorLayout, t, 0, 0.0f);
                    } else {
                        mo1693c(coordinatorLayout, t, 0);
                    }
                }
            }
            t.mo1455d();
            this.f1317n = -1;
            mo1500a(C0195a.m599a(mo1501b(), -t.getTotalScrollRange(), 0));
            m1465a(coordinatorLayout, t, mo1501b(), 0, true);
            t.mo1448a(mo1501b());
            return a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo1489a(T t) {
            C0392a aVar = this.f1321r;
            if (aVar != null) {
                return aVar.mo1499a(t);
            }
            WeakReference<View> weakReference = this.f1320q;
            boolean z = true;
            if (weakReference != null) {
                View view = (View) weakReference.get();
                if (view == null || !view.isShown() || view.canScrollVertically(-1)) {
                    z = false;
                }
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1498e(CoordinatorLayout coordinatorLayout, T t) {
            m1471d(coordinatorLayout, t);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo1491b(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3) {
            int c = mo1494c();
            int i4 = 0;
            if (i2 == 0 || c < i2 || c > i3) {
                this.f1314k = 0;
            } else {
                int a = C0195a.m599a(i, i2, i3);
                if (c != a) {
                    int c2 = t.mo1450a() ? m1469c(t, a) : a;
                    boolean a2 = mo1500a(c2);
                    i4 = c - a;
                    this.f1314k = a - c2;
                    if (!a2 && t.mo1450a()) {
                        coordinatorLayout.mo1599a((View) t);
                    }
                    t.mo1448a(mo1501b());
                    m1465a(coordinatorLayout, t, a, a < c ? -1 : 1, false);
                }
            }
            return i4;
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0061  */
        /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m1465a(android.support.design.widget.CoordinatorLayout r6, T r7, int r8, int r9, boolean r10) {
            /*
                r5 = this;
                android.view.View r0 = m1460a(r7, r8)
                if (r0 == 0) goto L_0x006e
                android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
                android.support.design.widget.AppBarLayout$b r1 = (android.support.design.widget.AppBarLayout.C0395b) r1
                int r1 = r1.mo1507a()
                r2 = r1 & 1
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x0041
                int r2 = android.support.p044v4.view.C0697y.m2996k(r0)
                if (r9 <= 0) goto L_0x002f
                r9 = r1 & 12
                if (r9 == 0) goto L_0x002f
                int r8 = -r8
                int r9 = r0.getBottom()
                int r9 = r9 - r2
                int r0 = r7.getTopInset()
                int r9 = r9 - r0
                if (r8 < r9) goto L_0x0041
            L_0x002d:
                r8 = 1
                goto L_0x0042
            L_0x002f:
                r9 = r1 & 2
                if (r9 == 0) goto L_0x0041
                int r8 = -r8
                int r9 = r0.getBottom()
                int r9 = r9 - r2
                int r0 = r7.getTopInset()
                int r9 = r9 - r0
                if (r8 < r9) goto L_0x0041
                goto L_0x002d
            L_0x0041:
                r8 = 0
            L_0x0042:
                boolean r9 = r7.mo1453c()
                if (r9 == 0) goto L_0x0057
                android.view.View r9 = r5.m1461a(r6)
                if (r9 == 0) goto L_0x0057
                int r8 = r9.getScrollY()
                if (r8 <= 0) goto L_0x0056
                r8 = 1
                goto L_0x0057
            L_0x0056:
                r8 = 0
            L_0x0057:
                boolean r8 = r7.mo1451a(r8)
                int r9 = android.os.Build.VERSION.SDK_INT
                r0 = 11
                if (r9 < r0) goto L_0x006e
                if (r10 != 0) goto L_0x006b
                if (r8 == 0) goto L_0x006e
                boolean r6 = r5.m1470c(r6, (T) r7)
                if (r6 == 0) goto L_0x006e
            L_0x006b:
                r7.jumpDrawablesToCurrentState()
            L_0x006e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.AppBarLayout.BaseBehavior.m1465a(android.support.design.widget.CoordinatorLayout, android.support.design.widget.AppBarLayout, int, int, boolean):void");
        }

        /* renamed from: a */
        private static View m1460a(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: a */
        private View m1461a(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt instanceof C0686n) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: a */
        public void mo1480a(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (parcelable instanceof C0393b) {
                C0393b bVar = (C0393b) parcelable;
                super.mo1480a(coordinatorLayout, t, bVar.mo2730a());
                this.f1317n = bVar.f1322c;
                this.f1319p = bVar.f1323d;
                this.f1318o = bVar.f1324e;
                return;
            }
            super.mo1480a(coordinatorLayout, t, parcelable);
            this.f1317n = -1;
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo1485a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            return super.mo1352a(coordinatorLayout, appBarLayout, i);
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ int mo1501b() {
            return super.mo1501b();
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo1486a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            return super.mo1488a(coordinatorLayout, appBarLayout, i, i2, i3, i4);
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ Parcelable mo1493b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.mo1497d(coordinatorLayout, appBarLayout);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo1479a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            super.mo1483a(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo1478a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5) {
            super.mo1482a(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo1476a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.mo1480a(coordinatorLayout, appBarLayout, parcelable);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo1487a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            return super.mo1379b(coordinatorLayout, appBarLayout, view, view2, i, i2);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo1477a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            super.mo1481a(coordinatorLayout, appBarLayout, view, i);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo1500a(int i) {
            return super.mo1500a(i);
        }
    }

    public static class ScrollingViewBehavior extends C0422E {
        public ScrollingViewBehavior() {
        }

        /* renamed from: b */
        public boolean mo1429b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            m1511a(view, view2);
            m1512b(view, view2);
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public int mo1505c(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.mo1505c(view);
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0061i.ScrollingViewBehavior_Layout);
            mo1696b(obtainStyledAttributes.getDimensionPixelSize(C0061i.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo1352a(CoordinatorLayout coordinatorLayout, View view, int i) {
            return super.mo1352a(coordinatorLayout, view, i);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo1488a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.mo1488a(coordinatorLayout, view, i, i2, i3, i4);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public float mo1504b(View view) {
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int a = m1510a(appBarLayout);
                if (downNestedPreScrollRange != 0 && totalScrollRange + a <= downNestedPreScrollRange) {
                    return 0.0f;
                }
                int i = totalScrollRange - downNestedPreScrollRange;
                if (i != 0) {
                    return (((float) a) / ((float) i)) + 1.0f;
                }
            }
            return 0.0f;
        }

        /* renamed from: a */
        public boolean mo1434a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        /* renamed from: a */
        public boolean mo1503a(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout a = m1514a(coordinatorLayout.mo1609b(view));
            if (a != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f1475d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    a.mo1449a(false, !z);
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        private void m1512b(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.mo1453c()) {
                    appBarLayout.mo1451a(view.getScrollY() > 0);
                }
            }
        }

        /* renamed from: a */
        private void m1511a(View view, View view2) {
            C0413b d = ((C0416e) view2.getLayoutParams()).mo1683d();
            if (d instanceof BaseBehavior) {
                C0697y.m2979b(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) d).f1314k) + mo1699d()) - mo1695a(view2));
            }
        }

        /* renamed from: a */
        private static int m1510a(AppBarLayout appBarLayout) {
            C0413b d = ((C0416e) appBarLayout.getLayoutParams()).mo1683d();
            if (d instanceof BaseBehavior) {
                return ((BaseBehavior) d).mo1494c();
            }
            return 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public AppBarLayout m1514a(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }
    }

    /* renamed from: android.support.design.widget.AppBarLayout$a */
    public interface C0394a<T extends AppBarLayout> {
        /* renamed from: a */
        void mo1506a(T t, int i);
    }

    /* renamed from: android.support.design.widget.AppBarLayout$b */
    public static class C0395b extends LayoutParams {

        /* renamed from: a */
        int f1325a = 1;

        /* renamed from: b */
        Interpolator f1326b;

        public C0395b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0061i.AppBarLayout_Layout);
            this.f1325a = obtainStyledAttributes.getInt(C0061i.AppBarLayout_Layout_layout_scrollFlags, 0);
            if (obtainStyledAttributes.hasValue(C0061i.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.f1326b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(C0061i.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public int mo1507a() {
            return this.f1325a;
        }

        /* renamed from: b */
        public Interpolator mo1508b() {
            return this.f1326b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public boolean mo1509c() {
            int i = this.f1325a;
            return (i & 1) == 1 && (i & 10) != 0;
        }

        public C0395b(int i, int i2) {
            super(i, i2);
        }

        public C0395b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0395b(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0395b(LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    /* renamed from: e */
    private boolean m1449e() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C0395b) getChildAt(i).getLayoutParams()).mo1509c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private void m1450f() {
        this.f1302a = -1;
        this.f1303b = -1;
        this.f1304c = -1;
    }

    /* renamed from: a */
    public void mo1449a(boolean z, boolean z2) {
        m1447a(z, z2, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo1452b() {
        return getTotalScrollRange() != 0;
    }

    /* renamed from: c */
    public boolean mo1453c() {
        return this.f1312k;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0395b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo1455d() {
        this.f1306e = 0;
    }

    /* access modifiers changed from: 0000 */
    public int getDownNestedPreScrollRange() {
        int i;
        int i2 = this.f1303b;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            C0395b bVar = (C0395b) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = bVar.f1325a;
            if ((i4 & 5) == 5) {
                int i5 = i3 + bVar.topMargin + bVar.bottomMargin;
                if ((i4 & 8) != 0) {
                    i3 = i5 + C0697y.m2996k(childAt);
                } else {
                    if ((i4 & 2) != 0) {
                        i = C0697y.m2996k(childAt);
                    } else {
                        i = getTopInset();
                    }
                    i3 = i5 + (measuredHeight - i);
                }
            } else if (i3 > 0) {
                break;
            }
        }
        int max = Math.max(0, i3);
        this.f1303b = max;
        return max;
    }

    /* access modifiers changed from: 0000 */
    public int getDownNestedScrollRange() {
        int i = this.f1304c;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C0395b bVar = (C0395b) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + bVar.topMargin + bVar.bottomMargin;
            int i4 = bVar.f1325a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                i3 -= C0697y.m2996k(childAt) + getTopInset();
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f1304c = max;
        return max;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int k = C0697y.m2996k(this);
        if (k == 0) {
            int childCount = getChildCount();
            k = childCount >= 1 ? C0697y.m2996k(getChildAt(childCount - 1)) : 0;
            if (k == 0) {
                return getHeight() / 3;
            }
        }
        return (k * 2) + topInset;
    }

    /* access modifiers changed from: 0000 */
    public int getPendingAction() {
        return this.f1306e;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    /* access modifiers changed from: 0000 */
    public final int getTopInset() {
        C0639N n = this.f1307f;
        if (n != null) {
            return n.mo2619d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f1302a;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C0395b bVar = (C0395b) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = bVar.f1325a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight + bVar.topMargin + bVar.bottomMargin;
            if ((i4 & 2) != 0) {
                i3 -= C0697y.m2996k(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3 - getTopInset());
        this.f1302a = max;
        return max;
    }

    /* access modifiers changed from: 0000 */
    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        if (this.f1313l == null) {
            this.f1313l = new int[4];
        }
        int[] iArr = this.f1313l;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        iArr[0] = this.f1310i ? C0031b.state_liftable : -C0031b.state_liftable;
        iArr[1] = (!this.f1310i || !this.f1311j) ? -C0031b.state_lifted : C0031b.state_lifted;
        iArr[2] = this.f1310i ? C0031b.state_collapsible : -C0031b.state_collapsible;
        iArr[3] = (!this.f1310i || !this.f1311j) ? -C0031b.state_collapsed : C0031b.state_collapsed;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m1450f();
        boolean z2 = false;
        this.f1305d = false;
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount) {
                break;
            } else if (((C0395b) getChildAt(i5).getLayoutParams()).mo1508b() != null) {
                this.f1305d = true;
                break;
            } else {
                i5++;
            }
        }
        if (!this.f1309h) {
            if (this.f1312k || m1449e()) {
                z2 = true;
            }
            m1448b(z2);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m1450f();
    }

    public void setExpanded(boolean z) {
        mo1449a(z, C0697y.m3008w(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.f1312k = z;
    }

    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    @Deprecated
    public void setTargetElevation(float f) {
        if (VERSION.SDK_INT >= 21) {
            C0454V.m1963a(this, f);
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1302a = -1;
        this.f1303b = -1;
        this.f1304c = -1;
        this.f1306e = 0;
        setOrientation(1);
        if (VERSION.SDK_INT >= 21) {
            C0454V.m1962a(this);
            C0454V.m1964a(this, attributeSet, 0, C0059h.Widget_Design_AppBarLayout);
        }
        TypedArray a = C0379c.m1400a(context, attributeSet, C0061i.AppBarLayout, 0, C0059h.Widget_Design_AppBarLayout, new int[0]);
        C0697y.m2968a((View) this, a.getDrawable(C0061i.AppBarLayout_android_background));
        if (a.hasValue(C0061i.AppBarLayout_expanded)) {
            m1447a(a.getBoolean(C0061i.AppBarLayout_expanded, false), false, false);
        }
        if (VERSION.SDK_INT >= 21 && a.hasValue(C0061i.AppBarLayout_elevation)) {
            C0454V.m1963a(this, (float) a.getDimensionPixelSize(C0061i.AppBarLayout_elevation, 0));
        }
        if (VERSION.SDK_INT >= 26) {
            if (a.hasValue(C0061i.AppBarLayout_android_keyboardNavigationCluster)) {
                setKeyboardNavigationCluster(a.getBoolean(C0061i.AppBarLayout_android_keyboardNavigationCluster, false));
            }
            if (a.hasValue(C0061i.AppBarLayout_android_touchscreenBlocksFocus)) {
                setTouchscreenBlocksFocus(a.getBoolean(C0061i.AppBarLayout_android_touchscreenBlocksFocus, false));
            }
        }
        this.f1312k = a.getBoolean(C0061i.AppBarLayout_liftOnScroll, false);
        a.recycle();
        C0697y.m2970a((View) this, (C0691s) new C0456a(this));
    }

    /* renamed from: a */
    private void m1447a(boolean z, boolean z2, boolean z3) {
        int i = 0;
        int i2 = (z ? 1 : 2) | (z2 ? 4 : 0);
        if (z3) {
            i = 8;
        }
        this.f1306e = i2 | i;
        requestLayout();
    }

    /* renamed from: b */
    private boolean m1448b(boolean z) {
        if (this.f1310i == z) {
            return false;
        }
        this.f1310i = z;
        refreshDrawableState();
        return true;
    }

    /* access modifiers changed from: protected */
    public C0395b generateDefaultLayoutParams() {
        return new C0395b(-1, -2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo1450a() {
        return this.f1305d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1448a(int i) {
        List<C0394a> list = this.f1308g;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0394a aVar = (C0394a) this.f1308g.get(i2);
                if (aVar != null) {
                    aVar.mo1506a(this, i);
                }
            }
        }
    }

    public C0395b generateLayoutParams(AttributeSet attributeSet) {
        return new C0395b(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0395b generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (VERSION.SDK_INT >= 19 && (layoutParams instanceof LayoutParams)) {
            return new C0395b((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new C0395b((MarginLayoutParams) layoutParams);
        }
        return new C0395b(layoutParams);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo1451a(boolean z) {
        if (this.f1311j == z) {
            return false;
        }
        this.f1311j = z;
        refreshDrawableState();
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0639N mo1447a(C0639N n) {
        C0639N n2 = C0697y.m2991g(this) ? n : null;
        if (!C0237k.m724a(this.f1307f, n2)) {
            this.f1307f = n2;
            m1450f();
        }
        return n;
    }
}
