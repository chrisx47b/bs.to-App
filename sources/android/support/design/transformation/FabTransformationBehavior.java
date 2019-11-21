package android.support.design.transformation;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.design.widget.C0423F;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.CoordinatorLayout.C0416e;
import android.support.design.widget.FloatingActionButton;
import android.support.p044v4.view.C0697y;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;
import p000a.p005b.p008c.C0052e;
import p000a.p005b.p008c.p009a.C0021a;
import p000a.p005b.p008c.p009a.C0022b;
import p000a.p005b.p008c.p009a.C0023c;
import p000a.p005b.p008c.p009a.C0024d;
import p000a.p005b.p008c.p009a.C0025e;
import p000a.p005b.p008c.p009a.C0028h;
import p000a.p005b.p008c.p009a.C0029i;
import p000a.p005b.p008c.p009a.C0030j;
import p000a.p005b.p008c.p011c.C0038b;
import p000a.p005b.p008c.p011c.C0040d;
import p000a.p005b.p008c.p011c.C0043f;
import p000a.p005b.p008c.p011c.C0043f.C0046c;
import p000a.p005b.p008c.p011c.C0043f.C0047d;

public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final Rect f1273c = new Rect();

    /* renamed from: d */
    private final RectF f1274d = new RectF();

    /* renamed from: e */
    private final RectF f1275e = new RectF();

    /* renamed from: f */
    private final int[] f1276f = new int[2];

    /* renamed from: android.support.design.transformation.FabTransformationBehavior$a */
    protected static class C0381a {

        /* renamed from: a */
        public C0028h f1277a;

        /* renamed from: b */
        public C0030j f1278b;

        protected C0381a() {
        }
    }

    public FabTransformationBehavior() {
    }

    @TargetApi(21)
    /* renamed from: c */
    private void m1433c(View view, View view2, boolean z, boolean z2, C0381a aVar, List<Animator> list, List<AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        float f = C0697y.m2988f(view2) - C0697y.m2988f(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-f);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{0.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{-f});
        }
        aVar.f1277a.mo49a("elevation").mo56a((Animator) objectAnimator);
        list.add(objectAnimator);
    }

    /* renamed from: d */
    private void m1435d(View view, View view2, boolean z, boolean z2, C0381a aVar, List<Animator> list, List<AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if ((view2 instanceof C0043f) && (view instanceof ImageView)) {
            C0043f fVar = (C0043f) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    objectAnimator = ObjectAnimator.ofInt(drawable, C0025e.f29a, new int[]{0});
                } else {
                    objectAnimator = ObjectAnimator.ofInt(drawable, C0025e.f29a, new int[]{255});
                }
                objectAnimator.addUpdateListener(new C0385d(this, view2));
                aVar.f1277a.mo49a("iconFade").mo56a((Animator) objectAnimator);
                list.add(objectAnimator);
                list2.add(new C0386e(this, fVar, drawable));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C0381a mo1432a(Context context, boolean z);

    /* renamed from: a */
    public boolean mo1434a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            if (expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId()) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public AnimatorSet mo1431b(View view, View view2, boolean z, boolean z2) {
        boolean z3 = z;
        C0381a a = mo1432a(view2.getContext(), z3);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (VERSION.SDK_INT >= 21) {
            m1433c(view, view2, z, z2, a, arrayList, arrayList2);
        }
        RectF rectF = this.f1274d;
        View view3 = view;
        View view4 = view2;
        boolean z4 = z;
        boolean z5 = z2;
        C0381a aVar = a;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        m1427a(view3, view4, z4, z5, aVar, (List<Animator>) arrayList3, (List<AnimatorListener>) arrayList4, rectF);
        float width = rectF.width();
        float height = rectF.height();
        m1435d(view3, view4, z4, z5, aVar, arrayList3, arrayList4);
        m1425a(view3, view4, z4, z5, aVar, width, height, (List<Animator>) arrayList, (List<AnimatorListener>) arrayList2);
        ArrayList arrayList5 = arrayList;
        ArrayList arrayList6 = arrayList2;
        m1430b(view3, view4, z4, z5, aVar, arrayList5, arrayList6);
        m1426a(view3, view4, z4, z5, aVar, arrayList5, arrayList6);
        AnimatorSet animatorSet = new AnimatorSet();
        C0022b.m32a(animatorSet, arrayList);
        animatorSet.addListener(new C0384c(this, z3, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener((AnimatorListener) arrayList2.get(i));
        }
        return animatorSet;
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo1433a(C0416e eVar) {
        if (eVar.f1452h == 0) {
            eVar.f1452h = 80;
        }
    }

    /* renamed from: c */
    private float m1431c(View view, View view2, C0030j jVar) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.f1274d;
        RectF rectF2 = this.f1275e;
        m1423a(view, rectF);
        m1423a(view2, rectF2);
        int i = jVar.f41a & 7;
        if (i == 1) {
            f3 = rectF2.centerX();
            f2 = rectF.centerX();
        } else if (i == 3) {
            f3 = rectF2.left;
            f2 = rectF.left;
        } else if (i != 5) {
            f = 0.0f;
            return f + jVar.f42b;
        } else {
            f3 = rectF2.right;
            f2 = rectF.right;
        }
        f = f3 - f2;
        return f + jVar.f42b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0092  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1427a(android.view.View r17, android.view.View r18, boolean r19, boolean r20, android.support.design.transformation.FabTransformationBehavior.C0381a r21, java.util.List<android.animation.Animator> r22, java.util.List<android.animation.Animator.AnimatorListener> r23, android.graphics.RectF r24) {
        /*
            r16 = this;
            r10 = r16
            r0 = r17
            r1 = r18
            r2 = r21
            r11 = r22
            a.b.c.a.j r3 = r2.f1278b
            float r3 = r10.m1431c(r0, r1, r3)
            a.b.c.a.j r4 = r2.f1278b
            float r0 = r10.m1434d(r0, r1, r4)
            r4 = 0
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 == 0) goto L_0x004c
            int r5 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r5 != 0) goto L_0x0020
            goto L_0x004c
        L_0x0020:
            if (r19 == 0) goto L_0x0026
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x002a
        L_0x0026:
            if (r19 != 0) goto L_0x003b
            if (r5 <= 0) goto L_0x003b
        L_0x002a:
            a.b.c.a.h r5 = r2.f1277a
            java.lang.String r6 = "translationXCurveUpwards"
            a.b.c.a.i r5 = r5.mo49a(r6)
            a.b.c.a.h r6 = r2.f1277a
            java.lang.String r7 = "translationYCurveUpwards"
            a.b.c.a.i r6 = r6.mo49a(r7)
            goto L_0x005c
        L_0x003b:
            a.b.c.a.h r5 = r2.f1277a
            java.lang.String r6 = "translationXCurveDownwards"
            a.b.c.a.i r5 = r5.mo49a(r6)
            a.b.c.a.h r6 = r2.f1277a
            java.lang.String r7 = "translationYCurveDownwards"
            a.b.c.a.i r6 = r6.mo49a(r7)
            goto L_0x005c
        L_0x004c:
            a.b.c.a.h r5 = r2.f1277a
            java.lang.String r6 = "translationXLinear"
            a.b.c.a.i r5 = r5.mo49a(r6)
            a.b.c.a.h r6 = r2.f1277a
            java.lang.String r7 = "translationYLinear"
            a.b.c.a.i r6 = r6.mo49a(r7)
        L_0x005c:
            r12 = r5
            r13 = r6
            r5 = 0
            r6 = 1
            if (r19 == 0) goto L_0x0092
            if (r20 != 0) goto L_0x006c
            float r7 = -r3
            r1.setTranslationX(r7)
            float r7 = -r0
            r1.setTranslationY(r7)
        L_0x006c:
            android.util.Property r7 = android.view.View.TRANSLATION_X
            float[] r8 = new float[r6]
            r8[r5] = r4
            android.animation.ObjectAnimator r14 = android.animation.ObjectAnimator.ofFloat(r1, r7, r8)
            android.util.Property r7 = android.view.View.TRANSLATION_Y
            float[] r6 = new float[r6]
            r6[r5] = r4
            android.animation.ObjectAnimator r15 = android.animation.ObjectAnimator.ofFloat(r1, r7, r6)
            float r5 = -r3
            float r6 = -r0
            r7 = 0
            r8 = 0
            r0 = r16
            r1 = r18
            r2 = r21
            r3 = r12
            r4 = r13
            r9 = r24
            r0.m1424a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x00a8
        L_0x0092:
            android.util.Property r2 = android.view.View.TRANSLATION_X
            float[] r4 = new float[r6]
            float r3 = -r3
            r4[r5] = r3
            android.animation.ObjectAnimator r14 = android.animation.ObjectAnimator.ofFloat(r1, r2, r4)
            android.util.Property r2 = android.view.View.TRANSLATION_Y
            float[] r3 = new float[r6]
            float r0 = -r0
            r3[r5] = r0
            android.animation.ObjectAnimator r15 = android.animation.ObjectAnimator.ofFloat(r1, r2, r3)
        L_0x00a8:
            r12.mo56a(r14)
            r13.mo56a(r15)
            r11.add(r14)
            r11.add(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.transformation.FabTransformationBehavior.m1427a(android.view.View, android.view.View, boolean, boolean, android.support.design.transformation.FabTransformationBehavior$a, java.util.List, java.util.List, android.graphics.RectF):void");
    }

    /* renamed from: d */
    private float m1434d(View view, View view2, C0030j jVar) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.f1274d;
        RectF rectF2 = this.f1275e;
        m1423a(view, rectF);
        m1423a(view2, rectF2);
        int i = jVar.f41a & 112;
        if (i == 16) {
            f3 = rectF2.centerY();
            f2 = rectF.centerY();
        } else if (i == 48) {
            f3 = rectF2.top;
            f2 = rectF.top;
        } else if (i != 80) {
            f = 0.0f;
            return f + jVar.f43c;
        } else {
            f3 = rectF2.bottom;
            f2 = rectF.bottom;
        }
        f = f3 - f2;
        return f + jVar.f43c;
    }

    /* renamed from: c */
    private ViewGroup m1432c(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    /* renamed from: b */
    private void m1430b(View view, View view2, boolean z, boolean z2, C0381a aVar, List<Animator> list, List<AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if (view2 instanceof C0043f) {
            C0043f fVar = (C0043f) view2;
            int b = m1429b(view);
            int i = 16777215 & b;
            if (z) {
                if (!z2) {
                    fVar.setCircularRevealScrimColor(b);
                }
                objectAnimator = ObjectAnimator.ofInt(fVar, C0046c.f82a, new int[]{i});
            } else {
                objectAnimator = ObjectAnimator.ofInt(fVar, C0046c.f82a, new int[]{b});
            }
            objectAnimator.setEvaluator(C0023c.m33a());
            aVar.f1277a.mo49a("color").mo56a((Animator) objectAnimator);
            list.add(objectAnimator);
        }
    }

    /* renamed from: a */
    private void m1425a(View view, View view2, boolean z, boolean z2, C0381a aVar, float f, float f2, List<Animator> list, List<AnimatorListener> list2) {
        Animator animator;
        View view3 = view;
        View view4 = view2;
        C0381a aVar2 = aVar;
        if (view4 instanceof C0043f) {
            C0043f fVar = (C0043f) view4;
            float a = m1419a(view3, view4, aVar2.f1278b);
            float b = m1428b(view3, view4, aVar2.f1278b);
            ((FloatingActionButton) view3).mo1702a(this.f1273c);
            float width = ((float) this.f1273c.width()) / 2.0f;
            C0029i a2 = aVar2.f1277a.mo49a("expansion");
            if (z) {
                if (!z2) {
                    fVar.setRevealInfo(new C0047d(a, b, width));
                }
                if (z2) {
                    width = fVar.getRevealInfo().f85c;
                }
                animator = C0038b.m88a(fVar, a, b, C0423F.m1758a(a, b, 0.0f, 0.0f, f, f2));
                animator.addListener(new C0387f(this, fVar));
                m1421a(view2, a2.mo55a(), (int) a, (int) b, width, list);
            } else {
                float f3 = fVar.getRevealInfo().f85c;
                Animator a3 = C0038b.m88a(fVar, a, b, width);
                int i = (int) a;
                int i2 = (int) b;
                View view5 = view2;
                int i3 = i;
                m1421a(view5, a2.mo55a(), i, i2, f3, list);
                m1422a(view5, a2.mo55a(), a2.mo57b(), aVar2.f1277a.mo48a(), i3, i2, width, list);
                animator = a3;
            }
            a2.mo56a(animator);
            list.add(animator);
            list2.add(C0038b.m87a(fVar));
        }
    }

    /* renamed from: b */
    private float m1428b(View view, View view2, C0030j jVar) {
        RectF rectF = this.f1274d;
        RectF rectF2 = this.f1275e;
        m1423a(view, rectF);
        m1423a(view2, rectF2);
        rectF2.offset(0.0f, -m1434d(view, view2, jVar));
        return rectF.centerY() - rectF2.top;
    }

    /* renamed from: b */
    private int m1429b(View view) {
        ColorStateList b = C0697y.m2977b(view);
        if (b != null) {
            return b.getColorForState(view.getDrawableState(), b.getDefaultColor());
        }
        return 0;
    }

    /* renamed from: a */
    private void m1426a(View view, View view2, boolean z, boolean z2, C0381a aVar, List<Animator> list, List<AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if (view2 instanceof ViewGroup) {
            if (!(view2 instanceof C0043f) || C0040d.f78a != 0) {
                ViewGroup a = m1420a(view2);
                if (a != null) {
                    if (z) {
                        if (!z2) {
                            C0024d.f28a.set(a, Float.valueOf(0.0f));
                        }
                        objectAnimator = ObjectAnimator.ofFloat(a, C0024d.f28a, new float[]{1.0f});
                    } else {
                        objectAnimator = ObjectAnimator.ofFloat(a, C0024d.f28a, new float[]{0.0f});
                    }
                    aVar.f1277a.mo49a("contentFade").mo56a((Animator) objectAnimator);
                    list.add(objectAnimator);
                }
            }
        }
    }

    /* renamed from: a */
    private void m1423a(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f1276f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    /* renamed from: a */
    private float m1419a(View view, View view2, C0030j jVar) {
        RectF rectF = this.f1274d;
        RectF rectF2 = this.f1275e;
        m1423a(view, rectF);
        m1423a(view2, rectF2);
        rectF2.offset(-m1431c(view, view2, jVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    /* renamed from: a */
    private void m1424a(View view, C0381a aVar, C0029i iVar, C0029i iVar2, float f, float f2, float f3, float f4, RectF rectF) {
        float a = m1418a(aVar, iVar, f, f3);
        float a2 = m1418a(aVar, iVar2, f2, f4);
        Rect rect = this.f1273c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f1274d;
        rectF2.set(rect);
        RectF rectF3 = this.f1275e;
        m1423a(view, rectF3);
        rectF3.offset(a, a2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    /* renamed from: a */
    private float m1418a(C0381a aVar, C0029i iVar, float f, float f2) {
        long a = iVar.mo55a();
        long b = iVar.mo57b();
        C0029i a2 = aVar.f1277a.mo49a("expansion");
        return C0021a.m30a(f, f2, iVar.mo58c().getInterpolation(((float) (((a2.mo55a() + a2.mo57b()) + 17) - a)) / ((float) b)));
    }

    /* renamed from: a */
    private ViewGroup m1420a(View view) {
        View findViewById = view.findViewById(C0052e.mtrl_child_content_container);
        if (findViewById != null) {
            return m1432c(findViewById);
        }
        if ((view instanceof C0390i) || (view instanceof C0389h)) {
            return m1432c(((ViewGroup) view).getChildAt(0));
        }
        return m1432c(view);
    }

    /* renamed from: a */
    private void m1421a(View view, long j, int i, int i2, float f, List<Animator> list) {
        if (VERSION.SDK_INT >= 21 && j > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(0);
            createCircularReveal.setDuration(j);
            list.add(createCircularReveal);
        }
    }

    /* renamed from: a */
    private void m1422a(View view, long j, long j2, long j3, int i, int i2, float f, List<Animator> list) {
        if (VERSION.SDK_INT >= 21) {
            long j4 = j + j2;
            if (j4 < j3) {
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
                createCircularReveal.setStartDelay(j4);
                createCircularReveal.setDuration(j3 - j4);
                list.add(createCircularReveal);
            }
        }
    }
}
