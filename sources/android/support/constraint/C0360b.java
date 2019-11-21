package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.constraint.ConstraintLayout.C0321a;
import android.support.constraint.p042a.p043a.C0341m;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.Arrays;

/* renamed from: android.support.constraint.b */
/* compiled from: ConstraintHelper */
public abstract class C0360b extends View {

    /* renamed from: a */
    protected int[] f1126a = new int[32];

    /* renamed from: b */
    protected int f1127b;

    /* renamed from: c */
    protected Context f1128c;

    /* renamed from: d */
    protected C0341m f1129d;

    /* renamed from: e */
    protected boolean f1130e = false;

    /* renamed from: f */
    private String f1131f;

    public C0360b(Context context) {
        super(context);
        this.f1128c = context;
        mo1087a((AttributeSet) null);
    }

    private void setIds(String str) {
        if (str != null) {
            int i = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    m1324a(str.substring(i));
                    return;
                } else {
                    m1324a(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo1319a(ConstraintLayout constraintLayout) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1087a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0369i.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0369i.ConstraintLayout_Layout_constraint_referenced_ids) {
                    this.f1131f = obtainStyledAttributes.getString(index);
                    setIds(this.f1131f);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo1320b(ConstraintLayout constraintLayout) {
    }

    /* renamed from: c */
    public void mo1321c(ConstraintLayout constraintLayout) {
        if (isInEditMode()) {
            setIds(this.f1131f);
        }
        C0341m mVar = this.f1129d;
        if (mVar != null) {
            mVar.mo1229J();
            for (int i = 0; i < this.f1127b; i++) {
                View a = constraintLayout.mo1056a(this.f1126a[i]);
                if (a != null) {
                    this.f1129d.mo1233b(constraintLayout.mo1055a(a));
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1126a, this.f1127b);
    }

    public void onDraw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f1130e) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f1127b = 0;
        for (int tag : iArr) {
            setTag(tag, null);
        }
    }

    public void setTag(int i, Object obj) {
        int i2 = this.f1127b + 1;
        int[] iArr = this.f1126a;
        if (i2 > iArr.length) {
            this.f1126a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f1126a;
        int i3 = this.f1127b;
        iArr2[i3] = i;
        this.f1127b = i3 + 1;
    }

    /* renamed from: a */
    public void mo1318a() {
        if (this.f1129d != null) {
            LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof C0321a) {
                ((C0321a) layoutParams).f822la = this.f1129d;
            }
        }
    }

    /* renamed from: a */
    private void m1324a(String str) {
        int i;
        if (str != null && this.f1128c != null) {
            String trim = str.trim();
            try {
                i = C0368h.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = this.f1128c.getResources().getIdentifier(trim, "id", this.f1128c.getPackageName());
            }
            if (i == 0 && isInEditMode() && (getParent() instanceof ConstraintLayout)) {
                Object a = ((ConstraintLayout) getParent()).mo1057a(0, (Object) trim);
                if (a != null && (a instanceof Integer)) {
                    i = ((Integer) a).intValue();
                }
            }
            if (i != 0) {
                setTag(i, null);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Could not find id of \"");
                sb.append(trim);
                sb.append("\"");
                Log.w("ConstraintHelper", sb.toString());
            }
        }
    }
}
