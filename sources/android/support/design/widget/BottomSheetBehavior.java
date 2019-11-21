package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.design.widget.CoordinatorLayout.C0413b;
import android.support.p044v4.view.C0667c;
import android.support.p044v4.view.C0697y;
import android.support.p044v4.widget.C0728s;
import android.support.p044v4.widget.C0728s.C0729a;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import p000a.p005b.p008c.C0035c;
import p000a.p005b.p008c.C0061i;

public class BottomSheetBehavior<V extends View> extends C0413b<V> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public boolean f1387a = true;

    /* renamed from: b */
    private float f1388b;

    /* renamed from: c */
    private int f1389c;

    /* renamed from: d */
    private boolean f1390d;

    /* renamed from: e */
    private int f1391e;

    /* renamed from: f */
    private int f1392f;

    /* renamed from: g */
    int f1393g;

    /* renamed from: h */
    int f1394h;

    /* renamed from: i */
    int f1395i;

    /* renamed from: j */
    boolean f1396j;

    /* renamed from: k */
    private boolean f1397k;

    /* renamed from: l */
    int f1398l = 4;

    /* renamed from: m */
    C0728s f1399m;

    /* renamed from: n */
    private boolean f1400n;

    /* renamed from: o */
    private int f1401o;

    /* renamed from: p */
    private boolean f1402p;

    /* renamed from: q */
    int f1403q;

    /* renamed from: r */
    WeakReference<V> f1404r;

    /* renamed from: s */
    WeakReference<View> f1405s;

    /* renamed from: t */
    private C0408a f1406t;

    /* renamed from: u */
    private VelocityTracker f1407u;

    /* renamed from: v */
    int f1408v;

    /* renamed from: w */
    private int f1409w;

    /* renamed from: x */
    boolean f1410x;

    /* renamed from: y */
    private Map<View, Integer> f1411y;

    /* renamed from: z */
    private final C0729a f1412z = new C0472q(this);

    /* renamed from: android.support.design.widget.BottomSheetBehavior$a */
    public static abstract class C0408a {
        /* renamed from: a */
        public abstract void mo1589a(View view, float f);

        /* renamed from: a */
        public abstract void mo1590a(View view, int i);
    }

    /* renamed from: android.support.design.widget.BottomSheetBehavior$b */
    protected static class C0409b extends C0667c {
        public static final Creator<C0409b> CREATOR = new C0473r();

        /* renamed from: c */
        final int f1413c;

        public C0409b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1413c = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1413c);
        }

        public C0409b(Parcelable parcelable, int i) {
            super(parcelable);
            this.f1413c = i;
        }
    }

    /* renamed from: android.support.design.widget.BottomSheetBehavior$c */
    private class C0410c implements Runnable {

        /* renamed from: a */
        private final View f1414a;

        /* renamed from: b */
        private final int f1415b;

        C0410c(View view, int i) {
            this.f1414a = view;
            this.f1415b = i;
        }

        public void run() {
            C0728s sVar = BottomSheetBehavior.this.f1399m;
            if (sVar == null || !sVar.mo2940a(true)) {
                BottomSheetBehavior.this.mo1587c(this.f1415b);
            } else {
                C0697y.m2972a(this.f1414a, (Runnable) this);
            }
        }
    }

    public BottomSheetBehavior() {
    }

    /* renamed from: e */
    private void m1608e() {
        this.f1408v = -1;
        VelocityTracker velocityTracker = this.f1407u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1407u = null;
        }
    }

    /* renamed from: c */
    public void mo1588c(boolean z) {
        this.f1397k = z;
    }

    /* renamed from: d */
    public Parcelable mo1497d(CoordinatorLayout coordinatorLayout, V v) {
        return new C0409b(super.mo1497d(coordinatorLayout, v), this.f1398l);
    }

    /* renamed from: d */
    private float m1606d() {
        VelocityTracker velocityTracker = this.f1407u;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f1388b);
        return this.f1407u.getYVelocity(this.f1408v);
    }

    /* renamed from: a */
    public void mo1480a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        C0409b bVar = (C0409b) parcelable;
        super.mo1480a(coordinatorLayout, v, bVar.mo2730a());
        int i = bVar.f1413c;
        if (i == 1 || i == 2) {
            this.f1398l = 4;
        } else {
            this.f1398l = i;
        }
    }

    /* renamed from: b */
    public boolean mo1435b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f1398l == 1 && actionMasked == 0) {
            return true;
        }
        C0728s sVar = this.f1399m;
        if (sVar != null) {
            sVar.mo2936a(motionEvent);
        }
        if (actionMasked == 0) {
            m1608e();
        }
        if (this.f1407u == null) {
            this.f1407u = VelocityTracker.obtain();
        }
        this.f1407u.addMovement(motionEvent);
        if (actionMasked == 2 && !this.f1400n && Math.abs(((float) this.f1409w) - motionEvent.getY()) > ((float) this.f1399m.mo2941b())) {
            this.f1399m.mo2937a((View) v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f1400n;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo1587c(int i) {
        if (this.f1398l != i) {
            this.f1398l = i;
            if (i == 6 || i == 3) {
                m1607d(true);
            } else if (i == 5 || i == 4) {
                m1607d(false);
            }
            View view = (View) this.f1404r.get();
            if (view != null) {
                C0408a aVar = this.f1406t;
                if (aVar != null) {
                    aVar.mo1590a(view, i);
                }
            }
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0061i.BottomSheetBehavior_Layout);
        TypedValue peekValue = obtainStyledAttributes.peekValue(C0061i.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (peekValue != null) {
            int i = peekValue.data;
            if (i == -1) {
                mo1585b(i);
                mo1586b(obtainStyledAttributes.getBoolean(C0061i.BottomSheetBehavior_Layout_behavior_hideable, false));
                mo1582a(obtainStyledAttributes.getBoolean(C0061i.BottomSheetBehavior_Layout_behavior_fitToContents, true));
                mo1588c(obtainStyledAttributes.getBoolean(C0061i.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
                obtainStyledAttributes.recycle();
                this.f1388b = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            }
        }
        mo1585b(obtainStyledAttributes.getDimensionPixelSize(C0061i.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        mo1586b(obtainStyledAttributes.getBoolean(C0061i.BottomSheetBehavior_Layout_behavior_hideable, false));
        mo1582a(obtainStyledAttributes.getBoolean(C0061i.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        mo1588c(obtainStyledAttributes.getBoolean(C0061i.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        obtainStyledAttributes.recycle();
        this.f1388b = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* renamed from: d */
    private void m1607d(boolean z) {
        WeakReference<V> weakReference = this.f1404r;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (VERSION.SDK_INT >= 16 && z) {
                    if (this.f1411y == null) {
                        this.f1411y = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.f1404r.get()) {
                        if (!z) {
                            Map<View, Integer> map = this.f1411y;
                            if (map != null && map.containsKey(childAt)) {
                                C0697y.m2985d(childAt, ((Integer) this.f1411y.get(childAt)).intValue());
                            }
                        } else {
                            if (VERSION.SDK_INT >= 16) {
                                this.f1411y.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            }
                            C0697y.m2985d(childAt, 4);
                        }
                    }
                }
                if (!z) {
                    this.f1411y = null;
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo1352a(CoordinatorLayout coordinatorLayout, V v, int i) {
        if (C0697y.m2991g(coordinatorLayout) && !C0697y.m2991g(v)) {
            v.setFitsSystemWindows(true);
        }
        int top = v.getTop();
        coordinatorLayout.mo1616c((View) v, i);
        this.f1403q = coordinatorLayout.getHeight();
        if (this.f1390d) {
            if (this.f1391e == 0) {
                this.f1391e = coordinatorLayout.getResources().getDimensionPixelSize(C0035c.design_bottom_sheet_peek_height_min);
            }
            this.f1392f = Math.max(this.f1391e, this.f1403q - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            this.f1392f = this.f1389c;
        }
        this.f1393g = Math.max(0, this.f1403q - v.getHeight());
        this.f1394h = this.f1403q / 2;
        m1604b();
        int i2 = this.f1398l;
        if (i2 == 3) {
            C0697y.m2979b((View) v, m1605c());
        } else if (i2 == 6) {
            C0697y.m2979b((View) v, this.f1394h);
        } else if (!this.f1396j || i2 != 5) {
            int i3 = this.f1398l;
            if (i3 == 4) {
                C0697y.m2979b((View) v, this.f1395i);
            } else if (i3 == 1 || i3 == 2) {
                C0697y.m2979b((View) v, top - v.getTop());
            }
        } else {
            C0697y.m2979b((View) v, this.f1403q);
        }
        if (this.f1399m == null) {
            this.f1399m = C0728s.m3167a((ViewGroup) coordinatorLayout, this.f1412z);
        }
        this.f1404r = new WeakReference<>(v);
        this.f1405s = new WeakReference<>(mo1580a((View) v));
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public int m1605c() {
        if (this.f1387a) {
            return this.f1393g;
        }
        return 0;
    }

    /* renamed from: b */
    public boolean mo1379b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.f1401o = 0;
        this.f1402p = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1585b(int r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.f1390d
            if (r4 != 0) goto L_0x0015
            r3.f1390d = r0
            goto L_0x0024
        L_0x000c:
            boolean r2 = r3.f1390d
            if (r2 != 0) goto L_0x0017
            int r2 = r3.f1389c
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x0024
        L_0x0017:
            r3.f1390d = r1
            int r1 = java.lang.Math.max(r1, r4)
            r3.f1389c = r1
            int r1 = r3.f1403q
            int r1 = r1 - r4
            r3.f1395i = r1
        L_0x0024:
            if (r0 == 0) goto L_0x003a
            int r4 = r3.f1398l
            r0 = 4
            if (r4 != r0) goto L_0x003a
            java.lang.ref.WeakReference<V> r4 = r3.f1404r
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x003a
            r4.requestLayout()
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.BottomSheetBehavior.mo1585b(int):void");
    }

    /* renamed from: b */
    public void mo1586b(boolean z) {
        this.f1396j = z;
    }

    /* renamed from: b */
    private void m1604b() {
        if (this.f1387a) {
            this.f1395i = Math.max(this.f1403q - this.f1392f, this.f1393g);
        } else {
            this.f1395i = this.f1403q - this.f1392f;
        }
    }

    /* renamed from: a */
    public boolean mo1565a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = false;
        if (!v.isShown()) {
            this.f1400n = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m1608e();
        }
        if (this.f1407u == null) {
            this.f1407u = VelocityTracker.obtain();
        }
        this.f1407u.addMovement(motionEvent);
        View view = null;
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f1409w = (int) motionEvent.getY();
            WeakReference<View> weakReference = this.f1405s;
            View view2 = weakReference != null ? (View) weakReference.get() : null;
            if (view2 != null && coordinatorLayout.mo1607a(view2, x, this.f1409w)) {
                this.f1408v = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.f1410x = true;
            }
            this.f1400n = this.f1408v == -1 && !coordinatorLayout.mo1607a((View) v, x, this.f1409w);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f1410x = false;
            this.f1408v = -1;
            if (this.f1400n) {
                this.f1400n = false;
                return false;
            }
        }
        if (!this.f1400n) {
            C0728s sVar = this.f1399m;
            if (sVar != null && sVar.mo2944b(motionEvent)) {
                return true;
            }
        }
        WeakReference<View> weakReference2 = this.f1405s;
        if (weakReference2 != null) {
            view = (View) weakReference2.get();
        }
        if (actionMasked == 2 && view != null && !this.f1400n && this.f1398l != 1 && !coordinatorLayout.mo1607a(view, (int) motionEvent.getX(), (int) motionEvent.getY()) && this.f1399m != null && Math.abs(((float) this.f1409w) - motionEvent.getY()) > ((float) this.f1399m.mo2941b())) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public void mo1483a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        if (i3 != 1 && view == ((View) this.f1405s.get())) {
            int top = v.getTop();
            int i4 = top - i2;
            if (i2 > 0) {
                if (i4 < m1605c()) {
                    iArr[1] = top - m1605c();
                    C0697y.m2979b((View) v, -iArr[1]);
                    mo1587c(3);
                } else {
                    iArr[1] = i2;
                    C0697y.m2979b((View) v, -i2);
                    mo1587c(1);
                }
            } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                int i5 = this.f1395i;
                if (i4 <= i5 || this.f1396j) {
                    iArr[1] = i2;
                    C0697y.m2979b((View) v, -i2);
                    mo1587c(1);
                } else {
                    iArr[1] = top - i5;
                    C0697y.m2979b((View) v, -iArr[1]);
                    mo1587c(4);
                }
            }
            mo1581a(v.getTop());
            this.f1401o = i2;
            this.f1402p = true;
        }
    }

    /* renamed from: a */
    public void mo1481a(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        int i2;
        int i3;
        int i4 = 3;
        if (v.getTop() == m1605c()) {
            mo1587c(3);
            return;
        }
        if (view == this.f1405s.get() && this.f1402p) {
            if (this.f1401o > 0) {
                i2 = m1605c();
            } else if (!this.f1396j || !mo1584a(v, m1606d())) {
                if (this.f1401o == 0) {
                    int top = v.getTop();
                    if (!this.f1387a) {
                        int i5 = this.f1394h;
                        if (top < i5) {
                            if (top < Math.abs(top - this.f1395i)) {
                                i2 = 0;
                            } else {
                                i2 = this.f1394h;
                            }
                        } else if (Math.abs(top - i5) < Math.abs(top - this.f1395i)) {
                            i2 = this.f1394h;
                        } else {
                            i3 = this.f1395i;
                        }
                        i4 = 6;
                    } else if (Math.abs(top - this.f1393g) < Math.abs(top - this.f1395i)) {
                        i2 = this.f1393g;
                    } else {
                        i3 = this.f1395i;
                    }
                } else {
                    i3 = this.f1395i;
                }
                i4 = 4;
            } else {
                i2 = this.f1403q;
                i4 = 5;
            }
            if (this.f1399m.mo2946b((View) v, v.getLeft(), i2)) {
                mo1587c(2);
                C0697y.m2972a((View) v, (Runnable) new C0410c(v, i4));
            } else {
                mo1587c(i4);
            }
            this.f1402p = false;
        }
    }

    /* renamed from: a */
    public boolean mo1583a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        return view == this.f1405s.get() && (this.f1398l != 3 || super.mo1583a(coordinatorLayout, v, view, f, f2));
    }

    /* renamed from: a */
    public void mo1582a(boolean z) {
        if (this.f1387a != z) {
            this.f1387a = z;
            if (this.f1404r != null) {
                m1604b();
            }
            mo1587c((!this.f1387a || this.f1398l != 6) ? this.f1398l : 3);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo1584a(View view, float f) {
        boolean z = true;
        if (this.f1397k) {
            return true;
        }
        if (view.getTop() < this.f1395i) {
            return false;
        }
        if (Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f1395i)) / ((float) this.f1389c) <= 0.5f) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public View mo1580a(View view) {
        if (C0697y.m3009x(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View a = mo1580a(viewGroup.getChildAt(i));
                if (a != null) {
                    return a;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1581a(int i) {
        View view = (View) this.f1404r.get();
        if (view != null) {
            C0408a aVar = this.f1406t;
            if (aVar != null) {
                int i2 = this.f1395i;
                if (i > i2) {
                    aVar.mo1589a(view, ((float) (i2 - i)) / ((float) (this.f1403q - i2)));
                } else {
                    aVar.mo1589a(view, ((float) (i2 - i)) / ((float) (i2 - m1605c())));
                }
            }
        }
    }
}
