package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.ConstraintLayout.C0321a;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;

/* renamed from: android.support.constraint.e */
/* compiled from: Constraints */
public class C0364e extends ViewGroup {

    /* renamed from: a */
    C0362d f1209a;

    /* renamed from: android.support.constraint.e$a */
    /* compiled from: Constraints */
    public static class C0365a extends C0321a {

        /* renamed from: na */
        public float f1210na;

        /* renamed from: oa */
        public boolean f1211oa;

        /* renamed from: pa */
        public float f1212pa;

        /* renamed from: qa */
        public float f1213qa;

        /* renamed from: ra */
        public float f1214ra;

        /* renamed from: sa */
        public float f1215sa;

        /* renamed from: ta */
        public float f1216ta;

        /* renamed from: ua */
        public float f1217ua;

        /* renamed from: va */
        public float f1218va;

        /* renamed from: wa */
        public float f1219wa;

        /* renamed from: xa */
        public float f1220xa;

        /* renamed from: ya */
        public float f1221ya;

        /* renamed from: za */
        public float f1222za;

        public C0365a(int i, int i2) {
            super(i, i2);
            this.f1210na = 1.0f;
            this.f1211oa = false;
            this.f1212pa = 0.0f;
            this.f1213qa = 0.0f;
            this.f1214ra = 0.0f;
            this.f1215sa = 0.0f;
            this.f1216ta = 1.0f;
            this.f1217ua = 1.0f;
            this.f1218va = 0.0f;
            this.f1219wa = 0.0f;
            this.f1220xa = 0.0f;
            this.f1221ya = 0.0f;
            this.f1222za = 0.0f;
        }

        public C0365a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1210na = 1.0f;
            this.f1211oa = false;
            this.f1212pa = 0.0f;
            this.f1213qa = 0.0f;
            this.f1214ra = 0.0f;
            this.f1215sa = 0.0f;
            this.f1216ta = 1.0f;
            this.f1217ua = 1.0f;
            this.f1218va = 0.0f;
            this.f1219wa = 0.0f;
            this.f1220xa = 0.0f;
            this.f1221ya = 0.0f;
            this.f1222za = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0369i.ConstraintSet);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0369i.ConstraintSet_android_alpha) {
                    this.f1210na = obtainStyledAttributes.getFloat(index, this.f1210na);
                } else if (index == C0369i.ConstraintSet_android_elevation) {
                    this.f1212pa = obtainStyledAttributes.getFloat(index, this.f1212pa);
                    this.f1211oa = true;
                } else if (index == C0369i.ConstraintSet_android_rotationX) {
                    this.f1214ra = obtainStyledAttributes.getFloat(index, this.f1214ra);
                } else if (index == C0369i.ConstraintSet_android_rotationY) {
                    this.f1215sa = obtainStyledAttributes.getFloat(index, this.f1215sa);
                } else if (index == C0369i.ConstraintSet_android_rotation) {
                    this.f1213qa = obtainStyledAttributes.getFloat(index, this.f1213qa);
                } else if (index == C0369i.ConstraintSet_android_scaleX) {
                    this.f1216ta = obtainStyledAttributes.getFloat(index, this.f1216ta);
                } else if (index == C0369i.ConstraintSet_android_scaleY) {
                    this.f1217ua = obtainStyledAttributes.getFloat(index, this.f1217ua);
                } else if (index == C0369i.ConstraintSet_android_transformPivotX) {
                    this.f1218va = obtainStyledAttributes.getFloat(index, this.f1218va);
                } else if (index == C0369i.ConstraintSet_android_transformPivotY) {
                    this.f1219wa = obtainStyledAttributes.getFloat(index, this.f1219wa);
                } else if (index == C0369i.ConstraintSet_android_translationX) {
                    this.f1220xa = obtainStyledAttributes.getFloat(index, this.f1220xa);
                } else if (index == C0369i.ConstraintSet_android_translationY) {
                    this.f1221ya = obtainStyledAttributes.getFloat(index, this.f1221ya);
                } else if (index == C0369i.ConstraintSet_android_translationZ) {
                    this.f1220xa = obtainStyledAttributes.getFloat(index, this.f1222za);
                }
            }
        }
    }

    public C0362d getConstraintSet() {
        if (this.f1209a == null) {
            this.f1209a = new C0362d();
        }
        this.f1209a.mo1329a(this);
        return this.f1209a;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    /* access modifiers changed from: protected */
    public C0365a generateDefaultLayoutParams() {
        return new C0365a(-2, -2);
    }

    public C0365a generateLayoutParams(AttributeSet attributeSet) {
        return new C0365a(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new C0321a(layoutParams);
    }
}
